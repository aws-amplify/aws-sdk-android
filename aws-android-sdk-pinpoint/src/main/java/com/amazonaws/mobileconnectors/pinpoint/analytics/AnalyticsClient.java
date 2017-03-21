/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.analytics;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;

import com.amazonaws.mobileconnectors.pinpoint.internal.event.EventRecorder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * AnalyticsClient is the entry point into the Amazon Pinpoint SDK where
 * {@link AnalyticsEvent} objects are created, recorded, and submitted to the
 * Amazon Pinpoint Service. <h3>Recording Events</h3> Example:
 *
 * <pre class="prettyprint">
 * // get the event client from your PinpointManager instance
 * AnalyticsClient analyticsClient = pinpointManager.getAnalyticsClient();
 *
 * // create and record an event
 * Event level1CompleteEvent = analyticsClient.createEvent(&quot;level1Complete&quot;);
 * analyticsClient.recordEvent(level1CompleteEvent);
 *
 * </pre>
 *
 * <h3>Submitting Events</h3>
 * <p>
 * The example below demonstrates how to submit events to the Amazon Pinpoint
 * Service. You have direct control over when events are submitted in
 * your app. Events are submitted in a background thread.
 * </p>
 * Example:
 *
 * <pre class="prettyprint">
 * // submit events to the website
 * AnalyticsClient analyticsClient = pinpointManager.getAnalyticsClient();
 * analyticsClient.submitEvents();
 * </pre>
 *
 * Amazon recommends that you call <code>submitEvents</code> once you stop the session.
 * <p>
 * Note: This client will store at most 5MiB of event data locally. Past that
 * events will be dropped. When events successfully submitted, they are removed
 * from the local database.
 * </p>
 */
public class AnalyticsClient implements JSONSerializable {
    private static final Log log =
            LogFactory.getLog(AnalyticsClient.class);

    private static final String ANALYTICS_ENABLED = "isAnalyticsEnabled";
    private static final int MAX_EVENT_TYPE_LENGTH = 50;

    private final PinpointContext context;
    private final Map<String, String> globalAttributes = new ConcurrentHashMap<String, String>();
    private final Map<String, Double> globalMetrics = new ConcurrentHashMap<String, Double>();
    private Map<String, String> campaignAttributes = new ConcurrentHashMap<String, String>();
    private final Map<String, Map<String, String>> eventTypeAttributes = new ConcurrentHashMap<String, Map<String, String>>();
    private final Map<String, Map<String, Double>> eventTypeMetrics = new ConcurrentHashMap<String, Map<String, Double>>();
    private String sessionId;
    private long sessionStartTime;
    private EventRecorder eventRecorder;

    public AnalyticsClient(final PinpointContext context) {
        checkNotNull(context, "A valid pinpointContext must be provided");
        this.context = context;
        eventRecorder = EventRecorder.newInstance(context);
    }

    /**
     * Create an event with the specified eventType. The eventType is a
     * developer defined String that can be used to distinguish between
     * different scenarios within an application. Note: You can have at most
     * 1,500 different eventTypes per app.
     *
     * @param eventType the type of event to create
     * @return an Event with the specified eventType
     */
    public AnalyticsEvent createEvent(String eventType) throws IllegalArgumentException {
        if (eventType == null) {
            log.error("Null eventType provided to addGlobalAttribute");
            throw new IllegalArgumentException("The eventType passed into create event was null");
        }
        if (eventType.length() > MAX_EVENT_TYPE_LENGTH) {
            log.error("The event type is too long, the max event type length is " + MAX_EVENT_TYPE_LENGTH
                    + " characters");
            throw new IllegalArgumentException("The eventType passed into create event was too long");
        }

        return createEvent(eventType, sessionStartTime, null, null);
    }

