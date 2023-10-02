package com.matancita.easyroutebackend.payload.response;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long idUsuario;
    private String username;
    private List<String> roles;
  
    public JwtResponse(String accessToken, Long id, String username, List<String> roles) {
      this.token = accessToken;
      this.idUsuario = id;
      this.username = username;
      this.roles = roles;
    }
  
    public String getAccessToken() {
      return token;
    }
  
    public void setAccessToken(String accessToken) {
      this.token = accessToken;
    }
  
    public String getTokenType() {
      return type;
    }
  
    public void setTokenType(String tokenType) {
      this.type = tokenType;
    }
  
    public Long getIdUsuario() {
      return idUsuario;
    }
  
    public void setIdUsuario(Long id) {
      this.idUsuario = id;
    }
  
    public String getUsername() {
      return username;
    }
  
    public void setUsername(String username) {
      this.username = username;
    }
  
    public List<String> getRoles() {
      return roles;
    }
}
