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

package com.amazonaws.mobileconnectors.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ReflectionHelpers;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Ignore("Robolectric introduced a bug in 3.x where SharedPreference#edit() hangs.")
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/test/resources/com/amazonaws/mobileconnectors/util/AndroidManifest.xml")
public class ClientContextTest {

    private Activity activity;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(Activity.class).create().start().resume().get();
    }

    @Test
    public void testClientContext() throws JSONException {
        ClientContext clientContext = new ClientContext(activity);

        String base64 = clientContext.toBase64String();
        assertNotNull(base64);

        String jsonString = new String(Base64.decode(base64), StringUtils.UTF8);
        JSONObject json = new JSONObject(jsonString);
        assertNotNull("has client info", json.getJSONObject("client"));
        assertNotNull("has device info", json.getJSONObject("env"));
    }

    @Test
    public void testClientInfo() throws JSONException {
        JSONObject client = ClientContext.getClientInfo(activity);
        assertNotNull("has installation id", client.getString("installation_id"));
        assertEquals("app_version_code", client.getString("app_version_code"), "2");
        assertEquals("app_version_name", client.getString("app_version_name"), "2.1.2");
        assertEquals("app_package_name", client.getString("app_package_name"),
                "com.amazonaws.sample");
        // for some reason, Robolectric can't handle
        assertEquals("app_title", client.getString("app_title"), "Unknown");

    }

    @Test
    public void testinstallationId() {
        String installationId = ClientContext.getInstallationId(activity);
        assertNotNull("always has installation id", installationId);
        assertTrue("matches UUID pattern", installationId.matches("\\w+-\\w+-\\w+-\\w+-\\w+"));
    }

    @Test
    public void testinstallationIdExist() {
        SharedPreferences sp = activity.getSharedPreferences(ClientContext.SHARED_PREFERENCES,
                Context.MODE_PRIVATE);
        // random UUID
        String installationId = "2d9a130e-1c3b-40c7-8953-c7c4aea3d6fa";
        sp.edit().putString("installation_id", installationId).commit();
        assertEquals(installationId, ClientContext.getInstallationId(activity));
    }

    @Test
    public void testDeviceInfo() throws JSONException {
        ReflectionHelpers.setStaticField(Build.class, "MANUFACTURER", "Samsung");
        ReflectionHelpers.setStaticField(Build.class, "MODEL", "HTC");
        ReflectionHelpers.setStaticField(Build.VERSION.class, "RELEASE", "2.3.3");

        JSONObject device = ClientContext.getDeviceInfo(activity);
        assertEquals("platform is hard coded Android", device.getString("platform"), "Android");
        assertEquals("model", device.getString("model"), "HTC");
        assertEquals("make", device.getString("make"), "Samsung");
        assertEquals("platform_version", device.getString("platform_version"), "2.3.3");
        assertEquals("locale", device.getString("locale"), Locale.getDefault().toString());
    }

    @Test
    public void testCustomContext() throws JSONException {
        ClientContext clientContext = new ClientContext(activity);
        Map<String, String> map = new HashMap<String, String>();
        map.put("first_name", "John");
        map.put("last_name", "Doe");
        clientContext.putCustomContext(map);

        JSONObject json = clientContext.getJson();
        JSONObject custom = json.getJSONObject("custom");
        assertNotNull("has custom", custom);
        assertEquals("first_name", custom.getString("first_name"), "John");
        assertEquals("last_name", custom.getString("last_name"), "Doe");
    }

    @Test
    public void testServiceContext() throws JSONException {
        ClientContext clientContext = new ClientContext(activity);
        Map<String, String> map = new HashMap<String, String>();
        map.put("app_id", "mobile_analytics_app_id");
        clientContext.putServiceContext("mobile_analytics", map);

        JSONObject json = clientContext.getJson();
        JSONObject services = json.getJSONObject("services");
        assertNotNull("has services", services);
        assertTrue(services.length() == 1);

        JSONObject mobileAnalytics = services.getJSONObject("mobile_analytics");
        assertNotNull("has mobile_analytics", mobileAnalytics);
        assertEquals("app_id", mobileAnalytics.getString("app_id"), "mobile_analytics_app_id");
    }
}
