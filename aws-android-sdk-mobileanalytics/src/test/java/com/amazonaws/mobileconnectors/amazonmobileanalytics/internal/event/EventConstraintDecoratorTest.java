/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class EventConstraintDecoratorTest extends MobileAnalyticsTestBase {

    private EventConstraintDecorator target;
    @Mock
    private InternalEvent eventToWrap;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        target = EventConstraintDecorator.newInstance(eventToWrap);
    }

    @Test
    public void test_addAttribute_limit() {
        for (int i = 0; i < 100; i++) {
            target.addAttribute(String.valueOf(i), String.valueOf(i));
        }

        verify(eventToWrap, times(EventConstraintDecorator.MAX_NUM_OF_METRICS_AND_ATTRIBUTES))
                .addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addMetric_limit() {
        for (double i = 0.0; i < 100; i++) {
            target.addMetric(String.valueOf(i), i);
        }

        verify(eventToWrap, times(EventConstraintDecorator.MAX_NUM_OF_METRICS_AND_ATTRIBUTES))
                .addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withMetric_limit() {
        for (double i = 0.0; i < 100; i++) {
            target.withMetric(String.valueOf(i), i);
        }

        verify(eventToWrap, times(EventConstraintDecorator.MAX_NUM_OF_METRICS_AND_ATTRIBUTES))
                .addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withAttribute_limit() {
        for (int i = 0; i < 100; i++) {
            target.withAttribute(String.valueOf(i), String.valueOf(i));
        }

        verify(eventToWrap, times(EventConstraintDecorator.MAX_NUM_OF_METRICS_AND_ATTRIBUTES))
                .addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addAttribute_sameKey() {
        for (int i = 0; i < 100; i++) {
            target.addAttribute(String.valueOf(1), String.valueOf(i));
            when(eventToWrap.hasAttribute("1")).thenReturn(true);
        }

        verify(eventToWrap, times(100)).addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addMetric_sameKey() {
        for (double i = 0; i < 100; i++) {
            target.addMetric(String.valueOf(1), i);
            when(eventToWrap.hasMetric("1")).thenReturn(true);
        }

        verify(eventToWrap, times(100)).addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withMetric_sameKey() {
        for (double i = 0; i < 100; i++) {
            target.withMetric(String.valueOf(1), i);
            when(eventToWrap.hasMetric("1")).thenReturn(true);
        }

        verify(eventToWrap, times(100)).addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withAttribute_sameKey() {
        for (int i = 0; i < 100; i++) {
            target.withAttribute(String.valueOf(1), String.valueOf(i));
            when(eventToWrap.hasAttribute("1")).thenReturn(true);
        }

        verify(eventToWrap, times(100)).addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addAttribute_nullKey() {
        for (int i = 0; i < 100; i++) {
            target.addAttribute(null, String.valueOf(i));
        }

        verify(eventToWrap, times(0)).addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addMetric_nullKey() {
        for (double i = 0; i < 100; i++) {
            target.addMetric(null, i);
        }

        verify(eventToWrap, times(0)).addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withMetric_nullKey() {
        for (double i = 0; i < 100; i++) {
            target.withMetric(null, i);
        }

        verify(eventToWrap, times(0)).addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withAttribute_nullKey() {
        for (int i = 0; i < 100; i++) {
            target.withAttribute(null, String.valueOf(i));
        }

        verify(eventToWrap, times(0)).addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addAttribute_null_value() {
        for (int i = 0; i < 100; i++) {
            target.addAttribute(String.valueOf(i), null);
        }

        verify(eventToWrap, times(0)).addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addMetric_null_value() {
        for (double i = 0; i < 100; i++) {
            target.addMetric(String.valueOf(i), null);
        }

        verify(eventToWrap, times(0)).addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withMetric_null_value() {
        for (double i = 0; i < 100; i++) {
            target.withMetric(String.valueOf(i), null);
        }

        verify(eventToWrap, times(0)).addMetric(anyString(), anyDouble());
    }

    @Test
    public void test_withAttribute_null_value() {
        for (int i = 0; i < 100; i++) {
            target.withAttribute(String.valueOf(i), null);
        }

        verify(eventToWrap, times(0)).addAttribute(anyString(), anyString());
    }

    @Test
    public void test_addAttribute_clipped_string() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 2000; i++) {
            builder.append("0");
        }
        builder.append("1");
        builder.append("2");
        builder.append("3");
        builder.append("4");
        builder.append("5");

        String tooLongValue = builder.toString();
        String tooLongKey = "123456789012345678901234567890123456789012345678901234567890";

        target.addAttribute(tooLongKey, tooLongValue);
        verify(eventToWrap, times(1)).addAttribute(
                tooLongKey.substring(0,
                        EventConstraintDecorator.MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH),
                tooLongValue
                        .substring(0, EventConstraintDecorator.MAX_EVENT_ATTRIBUTE_VALUE_LENGTH));
    }

    @Test
    public void test_addMetric_clipped_string() {
        String tooLongKey = "123456789012345678901234567890123456789012345678901234567890";

        target.addMetric(tooLongKey, 123.456);
        verify(eventToWrap, times(1)).addMetric(
                tooLongKey.substring(0,
                        EventConstraintDecorator.MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH), 123.456);
    }

    @Test
    public void test_withMetric_clipped_string() {
        String tooLongKey = "123456789012345678901234567890123456789012345678901234567890";

        target.withMetric(tooLongKey, 123.456);
        verify(eventToWrap, times(1)).addMetric(
                tooLongKey.substring(0,
                        EventConstraintDecorator.MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH), 123.456);
    }

    @Test
    public void test_withAttribute_clipped_string() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append("0");
        }
        builder.append("1");
        builder.append("2");
        builder.append("3");
        builder.append("4");
        builder.append("5");

        String tooLongValue = builder.toString();
        String tooLongKey = "123456789012345678901234567890123456789012345678901234567890";

        target.withAttribute(tooLongKey, tooLongValue);
        verify(eventToWrap, times(1)).addAttribute(
                tooLongKey.substring(0,
                        EventConstraintDecorator.MAX_EVENT_ATTRIBUTE_METRIC_KEY_LENGTH),
                tooLongValue
                        .substring(0, EventConstraintDecorator.MAX_EVENT_ATTRIBUTE_VALUE_LENGTH));
    }

}
