package com.osmeldevs.base.name.application.validator;

public class SizeValidator implements Validator<Integer> {

    @Override
    public boolean isValid(Integer size) {
        return size != null && size >= 1;
    }
}

