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

package com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.DateUtil;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

/**
 * Represents the device endpoint for which your application may add information to
 *
 * The example below demonstrates how to add custom attributes
 */
public class EndpointProfile implements JSONSerializable {

    static final int MAX_NUM_OF_METRICS_AND_ATTRIBUTES = 20;
    static final int MAX_ENDPOINT_ATTRIBUTE_METRIC_KEY_LENGTH = 50;
    static final int MAX_ENDPOINT_ATTRIBUTE_VALUE_LENGTH = 100;
    static final int MAX_ENDPOINT_ATTRIBUTE_VALUES = 50;
    private static final Log log =
        LogFactory.getLog(EndpointProfile.class);
    private static final int JSON_INDENTATION = 4;
    private final PinpointContext pinpointContext;
    private final Map<String, java.util.List<String>> attributes = new ConcurrentHashMap<String, java.util.List<String>>();
    private final Map<String, Double> metrics = new ConcurrentHashMap<String, Double>();
    private final AtomicInteger currentNumOfAttributesAndMetrics = new AtomicInteger(0);
    private String optOut;
    private EndpointProfileLocation location;
    private EndpointProfileDemographic demographic;
    private Long effectiveDate;
    private EndpointProfileUser user;

    /**
     * Constructor.
     *
     * @param pinpointContext the pinpoint context.
     */
    public EndpointProfile(final PinpointContext pinpointContext) {
        checkNotNull(pinpointContext,
                     "A valid pinpointContext must be provided.");

        this.pinpointContext = pinpointContext;
        this.effectiveDate = DateUtil.getCorrectedDate().getTime();
        this.demographic = new EndpointProfileDemographic(this.pinpointContext);
        this.location = new EndpointProfileLocation(this.pinpointContext);
        this.user = new EndpointProfileUser();
    }

    private static String processAttributeMetricKey(final String key) {

        final String trimmedKey = StringUtil.clipString(key, MAX_ENDPOINT_ATTRIBUTE_METRIC_KEY_LENGTH, false);
        if (trimmedKey.length() < key.length()) {
            log.warn("The attribute key has been trimmed to a length of " + MAX_ENDPOINT_ATTRIBUTE_METRIC_KEY_LENGTH + " characters.");
        }

        return trimmedKey;
    }

    private static java.util.List<String> processAttributeValues(final List<String> values) {

        final List<String> trimmedValues = new ArrayList<String>();
        int valuesCount = 0;
        for (final String value : values) {
            final String trimmedValue = StringUtil.clipString(value, MAX_ENDPOINT_ATTRIBUTE_VALUE_LENGTH, false);
            if (trimmedValue.length() < value.length()) {
                log.warn("The attribute value has been trimmed to a length of " + MAX_ENDPOINT_ATTRIBUTE_VALUE_LENGTH + " characters.");
            }
            trimmedValues.add(trimmedValue);
            if (++valuesCount >= MAX_ENDPOINT_ATTRIBUTE_VALUES) {
                log.warn("The attribute values has been reduced to" + MAX_ENDPOINT_ATTRIBUTE_VALUES + " values.");
                break;
            }
        }

        return trimmedValues;
    }

    /**
     * Returns the Mobile Analytics application Id
     *
     * @return the application id
     */
    public String getApplicationId() {
        return this.pinpointContext.getSystem().getAppDetails().getAppId();
    }

    /**
     * Returns the EndpointProfile Identifier of the device
     *
     * @return the endpoint id
     */
    public String getEndpointId() {
        return this.pinpointContext.getUniqueId();
    }

    /**
     * Returns the Channel Type of this endpoint, currently defaults to GCM
     *
     * @return the channel type
     */
    public String getChannelType() {
        return this.pinpointContext.getNotificationClient().getChannelType();
    }

    /**
     * Returns the Address of the endpoint. The token that is returned by the channel selected.
     *
     * @return the address
     */
    public String getAddress() {
        return this.pinpointContext.getNotificationClient().getDeviceToken();
    }

    /**
     * Returns the Demographic facet of the endpoint.
     *
     * @return EndpointProfileDemographic
     */
    public EndpointProfileDemographic getDemographic() {
        return this.demographic;
    }

