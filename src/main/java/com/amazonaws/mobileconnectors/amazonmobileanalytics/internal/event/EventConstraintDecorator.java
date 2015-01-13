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
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.json.JSONObject;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.log.Logger;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil;

public class EventConstraintDecorator implements InternalEvent {

    private static class Pair<T, U> {

        private T key;
        private U value;

        private T getKey() {
            return key;
        }

        private U getValue() {
            return value;
        }

        public Pair(T key, U value) {
            this.key = key;
            this.value = value;
        }
    }

    private static Logger logger = Logger.getLogger(EventConstraintDecorator.class);

    private static final int MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH = 40;
    private static final int MAX_EVENT_ATTRIBUTE_VALUE_LENGTH = 200;
    private static final int MAX_NUM_OF_METRICS_AND_ATTRIBUTES = 50;

    private final InternalEvent decoratedEvent;
    private final int maxAttributesAndMetrics;
    private final AtomicInteger currentNumOfAttributesAndMetrics = new AtomicInteger(0);

    public static EventConstraintDecorator newInstance(InternalEvent eventToDecorate) {
        return new EventConstraintDecorator(eventToDecorate, MAX_NUM_OF_METRICS_AND_ATTRIBUTES);
    }

    public EventConstraintDecorator(InternalEvent eventToDecorate, int maxAttributesAndMetrics) {
        this.decoratedEvent = eventToDecorate;
        this.maxAttributesAndMetrics = maxAttributesAndMetrics;
    }

    @Override
    public synchronized void addAttribute(String name, String value) {
        try {
            if(name != null && value != null && !decoratedEvent.hasAttribute(name)) {
                if(currentNumOfAttributesAndMetrics.get() < maxAttributesAndMetrics) {
                    Pair<String, String> trimmedResult = processAttribute(name, value);
                    decoratedEvent.addAttribute(trimmedResult.getKey(), trimmedResult.getValue());
                    currentNumOfAttributesAndMetrics.incrementAndGet();
                }
            }
        } catch (Exception e) {
            logger.e("addAttribute", e);
        }
    }

    @Override
    public boolean hasAttribute(String attributeName) {
        boolean hasAttribute = false;
        try {
            hasAttribute = decoratedEvent.hasAttribute(attributeName);
        } catch (Exception e) {
            logger.e("hasAttribute", e);
        }
        return hasAttribute;
    }

    @Override
    public synchronized void addMetric(String name, Double value) {
        try {
            if(name != null && value != null && !decoratedEvent.hasMetric(name)) {
                if(currentNumOfAttributesAndMetrics.get() < maxAttributesAndMetrics) {
                    Pair<String, Double> trimmedResult = processMetric(name, value);
                    decoratedEvent.addMetric(trimmedResult.getKey(), trimmedResult.getValue());
                    currentNumOfAttributesAndMetrics.incrementAndGet();
                }
            }
        } catch (Exception e) {
            logger.e("addMetric", e);
        }
    }

    @Override
    public boolean hasMetric(String metricName) {
        boolean hasMetric = false;
        try {
            hasMetric = decoratedEvent.hasMetric(metricName);
        } catch (Exception e) {
            logger.e("hasMetric", e);
        }
        return hasMetric;
    }

    @Override
    public String getEventType() {
        return decoratedEvent.getEventType();
    }

    @Override
    public String getAttribute(String name) {
        return decoratedEvent.getAttribute(name);
    }

    @Override
    public Double getMetric(String name) {
        return decoratedEvent.getMetric(name);
    }

    @Override
    public AnalyticsEvent withAttribute(String name, String value) {
        try {
            addAttribute(name, value);
        } catch (Exception e) {
            logger.e("withAttribute", e);
        }

        return decoratedEvent;
    }

    @Override
    public AnalyticsEvent withMetric(String name, Double value) {
        try {
            addMetric(name, value);            
        } catch (Exception e) {
            logger.e("withMetric", e);
        }

        return decoratedEvent;
    }

    @Override
    public Map<String, String> getAllAttributes() {
        return decoratedEvent.getAllAttributes();
    }

    @Override
    public Map<String, Double> getAllMetrics() {
        return decoratedEvent.getAllMetrics();
    }

    private static Pair<String, String> processAttribute(String key, String value) {

        String trimmedKey = StringUtil.clipString(key, MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH, false);
        if(trimmedKey.length() < key.length()) {
            logger.devw("The attribute key has been trimmed to a length of " + MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH + " characters");
        }
        String trimmedValue = StringUtil.clipString(value, MAX_EVENT_ATTRIBUTE_VALUE_LENGTH, false);
        if(trimmedValue.length() < value.length()) {
            logger.devw("The attribute value has been trimmed to a length of " + MAX_EVENT_ATTRIBUTE_VALUE_LENGTH + " characters");
        }

        return new Pair<String, String>(trimmedKey, trimmedValue);
    }

    private static Pair<String, Double> processMetric(String key, Double value) {

        String trimmedKey = StringUtil.clipString(key, MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH, false);
        if(trimmedKey.length() < key.length()) {
            logger.devw("The metric key has been trimmed to a length of " + MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH + " characters");
        }

        return new Pair<String, Double>(trimmedKey, value);
    }

    @Override
    public JSONObject toJSONObject() {
        return decoratedEvent.toJSONObject();
    }

    @Override
    public Long getEventTimestamp() {
        return decoratedEvent.getEventTimestamp();
    }

    @Override
    public Id getUniqueId() {
        return decoratedEvent.getUniqueId();
    }

    @Override
    public String getSessionId() {
        return decoratedEvent.getSessionId();
    }

    @Override
    public long getSessionStart() {
        return decoratedEvent.getSessionStart();
    }

    @Override
    public Long getSessionStop() {
        return decoratedEvent.getSessionStop();
    }

    @Override
    public Long getSessionDuration() {
        return decoratedEvent.getSessionDuration();
    }

    @Override
    public String getSdkName() {
        return decoratedEvent.getSdkName();
    }

    @Override
    public String getSdkVersion() {
        return decoratedEvent.getSdkVersion();
    }

    @Override
    public ClientContext createClientContext(String networkType) {
        return decoratedEvent.createClientContext(networkType);
    }
}