    protected AnalyticsEvent createEvent(String eventType, long sessionStart, Long sessionEnd, Long sessionDuration) {
        AnalyticsEvent event = AnalyticsEvent.newInstance(context, sessionId, sessionStart, sessionEnd,
                                                       sessionDuration, System.currentTimeMillis(), eventType);

        for (final Entry<String, String> attr : globalAttributes.entrySet()) {
            event.addAttribute(attr.getKey(), attr.getValue());
        }

        if (eventTypeAttributes.containsKey(event.getEventType())) {
            for (final Entry<String, String> attr : eventTypeAttributes.get(
                event.getEventType()).entrySet()) {
                event.addAttribute(attr.getKey(), attr.getValue());
            }
        }

        for (final Entry<String, Double> metric : globalMetrics.entrySet()) {
            event.addMetric(metric.getKey(), metric.getValue());
        }

        if (eventTypeMetrics.containsKey(event.getEventType())) {
            for (final Entry<String, Double> metric : eventTypeMetrics.get(
                event.getEventType()).entrySet()) {
                event.addMetric(metric.getKey(), metric.getValue());
            }
        }

        return event;
    }

    /**
     * Record the specified event to the local filestore Please note if the
     * amount of data stored events takes up EXCEEDS 5MiB further recordings
     * will be dropped
     *
     * @param event The event to persist
     */
    public void recordEvent(AnalyticsEvent event) {
        if (event == null) {
            log.info("The provided event was null");
            return;
        }
        AnalyticsEvent recordEvent = AnalyticsEvent.createFromEvent(context, sessionId,
                System.currentTimeMillis(), event);
        eventRecorder.recordEvent(recordEvent);
    }

    /**
     * Submit all recorded events.
     * If the device is off line, this is a no-op. See
     * {@link PinpointConfiguration}
     * for customizing which Internet connection the SDK can submit on.
     */
    public void submitEvents() {
        log.info("Submitting events");
        eventRecorder.submitEvents();
    }

    /**
     * Adds the specified attribute to all subsequently created events Note: The
     * maximum allowed attributes and metrics on a single event is 40. Attempts
     * to add more may be ignored
     *
     * @param attributeName the name of the attribute to add
     * @param attributeValue the value of the attribute
     */
    public void addGlobalAttribute(String attributeName, String attributeValue) {
        if (attributeName == null) {
            log.info("Null attribute name provided to addGlobalAttribute");
            return;
        }

        if (attributeValue == null) {
            log.debug("Null attribute value provided to addGlobalAttribute. attribute name:"
                    + attributeName);
            return;
        }
        globalAttributes.put(attributeName, attributeValue);
    }

    /**
     * Adds the specified attribute to all subsequently created events with the
     * specified event type Note: The maximum allowed attributes and metrics on
     * a single event is 40. Attempts to add more may be ignored
     *
     * @param eventType the type of events to add the attribute to
     * @param attributeName the name of the attribute to add
     * @param attributeValue the value of the attribute
     */
    public void addGlobalAttribute(String eventType, String attributeName, String attributeValue) {
        if (eventType == null) {
            log.warn("Null eventType provided to addGlobalAttribute");
            return;
        }

        if (attributeName == null) {
            log.warn("Null attribute name provided to addGlobalAttribute. eventType:" + eventType);
            return;
        }

        if (attributeValue == null) {
            log.warn("Null value provided to addGlobalAttribute. eventType:" + eventType
                     + ", attributeName:" + attributeName);
            return;
        }

        Map<String, String> eventAttrs = eventTypeAttributes.get(eventType);
        if (eventAttrs == null) {
            eventAttrs = new ConcurrentHashMap<String, String>();
            eventTypeAttributes.put(eventType, eventAttrs);
        }
        eventAttrs.put(attributeName, attributeValue);
    }

