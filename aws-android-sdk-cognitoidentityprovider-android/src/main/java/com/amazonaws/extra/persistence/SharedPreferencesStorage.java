package com.amazonaws.extra.persistence;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesStorage implements Storage {

    private final SharedPreferences prefs;

    public SharedPreferencesStorage(Context context, String name) {
        prefs = context.getApplicationContext().getSharedPreferences(name, Context.MODE_PRIVATE);        
    }
    
    @Override
    public boolean contains(String key) {
        return prefs.contains(key);
    }

    @Override
    public String getValue(String key, String defaultValue) {
        return prefs.getString(key, defaultValue);
    }

    @Override
    public String put(String key, String value) {
        prefs.edit().putString(key, value).apply();
        return key;
    }

    @Override
    public String remove(String key) {
        prefs.edit().remove(key).apply();
        return key;
    }

    @Override
    public void clear() {
        prefs.edit().clear().apply();
    }
}
