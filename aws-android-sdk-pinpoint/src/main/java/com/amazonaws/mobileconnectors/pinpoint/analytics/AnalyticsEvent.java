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

package com.amazonaws.mobileconnectors.pinpoint.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidAppDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidDeviceDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;
import com.amazonaws.mobileconnectors.pinpoint.internal.event.ClientContext;

/**
 * Represents an AnalyticsEvent
 */
public class AnalyticsEvent implements JSONSerializable {

    static final int MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH = 50;
    static final int MAX_EVENT_ATTRIBUTE_VALUE_LENGTH = 1000;
    static final int MAX_NUM_OF_METRICS_AND_ATTRIBUTES = 50;
    private static final Log log = LogFactory.getLog(AnalyticsEvent.class);
    private static final int INDENTATION = 4;
    private final String eventId;
    private final String eventType;
    private final String sdkName;
    private final String sdkVersion;
    private final PinpointSession session;
    private final Map<String, String> attributes = new ConcurrentHashMap<String, String>();
    private final Map<String, Double> metrics = new ConcurrentHashMap<String, Double>();
    private final Long timestamp;
    private final String uniqueId;
    private final AndroidAppDetails appDetails;
    private final AndroidDeviceDetails deviceDetails;
    private final AtomicInteger currentNumOfAttributesAndMetrics = new AtomicInteger(0);

    AnalyticsEvent(final String eventType, final Map<String, String> attributes, final Map<String, Double> metrics, final SDKInfo sdkInfo,
                   final String sessionId, final long sessionStart, final Long sessionEnd, final Long sessionDuration, final long timestamp,
                   final String uniqueId, final AndroidAppDetails appDetails, final AndroidDeviceDetails deviceDetails) {
        this(UUID.randomUUID().toString(), eventType, attributes, metrics, sdkInfo, sessionId, sessionStart, sessionEnd, sessionDuration,
             timestamp, uniqueId, appDetails, deviceDetails);
    }

    private AnalyticsEvent(final String eventId, final String eventType, final Map<String, String> attributes,
                           final Map<String, Double> metrics, final SDKInfo sdkInfo, final String sessionId, final long sessionStart,
                           final Long sessionEnd, final Long sessionDuration, final long timestamp, final String uniqueId,
                           final AndroidAppDetails appDetails, final AndroidDeviceDetails deviceDetails) {
        this.eventId = eventId;
        this.sdkName = sdkInfo.getName();
        this.sdkVersion = sdkInfo.getVersion();
        this.session = new PinpointSession(sessionId, sessionStart, sessionEnd, sessionDuration);
        this.timestamp = timestamp;
        this.uniqueId = uniqueId;
        this.eventType = eventType;
        this.appDetails = appDetails;
        this.deviceDetails = deviceDetails;
        if (null != attributes) {
            for (final Entry<String, String> kvp : attributes.entrySet()) {
                this.addAttribute(kvp.getKey(), kvp.getValue());
            }
        }
        if (null != metrics) {
            for (final Entry<String, Double> kvp : metrics.entrySet()) {
                this.addMetric(kvp.getKey(), kvp.getValue());
            }
        }
    }

    /**
     * Creates a copy of an event with specified parameters
     *
     * @param context   The Pinpoint context
     * @param sessionId The SessionId of the new event
     * @param timestamp The timestamp of the new event
     * @param copyEvent The event to be copied
     * @return An instance of an AnalyticsEvent object
     */
    public static AnalyticsEvent createFromEvent(final PinpointContext context, final String sessionId, final long timestamp,
                                                 final AnalyticsEvent copyEvent) {
        return new AnalyticsEvent(copyEvent.getEventId(), copyEvent.getEventType(), copyEvent.getAllAttributes(), copyEvent.getAllMetrics(),
                                  context.getSDKInfo(), sessionId, copyEvent.getSession().getSessionStart(),
                                  copyEvent.getSession().getSessionStop(), copyEvent.getSession().getSessionDuration(), timestamp,
                                  context.getUniqueId(), context.getSystem().getAppDetails(), context.getSystem().getDeviceDetails());
    }

    /**
     * Creates a new instance of an AnalyticsEvent
     *
     * @param context      The Pinpoint context
     * @param sessionId    The SessionId of the new event
     * @param sessionStart The sessionStart of the new event
     * @param sessionEnd   The sessionEnd of the new event
     * @param duration     The session duration of the new event
     * @param timestamp    The timestamp of the new event
     * @param eventType    The eventType of the new event
     * @return An instance of an AnalyticsEvent object
     */
    public static AnalyticsEvent newInstance(final PinpointContext context, final String sessionId, final Long sessionStart,
                                             final Long sessionEnd, Long duration, long timestamp, final String eventType) {
        return new AnalyticsEvent(eventType, null, null, context.getSDKInfo(),
                                  sessionId,
                                  sessionStart, sessionEnd, duration,
                                  timestamp, context.getUniqueId(),
                                  context.getSystem().getAppDetails(),
                                  context.getSystem()
                                         .getDeviceDetails());
    }

