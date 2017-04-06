/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://aws.amazon.com/apache2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.event;

import android.database.Cursor;
import android.net.Uri;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;
import com.amazonaws.services.pinpointanalytics.model.Event;
import com.amazonaws.services.pinpointanalytics.model.PutEventsRequest;
import com.amazonaws.services.pinpointanalytics.model.Session;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.VersionInfoUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Provides methods to record events and submit events to Pinpoint.
 */
public class EventRecorder {

    private static final String USER_AGENT = PinpointManager.class.getName() + "/"
            + VersionInfoUtils.getVersion();

    private static final int CLIPPED_EVENT_LENGTH = 10;
    private final static int MAX_EVENT_OPERATIONS = 1000;
    static final String KEY_MAX_SUBMISSION_SIZE = "maxSubmissionSize";
    static final long DEFAULT_MAX_SUBMISSION_SIZE = 1024 * 100;
    static final String KEY_MAX_PENDING_SIZE = "maxPendingSize";
    static final long DEFAULT_MAX_PENDING_SIZE = 5 * 1024 * 1024;
    static final String KEY_MAX_SUBMISSIONS_ALLOWED = "maxSubmissionAllowed";
    static final int DEFAULT_MAX_SUBMISSIONS_ALLOWED = 3;
    private static final long MINIMUM_PENDING_SIZE = 16 * 1024;

    private final PinpointDBUtil dbUtil;
    private final ExecutorService submissionRunnableQueue;
    private final PinpointContext pinpointContext;

    private static final Log log =
            LogFactory.getLog(EventRecorder.class);

    /**
     * Constructs a new EventRecorder specifying the client to use.
     *
     * @param pinpointContext The pinpoint pinpointContext
     */
    public static EventRecorder newInstance(PinpointContext pinpointContext) {
        return newInstance(pinpointContext,
                new PinpointDBUtil(pinpointContext.getApplicationContext().getApplicationContext()));
    }

