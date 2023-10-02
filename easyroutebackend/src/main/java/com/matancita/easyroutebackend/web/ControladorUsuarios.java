package com.matancita.easyroutebackend.web;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matancita.easyroutebackend.dao.CobradorDao;
import com.matancita.easyroutebackend.dao.EmpresaDao;
import com.matancita.easyroutebackend.dao.RoleDao;
import com.matancita.easyroutebackend.dao.UsuarioDao;
import com.matancita.easyroutebackend.domain.Cobrador;
import com.matancita.easyroutebackend.domain.Empresa;
import com.matancita.easyroutebackend.domain.Role;
import com.matancita.easyroutebackend.domain.Usuario;
import com.matancita.easyroutebackend.jwt.JwtUtils;
import com.matancita.easyroutebackend.jwt.UserDetailsImpl;
import com.matancita.easyroutebackend.payload.request.LoginRequest;
import com.matancita.easyroutebackend.payload.request.SignupRequest;
import com.matancita.easyroutebackend.payload.response.JwtResponse;
import com.matancita.easyroutebackend.payload.response.MessageResponse;
import com.matancita.easyroutebackend.specialfunctions.ERole;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class ControladorUsuarios {

     @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UsuarioDao userRepository;

  @Autowired
  CobradorDao cobradorRepository;

  @Autowired
  EmpresaDao empresaRepository;

  @Autowired
  RoleDao roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = jwtUtils.generateJwtToken(authentication);
    
    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt, 
                         userDetails.getId(), 
                         userDetails.getUsername(), 
                         roles));
  }

    @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (userRepository.existsByUsername(signUpRequest.getUsername())) {
      return ResponseEntity
          .badRequest()
          .body(new MessageResponse("Error: Username is already taken!"));
    }

    //Here i get the Empresa from db
    Empresa empresa = empresaRepository.findAll().get(0);

    //Here i save the cobrador on db before saving the user
    //Here i add the fechaIngreso to the cobrador also
    signUpRequest.getCobrador().setFechaIngreso(LocalDateTime.now());
    cobradorRepository.save(signUpRequest.getCobrador());

    // Create new user's account
    Usuario user = new Usuario(signUpRequest.getUsername(), 
               encoder.encode(signUpRequest.getPassword()), 1, empresa, signUpRequest.getCobrador());

    Set<String> strRoles = signUpRequest.getRole();
    Set<Role> roles = new HashSet<>();

    if (strRoles == null) {
      Role userRole = roleRepository.findByName(ERole.ROLE_USER)
          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
      roles.add(userRole);
    } else {
      strRoles.forEach(role -> {
        switch (role) {
        case "admin":
          Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          roles.add(adminRole);

          break;
        case "mod":
          Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          roles.add(modRole);

          break;
        default:
          Role userRole = roleRepository.findByName(ERole.ROLE_USER)
              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          roles.add(userRole);
        }
      });
    }

    user.setRoles(roles);
    userRepository.save(user);

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }
    
}
