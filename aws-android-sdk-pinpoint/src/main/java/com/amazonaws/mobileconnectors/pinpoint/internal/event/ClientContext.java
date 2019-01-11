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

package com.amazonaws.mobileconnectors.pinpoint.internal.event;

import java.util.HashMap;
import java.util.Map;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions;

public class ClientContext {
    public static final String APP_ID_KEY = "app_id";
    private static final Log log =
            LogFactory.getLog(ClientContext.class);
    private static final String CLIENT_OBJECT_KEY = "client";
    private static final String ENVIRONMENT_OBJECT_KEY = "env";
    private static final String CUSTOM_OBJECT_KEY = "custom";
    private static final String SERVICES_OBJECT_KEY = "services";
    private static final String MOBILE_ANALYTICS_KEY = "mobile_analytics";
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
    private String locale = "en-US";
    private String networkType = "";
    private String carrier = "";
    private Map<String, String> custom = new HashMap<String, String>();
    // services
    private String appId = "";

    private ClientContext() {

    }

    public JSONObject toJSONObject() {

        final Map<String, String> clientMap = new HashMap<String, String>();
        clientMap.put("app_package_name", appPackageName);
        clientMap.put("app_title", appTitle);
        clientMap.put("app_version_name", appVersionName);
        clientMap.put("app_version_code", appVersionCode);
        clientMap.put("client_id", uniqueId);

        final Map<String, String> envMap = new HashMap<String, String>();
        envMap.put("model", model);
        envMap.put("make", make);
        envMap.put("platform", platform);
        envMap.put("platform_version", platformVersion);
        envMap.put("locale", locale);
        envMap.put("carrier", carrier);
        envMap.put("networkType", networkType);

        // services section
        final Map<String, JSONObject> servicesMap = new HashMap<String, JSONObject>();
        final Map<String, String> analyticsServiceMap = new HashMap<String, String>();
        analyticsServiceMap.put(APP_ID_KEY, appId);

        final JSONObject mobileAnalytics = new JSONObject(analyticsServiceMap);
        servicesMap.put(MOBILE_ANALYTICS_KEY, mobileAnalytics);

        final JSONObject clientObj = new JSONObject(clientMap);
        final JSONObject envObj = new JSONObject(envMap);
        final JSONObject customObj = new JSONObject(custom);
        final JSONObject servicesObj = new JSONObject(servicesMap);

        final JSONObject clientContextJSON = new JSONObject();
        try {
            clientContextJSON.put(CLIENT_OBJECT_KEY, clientObj);
            clientContextJSON.put(ENVIRONMENT_OBJECT_KEY, envObj);
            clientContextJSON.put(CUSTOM_OBJECT_KEY, customObj);
            clientContextJSON.put(SERVICES_OBJECT_KEY, servicesObj);
        } catch (final JSONException e) {
            // Do not log clientContextJSON/exception due to potential sensitive information.
            log.error("Error creating clientContextJSON.");
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

        private final String platform = "ANDROID";
        // Application
        private String appPackageName = "";
        private String appTitle = "";
        private String appVersionName = "";
        private String appVersionCode = "";
        private String uniqueId = "";
        // environment
        private String model = "";
        private String make = "";
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
            final ClientContext result = new ClientContext();
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

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withCarrier(String carrier) {
            this.carrier = Preconditions.checkNotNull(carrier);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withNetworkType(String networkType) {
            this.networkType = Preconditions.checkNotNull(networkType);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withAppPackageName(String appPackageName) {
            this.appPackageName = Preconditions.checkNotNull(appPackageName);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withAppTitle(String appTitle) {
            this.appTitle = Preconditions.checkNotNull(appTitle);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withAppVersionName(String appVersionName) {
            this.appVersionName = Preconditions.checkNotNull(appVersionName);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withAppVersionCode(String appVersionCode) {
            this.appVersionCode = Preconditions.checkNotNull(appVersionCode);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withUniqueId(String uniqueId) {
            this.uniqueId = Preconditions.checkNotNull(uniqueId);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withModel(String model) {
            this.model = Preconditions.checkNotNull(model);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withMake(String make) {
            this.make = Preconditions.checkNotNull(make);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withPlatformVersion(String platformVersion) {
            this.platformVersion = Preconditions.checkNotNull(platformVersion);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withCustomFields(Map<String, String> customFields) {
            this.custom = Preconditions.checkNotNull(customFields);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withLocale(String locale) {
            this.locale = Preconditions.checkNotNull(locale);
            return this;
        }

        @SuppressWarnings("checkstyle:hiddenfield")
        public ClientContextBuilder withAppId(String appId) {
            this.appId = appId;
            return this;
        }

    }

}
