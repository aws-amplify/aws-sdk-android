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

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.ClientContext.ClientContextBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public final class DefaultEvent implements InternalEvent {

    private static final String TAG = "DefaultEvent";

    private final String eventType;
    private final String sdkName;
    private final String sdkVersion;
    private final String sessionId;
    private final Long sessionStart;
    private final Long sessionStop;
    private final Long sessionDuration;
    private final Map<String, String> attributes = new ConcurrentHashMap<String, String>();
    private final Map<String, Double> metrics = new ConcurrentHashMap<String, Double>();
    private final Long timestamp;
    private final Id uniqueId;
    private final AppDetails appDetails;
    private final DeviceDetails deviceDetails;

    public static DefaultEvent createFromEvent(AnalyticsContext context, String sessionId,
            long timestamp, InternalEvent copyEvent) {
        return new DefaultEvent(copyEvent.getEventType(), copyEvent.getAllAttributes(),
                copyEvent.getAllMetrics(),
                context.getSDKInfo(), sessionId, copyEvent.getSessionStart(),
                copyEvent.getSessionStop(),
                copyEvent.getSessionDuration(), timestamp, context.getUniqueId(),
                context.getSystem()
                        .getAppDetails(), context.getSystem().getDeviceDetails());
    }

    public static DefaultEvent newInstance(AnalyticsContext context, String sessionId,
            Long sessionStart, Long sessionEnd, Long duration, long timestamp,
            final String eventType) {
        return new DefaultEvent(eventType, null, null, context.getSDKInfo(), sessionId,
                sessionStart, sessionEnd, duration, timestamp, context.getUniqueId(),
                context.getSystem().getAppDetails(), context.getSystem().getDeviceDetails());
    }

    public static DefaultEvent newInstance(final String eventType,
            final Map<String, String> attributes, final Map<String, Double> metrics,
            final SDKInfo sdkInfo, String sessionId, Long sessionStart, Long sessionStop,
            Long sessionDuration, long timestamp, Id uniqueId, AppDetails appDetails,
            DeviceDetails deviceDetails) {
        return new DefaultEvent(eventType, attributes, metrics, sdkInfo, sessionId, sessionStart,
                sessionStop, sessionDuration, timestamp, uniqueId, appDetails,
                deviceDetails);
    }

    DefaultEvent(final String eventType, final Map<String, String> attributes,
            final Map<String, Double> metrics, final SDKInfo sdkInfo,
            String sessionId, long sessionStart, Long sessionEnd, Long sessionDuration,
            long timestamp, Id uniqueId,
            AppDetails appDetails, DeviceDetails deviceDetails) {
        this.sdkName = sdkInfo.getName();
        this.sdkVersion = sdkInfo.getVersion();
        this.sessionId = sessionId;
        this.sessionStart = sessionStart;
        this.sessionStop = sessionEnd;
        this.sessionDuration = sessionDuration;
        this.timestamp = timestamp;
        this.uniqueId = uniqueId;
        this.eventType = eventType;
        this.appDetails = appDetails;
        this.deviceDetails = deviceDetails;
        if (null != attributes) {
            for (Entry<String, String> kvp : attributes.entrySet()) {
                this.addAttribute(kvp.getKey(), kvp.getValue());
            }
        }
        if (null != metrics) {
            for (Entry<String, Double> kvp : metrics.entrySet()) {
                this.addMetric(kvp.getKey(), kvp.getValue());
            }
        }
    }

    @Override
    public void addAttribute(String name, String value) {
        if (null == name) {
            return;
        }

        if (null != value) {
            attributes.put(name, value);
        } else {
            attributes.remove(name);
        }
    }

    @Override
    public boolean hasAttribute(String attributeName) {
        if (attributeName == null) {
            return false;
        }
        return attributes.containsKey(attributeName);
    }

    @Override
    public void addMetric(String name, Double value) {
        if (null == name) {
            return;
        }

        if (null != value) {
            metrics.put(name, value);
        } else {
            metrics.remove(name);
        }
    }

    @Override
    public boolean hasMetric(String metricName) {
        if (metricName == null) {
            return false;
        }
        return metrics.containsKey(metricName);
    }

    @Override
    public String getEventType() {
        return this.eventType;
    }

    @Override
    public String getAttribute(String name) {
        if (name == null) {
            return null;
        }
        return attributes.get(name);
    }

    @Override
    public Double getMetric(String name) {
        if (name == null) {
            return null;
        }
        return metrics.get(name);
    }

    @Override
    public String getSessionId() {
        return sessionId;
    }

    @Override
    public Long getEventTimestamp() {
        return timestamp;
    }

    @Override
    public Id getUniqueId() {
        return uniqueId;
    }

    @Override
    public String getSdkName() {
        return sdkName;
    }

    @Override
    public String getSdkVersion() {
        return sdkVersion;
    }

    @Override
    public DefaultEvent withAttribute(String name, String value) {
        addAttribute(name, value);
        return this;
    }

    @Override
    public DefaultEvent withMetric(String name, Double value) {
        addMetric(name, value);
        return this;
    }

    @Override
    public Map<String, String> getAllAttributes() {
        return Collections.unmodifiableMap(attributes);
    }

    @Override
    public Map<String, Double> getAllMetrics() {
        return Collections.unmodifiableMap(metrics);
    }

    @Override
    public String toString() {
        JSONObject json = toJSONObject();
        try {
            return json.toString(4);
        } catch (JSONException e) {
            return json.toString();
        }
    }

    @Override
    public JSONObject toJSONObject() {
        Locale locale = this.deviceDetails.locale();
        String localeString = locale != null ? locale.toString() : "UNKNOWN";

        JSONBuilder builder = new JSONBuilder(this);

        // ****************************************************
        // ==================System Attributes=================
        // ****************************************************
        builder.withAttribute("event_type", getEventType());
        builder.withAttribute("unique_id", getUniqueId().getValue());
        builder.withAttribute("timestamp", getEventTimestamp());

        // ****************************************************
        // ==============Device Details Attributes=============
        // ****************************************************
        builder.withAttribute("platform", this.deviceDetails.platform());
        builder.withAttribute("platform_version", this.deviceDetails.platformVersion());
        builder.withAttribute("make", this.deviceDetails.manufacturer());
        builder.withAttribute("model", this.deviceDetails.model());
        builder.withAttribute("locale", localeString);
        builder.withAttribute("carrier", this.deviceDetails.carrier());

        // ****************************************************
        // ==============Session Attributes=============
        // ****************************************************
        JSONObject sessionObject = new JSONObject();
        try {
            sessionObject.put("id", sessionId);
            if (sessionStart != null) {
                sessionObject.put("startTimestamp", sessionStart);
            }
            if (sessionStop != null) {
                sessionObject.put("stopTimestamp", sessionStop);
            }
            if (sessionDuration != null) {
                sessionObject.put("duration", sessionDuration.longValue());
            }
        } catch (JSONException e) {
            Log.e(TAG, "Error serializing session information", e);
        }
        builder.withAttribute("session", sessionObject);

        // ****************************************************
        // ====SDK Details Attributes -- Prefix with 'sdk_'====
        // ****************************************************
        builder.withAttribute("sdk_version", this.sdkVersion);
        builder.withAttribute("sdk_name", this.sdkName);

        // ****************************************************
        // Application Details Attributes -- Prefix with 'app_'
        // ****************************************************
        builder.withAttribute("app_version_name", this.appDetails.versionName());
        builder.withAttribute("app_version_code", this.appDetails.versionCode());
        builder.withAttribute("app_package_name", this.appDetails.packageName());
        builder.withAttribute("app_title", this.appDetails.getAppTitle());
        builder.withAttribute(ClientContext.APP_ID_KEY, this.appDetails.getAppId());

        JSONObject attributesJson = new JSONObject();
        for (Entry<String, String> entry : getAllAttributes().entrySet()) {
            try {
                attributesJson.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
            }
        }

        JSONObject metricsJson = new JSONObject();
        for (Entry<String, Double> entry : getAllMetrics().entrySet()) {
            try {
                metricsJson.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                Log.e(TAG, "error serializing metric. key:'" + entry.getKey() + "', value: "
                        + entry.getValue().toString(), e);
            }
        }

        // If there are any attributes put then add the attributes to the
        // structure
        if (attributesJson.length() > 0) {
            builder.withAttribute("attributes", attributesJson);
        }

        // If there are any metrics put then add the attributes to the structure
        if (metricsJson.length() > 0) {
            builder.withAttribute("metrics", metricsJson);
        }
        return builder.toJSONObject();
    }

    @Override
    public ClientContext createClientContext(String networkType) {
        ClientContextBuilder builder = new ClientContext.ClientContextBuilder();
        builder.withAppPackageName(appDetails.packageName())
                .withAppVersionCode(appDetails.versionCode())
                .withAppVersionName(appDetails.versionName())
                .withLocale(deviceDetails.locale().toString())
                .withMake(deviceDetails.manufacturer()).withModel(deviceDetails.model())
                .withPlatformVersion(deviceDetails.platformVersion())
                .withUniqueId(uniqueId.getValue())
                .withAppTitle(appDetails.getAppTitle()).withNetworkType(networkType)
                .withCarrier(deviceDetails.carrier())
                .withAppId(appDetails.getAppId());
        return builder.build();
    }

    @Override
    public long getSessionStart() {
        return sessionStart;
    }

    @Override
    public Long getSessionStop() {
        return sessionStop;
    }

    @Override
    public Long getSessionDuration() {
        return sessionDuration;
    }
}
