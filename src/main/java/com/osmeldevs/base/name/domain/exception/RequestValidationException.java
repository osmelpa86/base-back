package com.osmeldevs.base.name.domain.exception;

import com.osmeldevs.base.name.application.controller.common.error.response.FieldErrorResponse;
import lombok.Getter;

import java.util.List;

@Getter
public class RequestValidationException extends Exception {

    private final List<FieldErrorResponse> fieldErrors;

    public RequestValidationException(String message, List<FieldErrorResponse> fieldErrors) {
        super(message);
        this.fieldErrors = fieldErrors;
    }

}