    /**
     * Creates a new instance of an AnalyticsEvent
     *
     * @param eventId         The eventId of the new event
     * @param eventType       The eventType of the new event
     * @param attributes      A list of attributes of the new event
     * @param metrics         A list of metrics of the new event
     * @param sdkInfo         The {@link SDKInfo} of the new event
     * @param sessionId       The SessionId of the new event
     * @param sessionStart    The sessionStart of the new event
     * @param sessionStop     The sessionStop of the new event
     * @param sessionDuration The sessionDuration of the new event
     * @param timestamp       The timestamp of the new event
     * @param uniqueId        The uniqueId of the new event
     * @param appDetails      The {@link AndroidAppDetails} of the new event
     * @param deviceDetails   The {@link AndroidDeviceDetails} of the new event
     * @return An instance of an AnalyticsEvent object
     */
    public static AnalyticsEvent newInstance(final String eventId, final String eventType, final Map<String, String> attributes,
                                             final Map<String, Double> metrics, final SDKInfo sdkInfo, final String sessionId,
                                             final Long sessionStart, final Long sessionStop, final Long sessionDuration,
                                             final long timestamp, final String uniqueId, final AndroidAppDetails appDetails,
                                             final AndroidDeviceDetails deviceDetails) {
        return new AnalyticsEvent(eventId, eventType, attributes, metrics, sdkInfo, sessionId, sessionStart, sessionStop, sessionDuration,
                                  timestamp, uniqueId, appDetails, deviceDetails);
    }

    private static String processAttributeMetricKey(final String key) {
        final String trimmedKey = StringUtil.clipString(key, MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH, false);
        if (trimmedKey.length() < key.length()) {
            log.warn("The attribute key has been trimmed to a length of " + MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH + " characters.");
        }
        return trimmedKey;
    }

    private static String processAttributeValue(final String value) {
        final String trimmedValue = StringUtil.clipString(value, MAX_EVENT_ATTRIBUTE_VALUE_LENGTH, false);
        if (trimmedValue.length() < value.length()) {
            log.warn("The attribute value has been trimmed to a length of " + MAX_EVENT_ATTRIBUTE_VALUE_LENGTH + " characters.");
        }
        return trimmedValue;
    }

    /**
     * Translates an event to a JSONObject
     *
     * @param source The event to transform
     * @return A {@link JSONObject}
     */
    public static JSONObject translateFromEvent(final AnalyticsEvent source) {
        if (null == source) {
            log.warn("The Event provided was null");
            return new JSONObject();
        }

        final JSONObject json = source.toJSONObject();
        if (json.has("class")) {
            json.remove("class");
        }
        if (json.has("hashCode")) {
            json.remove("hashCode");
        }
        return json;
    }

    /**
     * Transforms a JSONObject into an event
     *
     * @param source The event as a JSONObject
     * @return An AnalyticsEvent
     * @throws JSONException
     */
    public static AnalyticsEvent translateToEvent(final JSONObject source) throws JSONException {
        final Map<String, String> attributes = new HashMap<String, String>();
        final Map<String, Double> metrics = new HashMap<String, Double>();

        final AndroidAppDetails appDetails = new AndroidAppDetails(source.optString("app_package_name"),
                                                                   source.optString("app_version_code"),
                                                                   source.optString("app_version_name"),
                                                                   source.optString("app_title"),
                                                                   source.optString(ClientContext.APP_ID_KEY));
        final SDKInfo sdkInfo = new SDKInfo(source.optString("sdk_name"), source.optString("sdk_version"));
        final AndroidDeviceDetails deviceDetails = new AndroidDeviceDetails(source.optString("carrier"));
        final String eventId = source.getString("event_id");
        final String eventType = source.getString("event_type");
        final Long timestamp = source.getLong("timestamp");
        final String uniqueId = source.getString("unique_id");

        String sessionId = "";
        Long sessionStart = null;
        Long sessionStop = null;
        Long sessionDuration = null;

        final JSONObject sessionJSON = source.getJSONObject("session");
        if (sessionJSON != null) {
            sessionId = sessionJSON.getString("id");
            sessionStart = sessionJSON.getLong("startTimestamp");
            sessionStop = sessionJSON.optLong("stopTimestamp");
            sessionDuration = sessionJSON.optLong("duration");
        }

        final JSONObject attributesJSON = source.optJSONObject("attributes");
        if (attributesJSON != null) {
            final Iterator<String> keysIterator = attributesJSON.keys();
            String key;
            while (keysIterator.hasNext()) {
                key = keysIterator.next();
                attributes.put(key, attributesJSON.optString(key));
            }
        }

        final JSONObject metricsJSON = source.optJSONObject("metrics");
        if (metricsJSON != null) {
            final Iterator<String> keysIterator = metricsJSON.keys();
            String key;
            while (keysIterator.hasNext()) {
                key = keysIterator.next();
                try {
                    metrics.put(key, metricsJSON.getDouble(key));
                } catch (final JSONException e) {
                    // Do not log e due to potentially sensitive information
                    log.error("Failed to convert metric back to double from JSON value.");
                }
            }
        }

        return AnalyticsEvent.newInstance(eventId, eventType, attributes, metrics, sdkInfo, sessionId, sessionStart, sessionStop,
                                          sessionDuration, timestamp, uniqueId, appDetails, deviceDetails);
    }

