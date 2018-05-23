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

package com.amazonaws.mobileconnectors.pinpoint.internal.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;
import android.database.Cursor;
import android.net.Uri;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class PinpointDBUtilTest {

    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";
    private static final String UNIQUE_ID = "abc123";
    private static final String SESSION_ID = "testSessionId";
    private static final long SESSION_START = 100L;
    private static final long SESSION_END = 1000L;
    private static final long SESSION_DURATION = 900L;
    private static final Long TIME_STAMP = 1370111901909l;
    private static final String EVENT_NAME = "event_name";
    PinpointContext mockContext;
    MockDeviceDetails testDeviceDetails;
    private int id;
    private PinpointDBUtil dbUtil;

    @Before
    public void setup() {
        testDeviceDetails = new MockDeviceDetails();
        mockContext = new AnalyticsContextBuilder()
                              .withSdkInfo(SDK_NAME, SDK_VERSION)
                              .withUniqueIdValue(UNIQUE_ID)
                              .withDeviceDetails(testDeviceDetails)
                              .withContext(RuntimeEnvironment.application
                                                   .getApplicationContext())
                              .build();
        dbUtil = new PinpointDBUtil(RuntimeEnvironment.application
                                            .getApplicationContext());
    }

    @After
    public void tearDown() {
        dbUtil.closeDB();
    }

    @Test
    public void testInsertSingleEvent() throws Exception {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.newInstance(mockContext,
                                                                          SESSION_ID,
                                                                          SESSION_START,
                                                                          SESSION_END,
                                                                          SESSION_DURATION,
                                                                          TIME_STAMP,
                                                                          EVENT_NAME);
        Uri uri = dbUtil.saveEvent(analyticsEvent);
        int idInserted = Integer.parseInt(uri.getLastPathSegment());
        assertNotEquals(idInserted, 0);
    }

    @Test
    public void testQueryById() {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.newInstance(mockContext,
                                                                          SESSION_ID,
                                                                          SESSION_START,
                                                                          SESSION_END,
                                                                          SESSION_DURATION,
                                                                          TIME_STAMP,
                                                                          EVENT_NAME);
        Uri uri = dbUtil.saveEvent(analyticsEvent);
        int idInserted = Integer.parseInt(uri.getLastPathSegment());
        assertNotEquals(idInserted, 0);
        Cursor c = dbUtil.queryEventById(idInserted);
        assertNotNull(c);
        assertEquals(c.getCount(), 1);
        c.close();
    }

    @Test
    public void testQueryAll() {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.newInstance(mockContext,
                                                                          SESSION_ID,
                                                                          SESSION_START,
                                                                          SESSION_END,
                                                                          SESSION_DURATION,
                                                                          TIME_STAMP,
                                                                          EVENT_NAME);
        Uri uri1 = dbUtil.saveEvent(analyticsEvent);
        Uri uri2 = dbUtil.saveEvent(analyticsEvent);
        int idInserted1 = Integer.parseInt(uri1.getLastPathSegment());
        int idInserted2 = Integer.parseInt(uri2.getLastPathSegment());
        assertNotEquals(idInserted1, 0);
        assertNotEquals(idInserted2, 0);
        Cursor c = dbUtil.queryAllEvents();
        assertNotNull(c);
        assertEquals(c.getCount(), 2);
        c.close();
    }

    @Test
    public void testDelete() {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.newInstance(mockContext,
                                                                          SESSION_ID,
                                                                          SESSION_START,
                                                                          SESSION_END,
                                                                          SESSION_DURATION,
                                                                          TIME_STAMP,
                                                                          EVENT_NAME);
        Uri uri1 = dbUtil.saveEvent(analyticsEvent);
        Uri uri2 = dbUtil.saveEvent(analyticsEvent);
        int idInserted1 = Integer.parseInt(uri1.getLastPathSegment());
        int idInserted2 = Integer.parseInt(uri2.getLastPathSegment());
        assertNotEquals(idInserted1, 0);
        assertNotEquals(idInserted2, 0);
        Cursor c = dbUtil.queryAllEvents();
        assertNotNull(c);
        assertEquals(c.getCount(), 2);
        c.close();

        int delete1 = dbUtil.deleteEvent(idInserted1, null);
        Cursor c1 = dbUtil.queryAllEvents();
        assertNotNull(c1);
        assertEquals(c1.getCount(), 1);
        c1.close();

        int delete2 = dbUtil.deleteEvent(idInserted2, null);
        Cursor c2 = dbUtil.queryAllEvents();
        assertNotNull(c2);
        assertEquals(c2.getCount(), 0);
        c2.close();
    }
}
