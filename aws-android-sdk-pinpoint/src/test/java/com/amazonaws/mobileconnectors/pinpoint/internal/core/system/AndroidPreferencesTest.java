/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class AndroidPreferencesTest extends MobileAnalyticsTestBase {

    // This is the suffix we use. In real code we prepend this with the appId
    private static final String preferencesKey = "515d6767-01b7-49e5-8273-c8d11b0f331d";

    private SharedPreferences pref;
    private Context context;

    @Before
    public void setup() {
        context = RuntimeEnvironment.application.getApplicationContext();
        pref = context.getSharedPreferences(preferencesKey,
                                                   Context.MODE_PRIVATE);
    }

    @Test
    public void getBoolean_test() {
        pref.edit().putBoolean("boolean", true).commit();
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        boolean value = preferences.getBoolean("boolean", false);
        assertThat(value, is(true));
    }

    @Test
    public void getInt_test() {
        pref.edit().putInt("int", 1).commit();
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        int value = preferences.getInt("int", 0);
        assertThat(value, is(1));
    }

    @Test
    public void getFloat_test() {
        pref.edit().putFloat("float", 1.0f).commit();
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        float value = preferences.getFloat("float", 0.0f);
        assertThat(value, is(1.0f));
    }

    @Test
    public void getLong_test() {
        pref.edit().putLong("long", 1L).commit();
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        long value = preferences.getLong("long", 0L);
        assertThat(value, is(1L));
    }

    @Test
    public void getString_test() {
        pref.edit().putString("string", "value").commit();
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        String value = preferences.getString("string", "other");
        assertThat(value, is("value"));
    }

    @Test
    public void putBoolean_test() {
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        preferences.putBoolean("boolean", true);

        assertTrue(pref.getBoolean("boolean", false));
    }

    @Test
    public void putInt_test() {
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        preferences.putInt("int", 1);
        assertEquals(pref.getInt("int", 5), 1);
    }

    @Test
    public void putFloat_test() {
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        preferences.putFloat("float", 1.0f);
        assertEquals(pref.getFloat("float", 5.0f), 1.0f, .05f);
    }

    @Test
    public void putLong_test() {
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        preferences.putLong("long", 1L);
        assertEquals(pref.getLong("long", 5L), 1L);
    }

    @Test
    public void putString_test() {
        AndroidPreferences preferences = new AndroidPreferences(context,
                                                                       preferencesKey);
        preferences.putString("string", "value");
        assertSame(pref.getString("string", "nonValue"), "value");
    }
}
