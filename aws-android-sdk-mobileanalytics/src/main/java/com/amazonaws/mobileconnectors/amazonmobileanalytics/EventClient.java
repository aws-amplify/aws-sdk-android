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

/**
 * EventClient is the entry point into the Amazon Mobile Analytics SDK where
 * {@link AnalyticsEvent} objects are created, recorded, and submitted to the
 * Amazon Mobile Analytics Service. <h3>Recording Events</h3> Example:
 *
 * <pre class="prettyprint">
 * // get the event client from your MobileAnalyticsManager instance
 * EventClient eventClient = mobileAnalyticsManager.getEventClient();
 * 
 * // create and record an event
 * Event level1CompleteEvent = eventClient.createEvent(&quot;level1Complete&quot;);
 * eventClient.recordEvent(level1CompleteEvent);
 *
 * </pre>
 *
 * <h3>Submitting Events</h3>
 * <p>
 * The example below demonstrates how to submit events to the Amazon Mobile
 * Analytics Service. You have direct control over when events are submitted in
 * your app. Events are submitted in a background thread.
 * </p>
 * Example:
 *
 * <pre class="prettyprint">
 * // submit events to the website
 * EventClient eventClient = mobileAnalyticsManager.getEventClient();
 * eventClient.submitEvents();
 * </pre>
 *
 * Amazon recommends that you call <code>submitEvents</code> in the onPause
 * method of each Activity object that records events. The SDK ensures that you
 * do not submit events too frequently. If you try submitting events within one
 * minute of a previous submission, the submission request will be ignored.
 * <p>
 * Note: This client will store at most 5MiB of event data locally. Past that
 * events will be dropped. When events successfully submitted, they are removed
 * from the local filestore
 * </p>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public interface EventClient {

    /**
     * Record the specified event to the local filestore Please note if the
     * amount of data stored events takes up EXCEEDS 5MiB further recordings
     * will be dropped
     *
     * @param event The event to persist
     */
    public void recordEvent(final AnalyticsEvent event);

    /**
     * Create an event with the specified eventType. The eventType is a
     * developer defined String that can be used to distinguish between
     * different scenarios within an application. Note: You can have at most
     * 1,500 different eventTypes per app.
     *
     * @param eventType the type of event to create
     * @return an Event with the specified eventType
     */
    public AnalyticsEvent createEvent(final String eventType);

    /**
     * Adds the specified attribute to all subsequently created events Note: The
     * maximum allowed attributes and metrics on a single event is 40. Attempts
     * to add more may be ignored
     *
     * @param attributeName the name of the attribute to add
     * @param attributeValue the value of the attribute
     */
    public void addGlobalAttribute(final String attributeName, final String attributeValue);

    /**
     * Adds the specified attribute to all subsequently created events with the
     * specified event type Note: The maximum allowed attributes and metrics on
     * a single event is 40. Attempts to add more may be ignored
     *
     * @param eventType the type of events to add the attribute to
     * @param attributeName the name of the attribute to add
     * @param attributeValue the value of the attribute
     */
    public void addGlobalAttribute(final String eventType, final String attributeName,
            final String attributeValue);

    /**
     * Adds the specified metric to all subsequently created events Note: The
     * maximum allowed attributes and metrics on a single event is 40. Attempts
     * to add more may be ignored
     *
     * @param metricName the name of the metric to add
     * @param metricValue the value of the metric
     */
    public void addGlobalMetric(final String metricName, final Double metricValue);

    /**
     * Adds the specified metric to all subsequently created events with the
     * specified event type Note: The maximum allowed attributes and metrics on
     * a single event is 40. Attempts to add more may be ignored
     *
     * @param eventType the type of events to add the metric to
     * @param metricName the name of the metric to add
     * @param metricValue the value of the metric
     */
    public void addGlobalMetric(final String eventType, final String metricName,
            final Double metricValue);

    /**
     * Removes the specified attribute. All subsequently created events will no
     * longer have this global attribute.
     *
     * @param attributeName the name of the attribute to remove
     */
    public void removeGlobalAttribute(final String attributeName);

    /**
     * Removes the specified attribute. All subsequently created events with the
     * specified event type will no longer have this global attribute.
     *
     * @param eventType the type of events to remove the attribute from
     * @param attributeName the name of the attribute to remove
     */
    public void removeGlobalAttribute(final String eventType, final String attributeName);

    /**
     * Removes the specified metric. All subsequently created events will no
     * longer have this global metric.
     *
     * @param metricName the name of the metric to remove
     */
    public void removeGlobalMetric(final String metricName);

    /**
     * Removes the specified metric. All subsequently created events with the
     * specified event type will no longer have this global metric.
     *
     * @param eventType the type of events to remove the metric from
     * @param metricName the name of the metric to remove
     */
    public void removeGlobalMetric(final String eventType, final String metricName);

    /**
     * Submit all recorded events. If a submission occurred in the last minute,
     * this request is ignored. If the device is off line, this is a no-op. See
     * {@link com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsConfig}
     * for customizing which Internet connection the SDK can submit on.
     */
    public void submitEvents();
}
