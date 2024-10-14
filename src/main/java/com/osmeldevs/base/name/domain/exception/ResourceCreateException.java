package com.osmeldevs.base.name.domain.exception;

import lombok.Getter;

@Getter
public class ResourceCreateException extends Exception {

    private final String[] args;

    public ResourceCreateException(String message, String[] args, Throwable cause) {
        super(message, cause);
        this.args = args;
    }

    public ResourceCreateException(String message, String[] args) {
        super(message);
        this.args = args;
    }
}
