package com.example.demo.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class LoginDto {
    @NonNull
    @Column(length = 30)
    private String userId;

    @NonNull
    @Column(length = 30)
    private String userPw;


    @Column(length = 50)
    private String userEmail;
}