/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.android.mobileanalytics.internal.event;

import static com.amazonaws.android.mobileanalytics.internal.core.util.Preconditions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.amazonaws.android.mobileanalytics.AnalyticsEvent;
import com.amazonaws.android.mobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.android.mobileanalytics.internal.core.log.Logger;
import com.amazonaws.android.mobileanalytics.internal.core.log.Logger.LogLevel;
import com.amazonaws.android.mobileanalytics.internal.core.util.JSONBuilder;
import com.amazonaws.android.mobileanalytics.internal.core.util.JSONSerializable;
import com.amazonaws.android.mobileanalytics.internal.core.util.StringUtil;
import com.amazonaws.android.mobileanalytics.internal.delivery.DeliveryClient;

public class DefaultEventClient implements InternalEventClient, JSONSerializable {
    private static Logger logger = Logger.getLogger(DefaultEventClient.class);
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

    public static DefaultEventClient newInstance(final AnalyticsContext context, final boolean allowEventCollection) {
        DefaultEventClient instance = new DefaultEventClient(context, allowEventCollection);
        return instance;
    }

    DefaultEventClient(final AnalyticsContext context, final boolean allowEventCollection) {
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
            logger.i("The provided event was null");
            logger.devi("The provided event was null");
            return;
        }

        // If the configuration or user has the analytics enabled flag
        // explicitly set to false,
        // don't make any service calls
        if (!context.getConfiguration().optBoolean(ANALYTICS_ENABLED, true) || !getAllowEventCollection())
            return;

        InternalEvent eventToRecord = null;
        //TODO: Can we refactor this so we are not essentially passing a super class to the library user while expecting it to be a subclass in our 
        //Internal code?
        if(event instanceof InternalEvent){
            eventToRecord = (InternalEvent) event;
        }else{
            logger.e("Error recording event, this event cannot be stored");
            return;
        }
        InternalEvent recordEvent = DefaultEvent.createFromEvent(context, sessionId, System.currentTimeMillis(), eventToRecord);

