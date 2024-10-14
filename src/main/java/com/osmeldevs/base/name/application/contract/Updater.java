package com.osmeldevs.base.name.application.contract;

public interface Updater<T, V> {
    T update(T entity, V data);
}