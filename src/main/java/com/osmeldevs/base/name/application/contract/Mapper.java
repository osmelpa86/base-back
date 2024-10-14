package com.osmeldevs.base.name.application.contract;

public interface Mapper<T, V> {
    V map(T input);
}