    /**
     * Returns the eventId
     *
     * @return the eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * Adds an attribute to this {@link AnalyticsEvent} with the specified key.
     * Only 40 attributes/metrics are allowed to be added to an Event. If 40
     * attribute/metrics already exist on this Event, the call may be ignored.
     *
     * @param name  The name of the attribute. The name will be truncated if it
     *              exceeds 50 characters.
     * @param value The value of the attribute. The value will be truncated if
     *              it exceeds 200 characters.
     */
    public void addAttribute(final String name, final String value) {
        if (null == name) {
            return;
        }

        if (null != value) {
            if (currentNumOfAttributesAndMetrics.get() <
                MAX_NUM_OF_METRICS_AND_ATTRIBUTES) {
                attributes.put(this.processAttributeMetricKey(name), processAttributeValue(value));
                currentNumOfAttributesAndMetrics.incrementAndGet();
            } else {
                log.warn("Max number of attributes/metrics reached(" + MAX_NUM_OF_METRICS_AND_ATTRIBUTES + ").");
            }
        } else {
            attributes.remove(name);
        }
    }

    /**
     * Determines if this {@link AnalyticsEvent} contains a specific attribute
     *
     * @param attributeName The name of the attribute
     * @return true if this {@link AnalyticsEvent} has an attribute with the
     * specified name, false otherwise
     */
    public boolean hasAttribute(final String attributeName) {
        if (attributeName == null) {
            return false;
        }
        return attributes.containsKey(attributeName);
    }

    /**
     * Adds a metric to this {@link AnalyticsEvent} with the specified key. Only
     * 40 attributes/metrics are allowed to be added to an Event. If 50
     * attribute/metrics already exist on this Event, the call may be ignored.
     *
     * @param name  The name of the metric. The name will be truncated if it
     *              exceeds 50 characters.
     * @param value The value of the metric.
     */
    public void addMetric(final String name, final Double value) {
        if (null == name) {
            return;
        }

        if (null != value) {
            if (currentNumOfAttributesAndMetrics.get() <
                MAX_NUM_OF_METRICS_AND_ATTRIBUTES) {
                metrics.put(this.processAttributeMetricKey(name), value);
                currentNumOfAttributesAndMetrics.incrementAndGet();
            } else {
                log.warn("Max number of attributes/metrics reached(" + MAX_NUM_OF_METRICS_AND_ATTRIBUTES + ").");
            }
        } else {
            metrics.remove(name);
        }
    }

    /**
     * Determines if this {@link AnalyticsEvent} contains a specific metric.
     *
     * @param metricName The name of the metric
     * @return true if this {@link AnalyticsEvent} has a metric with the
     * specified name, false otherwise
     */
    public boolean hasMetric(final String metricName) {
        if (metricName == null) {
            return false;
        }
        return metrics.containsKey(metricName);
    }

    /**
     * Returns the name/type of this {@link AnalyticsEvent}
     *
     * @return the name/type of this {@link AnalyticsEvent}
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * Returns the value of the attribute with the specified name.
     *
     * @param name The name of the attribute to return
     * @return The attribute with the specified name, or null if attribute does
     * not exist
     */
    public String getAttribute(final String name) {
        if (name == null) {
            return null;
        }
        return attributes.get(name);
    }

    /**
     * Returns the value of the metric with the specified name.
     *
     * @param name The name of the metric to return
     * @return The metric with the specified name, or null if metric does not
     * exist
     */
    public Double getMetric(final String name) {
        if (name == null) {
            return null;
        }
        return metrics.get(name);
    }

    public PinpointSession getSession() {
        return session;
    }