    /**
     * Adds the specified metric to all subsequently created events Note: The
     * maximum allowed attributes and metrics on a single event is 40. Attempts
     * to add more may be ignored
     *
     * @param metricName the name of the metric to add
     * @param metricValue the value of the metric
     */
    public void addGlobalMetric(String metricName, Double metricValue) {
        if (metricName == null) {
            log.warn("Null metric name provided to addGlobalMetric");
            return;
        }

        if (metricValue == null) {
            log.warn("Null metric value provided to addGlobalMetric.  metric name:" + metricName);
            return;
        }

        globalMetrics.put(metricName, metricValue);
    }

    /**
     * Adds the specified metric to all subsequently created events with the
     * specified event type Note: The maximum allowed attributes and metrics on
     * a single event is 40. Attempts to add more may be ignored
     *
     * @param eventType the type of events to add the metric to
     * @param metricName the name of the metric to add
     * @param metricValue the value of the metric
     */
    public void addGlobalMetric(String eventType, String metricName, Double metricValue) {
        if (eventType == null) {
            log.warn("Null eventType provided to addGlobalMetric");
            return;
        }

        if (metricName == null) {
            log.warn("Null metric name provided to addGlobalMetric. eventType:" + eventType);
            return;
        }

        if (metricValue == null) {
            log.warn("Null metric value provided to addGlobalMetric. eventType:" + eventType
                    + ", metric name:" + metricName);
            return;
        }

        Map<String, Double> eventMetrics = eventTypeMetrics.get(eventType);
        if (eventMetrics == null) {
            eventMetrics = new ConcurrentHashMap<String, Double>();
            eventTypeMetrics.put(eventType, eventMetrics);
        }
        eventMetrics.put(metricName, metricValue);
    }

    /**
     * Removes the specified attribute. All subsequently created events will no
     * longer have this global attribute.
     *
     * @param attributeName the name of the attribute to remove
     */
    public void removeGlobalAttribute(String attributeName) {
        if (attributeName == null) {
            log.warn("Null attribute name provided to removeGlobalAttribute");
            return;
        }

        globalAttributes.remove(attributeName);
    }

    /**
     * Removes the specified attribute. All subsequently created events with the
     * specified event type will no longer have this global attribute.
     *
     * @param eventType the type of events to remove the attribute from
     * @param attributeName the name of the attribute to remove
     */
    public void removeGlobalAttribute(String eventType, String attributeName) {
        if (eventType == null) {
            log.warn("Null eventType provided to removeGlobalAttribute");
            return;
        }

        if (attributeName == null) {
            log.warn("Null attribute name provided to removeGlobalAttribute");
            return;
        }

        final Map<String, String> eventAttrs = eventTypeAttributes.get(eventType);
        if (eventAttrs != null) {
            eventAttrs.remove(attributeName);
        }
    }

    /**
     * Removes the specified metric. All subsequently created events will no
     * longer have this global metric.
     *
     * @param metricName the name of the metric to remove
     */
    public void removeGlobalMetric(String metricName) {
        if (metricName == null) {
            log.warn("Null metric name provided to removeGlobalMetric");
            return;
        }

        globalMetrics.remove(metricName);
    }

    /**
     * Removes the specified metric. All subsequently created events with the
     * specified event type will no longer have this global metric.
     *
     * @param eventType the type of events to remove the metric from
     * @param metricName the name of the metric to remove
     */
    public void removeGlobalMetric(String eventType, String metricName) {
        if (eventType == null) {
            log.warn("Null eventType provided to removeGlobalMetric");
            return;
        }

        if (metricName == null) {
            log.warn("Null metric name provided to removeGlobalMetric");
            return;
        }

        final Map<String, Double> eventMetrics = eventTypeMetrics.get(eventType);
        if (eventMetrics != null) {
            eventMetrics.remove(metricName);
        }
    }

    /**
     * Adds the specified campaign attributes to events to track Campaign Analytic
     *
     * You should not use this method as it will be called by the NotificationManager when the app is opened
     * from a push notification.
     *
     * @param campaign the map with campaign attributes of the campaign received
     */
    public void setCampaignAttributes(Map<String, String> campaign) {
        if (campaign == null) {
            log.warn("Null campaign attributes provided to setCampaignAttributes");
            return;
        }

        campaignAttributes = campaign;
    }