    /**
     * Sets the Demographic facet of the endpoint.
     *
     * @param demographic The demographic facet.
     */
    public void setDemographic(EndpointProfileDemographic demographic) {
        this.demographic = demographic;
    }

    /**
     * Returns the Location facet of the endpoint.
     *
     * @return EndpointProfileLocation
     */
    public EndpointProfileLocation getLocation() {
        return this.location;
    }

    /**
     * Sets the Location facet of the endpoint.
     *
     * @param location The location facet.
     */
    public void setLocation(EndpointProfileLocation location) {
        this.location = location;
    }

    /**
     * Returns the effective date of the endpoint.
     *
     * @return long
     */
    public long getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Sets the effectiveDate of the endpoint.
     *
     * @param effectiveDate The demographic facet.
     */
    public void setEffectiveDate(long effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * Returns weather the endpoint is opted out of notification.
     *
     * @return String (ALL | NONE)
     */
    public String getOptOut() {
        return (this.pinpointContext.getNotificationClient().areAppNotificationsEnabled() && !StringUtil.isBlank(
            this.pinpointContext.getNotificationClient().getDeviceToken())) ? "NONE" : "ALL";
    }

    /**
     * Adds a custom attribute to this {@link EndpointProfile} with the specified key.
     * Only 20 custom attributes/metrics are allowed to be added to a EndpointProfile. If 20
     * attributes already exist on this EndpointProfile, the call may be ignored.
     *
     * @param name   The name of the custom attribute. The name will be truncated if it
     *               exceeds 50 characters.
     * @param values An array of values of the custom attribute. The values will be truncated if
     *               it exceeds 100 characters.
     */
    public void addAttribute(final String name, final List<String> values) {
        if (null == name) {
            return;
        }

        if (null != values) {
            if (currentNumOfAttributesAndMetrics.get() < MAX_NUM_OF_METRICS_AND_ATTRIBUTES) {
                final String key = processAttributeMetricKey(name);
                if (!attributes.containsKey(key)) {
                    currentNumOfAttributesAndMetrics.incrementAndGet();
                }
                attributes.put(key, processAttributeValues(values));
            } else {
                log.warn("Max number of attributes/metrics reached(" + MAX_NUM_OF_METRICS_AND_ATTRIBUTES + ").");
            }
        } else {
            if (attributes.remove(name) != null) {
                currentNumOfAttributesAndMetrics.decrementAndGet();
            }
        }
    }

    /**
     * Determines if this {@link EndpointProfile} contains a specific custom attribute
     *
     * @param attributeName The name of the custom attribute
     * @return true if this {@link EndpointProfile} has a custom attribute with the
     * specified name, false otherwise
     */
    public boolean hasAttribute(final String attributeName) {
        if (attributeName == null) {
            return false;
        }
        return attributes.containsKey(attributeName);
    }

    /**
     * Returns the array of values of the custom attribute with the specified name.
     *
     * @param name The name of the custom attribute to return
     * @return The array of custom attributes with the specified name, or null if attribute does
     * not exist
     */
    public List<String> getAttribute(final String name) {
        if (name == null) {
            return null;
        }
        return attributes.get(name);
    }

    /**
     * Adds a custom attribute to this {@link EndpointProfile} with the specified key.
     * Only 20 custom attributes are allowed to be added to an
     * {@link EndpointProfile}. If 20 custom attributes/metrics already exist on this
     * {@link EndpointProfile}, the call may be ignored.
     *
     * @param name   The name of the custom attribute. The name will be truncated if it
     *               exceeds 50 characters.
     * @param values An array of values of the custom attribute. The values will be truncated if
     *               it exceeds 100 characters.
     * @return The same {@link EndpointProfile} instance is returned to allow for
     * method chaining.
     */
    public EndpointProfile withAttribute(final String name, final List<String> values) {
        addAttribute(name, values);
        return this;
    }

    /**
     * Returns a map of all custom attributes contained within this
     * {@link EndpointProfile}
     *
     * @return a map of all custom attributes, where the attribute names are the keys
     * and the attribute values are the values
     */
    public Map<String, java.util.List<String>> getAllAttributes() {
        return Collections.unmodifiableMap(attributes);
    }

    /**
     * Adds a metric to this {@link EndpointProfile} with the specified key. Only
     * 20 attributes/metrics are allowed to be added to an Event. If 20
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
                final String key = processAttributeMetricKey(name);
                if (!metrics.containsKey(key)) {
                    currentNumOfAttributesAndMetrics.incrementAndGet();
                }
                metrics.put(key, value);
            } else {
                log.warn("Max number of attributes/metrics reached(" +
                         MAX_NUM_OF_METRICS_AND_ATTRIBUTES +
                         ").");
            }
        } else {
            if (metrics.remove(name) != null) {
                currentNumOfAttributesAndMetrics.decrementAndGet();
            }
        }
    }

    /**
     * Determines if this {@link EndpointProfile} contains a specific metric.
     *
     * @param metricName The name of the metric
     * @return true if this {@link EndpointProfile} has a metric with the
     * specified name, false otherwise
     */
    public boolean hasMetric(final String metricName) {
        if (metricName == null) {
            return false;
        }
        return metrics.containsKey(metricName);
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

    /**
     * Adds a metric to this {@link EndpointProfile} with the specified key. Only
     * 20 attributes/metrics are allowed to be added to an
     * {@link EndpointProfile}. If 20 attribute/metrics already exist on this
     * {@link EndpointProfile}, the call may be ignored.
     *
     * @param name  The name of the metric. The name will be truncated if it
     *              exceeds 50 characters.
     * @param value The value of the metric.
     * @return The same {@link EndpointProfile} instance is returned to allow for
     * method chaining.
     */
    public EndpointProfile withMetric(final String name, final Double value) {
        addMetric(name, value);
        return this;
    }

    /**
     * Returns a map of all metrics contained within this {@link EndpointProfile}
     *
     * @return a map of all metrics, where the metric names are the keys and the
     * metric values are the values
     */
    public Map<String, Double> getAllMetrics() {
        return Collections.unmodifiableMap(metrics);
    }

    /**
     * Returns the User facet of the endpoint.
     *
     * @return EndpointProfileUser
     */
    public EndpointProfileUser getUser() {
        return this.user;
    }

    /**
     * Sets the User facet of the endpoint.
     *
     * @param user The user facet
     */
    public void setUser(final EndpointProfileUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final JSONObject json = toJSONObject();
        try {
            return json.toString(JSON_INDENTATION);
        } catch (final JSONException e) {
            return json.toString();
        }
    }

    @Override
    public JSONObject toJSONObject() {
        final JSONBuilder builder = new JSONBuilder(null);
        builder.withAttribute("ApplicationId", getApplicationId());
        builder.withAttribute("EndpointId", getEndpointId());
        builder.withAttribute("ChannelType", getChannelType());
        builder.withAttribute("Address", getAddress());
        builder.withAttribute("Location", getLocation().toJSONObject());
        builder.withAttribute("Demographic", getDemographic().toJSONObject());
        builder.withAttribute("EffectiveDate", DateUtil.isoDateFromMillis(getEffectiveDate()));
        builder.withAttribute("OptOut", getOptOut());

        final JSONObject attributesJson = new JSONObject();
        for (final Map.Entry<String, List<String>> entry : getAllAttributes().entrySet()) {
            try {
                final JSONArray array = new JSONArray(entry.getValue());
                attributesJson.put(entry.getKey(), array);
            } catch (final JSONException e) {
                // Do not log e due to potentially sensitive information
                log.warn("Error serializing attributes.");
            }
        }

        // If there are any attributes put then add the attributes to the structure
        if (attributesJson.length() > 0) {
            builder.withAttribute("Attributes", attributesJson);
        }

        final JSONObject metricsJson = new JSONObject();
        for (final Map.Entry<String, Double> entry : getAllMetrics().entrySet()) {
            try {
                metricsJson.put(entry.getKey(), entry.getValue());
            } catch (final JSONException e) {
                // Do not log e due to potentially sensitive information
                log.error("Error serializing metric.");
            }
        }

        // If there are any metrics put then add the attributes to the structure
        if (metricsJson.length() > 0) {
            builder.withAttribute("Metrics", metricsJson);
        }

        builder.withAttribute("User", getUser().toJSONObject());
        return builder.toJSONObject();
    }
}
