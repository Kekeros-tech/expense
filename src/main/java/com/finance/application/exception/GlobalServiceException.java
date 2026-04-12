package com.finance.application.exception;

import lombok.Getter;

@Getter
public class GlobalServiceException extends RuntimeException {
    private final ServiceErrorCode errorCode;

    public GlobalServiceException(ServiceErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