    /**
     * Clears campaign attributes
     *
     * You should not use this method as it will be called by the NotificationManager when the app is opened
     * from a push notification.
     *
     */
    public void clearCampaignAttributes() {
        for (String key : campaignAttributes.keySet()) {
            this.removeGlobalAttribute(key);
        }
        campaignAttributes.clear();
    }

    public String toString() {
        JSONObject json = toJSONObject();
        try {
            return json.toString(4);
        } catch (JSONException e) {
            return json.toString();
        }
    }

    public JSONObject toJSONObject() {
        JSONArray observersJSON = new JSONArray();

        JSONArray globalAttrs = new JSONArray();
        if (null != globalAttributes) {
            for (Entry<String, String> entry : globalAttributes.entrySet()) {
                try {
                    JSONObject attr = new JSONObject();
                    attr.put(entry.getKey(), entry.getValue());
                    globalAttrs.put(attr);
                } catch (JSONException e) {
                    log.error("Error parsing Global Attributes: " + e.toString());
                }
            }
        }

        JSONArray globalMets = new JSONArray();
        if (null != globalMetrics) {
            for (Entry<String, Double> entry : globalMetrics.entrySet()) {
                try {
                    JSONObject attr = new JSONObject();
                    attr.put(entry.getKey(), entry.getValue());
                    globalMets.put(attr);
                } catch (JSONException e) {
                    log.error("Error parsing Global Metrics: " + e.toString());
                }
            }
        }

        JSONObject eventTypesAttributesJson = new JSONObject();
        if (null != eventTypeAttributes) {
            for (Entry<String, Map<String, String>> entry : eventTypeAttributes.entrySet()) {
                JSONArray eventTypeAttrs = new JSONArray();
                try {
                    for (Entry<String, String> attrEntry : entry.getValue().entrySet()) {
                            JSONObject attr = new JSONObject();
                            attr.put(attrEntry.getKey(), attrEntry.getValue());
                            eventTypeAttrs.put(attr);

                    }
                    eventTypesAttributesJson.put(entry.getKey(), eventTypeAttrs);
                } catch (JSONException e) {
                    log.error("Error parsing Event Type Attributes: " + e.toString());
                }
            }
        }

        JSONObject eventTypesMetricsJson = new JSONObject();
        if (null != eventTypeMetrics) {
            for (Entry<String, Map<String, Double>> entry : eventTypeMetrics.entrySet()) {
                JSONArray eventTypeMets = new JSONArray();
                try {
                    for (Entry<String, Double> attrEntry : entry.getValue().entrySet()) {
                        JSONObject attr = new JSONObject();
                        attr.put(attrEntry.getKey(), attrEntry.getValue());
                        eventTypeMets.put(attr);
                    }
                    eventTypesMetricsJson.put(entry.getKey(), eventTypeMets);
                } catch (JSONException e) {
                    log.error("Error parsing Event Type Metrics: " + e.toString());
                }
            }
        }

        return new JSONBuilder(this).withAttribute("uniqueId", context.getUniqueId())
                .withAttribute("observers", observersJSON)
                .withAttribute("globalAttributes", globalAttrs)
                .withAttribute("globalMetrics", globalMets)
                .withAttribute("eventTypeAttributes", eventTypesAttributesJson)
                .withAttribute("eventTypeMetrics", eventTypesMetricsJson)
                .toJSONObject();
    }

    public void closeDB() {
        eventRecorder.closeDB();
    }

    public List<JSONObject> getAllEvents() {
        return eventRecorder.getAllEvents();
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setSessionStartTime(long sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public long getSessionStartTime() {
        return sessionStartTime;
    }

    void setEventRecorder(EventRecorder eventRecorder){
        this.eventRecorder = eventRecorder;
    }
}
