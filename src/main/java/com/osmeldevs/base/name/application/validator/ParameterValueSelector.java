package com.osmeldevs.base.name.application.validator;

public class ParameterValueSelector {

    public <T> T selectValue(T originalValue, T defaultValue, Validator<T> validator) {
        return validator.isValid(originalValue) ? originalValue : defaultValue;
    }
}