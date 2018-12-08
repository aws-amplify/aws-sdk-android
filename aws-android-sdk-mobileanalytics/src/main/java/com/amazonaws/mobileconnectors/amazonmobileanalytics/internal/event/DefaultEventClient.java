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

import static com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.Preconditions.checkNotNull;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONSerializable;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class DefaultEventClient implements InternalEventClient, JSONSerializable {
    private static String TAG = "DefaultEventClient";
    private static final String ANALYTICS_ENABLED = "isAnalyticsEnabled";
    private static final int MAX_EVENT_TYPE_LENGTH = 50;

    private final DeliveryClient deliveryClient;
    private final AnalyticsContext context;
    private final Map<String, String> globalAttributes = new ConcurrentHashMap<String, String>();
    private final Map<String, Double> globalMetrics = new ConcurrentHashMap<String, Double>();
    private final Map<String, Map<String, String>> eventTypeAttributes = new ConcurrentHashMap<String, Map<String, String>>();
    private final Map<String, Map<String, Double>> eventTypeMetrics = new ConcurrentHashMap<String, Map<String, Double>>();
    private List<EventObserver> observers = new CopyOnWriteArrayList<EventObserver>();
    private boolean allowEventCollection = true;
    private String sessionId;
    private long sessionStartTime;

    public DefaultEventClient(final AnalyticsContext context, final boolean allowEventCollection) {
        checkNotNull(context, "A valid context must be provided");
        checkNotNull(context.getDeliveryClient(), "A valid DeliveryClient must be provided");

        this.allowEventCollection = allowEventCollection;

        this.context = context;

        // add the delivery client as an observer of our events, and hold onto
        // the ref
        // so that we can force a submission of events
        this.deliveryClient = context.getDeliveryClient();
        addEventObserver(deliveryClient);
    }

    @Override
    public void recordEvent(AnalyticsEvent event) {
        if (event == null) {
            Log.i(TAG, "The provided event was null");
            return;
        }

        // If the configuration or user has the analytics enabled flag
        // explicitly set to false,
        // don't make any service calls
        if (!context.getConfiguration().optBoolean(ANALYTICS_ENABLED, true)
                || !getAllowEventCollection())
            return;

        InternalEvent eventToRecord = null;
        // TODO: Can we refactor this so we are not essentially passing a super
        // class to the library user while expecting it to be a subclass in our
        // Internal code?
        if (event instanceof InternalEvent) {
            eventToRecord = (InternalEvent) event;
        } else {
            Log.e(TAG, "Error recording event, this event cannot be stored");
            return;
        }
        InternalEvent recordEvent = DefaultEvent.createFromEvent(context, sessionId,
                System.currentTimeMillis(), eventToRecord);

        notifyObservers(recordEvent);
    }

    @Override
    public AnalyticsEvent createEvent(String eventType) {
        return createEvent(eventType, true);
    }

    @Override
    public AnalyticsEvent createEvent(String eventType, boolean applyGlobalAttributes) {
        if (eventType == null) {
            Log.v(TAG, "Null eventType provided to addGlobalAttribute");
            throw new IllegalArgumentException("The eventType passed into create event was null");
        }
        String trimmedEventType = StringUtil.clipString(eventType, MAX_EVENT_TYPE_LENGTH, false);
        if (trimmedEventType.length() < eventType.length()) {
            Log.w(TAG, "The event type has been trimmed to a length of " + MAX_EVENT_TYPE_LENGTH
                    + " characters");
        }

        InternalEvent event = createInternalEvent(trimmedEventType, sessionStartTime, null, null);
        event = EventConstraintDecorator.newInstance(event);

        // TODO Refactor lock to use ReentrantReadWriteLock
        synchronized (this) {
            if (applyGlobalAttributes) {

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
            }
        }

        return event;
    }

    @Override
    public InternalEvent createInternalEvent(String eventType, long sessionStart, Long sessionEnd,
            Long sessionDuration) {
        return DefaultEvent.newInstance(context, sessionId, sessionStart, sessionEnd,
                sessionDuration, System.currentTimeMillis(), eventType);
    }

    @Override
    public void submitEvents() {
        Log.v(TAG, "Notifying deliveryClient");
        deliveryClient.attemptDelivery();
    }

    @Override
    public void addGlobalAttribute(String attributeName, String attributeValue) {
        if (attributeName == null) {
            Log.d(TAG, "Null attribute name provided to addGlobalAttribute");
            return;
        }

        if (attributeValue == null) {
            Log.d(TAG, "Null attribute value provided to addGlobalAttribute. attribute name:"
                    + attributeName);
            return;
        }
        globalAttributes.put(attributeName, attributeValue);
    }

    @Override
    public void addGlobalAttribute(String eventType, String attributeName, String attributeValue) {
        if (eventType == null) {
            Log.w(TAG, "Null eventType provided to addGlobalAttribute");
            return;
        }

        if (attributeName == null) {
            Log.w(TAG, "Null attribute name provided to addGlobalAttribute. eventType:" + eventType);
            return;
        }

        if (attributeValue == null) {
            Log.w(TAG, "Null value provided to addGlobalAttribute. eventType:" + eventType
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

    @Override
    public void addGlobalMetric(String metricName, Double metricValue) {
        if (metricName == null) {
            Log.w(TAG, "Null metric name provided to addGlobalMetric");
            return;
        }

        if (metricValue == null) {
            Log.w(TAG, "Null metric value provided to addGlobalMetric.  metric name:" + metricName);
            return;
        }

        globalMetrics.put(metricName, metricValue);
    }

    @Override
    public void addGlobalMetric(String eventType, String metricName, Double metricValue) {
        if (eventType == null) {
            Log.w(TAG, "Null eventType provided to addGlobalMetric");
            return;
        }

        if (metricName == null) {
            Log.w(TAG, "Null metric name provided to addGlobalMetric. eventType:" + eventType);
            return;
        }

        if (metricValue == null) {
            Log.w(TAG, "Null metric value provided to addGlobalMetric. eventType:" + eventType
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

    @Override
    public void addEventObserver(EventObserver observer) {
        if (observer == null) {
            Log.w(TAG, "Null EventObserver provided to addObserver");
            return;
        }

        if (!getEventObservers().contains(observer)) {
            getEventObservers().add(observer);
        } else {
            Log.w(TAG, "Observer was already registered with this EventRecorder");
        }
    }

    @Override
    public void removeEventObserver(EventObserver observer) {
        Log.v(TAG, "Removing EventObserver");
        if (observer == null) {
            Log.w(TAG, "Null EventObserver provided to removeObserver");
            return;
        } else {
            Log.v(TAG, observer.toString());
        }

        if (getEventObservers().contains(observer)) {
            getEventObservers().remove(observer);
        } else {
            Log.w(TAG,
                    "Observer was not registered with this EventRecorder because it already exists");
        }
    }

    protected List<EventObserver> getEventObservers() {
        if (observers == null) {
            observers = new ArrayList<EventObserver>();
        }
        return observers;
    }

    protected void notifyObservers(InternalEvent event) {
        for (final EventObserver observer : getEventObservers()) {
            observer.notify(event);
        }
    }

    @Override
    public void removeGlobalAttribute(String attributeName) {
        if (attributeName == null) {
            Log.w(TAG, "Null attribute name provided to removeGlobalAttribute");
            return;
        }

        globalAttributes.remove(attributeName);
    }

    @Override
    public void removeGlobalAttribute(String eventType, String attributeName) {
        if (eventType == null) {
            Log.w(TAG, "Null eventType provided to removeGlobalAttribute");
            return;
        }

        if (attributeName == null) {
            Log.w(TAG, "Null attribute name provided to removeGlobalAttribute");
            return;
        }

        final Map<String, String> eventAttrs = eventTypeAttributes.get(eventType);
        if (eventAttrs != null) {
            eventAttrs.remove(attributeName);
        }
    }

    @Override
    public void removeGlobalMetric(String metricName) {
        if (metricName == null) {
            Log.w(TAG, "Null metric name provided to removeGlobalMetric");
            return;
        }

        globalMetrics.remove(metricName);
    }

    @Override
    public void removeGlobalMetric(String eventType, String metricName) {
        if (eventType == null) {
            Log.w(TAG, "Null eventType provided to removeGlobalMetric");
            return;
        }

        if (metricName == null) {
            Log.w(TAG, "Null metric name provided to removeGlobalMetric");
            return;
        }

        final Map<String, Double> eventMetrics = eventTypeMetrics.get(eventType);
        if (eventMetrics != null) {
            eventMetrics.remove(metricName);
        }
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
        JSONArray observersJSON = new JSONArray();
        if (null != observers) {
            for (EventObserver observer : observers) {
                if (JSONSerializable.class.isAssignableFrom(observer.getClass())) {
                    observersJSON.put(((JSONSerializable) observer).toJSONObject());
                } else {
                    observersJSON.put(observer);
                }
            }
        }

        JSONArray globalAttrs = new JSONArray();
        if (null != globalAttributes) {
            for (Entry<String, String> entry : globalAttributes.entrySet()) {
                try {
                    JSONObject attr = new JSONObject();
                    attr.put(entry.getKey(), entry.getValue());
                    globalAttrs.put(attr);
                } catch (JSONException e) {
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
                }
            }
        }

        JSONObject eventTypesAttributesJson = new JSONObject();
        if (null != eventTypeAttributes) {
            for (Entry<String, Map<String, String>> entry : eventTypeAttributes.entrySet()) {
                JSONArray eventTypeAttrs = new JSONArray();
                for (Entry<String, String> attrEntry : entry.getValue().entrySet()) {
                    try {
                        JSONObject attr = new JSONObject();
                        attr.put(attrEntry.getKey(), attrEntry.getValue());
                        eventTypeAttrs.put(attr);
                    } catch (JSONException e) {
                    }
                }
                try {
                    eventTypesAttributesJson.put(entry.getKey(), eventTypeAttrs);
                } catch (JSONException e) {
                }
            }
        }

        JSONObject eventTypesMetricsJson = new JSONObject();
        if (null != eventTypeMetrics) {
            for (Entry<String, Map<String, Double>> entry : eventTypeMetrics.entrySet()) {
                JSONArray eventTypeMets = new JSONArray();
                for (Entry<String, Double> attrEntry : entry.getValue().entrySet()) {
                    try {
                        JSONObject attr = new JSONObject();
                        attr.put(attrEntry.getKey(), attrEntry.getValue());
                        eventTypeMets.put(attr);
                    } catch (JSONException e) {
                    }
                }
                try {
                    eventTypesMetricsJson.put(entry.getKey(), eventTypeMets);
                } catch (JSONException e) {
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

    public boolean getAllowEventCollection() {
        return allowEventCollection;
    }

    @Override
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public void setSessionStartTime(long sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    @Override
    public String getSessionId() {
        return sessionId;
    }

    @Override
    public long getSessionStartTime() {
        return sessionStartTime;
    }
}