        notifyObservers(recordEvent);
    }
    
    @Override
    public AnalyticsEvent createEvent(String eventType){
        return createEvent(eventType,true);
    }

    @Override
    public AnalyticsEvent createEvent(String eventType, boolean applyGlobalAttributes) {
        if (eventType == null) {
            logger.v("Null eventType provided to addGlobalAttribute");
            logger.devi("Null eventType provided to createEvent");
            throw new IllegalArgumentException("The eventType passed into create event was null");
        }
        String trimmedEventType = StringUtil.clipString(eventType, MAX_EVENT_TYPE_LENGTH, false);
        if (trimmedEventType.length() < eventType.length()) {
            logger.devw("The event type has been trimmed to a length of " + MAX_EVENT_TYPE_LENGTH + " characters");
        }

        InternalEvent event = createInternalEvent(trimmedEventType, sessionStartTime, null, null);
        event = EventConstraintDecorator.newInstance(event);
        
     // TODO Refactor lock to use ReentrantReadWriteLock
        synchronized (this) {
            if (applyGlobalAttributes) {
                
                if (eventTypeAttributes.containsKey(event.getEventType())) {
                    for (final Entry<String, String> attr : eventTypeAttributes.get(event.getEventType()).entrySet()) {
                        event.addAttribute(attr.getKey(), attr.getValue());
                    }
                }

                for (final Entry<String, String> attr : globalAttributes.entrySet()) {
                    event.addAttribute(attr.getKey(), attr.getValue());
                }

                if (eventTypeMetrics.containsKey(event.getEventType())) {
                    for (final Entry<String, Double> metric : eventTypeMetrics.get(event.getEventType()).entrySet()) {
                        event.addMetric(metric.getKey(), metric.getValue());
                    }
                }

                for (final Entry<String, Double> metric : globalMetrics.entrySet()) {
                    event.addMetric(metric.getKey(), metric.getValue());
                }
            }
        }
        
        return event;
    }

    @Override
    public InternalEvent createInternalEvent(String eventType, long sessionStart, Long sessionEnd, Long sessionDuration) {
        return DefaultEvent.newInstance(context, sessionId, sessionStart, sessionEnd, sessionDuration, System.currentTimeMillis(), eventType);
    }

    @Override
    public void submitEvents() {
        logger.v("Notifying deliveryClient");
        deliveryClient.attemptDelivery();
    }

    @Override
    public void addGlobalAttribute(String attributeName, String attributeValue) {
        if (attributeName == null) {
            logger.v("Null attribute name provided to addGlobalAttribute");
            return;
        }

        if (attributeValue == null) {
            logger.v("Null attribute value provided to addGlobalAttribute. attribute name:" + attributeName);
            return;
        }
        globalAttributes.put(attributeName, attributeValue);
    }

    @Override
    public void addGlobalAttribute(String eventType, String attributeName, String attributeValue) {
        if (eventType == null) {
            logger.w("Null eventType provided to addGlobalAttribute");
            return;
        }

        if (attributeName == null) {
            logger.w("Null attribute name provided to addGlobalAttribute. eventType:" + eventType);
            return;
        }

        if (attributeValue == null) {
            logger.w("Null value provided to addGlobalAttribute. eventType:" + eventType + ", attributeName:" + attributeName);
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
            logger.v("Null metric name provided to addGlobalMetric");
            return;
        }

        if (metricValue == null) {
            logger.v("Null metric value provided to addGlobalMetric.  metric name:" + metricName);
            return;
        }

        globalMetrics.put(metricName, metricValue);
    }

    @Override
    public void addGlobalMetric(String eventType, String metricName, Double metricValue) {
        if (eventType == null) {
            logger.v("Null eventType provided to addGlobalMetric");
            return;
        }

        if (metricName == null) {
            logger.v("Null metric name provided to addGlobalMetric. eventType:" + eventType);
            return;
        }

        if (metricValue == null) {
            logger.v("Null metric value provided to addGlobalMetric. eventType:" + eventType + ", metric name:" + metricName);
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
        logger.v("Adding EventObserver");
        if (observer == null) {
            logger.v("Null EventObserver provided to addObserver");
            return;
        } else {
            if (logger.isLoggingEnabled(LogLevel.VERBOSE)) {
                logger.v(observer.toString());
            }
        }

        if (!getEventObservers().contains(observer)) {
            getEventObservers().add(observer);
        } else {
            logger.v("Observer was already registered with this EventRecorder");
            if (logger.isLoggingEnabled(LogLevel.VERBOSE)) {
                logger.v(this.toString());
            }
        }
    }

    @Override
    public void removeEventObserver(EventObserver observer) {
        logger.v("Removing EventObserver");
        if (observer == null) {
            logger.v("Null EventObserver provided to removeObserver");
            return;
        } else {
            if (logger.isLoggingEnabled(LogLevel.VERBOSE)) {
                logger.v(observer.toString());
            }
        }

        if (getEventObservers().contains(observer)) {
            getEventObservers().remove(observer);
        } else {
            logger.v("Observer was not registered with this EventRecorder");
            if (logger.isLoggingEnabled(LogLevel.VERBOSE)) {
                logger.v(this.toString());
            }
        }
    }

    protected List<EventObserver> getEventObservers() {
        if (observers == null) {
            observers = new ArrayList<EventObserver>();
        }
        return observers;
    }

    protected void notifyObservers(InternalEvent event) {
        logger.v("Notifying EventObservers");
        if (logger.isLoggingEnabled(LogLevel.VERBOSE)) {
            logger.v(event.toString());
        }
        for (final EventObserver observer : getEventObservers()) {
            observer.notify(event);
        }
    }

    @Override
    public void removeGlobalAttribute(String attributeName) {
        if (attributeName == null) {
            logger.v("Null attribute name provided to removeGlobalAttribute");
            return;
        }

        globalAttributes.remove(attributeName);
    }

    @Override
    public void removeGlobalAttribute(String eventType, String attributeName) {
        if (eventType == null) {
            logger.v("Null eventType provided to removeGlobalAttribute");
            return;
        }

        if (attributeName == null) {
            logger.v("Null attribute name provided to removeGlobalAttribute");
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
            logger.v("Null metric name provided to removeGlobalMetric");
            return;
        }

        globalMetrics.remove(metricName);
    }

    @Override
    public void removeGlobalMetric(String eventType, String metricName) {
        if (eventType == null) {
            logger.v("Null eventType provided to removeGlobalMetric");
            return;
        }

        if (metricName == null) {
            logger.v("Null metric name provided to removeGlobalMetric");
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

        return new JSONBuilder(this).withAttribute("uniqueId", context.getUniqueId()).withAttribute("observers", observersJSON)
                .withAttribute("globalAttributes", globalAttrs).withAttribute("globalMetrics", globalMets)
                .withAttribute("eventTypeAttributes", eventTypesAttributesJson).withAttribute("eventTypeMetrics", eventTypesMetricsJson)
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
}
