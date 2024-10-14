package com.osmeldevs.base.name.shared.util;

public class Utils {
    public static String wrapToLike(String value) {
        return value == null ? "%" : "%" + value.toLowerCase() + "%";
    }
}
