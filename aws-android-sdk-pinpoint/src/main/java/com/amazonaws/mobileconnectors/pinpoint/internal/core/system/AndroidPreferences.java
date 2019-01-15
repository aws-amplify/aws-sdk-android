/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.core.system;

import android.content.Context;
import android.content.SharedPreferences;

public class AndroidPreferences {

    private final SharedPreferences preferences;

    public AndroidPreferences() {
        preferences = null;
    }

    public AndroidPreferences(final Context context,
                                     final String preferencesKey) {
        preferences = context.getSharedPreferences(preferencesKey,
                                                          Context.MODE_PRIVATE);
    }

    public boolean getBoolean(String key, boolean optValue) {
        return preferences.getBoolean(key, optValue);
    }

    public int getInt(String key, int optValue) {
        return preferences.getInt(key, optValue);
    }

    public float getFloat(String key, float optValue) {
        return preferences.getFloat(key, optValue);
    }

    public long getLong(String key, long optValue) {
        return preferences.getLong(key, optValue);
    }

    public String getString(String key, String optValue) {
        return preferences.getString(key, optValue);
    }

    public void putBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void putInt(String key, int value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public void putFloat(String key, float value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(key, value);
        editor.commit();
    }

    public void putLong(String key, long value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

}
