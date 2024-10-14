package com.osmeldevs.base.name.application.validator;

public class PageValidator implements Validator<Integer> {

    @Override
    public boolean isValid(Integer page) {
        return page != null && page >= 0;
    }
}
