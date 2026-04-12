package com.finance.interfaces.rest;

//@RestControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(GlobalServiceException.class)
//    public ResponseEntity<ErrorDto> handleGlobalServiceException(GlobalServiceException ex) {
//        ServiceErrorCode errorCode = ex.getErrorCode();
//        ErrorDto errorBody = new ErrorDto(errorCode.getStatus().name(), errorCode.getMessage());
//        return ResponseEntity.status(errorCode.getStatus()).body(errorBody);
//    }
//}
