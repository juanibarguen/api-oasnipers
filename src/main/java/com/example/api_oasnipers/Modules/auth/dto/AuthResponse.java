package com.example.api_oasnipers.Modules.auth.dto;

import com.example.api_oasnipers.Modules.user.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    String token;
    User user;
}
