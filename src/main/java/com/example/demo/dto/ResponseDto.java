package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor(staticName = "set")
public class ResponseDto {
    private boolean result;

    private String message;


    public static ResponseDto setSuccess(String message) {
        return ResponseDto.set(true, message);
    }

    public static ResponseDto setFailed(String message) {
        return ResponseDto.set(false, message);
    }
}