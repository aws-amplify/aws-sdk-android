/**
 * Copyright 2016-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
import android.database.Cursor;
import android.net.Uri;

/**
 * Provides methods to record events and submit events to Pinpoint.
 */
public class EventRecorder {

    static final String KEY_MAX_SUBMISSION_SIZE = "maxSubmissionSize";
    static final long DEFAULT_MAX_SUBMISSION_SIZE = 1024 * 100;
    static final String KEY_MAX_PENDING_SIZE = "maxPendingSize";
    static final long DEFAULT_MAX_PENDING_SIZE = 5 * 1024 * 1024;
    static final String KEY_MAX_SUBMISSIONS_ALLOWED = "maxSubmissionAllowed";
    static final int DEFAULT_MAX_SUBMISSIONS_ALLOWED = 3;
    private static final String USER_AGENT = PinpointManager.class.getName() + "/" + VersionInfoUtils.getVersion();
    private static int clippedEventLength = 10;
    private final static int MAX_EVENT_OPERATIONS = 1000;
    private static final long MINIMUM_PENDING_SIZE = 16 * 1024;
    private static final Log log = LogFactory.getLog(EventRecorder.class);
    private final PinpointDBUtil dbUtil;
    private final ExecutorService submissionRunnableQueue;
    private final PinpointContext pinpointContext;

    EventRecorder(final PinpointContext pinpointContext, final PinpointDBUtil dbUtil, final ExecutorService submissionRunnableQueue) {
        this.pinpointContext = pinpointContext;
        this.dbUtil = dbUtil;
        this.submissionRunnableQueue = submissionRunnableQueue;
    }

    /**
     * Constructs a new EventRecorder specifying the client to use.
     *
     * @param pinpointContext The pinpoint pinpointContext
     */
    public static EventRecorder newInstance(final PinpointContext pinpointContext) {
        return newInstance(pinpointContext, new PinpointDBUtil(pinpointContext.getApplicationContext().getApplicationContext()));
    }