    public Long getEventTimestamp() {
        return timestamp;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getSdkName() {
        return sdkName;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    /**
     * Adds an attribute to this {@link AnalyticsEvent} with the specified key.
     * Only 40 attributes/metrics are allowed to be added to an
     * {@link AnalyticsEvent}. If 40 attribute/metrics already exist on this
     * {@link AnalyticsEvent}, the call may be ignored.
     *
     * @param name  The name of the attribute. The name will be truncated if it
     *              exceeds 50 characters.
     * @param value The value of the attribute. The value will be truncated if
     *              it exceeds 200 characters.
     * @return The same {@link AnalyticsEvent} instance is returned to allow for
     * method chaining.
     */
    public AnalyticsEvent withAttribute(String name, String value) {
        addAttribute(name, value);
        return this;
    }

    /**
     * Adds a metric to this {@link AnalyticsEvent} with the specified key. Only
     * 40 attributes/metrics are allowed to be added to an
     * {@link AnalyticsEvent}. If 40 attribute/metrics already exist on this
     * {@link AnalyticsEvent}, the call may be ignored.
     *
     * @param name  The name of the metric. The name will be truncated if it
     *              exceeds 50 characters.
     * @param value The value of the metric.
     * @return The same {@link AnalyticsEvent} instance is returned to allow for
     * method chaining.
     */
    public AnalyticsEvent withMetric(String name, Double value) {
        addMetric(name, value);
        return this;
    }

    /**
     * Returns a map of all attributes contained within this
     * {@link AnalyticsEvent}
     *
     * @return a map of all attributes, where the attribute names are the keys
     * and the attribute values are the values
     */
    public Map<String, String> getAllAttributes() {
        return Collections.unmodifiableMap(attributes);
    }

    /**
     * Returns a map of all metrics contained within this {@link AnalyticsEvent}
     *
     * @return a map of all metrics, where the metric names are the keys and the
     * metric values are the values
     */
    public Map<String, Double> getAllMetrics() {
        return Collections.unmodifiableMap(metrics);
    }

    /**
     * Returns the App specific information
     *
     * @return the App specific information
     */
    public AndroidAppDetails getAppDetails() {
        return appDetails;
    }

    @Override
    public String toString() {
        final JSONObject json = toJSONObject();
        try {
            return json.toString(INDENTATION);
        } catch (final JSONException e) {
            return json.toString();
        }
    }

    @Override
    public JSONObject toJSONObject() {
        final Locale locale = this.deviceDetails.locale();
        final String localeString =
            locale != null ? locale.toString() : "UNKNOWN";

        final JSONBuilder builder = new JSONBuilder(this);

        // ****************************************************
        // ==================System Attributes=================
        // ****************************************************
        builder.withAttribute("event_id", getEventId());
        builder.withAttribute("event_type", getEventType());
        builder.withAttribute("unique_id", getUniqueId());
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
        final JSONObject sessionObject = new JSONObject();
        try {
            sessionObject.put("id", session.getSessionId());
            if (session.getSessionStart() != null) {
                sessionObject.put("startTimestamp", session.getSessionStart());
            }
            if (session.getSessionStop() != null) {
                sessionObject.put("stopTimestamp", session.getSessionStop());
            }
            if (session.getSessionDuration() != null) {
                sessionObject.put("duration", session.getSessionDuration().longValue());
            }
        } catch (final JSONException e) {
            log.error("Error serializing session information", e);
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

        final JSONObject attributesJson = new JSONObject();
        for (final Entry<String, String> entry : getAllAttributes().entrySet()) {
            try {
                attributesJson.put(entry.getKey(), entry.getValue());
            } catch (final JSONException e) {
                // Do not log e due to potentially sensitive information
                log.error("Error serializing attribute for eventType: " + eventType);
            }
        }

        final JSONObject metricsJson = new JSONObject();
        for (final Entry<String, Double> entry : getAllMetrics().entrySet()) {
            try {
                metricsJson.put(entry.getKey(), entry.getValue());
            } catch (final JSONException e) {
                // Do not log e due to potentially sensitive information
                log.error("Error serializing metric for eventType: " + eventType);
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

    /**
     * Creates a ClientContext object
     *
     * @param networkType The network type from the Pinpoint Context
     * @return Returns a {@link ClientContext} object
     */
    public ClientContext createClientContext(final String networkType) {
        final ClientContext.ClientContextBuilder builder = new ClientContext.ClientContextBuilder();
        builder.withAppPackageName(appDetails.packageName()).withAppVersionCode(appDetails.versionCode()).withAppVersionName(
            appDetails.versionName()).withLocale(deviceDetails.locale().toString()).withMake(deviceDetails.manufacturer()).withModel(
            deviceDetails.model()).withPlatformVersion(deviceDetails.platformVersion()).withUniqueId(uniqueId).withAppTitle(
            appDetails.getAppTitle()).withNetworkType(networkType).withCarrier(deviceDetails.carrier()).withAppId(appDetails.getAppId());
        return builder.build();
    }
}
