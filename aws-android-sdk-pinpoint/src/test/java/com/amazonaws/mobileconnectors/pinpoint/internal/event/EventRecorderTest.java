/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.database.Cursor;
import android.net.Uri;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import com.amazonaws.logging.Log;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockAppDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockDeviceDetails;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfile;
import com.amazonaws.services.pinpoint.model.BadRequestException;
import com.amazonaws.services.pinpoint.model.EndpointItemResponse;
import com.amazonaws.services.pinpoint.model.Event;
import com.amazonaws.services.pinpoint.model.EventItemResponse;
import com.amazonaws.services.pinpoint.model.EventsResponse;
import com.amazonaws.services.pinpoint.model.InternalServerErrorException;
import com.amazonaws.services.pinpoint.model.ItemResponse;
import com.amazonaws.services.pinpoint.model.PutEventsRequest;
import com.amazonaws.services.pinpoint.model.PutEventsResult;
import com.amazonaws.services.pinpointanalytics.AmazonPinpointAnalyticsClient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
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
    EndpointProfile endpointProfile;
    EventRecorder eventRecorder;
    PutEventsResult putEventsResult;
    ItemResponse itemResponse;
    EventItemResponse eventItemResponse;

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
        analyticsEvent.addAttribute("key1", "value1");
        analyticsEvent.addAttribute("key2", "value2");
        endpointProfile = new EndpointProfile(mockContext);
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
    public void testRecordEvent() throws JSONException {
        final Uri uri = eventRecorder.recordEvent(analyticsEvent);
        final int idInserted = Integer.parseInt(uri.getLastPathSegment());
        assertNotEquals(idInserted, 0);
        final Cursor c = dbUtil.queryEventById(idInserted);
        assertNotNull(c);
        assertEquals(c.getCount(), 1);
        while (c.moveToNext()) {
            final JSONObject obj = eventRecorder.readEventFromCursor(c, null);
            //add databaseId to event for deleting.
            assertEquals(obj.getInt("databaseId"), 1);
            obj.remove("databaseId");
            assertEquals(obj.toString(),
                                analyticsEvent.toJSONObject().toString());
            dbUtil.deleteEvent(c.getInt(EventTable.COLUMN_INDEX.ID.getValue()),
                                      c.getInt(EventTable.COLUMN_INDEX.SIZE
                                                       .getValue()));
        }
        c.close();
    }

    @Test
    public void testRecordEventPayload() throws JSONException {
        final Event event = new Event();
        eventRecorder.buildEventPayload(analyticsEvent, event);

        final MockAppDetails mockAppDetails = new MockAppDetails();
        assertEquals(mockAppDetails.packageName(), event.getAppPackageName());
        assertEquals(mockAppDetails.getAppTitle(), event.getAppTitle());
        assertEquals(mockAppDetails.versionCode(), event.getAppVersionCode());
        assertEquals(EVENT_NAME, event.getEventType());
        assertEquals(SDK_NAME, event.getSdkName());
        assertEquals(SDK_VERSION, event.getClientSdkVersion());
        assertNotNull(event.getAttributes());
        assertTrue(event.getAttributes().equals(analyticsEvent.getAllAttributes()));
        assertEquals(event.getAttributes().get("key1"), "value1");
        assertEquals(event.getAttributes().get("key2"), "value2");
        assertNotNull(event.getMetrics());
        assertNotNull(event.getSession());
    }

    @Test (expected=IllegalStateException.class)
    public void testReadEventFromCursorThrowsException() throws Exception {
        final Log mockLog = mock(Log.class);
        Mockito.doThrow(new IllegalStateException()).when(mockLog)
            .error(Mockito.anyObject(), any(IllegalStateException.class));
        // Set static field to mock log. equivalent to: Whitebox.setInternalState(EventRecorder.class, "log", mockLog);
        final Field field = EventRecorder.class.getDeclaredField("log");
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(null, mockLog);

        final Cursor mockCursor = mock(Cursor.class);
        when(mockCursor.getString(Mockito.anyInt()))
            .thenThrow(new IllegalStateException(
                "Couldn't read row 794, col 2 from CursorWindow. Make sure the Cursor" +
                " is initialized correctly before accessing data from it."));
        eventRecorder.readEventFromCursor(mockCursor, null);

    }


    @Test
    public void testProcessEventWithAPIError() {
        BadRequestException badRequestException = new BadRequestException("BadRequestException");
        badRequestException.setErrorCode("BadRequestException");
        badRequestException.setStatusCode(400);
        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        //mock endpoint profile
        when(mockContext.getTargetingClient().currentEndpoint()).thenReturn(endpointProfile);
        //mock putEvents API response;
        when(mockContext.getPinpointServiceClient().putEvents(any(PutEventsRequest.class))).thenThrow(badRequestException);
        //before processing events
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
        eventRecorder.processEvents();
        //not retryable, removed from db.
        assertTrue(dbUtil.queryAllEvents().getCount() == 0);
    }

    @Test
    public void testProcessEventWithRetryableAPIError() {
        InternalServerErrorException internalServerErrorException = new InternalServerErrorException("InternalServerErrorException");
        internalServerErrorException.setErrorCode("InternalServerErrorException");
        internalServerErrorException.setStatusCode(500);
        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        //mock endpoint profile
        when(mockContext.getTargetingClient().currentEndpoint()).thenReturn(endpointProfile);
        //mock putEvents API response;
        when(mockContext.getPinpointServiceClient().putEvents(any(PutEventsRequest.class))).thenThrow(internalServerErrorException);
        //before processing events
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
        eventRecorder.processEvents();
        //retryable, not removed from db.
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
    }

    @Test
    public void testProcessEvent_eventCount100() {
        PinpointDBUtil dbUtil = mock(PinpointDBUtil.class);
        PinpointContext pinpointContext = mock(PinpointContext.class);
        EventRecorder eventRecorder = new EventRecorder(pinpointContext, dbUtil, mock(ExecutorService.class));

        AndroidPreferencesConfiguration config = mock(AndroidPreferencesConfiguration.class);
        when(pinpointContext.getConfiguration()).thenReturn(config);
        when(config.optLong(any(String.class), any(Long.class))).thenReturn(5 * 1024 * 1024L);

        Cursor cursor = mock(Cursor.class);

        int numberOfEvents = 150; // Note: Due to API there are (numberOfEvents + 1) added
        Boolean[] falseArray = new Boolean[numberOfEvents];
        Arrays.fill(falseArray, false);
        int sharedIdForAllEvents = 1;
        Integer[] idArray = new Integer[numberOfEvents];
        Arrays.fill(idArray, sharedIdForAllEvents);
        int size = 2;
        Integer[] sizeArray = new Integer[numberOfEvents];
        Arrays.fill(sizeArray, size);
        String[] jsonStringArray = new String[numberOfEvents];
        String json = "{}";
        Arrays.fill(jsonStringArray, json);

        when(cursor.isNull(EventTable.COLUMN_INDEX.ID.getValue())).thenReturn(false, falseArray);
        when(cursor.getInt(EventTable.COLUMN_INDEX.ID.getValue())).thenReturn(sharedIdForAllEvents, idArray);

        when(cursor.isNull(EventTable.COLUMN_INDEX.SIZE.getValue())).thenReturn(false, falseArray);
        when(cursor.getInt(EventTable.COLUMN_INDEX.SIZE.getValue())).thenReturn(size, sizeArray);

        when(cursor.isNull(EventTable.COLUMN_INDEX.JSON.getValue())).thenReturn(false, falseArray);
        when(cursor.getString(EventTable.COLUMN_INDEX.JSON.getValue())).thenReturn(json, jsonStringArray);

        // Allows looping for next batch submit
        when(cursor.moveToNext()).thenReturn(true).thenReturn(true).thenReturn(true);

        JSONArray readArray = eventRecorder.getBatchOfEvents(cursor, new HashMap<Integer, Integer>());
        assertEquals(EventRecorder.SERVICE_DEFINED_MAX_EVENTS_PER_BATCH, readArray.length());
    }

    @Test
    public void testProcessEventWithOutEndpoint() {
        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
        eventRecorder.processEvents();
        //should not delete any events since endpoint profile is null.
        //putEvents API only accept request with endpoint profile.
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
    }

    @Test
    public void testProcessEventWithEndpoint() {
        //build API response
        System.out.println("endpoint id: " + endpointProfile.getEndpointId());
        eventItemResponse = new EventItemResponse().withStatusCode(202).withMessage("Accepted");
        itemResponse = new ItemResponse()
                .withEndpointItemResponse(new EndpointItemResponse().withStatusCode(202).withMessage("Accepted"));
        itemResponse.addEventsItemResponseEntry(analyticsEvent.getEventId(), eventItemResponse);
        putEventsResult = new PutEventsResult();
        putEventsResult.withEventsResponse(
            new EventsResponse()
                .addResultsEntry(endpointProfile.getEndpointId(), itemResponse));

        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        //mock endpoint profile
        when(mockContext.getTargetingClient().currentEndpoint()).thenReturn(endpointProfile);
        //mock putEvents API response;
        when(mockContext.getPinpointServiceClient().putEvents(any(PutEventsRequest.class))).thenReturn(putEventsResult);
        //before processing events
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
        eventRecorder.processEvents();
        //putEvents API only accept request with endpoint profile.
        assertTrue(dbUtil.queryAllEvents().getCount() == 0);
    }

    @Test
    public void testProcessEventWithItemRetryableError() {
        //build API response
        eventItemResponse = new EventItemResponse().withStatusCode(500).withMessage("InternalServerErrorException");
        itemResponse = new ItemResponse()
                .withEndpointItemResponse(new EndpointItemResponse().withStatusCode(500).withMessage("InternalServerErrorException"));
        itemResponse.addEventsItemResponseEntry(analyticsEvent.getEventId(), eventItemResponse);
        putEventsResult = new PutEventsResult();
        putEventsResult.withEventsResponse(
            new EventsResponse()
                .addResultsEntry(endpointProfile.getEndpointId(), itemResponse));

        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        //mock endpoint profile
        when(mockContext.getTargetingClient().currentEndpoint()).thenReturn(endpointProfile);
        //mock putEvents API response;
        when(mockContext.getPinpointServiceClient().putEvents(any(PutEventsRequest.class))).thenReturn(putEventsResult);
        //before processing events
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
        eventRecorder.processEvents();
        //retryable, not removed from db.
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
    }

    @Test
    public void testProcessEventWithItemNotRetryableError() {
        //build API response
        eventItemResponse = new EventItemResponse().withStatusCode(400).withMessage("BadRequestException");
        itemResponse = new ItemResponse()
                .withEndpointItemResponse(new EndpointItemResponse().withStatusCode(400).withMessage("BadRequestException"));
        itemResponse.addEventsItemResponseEntry(analyticsEvent.getEventId(), eventItemResponse);
        putEventsResult = new PutEventsResult();
        putEventsResult.withEventsResponse(
            new EventsResponse()
                .addResultsEntry(endpointProfile.getEndpointId(), itemResponse));

        eventRecorder.recordEvent(analyticsEvent);
        final ArrayList<String> attrValues = new ArrayList<String>();
        attrValues.add("TestValue");
        mockContext.getTargetingClient().addAttribute("Test", attrValues);
        //mock endpoint profile
        when(mockContext.getTargetingClient().currentEndpoint()).thenReturn(endpointProfile);
        //mock putEvents API response;
        when(mockContext.getPinpointServiceClient().putEvents(any(PutEventsRequest.class))).thenReturn(putEventsResult);
        //before processing events
        assertTrue(dbUtil.queryAllEvents().getCount() == 1);
        eventRecorder.processEvents();
        //not retryable, removed from db.
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
