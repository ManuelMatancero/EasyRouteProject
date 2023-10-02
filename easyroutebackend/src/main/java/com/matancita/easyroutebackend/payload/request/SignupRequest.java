package com.matancita.easyroutebackend.payload.request;

import java.util.Set;

import com.matancita.easyroutebackend.domain.Cobrador;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignupRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  private Set<String> role;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;

  private Cobrador cobrador;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }

  public void setCobrador(Cobrador cobrador) {
    this.cobrador = cobrador;
  } 

  public Cobrador getCobrador() {
    return this.cobrador;
  }
}
