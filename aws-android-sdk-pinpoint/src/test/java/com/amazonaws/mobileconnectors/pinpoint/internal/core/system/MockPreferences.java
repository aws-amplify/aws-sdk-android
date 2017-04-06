/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.core.system;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MockPreferences extends AndroidPreferences {
    private static final String TAG = "MockPreferences";

    final Map<String, String> prefs = new ConcurrentHashMap<String, String>();

    @Override
    public boolean getBoolean(String key, boolean optValue) {
        boolean value = optValue;
        if (prefs.containsKey(key)) {
            value = Boolean.parseBoolean(prefs.get(key));
        }
        return value;
    }

    @Override
    public int getInt(String key, int optValue) {
        int value = optValue;
        if (prefs.containsKey(key)) {
            value = Integer.parseInt(prefs.get(key));
        }
        return value;
    }

    @Override
    public float getFloat(String key, float optValue) {
        float value = optValue;
        if (prefs.containsKey(key)) {
            value = Float.parseFloat(prefs.get(key));
        }
        return value;
    }

    @Override
    public long getLong(String key, long optValue) {
        long value = optValue;
        if (prefs.containsKey(key)) {
            value = Long.parseLong(prefs.get(key));
        }
        return value;
    }

    @Override
    public String getString(String key, String optValue) {
        String value = optValue;
        if (prefs.containsKey(key) && prefs.get(key).length() > 0) {
            value = prefs.get(key);
        }
        return value;
    }

    @Override
    public void putBoolean(String key, boolean value) {
        prefs.put(key, String.valueOf(value));
    }

    @Override
    public void putInt(String key, int value) {
        prefs.put(key, String.valueOf(value));
    }

    @Override
    public void putFloat(String key, float value) {
        prefs.put(key, String.valueOf(value));
    }

    @Override
    public void putLong(String key, long value) {
        prefs.put(key, String.valueOf(value));
    }

    @Override
    public void putString(String key, String value) {
        prefs.put(key, value);
    }

}
