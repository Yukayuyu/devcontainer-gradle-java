package com.example.demo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserDto {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @Email
    private String email;

    @NotNull
    private String password;
}
