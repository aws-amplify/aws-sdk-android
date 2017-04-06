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

package com.amazonaws.mobileconnectors.pinpoint.targeting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import android.os.Build;

import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.DateUtil;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfile;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfileDemographic;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfileLocation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class EndpointProfileTest extends MobileAnalyticsTestBase {

    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";
    private static final String UNIQUE_ID = "abc123";

    private MockDeviceDetails testDeviceDetails;
    private EndpointProfile target;
    private PinpointContext mockContext;

    @Before
    public void setup() {
        testDeviceDetails = new MockDeviceDetails();

        mockContext = new AnalyticsContextBuilder()
                .withSdkInfo(SDK_NAME, SDK_VERSION)
                .withUniqueIdValue(UNIQUE_ID)
                .withDeviceDetails(testDeviceDetails)
                .withContext(Robolectric.application.getApplicationContext())
                .build();

        target = new EndpointProfile(mockContext);
    }

    @After
    public void cleanup() {
        target = null;
    }

    @Test
    public void testProfile() {
        assertTrue(target.getAllAttributes().isEmpty());
        assertEquals(mockContext.getSystem().getAppDetails().getAppId(), target.getApplicationId());
        assertEquals(UNIQUE_ID, target.getEndpointId());
        assertEquals(mockContext.getSystem().getAppDetails().versionName(), target.getDemographic().getAppVersion());
        assertEquals(Locale.getDefault(), target.getDemographic().getLocale());
        assertEquals(mockContext.getSystem().getDeviceDetails().manufacturer(), target.getDemographic().getMake());
        assertEquals(Build.MODEL,target.getDemographic().getModel());
        assertEquals("ANDROID",target.getDemographic().getPlatform());
        assertEquals(Build.VERSION.RELEASE, target.getDemographic().getPlatformVersion());
        assertEquals(TimeZone.getDefault().getID(), target.getDemographic().getTimezone());
        assertNotNull(target.getEffectiveDate());
        assertNotNull(target.getLocation());
        assertEquals(target.getOptOut(), "ALL");
        assertNull(target.getAddress());
        assertEquals(target.getDemographic().getPlatform(), "ANDROID");
        assertEquals(target.getChannelType(), "GCM");
        assertFalse(target.hasAttribute(""));
        assertFalse(target.hasAttribute(null));
        assertFalse(target.hasMetric(""));
        assertFalse(target.hasMetric(null));
        target.setDemographic(null);
        assertNull(target.getDemographic());
        target.setLocation(null);
        assertNull(target.getLocation());
        target.setEffectiveDate(0);
        assertNotNull(target.getEffectiveDate());
        target.setUser(null);
        assertNull(target.getUser());
        final EndpointProfileDemographic demographic = new EndpointProfileDemographic(mockContext);
        demographic.setMake("test");
        demographic.setModel("test");
        demographic.setTimezone("test");
        demographic.setLocale(null);
        demographic.setAppVersion("test");
        demographic.setPlatform("test");
        demographic.setPlatformVersion("test");
        target.setDemographic(demographic);
        assertEquals(demographic, target.getDemographic());
        final EndpointProfileLocation location = new EndpointProfileLocation();
        location.setLatitude(0.0);
        location.setLongitude(0.0);
        location.setPostalCode("test");
        location.setCity("test");
        location.setRegion("test");
        location.setCountry("test");
        target.setLocation(location);
        assertEquals(location, target.getLocation());
    }

    @Test
    public void testEndpointAttribute() {
        target.addAttribute(null, Arrays.asList(new String[]{"bad"}));
        assertTrue(target.getAllAttributes().isEmpty());
        assertNull(target.getAttribute(null));
        assertFalse(target.hasAttribute(null));
        target.addAttribute("key1", Arrays.asList(new String[]{"attr1", "attr2"}));
        assertFalse(target.getAllAttributes().isEmpty());
        assertNotNull(target.getAttribute("key1"));
        assertTrue(target.hasAttribute("key1"));
        target.addAttribute("key1", null);
        assertTrue(target.getAllAttributes().isEmpty());
        target.withAttribute("key2", Arrays.asList(new String[]{"attr3", "attr4"}));
        assertNotNull(target.getAttribute("key2"));
        assertTrue(target.hasAttribute("key2"));
    }

    @Test
    public void testEndpointMetric() {
        target.addMetric(null, 0.0);
        assertTrue(target.getAllMetrics().isEmpty());
        assertNull(target.getMetric(null));
        assertFalse(target.hasMetric(null));
        target.addMetric("key1", 0.0);
        assertFalse(target.getAllMetrics().isEmpty());
        assertNotNull(target.getMetric("key1"));
        assertTrue(target.hasMetric("key1"));
        target.addMetric("key1", null);
        assertTrue(target.getAllMetrics().isEmpty());
        target.withMetric("key2", 0.0);
        assertTrue(target.hasMetric("key2"));
    }

    @Test
    public void testEndpointSerialization() throws JSONException {
        target = new EndpointProfile(mockContext);
        long date = DateUtil.getCorrectedDate().getTime();
        target.setEffectiveDate(date);
        target.addMetric("key1", 0.0);
        target.addAttribute("key1", Arrays.asList(new String[]{"attr1", "attr2"}));
        assertFalse(target.getAllMetrics().isEmpty());
        assertFalse(target.getAllAttributes().isEmpty());
        assertNotNull(target.getEffectiveDate());
        JSONObject jsonEndpoint = target.toJSONObject();
        assertTrue(jsonEndpoint.getString("ApplicationId").equalsIgnoreCase(target.getApplicationId()));
        assertTrue(jsonEndpoint.getString("EndpointId").equalsIgnoreCase(target.getEndpointId()));
        assertTrue(jsonEndpoint.getString("ChannelType").equalsIgnoreCase(target.getChannelType()));
        assertTrue(jsonEndpoint.getString("EffectiveDate").equalsIgnoreCase(DateUtil.isoDateFromMillis(date)));
        assertTrue(jsonEndpoint.getString("OptOut").equalsIgnoreCase(target.getOptOut()));

        JSONObject metrics = jsonEndpoint.getJSONObject("Metrics");
        assertEquals(metrics.getDouble("key1"), 0.0, 0.0);

        JSONObject attributes = jsonEndpoint.getJSONObject("Attributes");
        JSONArray attrValues = attributes.getJSONArray("key1");
        assertTrue(attrValues.getString(0).equalsIgnoreCase("attr1"));
        assertTrue(attrValues.getString(1).equalsIgnoreCase("attr2"));

        JSONObject location = jsonEndpoint.getJSONObject("Location");
        assertTrue(location.getString("PostalCode").equalsIgnoreCase(target.getLocation().getPostalCode()));
        assertTrue(location.getString("Region").equalsIgnoreCase(target.getLocation().getRegion()));
        assertTrue(location.getString("Country").equalsIgnoreCase(target.getLocation().getCountry()));
        assertTrue(location.getString("City").equalsIgnoreCase(target.getLocation().getCity()));

        JSONObject demographic = jsonEndpoint.getJSONObject("Demographic");
        assertTrue(demographic.getString("Timezone").equalsIgnoreCase(target.getDemographic().getTimezone()));
        assertTrue(demographic.getString("Locale").equalsIgnoreCase(target.getDemographic().getLocale().toString()));
        assertTrue(demographic.getString("AppVersion").equalsIgnoreCase(target.getDemographic().getAppVersion()));
        assertTrue(demographic.getString("PlatformVersion").equalsIgnoreCase(target.getDemographic().getPlatformVersion()));
        assertTrue(demographic.getString("Platform").equalsIgnoreCase(target.getDemographic().getPlatform()));
        assertTrue(demographic.getString("Model").equalsIgnoreCase(target.getDemographic().getModel()));
        assertTrue(demographic.getString("Make").equalsIgnoreCase(target.getDemographic().getMake()));
    }
}
