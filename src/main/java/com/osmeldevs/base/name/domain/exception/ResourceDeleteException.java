package com.osmeldevs.base.name.domain.exception;

import lombok.Getter;

@Getter
public class ResourceDeleteException extends Exception {

    private final String[] args;

    public ResourceDeleteException(String message, String[] args, Throwable cause) {
        super(message, cause);
        this.args = args;
    }

    public ResourceDeleteException(String message, String[] args) {
        super(message);
        this.args = args;
    }

}
