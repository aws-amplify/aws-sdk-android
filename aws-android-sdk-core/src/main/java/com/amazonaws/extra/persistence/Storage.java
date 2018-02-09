package com.amazonaws.extra.persistence;

public interface Storage {

    boolean contains(String key);

    String getValue(String key, String defaultValue);

    String put(String key, String value);

    String remove(String key);

    void clear();
}
