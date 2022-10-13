package com.sparta.merong.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoAuthorityException extends RuntimeException{

    public NoAuthorityException(String message) {
        super(message);
    }
}