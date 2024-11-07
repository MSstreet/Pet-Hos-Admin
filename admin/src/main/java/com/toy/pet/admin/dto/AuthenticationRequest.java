package com.toy.pet.admin.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.access.annotation.Secured;

@Getter
@Setter
@ToString
public class AuthenticationRequest {

    private String username;
    private String password;
}