    public static EventRecorder newInstance(PinpointContext pinpointContext, PinpointDBUtil dbUtil) {
        final ExecutorService submissionRunnableQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(
                        MAX_EVENT_OPERATIONS), new ThreadPoolExecutor.DiscardPolicy());
        return new EventRecorder(pinpointContext,
                dbUtil,
                submissionRunnableQueue);
    }

    public void closeDB() {
        dbUtil.closeDB();
    }

    EventRecorder(PinpointContext pinpointContext, PinpointDBUtil dbUtil,
                  ExecutorService submissionRunnableQueue) {
        this.pinpointContext = pinpointContext;
        this.dbUtil = dbUtil;
        this.submissionRunnableQueue = submissionRunnableQueue;
    }

    public Uri recordEvent(AnalyticsEvent event) {
        log.info(String.format("Event Recorded to database: %s", event.toString()));
        long maxPendingSize = pinpointContext.getConfiguration().optLong(
                KEY_MAX_PENDING_SIZE, DEFAULT_MAX_PENDING_SIZE);
        if (maxPendingSize < MINIMUM_PENDING_SIZE) {
            maxPendingSize = MINIMUM_PENDING_SIZE;
        }

        final Uri uri = this.dbUtil.saveEvent(event);
        if (uri != null) {
            while(this.dbUtil.getTotalSize() > maxPendingSize) {
                Cursor cursor = null;
                try {
                    cursor = this.dbUtil.queryOldestEvents(5);
                    while (this.dbUtil.getTotalSize() > maxPendingSize && cursor.moveToNext()) {
                        this.dbUtil.deleteEvent(
                                cursor.getInt(EventTable.COLUMN_INDEX.ID.getValue()),
                                cursor.getInt(EventTable.COLUMN_INDEX.SIZE.getValue()));
                    }
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }

            return uri;
        } else {
            log.warn(String.format("Event: '%s' failed to record to local database",
                    StringUtil.clipString(event.getEventType(), CLIPPED_EVENT_LENGTH,
                            true)));
            return null;
        }
    }

    JSONObject translateFromCursor(Cursor cursor) {
        try {
            return new JSONObject(cursor.getString(EventTable.COLUMN_INDEX.JSON.getValue()));
        } catch (final JSONException e) {
            log.error(String.format("Unable to format events"));
        }
        return null;
    }

    public void submitEvents() {
        submissionRunnableQueue.execute(new Runnable() {
            @Override
            public void run() {
                processEvents();
            }
        });
    }

    JSONArray getBatchOfEvents(Cursor cursor, List<Integer> idsToDeletes, List<Integer> sizeToDeletes) {
        final JSONArray eventArray = new JSONArray();
        long currentRequestSize = 0;
        long eventLength;
        final long maxRequestSize = pinpointContext.getConfiguration().optLong(
                KEY_MAX_SUBMISSION_SIZE, DEFAULT_MAX_SUBMISSION_SIZE);

        JSONObject json = translateFromCursor(cursor);
        idsToDeletes.add(cursor.getInt(EventTable.COLUMN_INDEX.ID.getValue()));
        sizeToDeletes.add(cursor.getInt(EventTable.COLUMN_INDEX.ID.getValue()));
        if (json != null) {
            eventLength = json.length();
            currentRequestSize += eventLength;
            eventArray.put(json);
        }

        while (cursor.moveToNext()) {
            json = translateFromCursor(cursor);
            idsToDeletes.add(cursor.getInt(EventTable.COLUMN_INDEX.ID.getValue()));
            sizeToDeletes.add(cursor.getInt(EventTable.COLUMN_INDEX.ID.getValue()));
            if (json != null) {
                eventLength = json.length();
                currentRequestSize += eventLength;
                eventArray.put(json);

                if (currentRequestSize > maxRequestSize) {
                    break;
                }
            }
        }

        return eventArray;
    }

    public List<JSONObject> getAllEvents() {
        final List<JSONObject> events = new ArrayList<JSONObject>();
        Cursor cursor = null;
        try {
            cursor = dbUtil.queryAllEvents();
            while (cursor.moveToNext()) {
                events.add(translateFromCursor(cursor));
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return events;
    }

    void processEvents() {
        final long start = System.currentTimeMillis();

        Cursor cursor = null;

        try {
            cursor = dbUtil.queryAllEvents();

            final List<Integer> idsToDeletes = new ArrayList<Integer>();
            final List<Integer> sizeToDeletes = new ArrayList<Integer>();
            boolean successful;
            int submissions = 0;
            final long maxSubmissionsAllowed = pinpointContext.getConfiguration().optInt(
                    KEY_MAX_SUBMISSIONS_ALLOWED, DEFAULT_MAX_SUBMISSIONS_ALLOWED);

            while (cursor.moveToNext()) {
                final List<Integer> batchIdsToDeletes = new ArrayList<Integer>();
                final List<Integer> batchSizeToDeletes = new ArrayList<Integer>();
                successful = submitEvents(
                        this.getBatchOfEvents(cursor, batchIdsToDeletes, batchSizeToDeletes));
                if (successful) {
                    idsToDeletes.addAll(batchIdsToDeletes);
                    sizeToDeletes.addAll(batchSizeToDeletes);
                    submissions++;
                }
                if (submissions >= maxSubmissionsAllowed) {
                    break;
                }
            }

            if (sizeToDeletes.size() > 0) {
                for (int i = 0; i < sizeToDeletes.size(); i++) {
                    try {
                        dbUtil.deleteEvent(idsToDeletes.get(i), sizeToDeletes.get(i));
                    } catch (final Exception exc) {
                        log.error("Failed to delete event: " + idsToDeletes.get(i), exc);
                    }
                }
            }

            log.info(String.format("Time of attemptDelivery: %d",
                    System.currentTimeMillis() - start));
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    boolean submitEvents(final JSONArray eventArray) {
        boolean submitted = false;

        // package them into an ers request
        final PutEventsRequest request = this.createRecordEventsRequest(eventArray,
                pinpointContext.getNetworkType(), pinpointContext.getTargetingClient());
        request.withClientContextEncoding("base64");

        request.getRequestClientOptions().appendUserAgent(USER_AGENT);

        try {
            pinpointContext.getAnalyticsServiceClient().putEvents(request);
            submitted = true;
            log.info(String.format("Successful submission of %d events", eventArray.length()));

            return submitted;
        } catch (final AmazonServiceException e) {
            log.error("AmazonServiceException occured during send of put event ", e);
            final String errorCode = e.getErrorCode();
            if (errorCode.equalsIgnoreCase("ValidationException")
                    || errorCode.equalsIgnoreCase("SerializationException")
                    || errorCode.equalsIgnoreCase("BadRequestException")) {
                submitted = true;
                log.error(String.format(
                        "Failed to submit events to EventService: statusCode: " + e.getStatusCode()
                                + " errorCode: ", errorCode));
                log.error(String.format("Failed submission of %d events, events will be removed",
                        eventArray.length()), e);

                return submitted;
            } else {
                log.warn(
                        "Unable to successfully deliver events to server. Events will be saved, error likely recoverable.  Response status code "
                                + e.getStatusCode() + " , response error code " + e.getErrorCode()
                                + e.getMessage());
                log.warn("Recieved an error response: " + e.getMessage());

            }
        } catch (final Exception e2) {
            log.warn("Unable to successfully deliver events to server. Events will be saved, error likely recoverable."
                    + e2.getMessage());
        }

        return submitted;
    }

    public PutEventsRequest createRecordEventsRequest(JSONArray events, String networkType, TargetingClient targetingClient) {
        if (events == null || events.length() == 0) {
            return null;
        }

        final PutEventsRequest putRequest = new PutEventsRequest();
        final List<Event> eventList = new ArrayList<Event>();

        ClientContext clientContext = null;
        for (int i = 0; i < events.length(); i++) {
            JSONObject eventJSON = null;
            AnalyticsEvent internalEvent = null;
            try {
                eventJSON = events.getJSONObject(i);
                internalEvent = AnalyticsEvent.translateToEvent(eventJSON);
            } catch (final JSONException e) {
                log.error("Stored event was invalid JSON", e);
                continue;
            }
            clientContext = internalEvent.createClientContext(networkType);

            //Add EndpointProfile profile to client pinpointContext
            if (targetingClient != null && targetingClient.currentEndpoint() != null) {
                final String endpoint = targetingClient.currentEndpoint().toJSONObject().toString();
                final Map<String, String> customAttribute = new HashMap<String, String>();
                customAttribute.put("endpoint", endpoint);
                clientContext.setCustom(customAttribute);
                log.info("Recorded profile to client pinpointContext: " + clientContext.toJSONObject());
            } else {
                log.error("Event Client is null");
            }

            final Event event = new Event();
            final Session session = new Session();
            session.withId(internalEvent.getSession().getSessionId());
            session.withStartTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent
                    .getSession().getSessionStart())));
            if (internalEvent.getSession().getSessionStop() != null && internalEvent.getSession().getSessionStop() != 0L) {
                session.withStopTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent
                        .getSession().getSessionStop())));
            }
            if (internalEvent.getSession().getSessionDuration() != null
                    && internalEvent.getSession().getSessionDuration() != 0L) {
                session.withDuration(internalEvent.getSession().getSessionDuration());
            }

            event.withAttributes(internalEvent.getAllAttributes())
                    .withMetrics(internalEvent.getAllMetrics())
                    .withEventType(internalEvent.getEventType())
                    .withTimestamp(
                            DateUtils.formatISO8601Date(new Date(internalEvent.getEventTimestamp())))
                    .withSession(session);

            eventList.add(event);
        }

        if (clientContext != null && eventList.size() > 0) {
            putRequest.withEvents(eventList).withClientContext(
                    Base64.encodeAsString(clientContext.toJSONObject().toString().getBytes()));
        } else {
            log.error("ClientContext is null or event list is empty");
        }
        return putRequest;
    }

}
