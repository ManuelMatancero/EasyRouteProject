package com.matancita.easyroutebackend.jwt;

public class AccountCredentials {

    private String username;
    private String password;
   

    public AccountCredentials() {
    }

    public AccountCredentials(String username, String password) {
        this.username = username;
        this.password = password;
       
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
}
