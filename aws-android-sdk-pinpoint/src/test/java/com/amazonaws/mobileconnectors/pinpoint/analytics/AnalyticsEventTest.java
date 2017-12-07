/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class AnalyticsEventTest extends MobileAnalyticsTestBase {

    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";
    private static final String UNIQUE_ID = "abc123";
    private static final String SESSION_ID = "testSessionId";
    private static final long SESSION_START = 100L;
    private static final long SESSION_END = 1000L;
    private static final long SESSION_DURATION = 900L;
    private static final Long TIME_STAMP = 1370111901909l;
    private static final String EVENT_NAME = "event_name";

    private AnalyticsEvent target;
    private MockDeviceDetails testDeviceDetails;

    @Before
    public void setup() {
        testDeviceDetails = new MockDeviceDetails();

        PinpointContext mockContext = new AnalyticsContextBuilder()
                                              .withSdkInfo(SDK_NAME,
                                                                  SDK_VERSION)
                                              .withUniqueIdValue(UNIQUE_ID)
                                              .withDeviceDetails(testDeviceDetails)
                                              .withContext(RuntimeEnvironment.application
                                                                   .getApplicationContext())
                                              .build();

        target = AnalyticsEvent
                         .newInstance(mockContext, SESSION_ID, SESSION_START,
                                             SESSION_END,
                                             SESSION_DURATION, TIME_STAMP,
                                             EVENT_NAME);

        assertEquals(EVENT_NAME, target.getEventType());
        assertEquals(UNIQUE_ID, target.getUniqueId());
        assertEquals(TIME_STAMP, target.getEventTimestamp());
        assertEquals(SDK_NAME, target.getSdkName());
        assertEquals(SDK_VERSION, target.getSdkVersion());
        assertEquals(0, target.getAllAttributes().size());
        assertEquals(0, target.getAllMetrics().size());

    }

    @After
    public void cleanup() {
        target = null;
    }

    @Test
    public void copyEvent_initializaer() {
        target.addAttribute("attr", "value");
        target.addMetric("metric", 1.0);

        PinpointContext mockContext = new AnalyticsContextBuilder()
                                              .withSdkInfo(SDK_NAME,
                                                                  SDK_VERSION)
                                              .withUniqueIdValue(UNIQUE_ID)
                                              .withDeviceDetails(testDeviceDetails)
                                              .withContext(RuntimeEnvironment.application
                                                                   .getApplicationContext())
                                              .build();

        AnalyticsEvent copiedTarget = AnalyticsEvent
                                              .createFromEvent(mockContext,
                                                                      SESSION_ID,
                                                                      System.currentTimeMillis(),
                                                                      target);

        assertEquals(EVENT_NAME, copiedTarget.getEventType());
        assertEquals(UNIQUE_ID, copiedTarget.getUniqueId());
        assertEquals(true, System.currentTimeMillis() -
                                   copiedTarget.getEventTimestamp() < 50);
        assertEquals(SDK_NAME, copiedTarget.getSdkName());
        assertEquals(SDK_VERSION, copiedTarget.getSdkVersion());
        assertEquals("value", copiedTarget.getAttribute("attr"));
        assertEquals(1.0, copiedTarget.getMetric("metric").doubleValue(), .01);
    }

    @Test
    public void addAttribute_then_retrieve_test() {
        target.addAttribute("something", "otherthing");
        assertTrue(target.hasAttribute("something"));
        assertEquals(1, target.getAllAttributes().size());
        assertEquals("otherthing", target.getAttribute("something"));
    }

    @Test
    public void addAttribute_override_retrieve_test() {
        target.addAttribute("something", "1");
        target.addAttribute("something", "2");
        assertTrue(target.hasAttribute("something"));
        assertEquals("2", target.getAttribute("something"));
        assertEquals(1, target.getAllAttributes().size());
    }

    @Test
    public void hasAttribute_tests() {
        target.addAttribute("a1", "30");
        target.addAttribute("a2", "30");
        target.addAttribute("a4", "30");
        assertEquals(3, target.getAllAttributes().size());
        assertTrue(target.hasAttribute("a1"));
        assertTrue(target.hasAttribute("a2"));
        assertFalse(target.hasAttribute("a3"));
        assertTrue(target.hasAttribute("a4"));
    }

    @Test
    public void addMetric_then_retrieve_test() {
        target.addMetric("something", 30.0);
        assertEquals(1, target.getAllMetrics().size());
        assertTrue(target.hasMetric("something"));
        assertEquals(30.0, target.getMetric("something").doubleValue(), 0.01);
    }

    @Test
    public void addMetric_override_retrieve_test() {
        target.addMetric("something", 30.0);
        target.addMetric("something", 40.0);
        assertEquals(1, target.getAllMetrics().size());
        assertTrue(target.hasMetric("something"));
        assertEquals(40.0, target.getMetric("something").doubleValue(), 0.01);
    }

    @Test
    public void hasMetric_tests() {
        target.addMetric("m1", 30.0);
        target.addMetric("m2", 30.0);
        target.addMetric("m4", 30.0);
        assertEquals(3, target.getAllMetrics().size());
        assertTrue(target.hasMetric("m1"));
        assertTrue(target.hasMetric("m2"));
        assertFalse(target.hasMetric("m3"));
        assertTrue(target.hasMetric("m4"));
    }

    @Test
    public void withMetric_test() {
        target.withMetric("a", 30.0).withMetric("b", 123.32939d);

        assertEquals(30.0, target.getMetric("a"), 0.01);
        assertEquals(123.32939d, target.getMetric("b"), 0.01);
    }

    @Test
    public void withAttribute_test() {
        target.withAttribute("a", "zz")
                .withAttribute("b", "ff");

        assertEquals("zz", target.getAttribute("a"));
        assertEquals("ff", target.getAttribute("b"));
    }

    @Test
    public void valid_json_from_event_test() throws JSONException {
        target.addAttribute("attr1", "value1");
        target.addAttribute("attr2", "value2");
        target.addMetric("metric1", 1.0);
        target.addMetric("metric2", 2.0);

        JSONObject out = target.toJSONObject();

        assertTrue(out.has("event_type"));
        assertEquals(EVENT_NAME, out.getString("event_type"));

        assertTrue(out.has("timestamp"));
        assertEquals(TIME_STAMP.longValue(), out.getLong("timestamp"));

        assertTrue(out.has("unique_id"));
        assertEquals(UNIQUE_ID, out.getString("unique_id"));

        assertTrue(out.has("sdk_name"));
        assertEquals(SDK_NAME, out.getString("sdk_name"));

        assertTrue(out.has("sdk_version"));
        assertEquals(SDK_VERSION, out.getString("sdk_version"));

        assertTrue(out.has("platform"));
        assertEquals("ANDROID", out.getString("platform"));

        assertTrue(out.has("locale"));
        assertEquals("en_US", out.getString("locale"));

        assertTrue(out.has("platform_version"));
        assertEquals("4.0", out.getString("platform_version"));

        assertTrue(out.has("make"));
        assertEquals("Samsung", out.getString("make"));

        assertTrue(out.has("model"));
        assertEquals("Galaxy S", out.getString("model"));

        assertTrue(out.has("app_version_name"));
        assertEquals("v1.2.0301-Alpha", out.getString("app_version_name"));

        assertTrue(out.has("app_version_code"));
        assertEquals("14", out.getString("app_version_code"));

        assertTrue(out.has("app_package_name"));
        assertEquals("com.amazon.packagename",
                            out.getString("app_package_name"));

        assertTrue(out.has("attributes"));
        JSONObject attributes = out.getJSONObject("attributes");
        assertEquals(2, attributes.length());
        assertEquals("value1", attributes.getString("attr1"));
        assertEquals("value2", attributes.getString("attr2"));

        assertTrue(out.has("metrics"));
        JSONObject metrics = out.getJSONObject("metrics");
        assertEquals(2, metrics.length());
        assertEquals(1, metrics.getInt("metric1"));
        assertEquals(2, metrics.getInt("metric2"));
    }

    @Test
    public void valid_json_locale_from_event_test() throws JSONException {
        testDeviceDetails.setLocale(Locale.CANADA_FRENCH);
        JSONObject out = target.toJSONObject();
        assertTrue(out.has("locale"));
        assertEquals("fr_CA", out.getString("locale"));

        testDeviceDetails.setLocale(Locale.CHINA);
        out = target.toJSONObject();
        assertTrue(out.has("locale"));
        assertEquals("zh_CN", out.getString("locale"));

        testDeviceDetails.setLocale(Locale.UK);
        out = target.toJSONObject();
        assertTrue(out.has("locale"));
        assertEquals("en_GB", out.getString("locale"));

        testDeviceDetails.setLocale(Locale.JAPAN);
        out = target.toJSONObject();
        assertTrue(out.has("locale"));
        assertEquals("ja_JP", out.getString("locale"));

        testDeviceDetails.setLocale(null);
        out = target.toJSONObject();
        assertTrue(out.has("locale"));
        assertEquals("UNKNOWN", out.getString("locale"));
    }
}
