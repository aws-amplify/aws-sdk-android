/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.Preconditions;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class ClientContext {
    private static final String TAG = "ClientContext";

    // Application
    private String appPackageName = "";
    private String appTitle = "";
    private String appVersionName = "";
    private String appVersionCode = "";
    private String uniqueId = "";
    private static final String CLIENT_OBJECT_KEY = "client";

    // environment
    private String model = "";
    private String make = "";
    private String platform = "ANDROID";
    private String platformVersion = "";
    private String locale = "en-US";
    private String networkType = "";
    private String carrier = "";
    private static final String ENVIRONMENT_OBJECT_KEY = "env";

    private Map<String, String> custom = new HashMap<String, String>();
    private static final String CUSTOM_OBJECT_KEY = "custom";

    // services
    private String appId = "";
    public static final String APP_ID_KEY = "app_id";
    private static final String SERVICES_OBJECT_KEY = "services";
    private static final String MOBILE_ANALYTICS_KEY = "mobile_analytics";

    private ClientContext() {

    }

    public JSONObject toJSONObject() {

        Map<String, String> clientMap = new HashMap<String, String>();
        clientMap.put("app_package_name", appPackageName);
        clientMap.put("app_title", appTitle);
        clientMap.put("app_version_name", appVersionName);
        clientMap.put("app_version_code", appVersionCode);
        clientMap.put("client_id", uniqueId);

        Map<String, String> envMap = new HashMap<String, String>();
        envMap.put("model", model);
        envMap.put("make", make);
        envMap.put("platform", platform);
        envMap.put("platform_version", platformVersion);
        envMap.put("locale", locale);
        envMap.put("carrier", carrier);
        envMap.put("networkType", networkType);

        // services section
        Map<String, JSONObject> servicesMap =
                new HashMap<String, JSONObject>();
        Map<String, String> analyticsServiceMap = new HashMap<String, String>();
        analyticsServiceMap.put(APP_ID_KEY, appId);

        JSONObject mobileAnalytics = new JSONObject(analyticsServiceMap);
        servicesMap.put(MOBILE_ANALYTICS_KEY, mobileAnalytics);

        JSONObject clientObj = new JSONObject(clientMap);
        JSONObject envObj = new JSONObject(envMap);
        JSONObject customObj = new JSONObject(custom);
        JSONObject servicesObj = new JSONObject(servicesMap);

        JSONObject clientContextJSON = new JSONObject();
        try {
            clientContextJSON.put(CLIENT_OBJECT_KEY, clientObj);
            clientContextJSON.put(ENVIRONMENT_OBJECT_KEY, envObj);
            clientContextJSON.put(CUSTOM_OBJECT_KEY, customObj);
            clientContextJSON.put(SERVICES_OBJECT_KEY, servicesObj);
        } catch (JSONException e) {
            Log.e(TAG, "Error creating clientContextJSON", e);
            return clientContextJSON;
        }

        return clientContextJSON;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getAppPackageName() {
        return appPackageName;
    }

    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public String getAppVersionName() {
        return appVersionName;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }

    public String getAppVersionCode() {
        return appVersionCode;
    }

    public void setAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Map<String, String> getCustom() {
        return custom;
    }

    public void setCustom(Map<String, String> custom) {
        this.custom = custom;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public static class ClientContextBuilder {

        // Application
        private String appPackageName = "";
        private String appTitle = "";
        private String appVersionName = "";
        private String appVersionCode = "";
        private String uniqueId = "";

        // environment
        private String model = "";
        private String make = "";
        private String platform = "ANDROID";
        private String platformVersion = "";
        private String locale = "";
        private String networkType = "";
        private String carrier = "";
        private Map<String, String> custom = new HashMap<String, String>();

        // services
        private String appId = "";

        public ClientContextBuilder() {

        }

        public ClientContext build() {
            ClientContext result = new ClientContext();
            result.setAppPackageName(appPackageName);
            result.setAppTitle(appTitle);
            result.setAppVersionName(appVersionName);
            result.setAppVersionCode(appVersionCode);
            result.setUniqueId(uniqueId);
            result.setMake(make);
            result.setModel(model);
            result.setPlatform(platform);
            result.setPlatformVersion(platformVersion);
            result.setLocale(locale);
            result.setNetworkType(networkType);
            result.setCarrier(carrier);
            result.setCustom(custom);
            result.setAppId(appId);
            return result;
        }

        public ClientContextBuilder withCarrier(String carrier) {
            this.carrier = Preconditions.checkNotNull(carrier);
            return this;
        }

        public ClientContextBuilder withNetworkType(String networkType) {
            this.networkType = Preconditions.checkNotNull(networkType);
            return this;
        }

        public ClientContextBuilder withAppPackageName(String appPackageName) {
            this.appPackageName = Preconditions.checkNotNull(appPackageName);
            return this;
        }

        public ClientContextBuilder withAppTitle(String appTitle) {
            this.appTitle = Preconditions.checkNotNull(appTitle);
            return this;
        }

        public ClientContextBuilder withAppVersionName(String appVersionName) {
            this.appVersionName = Preconditions.checkNotNull(appVersionName);
            return this;
        }

        public ClientContextBuilder withAppVersionCode(String appVersionCode) {
            this.appVersionCode = Preconditions.checkNotNull(appVersionCode);
            return this;
        }

        public ClientContextBuilder withUniqueId(String uniqueId) {
            this.uniqueId = Preconditions.checkNotNull(uniqueId);
            return this;
        }

        public ClientContextBuilder withModel(String model) {
            this.model = Preconditions.checkNotNull(model);
            return this;
        }

        public ClientContextBuilder withMake(String make) {
            this.make = Preconditions.checkNotNull(make);
            return this;
        }

        public ClientContextBuilder withPlatformVersion(String platformVersion) {
            this.platformVersion = Preconditions.checkNotNull(platformVersion);
            return this;
        }

        public ClientContextBuilder withCustomFields(Map<String, String> customFields) {
            this.custom = Preconditions.checkNotNull(customFields);
            return this;
        }

        public ClientContextBuilder withLocale(String locale) {
            this.locale = Preconditions.checkNotNull(locale);
            return this;
        }

        public ClientContextBuilder withAppId(String appId) {
            this.appId = appId;
            return this;
        }

    }

}
