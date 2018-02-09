package com.amazonaws.extra.persistence;

import java.util.HashMap;
import java.util.Map;

public class StorageMemory implements Storage {

    private Map<String, String> keyValues = new HashMap<>();

    public boolean contains(String key) {
        return keyValues.containsKey(key);
    }

    public String getValue(String key, String defaultValue) {
        String value;
        return (value = keyValues.get(key)) == null
                && !keyValues.containsKey(key) ? defaultValue : value;
    }

    public String put(String key, String value) {
        return keyValues.put(key, value);
    }

    public String remove(String key) {
        return keyValues.remove(key);
    }

    public void clear() {
        keyValues.clear();
    }
}
