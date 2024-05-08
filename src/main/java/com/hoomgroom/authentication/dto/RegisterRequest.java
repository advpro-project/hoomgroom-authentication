package com.hoomgroom.authentication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String username;
    private String email;
    private String password;
    private String role;
}