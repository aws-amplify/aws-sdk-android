/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/**
 * A class that consists of app info, device info, additional service info, and
 * user defined data.
 *
 * <pre>
 * <code>{@code
 * ClientContext clientContext = new ClientContext(activity);
 *
 * Map<String, String> map = new HashMap<String, String>();
 * map.put("first_name", "John");
 * map.put("last_name", "Doe");
 * clientContext.putCustomContext(map);
 *
 * clientContext.putServiceContext("mobile_analytics", serviceContext);
 *
 * String base64 = clientContext.toBase64String();
 * }</code>
 * </pre>
 */
public class ClientContext {
    private static final Log LOGGER = LogFactory.getLog(ClientContext.class);

    /**
     * Name of the shared preferences where client id is saved.
     */
    static final String SHARED_PREFERENCES = "com.amazonaws.common";

    private final JSONObject json;
    private String base64String;

    /**
     * Constructs a new client context.
     *
     * @param context context of the app
     */
    public ClientContext(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null");
        }

        json = new JSONObject();
        try {
            json.put("client", getClientInfo(context))
                    .put("env", getDeviceInfo(context));
        } catch (final JSONException e) {
            throw new AmazonClientException("Failed to build client context", e);
        }
    }

    /**
     * Gets the installation id from shared preferences. A new one will be
     * assigned if not found. The installation id is unique per app
     * installation. This value appears as installation_id in client context
     * object in AWS Lambda.
     *
     * @param context context of the app
     * @return the unique installation id per app installation
     * @see <a
     *      href="http://docs.aws.amazon.com/lambda/latest/dg/nodejs-prog-model-context.html">The
     *      Context Object (Node.js)</a>
     */
    public static String getInstallationId(Context context) {
        final SharedPreferences sp = context.getSharedPreferences(SHARED_PREFERENCES,
                Context.MODE_PRIVATE);
        String installationId = sp.getString("installation_id", null);
        if (installationId == null) {
            installationId = UUID.randomUUID().toString();
            sp.edit().putString("installation_id", installationId).commit();
        }
        return installationId;
    }

    /**
     * Gets the client info, including installation_id_id, app_title,
     * app_version_name, app_version_code, and app_package_name.
     *
     * @param context context of the app
     * @return an JSONObject that has the client info
     * @throws JSONException
     */
    static JSONObject getClientInfo(Context context) throws JSONException {
        final JSONObject client = new JSONObject();

        final PackageManager packageManager = context.getPackageManager();
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            final ApplicationInfo applicationInfo = context.getApplicationInfo();

            client.put("installation_id", getInstallationId(context))
                    .put("app_version_name", packageInfo.versionName)
                    .put("app_version_code", String.valueOf(packageInfo.versionCode))
                    .put("app_package_name", packageInfo.packageName);
            // If null is returned for some reason, fall back to "Unknown"
            final CharSequence title = packageManager.getApplicationLabel(applicationInfo);
            client.put("app_title", title == null ? "Unknown" : title.toString());
        } catch (final NameNotFoundException e) {
            // When device starts, PackageManager will gather package
            // information by scanning them. It will take a while to finish.
            // This exception may be thrown when scan doesn't finish.
            LOGGER.warn("Failed to load package info: " + context.getPackageName(), e);
        }

        return client;
    }

    /**
     * Gets the device info, including platform, model, make, platform_version,
     * and locale.
     *
     * @param context context of the app
     * @return an JSONObject that has the device info
     * @throws JSONException
     */
    static JSONObject getDeviceInfo(Context context) throws JSONException {
        final JSONObject env = new JSONObject()
                .put("platform", "Android")
                .put("model", Build.MODEL)
                .put("make", Build.MANUFACTURER)
                .put("platform_version", Build.VERSION.RELEASE)
                .put("locale", Locale.getDefault().toString());
        return env;
    }

    /**
     * Adds additional user defined key-value pairs to the client context under
     * "custom". This method is not thread safe.
     *
     * <pre>
     * <code>{@code
     * Map<String, String> map = new HashMap<String, String>();
     * map.put("first_name", "John");
     * map.put("last_name", "Doe");
     * clientContext.putCustomContext(map);
     * }</code>
     * </pre>
     *
     * The above code will add a Json object under "custom" as following.
     *
     * <pre>
     * {
     *   "custom": {
     *     "first_name":"John",
     *     "last_name":"Doe"
     *   }
     * }
     * </pre>
     *
     * @param map the custom key-value context map
     */
    public void putCustomContext(Map<String, String> map) {
        // clear serialized string when content is changed.
        base64String = null;
        try {
            json.put("custom", new JSONObject(map));
        } catch (final JSONException e) {
            throw new AmazonClientException("Failed to add user defined context", e);
        }
    }

    /**
     * Sets service context under key "services". This will overwrite the
     * service context of the same service name. This method isn't thread safe.
     *
     * <pre>
     * {
     *   "services": {
     *     "mobile_analytics": {
     *       "app_id":"mobile_analytics_app_id"
     *     }
     *   }
     * }
     * </pre>
     *
     * @param service service name
     * @param map the service key-value context map
     */
    public void putServiceContext(String service, Map<String, String> map) {
        // clear serialized string when content is changed.
        base64String = null;
        try {
            if (!json.has("services")) {
                json.put("services", new JSONObject());
            }
            final JSONObject services = json.getJSONObject("services");
            services.put(service, new JSONObject(map));
        } catch (final JSONException e) {
            throw new AmazonClientException("Failed to add service context", e);
        }
    }

    /**
     * Serializes the client context into a base64 encoded Json string.
     *
     * @return a based64 encoded Json string
     */
    public String toBase64String() {
        if (base64String == null) {
            synchronized (this) {
                if (base64String == null) {
                    base64String = Base64
                            .encodeAsString(json.toString().getBytes(StringUtils.UTF8));
                }
            }
        }
        return base64String;
    }

    /**
     * Gets the underlying JSONObject of this client context. Warning: any
     * change to the JSONObject will also change the client context.
     *
     * @return JSONObject that represents the client context
     */
    JSONObject getJson() {
        return json;
    }
}
