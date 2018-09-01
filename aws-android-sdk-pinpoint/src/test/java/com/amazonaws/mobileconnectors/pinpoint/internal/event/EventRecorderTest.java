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

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

import com.amazonaws.logging.Log;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.powermock.reflect.Whitebox;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;
import android.database.Cursor;
import android.net.Uri;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(RobolectricTestRunner.class)
@PowerMockIgnore({"org.mockito.*", "org.robolectric.*", "android.*"})
@Config(manifest = Config.NONE, sdk=23)
public class EventRecorderTest {
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
    AnalyticsEvent analyticsEvent;
    MockDeviceDetails testDeviceDetails;
    EventRecorder eventRecorder;
    @Mock
    AmazonPinpointAnalyticsClient mockAnalyticsService;
    @Mock
    ExecutorService submissionRunnable;
    private PinpointDBUtil dbUtil;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        testDeviceDetails = new MockDeviceDetails();
        mockContext = new AnalyticsContextBuilder()
                              .withSdkInfo(SDK_NAME, SDK_VERSION)
                              .withUniqueIdValue(UNIQUE_ID)
                              .withDeviceDetails(testDeviceDetails)
                              .withContext(RuntimeEnvironment.application
                                                   .getApplicationContext())
                              .build();
        analyticsEvent = AnalyticsEvent.newInstance(mockContext, SESSION_ID,
                                                           SESSION_START,
                                                           SESSION_END,
                                                           SESSION_DURATION,
                                                           TIME_STAMP,
                                                           EVENT_NAME);
        dbUtil = new PinpointDBUtil(RuntimeEnvironment.application
                                            .getApplicationContext());
        eventRecorder = new EventRecorder(mockContext, dbUtil,
                                                 submissionRunnable);
    }

    @After
    public void teardown() {
        dbUtil.closeDB();
    }

    @Test
    public void testRecordEvent() {
        final Uri uri = eventRecorder.recordEvent(analyticsEvent);
        final int idInserted = Integer.parseInt(uri.getLastPathSegment());
        assertNotEquals(idInserted, 0);
        final Cursor c = dbUtil.queryEventById(idInserted);
        assertNotNull(c);
        assertEquals(c.getCount(), 1);
        while (c.moveToNext()) {
            final JSONObject obj = eventRecorder.readEventFromCursor(c, null, null);
            assertEquals(obj.toString(),
                                analyticsEvent.toJSONObject().toString());
            dbUtil.deleteEvent(c.getInt(EventTable.COLUMN_INDEX.ID.getValue()),
                                      c.getInt(EventTable.COLUMN_INDEX.SIZE
                                                       .getValue()));
        }
        c.close();
    }

    @Test (expected=IllegalStateException.class)
    public void testReadEventFromCursorThrowsException() throws Exception {
        final Log mockLog = Mockito.mock(Log.class);
        Mockito.doThrow(new IllegalStateException()).when(mockLog)
            .error(Mockito.anyObject(), Mockito.any(IllegalStateException.class));
        // Set static field to mock log. equivalent to: Whitebox.setInternalState(EventRecorder.class, "log", mockLog);
        final Field field = EventRecorder.class.getDeclaredField("log");
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, mockLog);

        final Cursor mockCursor = Mockito.mock(Cursor.class);
        Mockito.when(mockCursor.getString(Mockito.anyInt()))
            .thenThrow(new IllegalStateException(
                "Couldn't read row 794, col 2 from CursorWindow. Make sure the Cursor" +
                " is initialized correctly before accessing data from it."));
        eventRecorder.readEventFromCursor(mockCursor, null, null);

    }

    @Test
    public void testProcessEvent() {
        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        eventRecorder.processEvents();
        assertTrue(dbUtil.queryAllEvents().getCount() == 0);
    }

    @Test
    public void testTrimming() {
        final List<Uri> uris = new ArrayList<Uri>();
        for (int i = 0; i < 100; i++) {
            uris.add(eventRecorder.recordEvent(analyticsEvent));
            assertTrue(dbUtil.getTotalSize() <= 16 * 1024);
        }
        Boolean existing = null;
        for (final Uri uri : uris) {
            final Cursor c = dbUtil.queryEventById(Integer.parseInt(uri.getLastPathSegment()));
            if (c.moveToNext()) {
                assertTrue(existing != null);
                dbUtil.deleteEvent(c.getInt(EventTable.COLUMN_INDEX.ID
                                                    .getValue()),
                                          c.getInt(EventTable.COLUMN_INDEX.SIZE
                                                           .getValue()));
                existing = true;
            } else {
                assertTrue(existing == null || !existing);
                existing = false;
            }
        }
        assertTrue(dbUtil.getTotalSize() == 0);
    }
}
