package com.osmeldevs.base.name.application.exception;

import lombok.Getter;

@Getter
public class ValueDeserializationException extends Exception {

    private final String fieldName;

    public ValueDeserializationException(String message, String fieldName, Throwable cause) {
        super(message, cause);
        this.fieldName = fieldName;
    }

}

