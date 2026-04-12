package com.finance.application.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ServiceErrorCode {
    PARAMETER_ERROR("Parameter error", HttpStatus.BAD_REQUEST),
    INTERNAL_ERROR("Внутренняя ошибка сервера", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String message;
    private final HttpStatus status;

    ServiceErrorCode(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
