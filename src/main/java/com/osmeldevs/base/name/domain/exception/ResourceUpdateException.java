package com.osmeldevs.base.name.domain.exception;

import lombok.Getter;

@Getter
public class ResourceUpdateException extends Exception {

    private final String[] args;

    public ResourceUpdateException(String message, String[] args) {
        super(message);
        this.args = args;
    }

    public ResourceUpdateException(String message, String[] args, Throwable cause) {
        super(message, cause);
        this.args = args;
    }

}

