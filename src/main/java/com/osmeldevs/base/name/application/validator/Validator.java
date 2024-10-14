package com.osmeldevs.base.name.application.validator;

public interface Validator<T> {

    boolean isValid(T parameter);
}