    public static EventRecorder newInstance(final PinpointContext pinpointContext, final PinpointDBUtil dbUtil) {
        final ExecutorService submissionRunnableQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                                                                               new LinkedBlockingQueue<Runnable>(
                                                                                   MAX_EVENT_OPERATIONS),
                                                                               new ThreadPoolExecutor.DiscardPolicy());
        return new EventRecorder(pinpointContext, dbUtil, submissionRunnableQueue);
    }

    /**
     * Sets clipped event length.
     *
     * @param clippedEventLength the clipped event length
     */
    public static void setClippedEventLength(final int clippedEventLength) {
        EventRecorder.clippedEventLength = clippedEventLength;
    }

    public void closeDB() {
        dbUtil.closeDB();
    }

    public Uri recordEvent(final AnalyticsEvent event) {
        if (event != null) {
            log.info(String.format("Event Recorded to database with EventType: %s",
                                   StringUtil.clipString(event.getEventType(), clippedEventLength, true)));
        }
        long maxPendingSize = pinpointContext.getConfiguration().optLong(KEY_MAX_PENDING_SIZE, DEFAULT_MAX_PENDING_SIZE);
        if (maxPendingSize < MINIMUM_PENDING_SIZE) {
            maxPendingSize = MINIMUM_PENDING_SIZE;
        }

        final Uri uri = this.dbUtil.saveEvent(event);
        if (uri != null) {
            while (this.dbUtil.getTotalSize() > maxPendingSize) {
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
            log.warn(String.format("Event: '%s' failed to record to local database.",
                                   StringUtil.clipString(event.getEventType(), clippedEventLength, true)));
            return null;
        }
    }

    private static final int JSON_COLUMN_INDEX = EventTable.COLUMN_INDEX.JSON.getValue();
    private static final int ID_COLUMN_INDEX = EventTable.COLUMN_INDEX.ID.getValue();
    private static final int SIZE_COLUMN_INDEX = EventTable.COLUMN_INDEX.SIZE.getValue();

    JSONObject readEventFromCursor(final Cursor cursor,
                                   final List<Integer> idsToDelete,
                                   final List<Integer> sizeToDelete) {
        Integer rowId = null;
        Integer size = null;
        try {
            if (cursor.isNull(ID_COLUMN_INDEX)) {
                log.error("Column 'ID' for event was NULL.");
                return null;
            } else {
                rowId = cursor.getInt(ID_COLUMN_INDEX);
            }

            if (cursor.isNull(SIZE_COLUMN_INDEX)) {
                log.error("Column 'SIZE' for event was NULL.");
            } else {
                size = cursor.getInt(SIZE_COLUMN_INDEX);
            }

            JSONObject jsonObject = null;
            if (cursor.isNull(JSON_COLUMN_INDEX)) {
                log.error(String.format(Locale.US,
                    "Event from DB with ID=%d and SiZE=%d contained a NULL message.", rowId, size));
            } else {
                final String message = cursor.getString(JSON_COLUMN_INDEX);
                try {
                    jsonObject = new JSONObject(message);
                } catch (final JSONException e) {
                    log.error(String.format(Locale.US,
                        "Unable to deserialize event JSON for event with ID=%d.", rowId));
                }

                if (size != null && message.length() != size) {
                    log.warn(String.format(Locale.US,
                        "Message with ID=%d has a size mismatch. DBMsgSize=%d DBSizeCol=%d",
                        rowId, message.length(), size));
                    // In this case we had a size in the DB, but it didn't match the size of the message in the DB.
                    // We set the size as null so the total size will end up recalculated from the remaining
                    // items in the database after this item is removed.
                    size = null;
                }
            }

            return jsonObject;
        } catch (final Exception ex) {
            log.error("Failed accessing cursor to get next event.", ex);
        } finally {
            // if the row Id is not null then this item needs to be deleted from the database regardless of whether
            // the message was valid json or not, since we don't want to leave a corrupted item in the DB.
            if (rowId != null && idsToDelete != null && sizeToDelete != null) {
                idsToDelete.add(rowId);
                sizeToDelete.add(size);
            }
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

    JSONArray getBatchOfEvents(final Cursor cursor, final List<Integer> idsToDelete, final List<Integer> sizeToDelete) {
        final JSONArray eventArray = new JSONArray();
        long currentRequestSize = 0;
        long eventLength;
        final long maxRequestSize = pinpointContext.getConfiguration().optLong(KEY_MAX_SUBMISSION_SIZE, DEFAULT_MAX_SUBMISSION_SIZE);

        do {
            JSONObject json = readEventFromCursor(cursor, idsToDelete, sizeToDelete);
            if (json != null) {
                eventLength = json.length();
                currentRequestSize += eventLength;
                eventArray.put(json);
            }
            if (currentRequestSize > maxRequestSize) {
                break;
            }
        } while (cursor.moveToNext());

        return eventArray;
    }

    public List<JSONObject> getAllEvents() {
        final List<JSONObject> events = new ArrayList<JSONObject>();
        Cursor cursor = null;
        try {
            cursor = dbUtil.queryAllEvents();
            while (cursor.moveToNext()) {
                JSONObject jsonEvent = readEventFromCursor(cursor, null, null);
                if (jsonEvent != null) {
                    events.add(jsonEvent);
                }
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return events;
    }

    void processEvents() {
        final long start = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());

        Cursor cursor = null;

        try {
            cursor = dbUtil.queryAllEvents();

            if (!cursor.moveToFirst()) {
                // if the cursor is empty there is nothing to do.
                log.info("No events available to submit.");
                return;
            }

            final List<Integer> idsToDelete = new ArrayList<Integer>();
            final List<Integer> sizeToDelete = new ArrayList<Integer>();
            boolean successful;
            int submissions = 0;
            final long maxSubmissionsAllowed = pinpointContext
                .getConfiguration()
                .optInt(KEY_MAX_SUBMISSIONS_ALLOWED, DEFAULT_MAX_SUBMISSIONS_ALLOWED);

            do {
                final List<Integer> batchIdsToDelete = new ArrayList<Integer>();
                final List<Integer> batchSizeToDelete = new ArrayList<Integer>();
                successful = submitEvents(
                    this.getBatchOfEvents(cursor, batchIdsToDelete, batchSizeToDelete));
                if (successful) {
                    idsToDelete.addAll(batchIdsToDelete);
                    sizeToDelete.addAll(batchSizeToDelete);
                    submissions++;
                }
                if (submissions >= maxSubmissionsAllowed) {
                    break;
                }
            } while (cursor.moveToNext());

            if (sizeToDelete.size() > 0) {
                for (int i = 0; i < sizeToDelete.size(); i++) {
                    try {
                        dbUtil.deleteEvent(idsToDelete.get(i), sizeToDelete.get(i));
                    } catch (final Exception exc) {
                        log.error("Failed to delete event: " + idsToDelete.get(i), exc);
                    }
                }
            }

            log.info(String.format(Locale.US, "Time of attemptDelivery: %d",
                TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) - start));
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    boolean submitEvents(final JSONArray eventArray) {
        boolean submitted = false;

        // package them into an ers request
        final PutEventsRequest request = this.createRecordEventsRequest(eventArray, pinpointContext.getNetworkType(),
                                                                        pinpointContext.getTargetingClient());
        request.withClientContextEncoding("base64");

        request.getRequestClientOptions().appendUserAgent(USER_AGENT);

        try {
            pinpointContext.getAnalyticsServiceClient().putEvents(request);
            submitted = true;
            log.info(String.format("Successful submission of %d events.", eventArray.length()));

            return submitted;
        } catch (final AmazonServiceException e) {
            log.error("AmazonServiceException occured during send of put event ", e);
            final String errorCode = e.getErrorCode();
            if (errorCode.equalsIgnoreCase("ValidationException")
                || errorCode.equalsIgnoreCase("SerializationException")
                || errorCode.equalsIgnoreCase("BadRequestException")) {
                submitted = true;
                log.error(
                    String.format("Failed to submit events to EventService: statusCode: " + e.getStatusCode() + " errorCode: ", errorCode));
                log.error(String.format("Failed submission of %d events, events will be removed", eventArray.length()), e);

                return submitted;
            } else {
                log.warn(
                    "Unable to successfully deliver events to server. Events will be saved, error likely recoverable.  Response status "
                    + "code " + e.getStatusCode() + " , response error code " + e.getErrorCode() + e.getMessage());
                log.warn("Received an error response: " + e.getMessage());
            }
        } catch (final Exception e2) {
            log.warn("Unable to successfully deliver events to server. Events will be saved, error likely recoverable." + e2.getMessage());
        }

        return submitted;
    }

    /**
     * @param events
     * @param networkType
     * @param targetingClient
     * @return
     */
    public PutEventsRequest createRecordEventsRequest(final JSONArray events, final String networkType, final TargetingClient targetingClient) {
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
                // Do not log JSONException due to potentially sensitive information
                log.error("Stored event was invalid JSON.");
                continue;
            }
            clientContext = internalEvent.createClientContext(networkType);

            //Add EndpointProfile profile to client pinpointContext
            if (targetingClient != null &&
                targetingClient.currentEndpoint() != null) {
                final String endpoint = targetingClient.currentEndpoint().toJSONObject().toString();
                final Map<String, String> customAttribute = new HashMap<String, String>();
                customAttribute.put("endpoint", endpoint);
                clientContext.setCustom(customAttribute);
                // Do not log client context due to potentially sensitive information
                log.info("Recorded profile to client pinpointContext.");
            } else {
                log.error("Event Client is null.");
            }

            final Event event = new Event();
            final Session session = new Session();
            session.withId(internalEvent.getSession().getSessionId());
            session.withStartTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent.getSession().getSessionStart())));
            if (internalEvent.getSession().getSessionStop() != null &&
                internalEvent.getSession().getSessionStop() != 0L) {
                session.withStopTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent.getSession().getSessionStop())));
            }
            if (internalEvent.getSession().getSessionDuration() != null && internalEvent.getSession().getSessionDuration() != 0L) {
                session.withDuration(internalEvent.getSession().getSessionDuration());
            }

            event.withAttributes(internalEvent.getAllAttributes())
                 .withMetrics(internalEvent.getAllMetrics())
                 .withEventType(internalEvent.getEventType())
                 .withTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent.getEventTimestamp())))
                 .withSession(session);

            eventList.add(event);
        }

        if (clientContext != null && eventList.size() > 0) {
            putRequest.withEvents(eventList).withClientContext(Base64.encodeAsString(clientContext.toJSONObject().toString().getBytes()));
        } else {
            log.error("ClientContext is null or event list is empty.");
        }
        return putRequest;
    }

}
