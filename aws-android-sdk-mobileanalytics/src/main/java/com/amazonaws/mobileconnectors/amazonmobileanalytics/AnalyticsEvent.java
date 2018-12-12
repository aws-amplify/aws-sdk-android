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

package com.amazonaws.mobileconnectors.amazonmobileanalytics;

import java.util.Map;

/**
 * Represents the any useful action you wish to record within your application
 * <p>
 * The example below demonstrates how to record events.
 * </p>
 *
 * <pre class="prettyprint">
 * // get the event client from your amazon MobileAnalyticsManager instance
 * EventClient eventClient = mobileAnalyticsManager.getEventClient();
 *
 * // create and record the view event
 * Event level1CompleteEvent = eventClient.createEvent(&quot;level1Complete&quot;);
 * eventClient.recordEvent(level1CompleteEvent);
 *
 * // record if the user bought an upgrade (conversion)
 * if (userBoughtUpgrade) {
 *     Event level1UserBoughtUpgradeEvent = eventClient.createEvent(&quot;level1UserBoughtUpgrade&quot;);
 *     eventClient.recordEvent(level1UserBoughtUpgradeEvent);
 * }
 * </pre>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface AnalyticsEvent {
    /**
     * Adds an attribute to this {@link AnalyticsEvent} with the specified key.
     * Only 40 attributes/metrics are allowed to be added to an Event. If 40
     * attribute/metrics already exist on this Event, the call may be ignored.
     *
     * @param name The name of the attribute. The name will be truncated if it
     *            exceeds 50 characters.
     * @param value The value of the attribute. The value will be truncated if
     *            it exceeds 200 characters.
     */
    public void addAttribute(String name, String value);

    /**
     * Determines if this {@link AnalyticsEvent} contains a specific attribute
     *
     * @param attributeName The name of the attribute
     * @return true if this {@link AnalyticsEvent} has an attribute with the
     *         specified name, false otherwise
     */
    public boolean hasAttribute(String attributeName);

    /**
     * Adds a metric to this {@link AnalyticsEvent} with the specified key. Only
     * 40 attributes/metrics are allowed to be added to an Event. If 50
     * attribute/metrics already exist on this Event, the call may be ignored.
     *
     * @param name The name of the metric. The name will be truncated if it
     *            exceeds 50 characters.
     * @param value The value of the metric.
     */
    public void addMetric(String name, Double value);

    /**
     * Determines if this {@link AnalyticsEvent} contains a specific metric.
     *
     * @param metricName The name of the metric
     * @return true if this {@link AnalyticsEvent} has a metric with the
     *         specified name, false otherwise
     */
    public boolean hasMetric(String metricName);

    /**
     * Returns the name/type of this {@link AnalyticsEvent}
     *
     * @return the name/type of this {@link AnalyticsEvent}
     */
    public String getEventType();

    /**
     * Returns the value of the attribute with the specified name.
     *
     * @param name The name of the attribute to return
     * @return The attribute with the specified name, or null if attribute does
     *         not exist
     */
    public String getAttribute(String name);

    /**
     * Returns the value of the metric with the specified name.
     *
     * @param name The name of the metric to return
     * @return The metric with the specified name, or null if metric does not
     *         exist
     */
    public Double getMetric(String name);

    /**
     * Adds an attribute to this {@link AnalyticsEvent} with the specified key.
     * Only 40 attributes/metrics are allowed to be added to an
     * {@link AnalyticsEvent}. If 40 attribute/metrics already exist on this
     * {@link AnalyticsEvent}, the call may be ignored.
     *
     * @param name The name of the attribute. The name will be truncated if it
     *            exceeds 50 characters.
     * @param value The value of the attribute. The value will be truncated if
     *            it exceeds 200 characters.
     * @return The same {@link AnalyticsEvent} instance is returned to allow for
     *         method chaining.
     */
    public AnalyticsEvent withAttribute(String name, String value);

    /**
     * Adds a metric to this {@link AnalyticsEvent} with the specified key. Only
     * 40 attributes/metrics are allowed to be added to an
     * {@link AnalyticsEvent}. If 40 attribute/metrics already exist on this
     * {@link AnalyticsEvent}, the call may be ignored.
     *
     * @param name The name of the metric. The name will be truncated if it
     *            exceeds 50 characters.
     * @param value The value of the metric.
     * @return The same {@link AnalyticsEvent} instance is returned to allow for
     *         method chaining.
     */
    public AnalyticsEvent withMetric(String name, Double value);

    /**
     * Returns a map of all attributes contained within this
     * {@link AnalyticsEvent}
     *
     * @return a map of all attributes, where the attribute names are the keys
     *         and the attribute values are the values
     */
    public Map<String, String> getAllAttributes();

    /**
     * Returns a map of all metrics contained within this {@link AnalyticsEvent}
     *
     * @return a map of all metrics, where the metric names are the keys and the
     *         metric values are the values
     */
    public Map<String, Double> getAllMetrics();
}
