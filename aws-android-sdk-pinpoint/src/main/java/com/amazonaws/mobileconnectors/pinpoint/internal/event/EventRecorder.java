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

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import com.amazonaws.mobileconnectors.pinpoint.PinpointManager;
import com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile.EndpointProfile;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidAppDetails;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;

import com.amazonaws.services.pinpoint.model.EndpointDemographic;
import com.amazonaws.services.pinpoint.model.EndpointItemResponse;
import com.amazonaws.services.pinpoint.model.EndpointLocation;
import com.amazonaws.services.pinpoint.model.EndpointUser;
import com.amazonaws.services.pinpoint.model.Event;
import com.amazonaws.services.pinpoint.model.EventItemResponse;
import com.amazonaws.services.pinpoint.model.EventsBatch;
import com.amazonaws.services.pinpoint.model.EventsRequest;
import com.amazonaws.services.pinpoint.model.PublicEndpoint;
import com.amazonaws.services.pinpoint.model.PutEventsRequest;
import com.amazonaws.services.pinpoint.model.PutEventsResult;
import com.amazonaws.services.pinpoint.model.Session;

import com.amazonaws.util.DateUtils;
import com.amazonaws.util.VersionInfoUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Provides methods to record events and submit events to Pinpoint.
 */
public class EventRecorder {

    static final String KEY_MAX_SUBMISSION_SIZE = "maxSubmissionSize";
    static final long DEFAULT_MAX_SUBMISSION_SIZE = 1024 * 100;
    static final String KEY_MAX_PENDING_SIZE = "maxPendingSize";
    static final long DEFAULT_MAX_PENDING_SIZE = 5 * 1024 * 1024;
    static final String DATABASE_ID_KEY = "databaseId";
    static final String SUCCESSFUL_EVENT_IDS = "successfulEventIds";
    static final String FAILED_EVENT_IDS = "failedEventIds";
    static final String EVENT_ID = "event_id";
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

    /**
     * Closes the database.
     */
    public void closeDB() {
        dbUtil.closeDB();
    }

    /**
     * Records an {@link com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent}.
     *
     * @param event the analytics event
     * @return the URI of the event recorded in the local database
     */
    public Uri recordEvent(final AnalyticsEvent event) {
        if (event == null) {
            log.warn("Event cannot be null. Pass in a valid non-null event.");
            return null;
        }

        log.info(String.format("Event Recorded to database with EventType: %s",
                StringUtil.clipString(event.getEventType(), clippedEventLength, true)));

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

    JSONObject readEventFromCursor(final Cursor cursor, final HashMap<Integer, Integer> idsAndSizeToDelete) {
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
                    //link event with databaseId
                    jsonObject.put(DATABASE_ID_KEY,rowId);
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
            if (rowId != null && idsAndSizeToDelete != null) {
                idsAndSizeToDelete.put(rowId, size);
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

    JSONArray getBatchOfEvents(final Cursor cursor, final HashMap<Integer, Integer> idsAndSizeToDelete) {
        final JSONArray eventArray = new JSONArray();
        long currentRequestSize = 0;
        long eventLength;
        final long maxRequestSize = pinpointContext.getConfiguration().optLong(KEY_MAX_SUBMISSION_SIZE, DEFAULT_MAX_SUBMISSION_SIZE);

        do {
            JSONObject json = readEventFromCursor(cursor, idsAndSizeToDelete);
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
                JSONObject jsonEvent = readEventFromCursor(cursor, null);
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

    Map<String,Set<String>> processEvents() {
        final long start = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());

        Cursor cursor = null;

        try {
            cursor = dbUtil.queryAllEvents();

            if (!cursor.moveToFirst()) {
                // if the cursor is empty there is nothing to do.
                log.info("No events available to submit.");
                return null;
            }

            Map<String,Set<String>> totalProcessedEvents = new HashMap<String,Set<String>>();
            Map<String,Set<String>> processedEvents;
            Set<String> successfulEventIds = new HashSet<String>();
            Set<String> failedEventIds = new HashSet<String>();
            totalProcessedEvents.put(SUCCESSFUL_EVENT_IDS, successfulEventIds);
            totalProcessedEvents.put(FAILED_EVENT_IDS, failedEventIds);

            int submissions = 0;
            final long maxSubmissionsAllowed = pinpointContext
                .getConfiguration()
                .optInt(KEY_MAX_SUBMISSIONS_ALLOWED, DEFAULT_MAX_SUBMISSIONS_ALLOWED);

            do {
                final HashMap<Integer, Integer> batchIdsAndSizeToDelete = new HashMap<Integer, Integer>();
                final JSONArray events = this.getBatchOfEvents(cursor, batchIdsAndSizeToDelete);
                if (batchIdsAndSizeToDelete.size() > 0) {
                    processedEvents = submitEventsAndEndpoint(events, batchIdsAndSizeToDelete);
                    totalProcessedEvents.get(FAILED_EVENT_IDS).addAll(processedEvents.get(FAILED_EVENT_IDS));
                    totalProcessedEvents.get(SUCCESSFUL_EVENT_IDS).addAll(processedEvents.get(SUCCESSFUL_EVENT_IDS));
                    submissions++;
                }
                for(Integer id : batchIdsAndSizeToDelete.keySet()) {
                    try{
                        dbUtil.deleteEvent(id, batchIdsAndSizeToDelete.get(id));
                    } catch (final IllegalArgumentException exc) {
                        log.error("Failed to delete event: " + id, exc);
                    }
                }
                if (submissions >= maxSubmissionsAllowed) {
                    break;
                }
            } while (cursor.moveToNext());

            log.info(String.format(Locale.US, "Time of attemptDelivery: %d",
                TimeUnit.NANOSECONDS.toMillis(System.nanoTime()) - start));
            return totalProcessedEvents;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

    }

    public Map<String,Set<String>> submitEventsAndEndpoint(final JSONArray eventArray, final HashMap<Integer, Integer> batchIdsAndSizeToDelete) {
        return submitEventsAndEndpoint(eventArray, batchIdsAndSizeToDelete, pinpointContext.getTargetingClient().currentEndpoint());
    }

    public Map<String,Set<String>> submitEventsAndEndpoint(final JSONArray eventArray, final HashMap<Integer, Integer> batchIdsAndSizeToDelete, EndpointProfile endpoint) {

        Map<String,Set<String>> processedEvents = new HashMap<String,Set<String>>();
        Set<String> successfulEventIds = new HashSet<String>();
        Set<String> failedEventIds = new HashSet<String>();
        processedEvents.put(SUCCESSFUL_EVENT_IDS, successfulEventIds);
        processedEvents.put(FAILED_EVENT_IDS, failedEventIds);
        if (endpoint == null) {
            log.warn("Endpoint profile is null, failed to submit events.");
            batchIdsAndSizeToDelete.clear();
            addAllEventIdsToSet(eventArray, failedEventIds);
            return processedEvents;
        }
        // package them into an putEvents request
        PutEventsRequest request = this.createRecordEventsRequest(eventArray, endpoint);
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);

        try {
            //making putEvents request
            PutEventsResult resultResponse = pinpointContext.getPinpointServiceClient().putEvents(request);

            //process endpoint response.
            processEndpointResponse(endpoint, resultResponse);
            //request accepted, checking each event item in the response.
            processEventsResponse(eventArray, endpoint, resultResponse, batchIdsAndSizeToDelete, successfulEventIds, failedEventIds);
            log.info(String.format("Successful submission of %d events.", batchIdsAndSizeToDelete.size()));
        } catch (final AmazonServiceException amazonServiceException) {
            //This is service level exception, we also have item level exception.
            log.error("AmazonServiceException occured during send of put event ", amazonServiceException);
            final String errorCode = amazonServiceException.getErrorCode();
            if (!isRetryable(errorCode)) {
                addAllEventIdsToSet(eventArray, failedEventIds);
                log.error(
                    String.format("Failed to submit events to EventService: statusCode: " +
                            amazonServiceException.getStatusCode() + " errorCode: ", errorCode),
                        amazonServiceException);
                log.error(String.format("Failed submission of %d events, events will be removed", eventArray.length()),
                        amazonServiceException);
            } else {
                log.error(
                        String.format("Unable to successfully deliver events to server. " +
                                "Events will be saved, error is likely recoverable. " +
                                "Response Status code: %s, Response Error Code: %s",
                                amazonServiceException.getStatusCode(), amazonServiceException.getErrorCode()),
                        amazonServiceException);
            }
        } catch (final Exception exception) {
            log.error("Unable to successfully deliver events to server. " +
                    "Events will be saved, error likely recoverable." + exception.getMessage(), exception);
        }
        return processedEvents;
    }

    private void addAllEventIdsToSet(JSONArray eventArray, Set<String> failedEventIds) {
        for(int i = 0; i < eventArray.length(); i++) {
            try {
                failedEventIds.add(eventArray.getJSONObject(i).getString(EVENT_ID));
            } catch (JSONException e) {
                log.error("Failed to get event id while processing event item response.", e);
            }
        }
    }

    private void processEndpointResponse(EndpointProfile endpoint, PutEventsResult resultResponse) {
        final EndpointItemResponse endpointItemResponse = resultResponse
                .getEventsResponse()
                .getResults()
                .get(endpoint.getEndpointId())
                .getEndpointItemResponse();
        if(202 == endpointItemResponse.getStatusCode()) {
            log.info("EndpointProfile updated successfully.");
        } else {
            log.error("AmazonServiceException occurred during endpoint update: " +
                    endpointItemResponse.getMessage());
        }
    }

    private void processEventsResponse(final JSONArray eventArray, EndpointProfile endpointProfile, final PutEventsResult resultResponse, final HashMap<Integer, Integer> batchIdsAndSizeToDelete, Set<String> successfulEventIds, Set<String> failedEventIds) {
        String eventId;
        EventItemResponse responseMessage;

        for(int i = 0; i < eventArray.length(); i++) {
            try {
                eventId = eventArray.getJSONObject(i).getString(EVENT_ID);
                responseMessage = resultResponse
                        .getEventsResponse()
                        .getResults()
                        .get(endpointProfile.getEndpointId())
                        .getEventsItemResponse()
                        .get(eventId);
                if (responseMessage.getMessage().equalsIgnoreCase("Accepted")) {
                    successfulEventIds.add(eventId);
                    log.info(String.format("Successful submit event with event id %s", eventId));
                } else if (isRetryable(responseMessage.getMessage())) {
                    //Item level exception, retryable, removed from batchIdsAndSizeToDelete
                    batchIdsAndSizeToDelete.remove(eventArray.getJSONObject(i).getInt(DATABASE_ID_KEY));
                    log.warn(String.format("Unable to successfully deliver event to server. Event will be saved. Event id %s", eventId));
                } else {
                    //Item level exception, not retryable
                    failedEventIds.add(eventId);
                    log.error(
                            String.format("Failed to submitEvents to EventService: statusCode: %s Status Message: %s",
                                    responseMessage.getStatusCode(), responseMessage.getMessage()));
                }
            } catch (JSONException e) {
                log.error("Failed to get event id while processing event item response.", e);
            }
        }
    }

    private boolean isRetryable(String responseCode) {
        if (responseCode.equalsIgnoreCase("ValidationException") ||
            responseCode.equalsIgnoreCase("SerializationException") ||
            responseCode.equalsIgnoreCase("BadRequestException")) {
            return false;
        }
        return true;
    }

    /**
     * @param events
     * @param endpointProfile
     *
     * @return the request to put event
     */
    private PutEventsRequest createRecordEventsRequest(final JSONArray events,
                                                       final EndpointProfile endpointProfile) {

        final PutEventsRequest putRequest = new PutEventsRequest().withApplicationId(endpointProfile.getApplicationId());
        final String endpointId = endpointProfile.getEndpointId();
        final Map<String, EventsBatch> eventsBatchMap = new HashMap<String, EventsBatch>();
        final EventsBatch eventsBatch = new EventsBatch();
        final PublicEndpoint endpoint = new PublicEndpoint();
        final Map<String,Event> eventsMap = new HashMap<String, Event>();

        // build endpoint payload
        buildEndpointPayload(endpointProfile, endpoint);

        for (int i = 0; i < events.length(); i++) {
            JSONObject eventJSON = null;
            AnalyticsEvent internalEvent = null;
            try {
                eventJSON = events.getJSONObject(i);
                internalEvent = AnalyticsEvent.translateToEvent(eventJSON);
            } catch (final JSONException jsonException) {
                // Do not log JSONException due to potentially sensitive information
                log.error("Stored event was invalid JSON.", jsonException);
                continue;
            }

            // build event payload
            final Event event = new Event();
            buildEventPayload(internalEvent, event);
            eventsMap.put(internalEvent.getEventId(), event);
        }

        // build request payload, could also build with only endpoint payload
        buildRequestPayload(putRequest, endpointId, eventsBatchMap, eventsBatch, endpoint, eventsMap);

        return putRequest;
    }

    private void buildRequestPayload(PutEventsRequest putRequest, 
                                     String endpointId, 
                                     Map<String, EventsBatch> eventsBatchMap, 
                                     EventsBatch eventsBatch, 
                                     PublicEndpoint endpoint, 
                                     Map<String,Event> eventsMap) {
        eventsBatch
            .withEndpoint(endpoint)
            .withEvents(eventsMap);
        eventsBatchMap.put(endpointId, eventsBatch);
        
        final EventsRequest eventsRequest = new EventsRequest();
        eventsRequest.withBatchItem(eventsBatchMap);
        putRequest.withEventsRequest(eventsRequest);
    }

    private void buildEndpointPayload(EndpointProfile endpointProfile, 
                                      PublicEndpoint endpoint) {
        final EndpointDemographic demographic = new EndpointDemographic()
                .withAppVersion(endpointProfile.getDemographic().getAppVersion())
                .withLocale(endpointProfile.getDemographic().getLocale().toString())
                .withTimezone(endpointProfile.getDemographic().getTimezone())
                .withMake(endpointProfile.getDemographic().getMake())
                .withModel(endpointProfile.getDemographic().getModel())
                .withPlatform(endpointProfile.getDemographic().getPlatform())
                .withPlatformVersion(endpointProfile.getDemographic().getPlatformVersion());

        final EndpointLocation location = new EndpointLocation()
                .withLatitude(endpointProfile.getLocation().getLatitude())
                .withLongitude(endpointProfile.getLocation().getLongitude())
                .withPostalCode(endpointProfile.getLocation().getPostalCode())
                .withCity(endpointProfile.getLocation().getCity())
                .withRegion(endpointProfile.getLocation().getRegion())
                .withCountry(endpointProfile.getLocation().getCountry());

        final EndpointUser user;
        if (endpointProfile.getUser().getUserId() == null) {
            user = null;
        } else {
            user = new EndpointUser();
            user.setUserId(endpointProfile.getUser().getUserId());
        }

        endpoint.withChannelType(endpointProfile.getChannelType())
                .withAddress(endpointProfile.getAddress())
                .withLocation(location)
                .withDemographic(demographic)
                .withEffectiveDate(DateUtils.formatISO8601Date(
                        new Date(endpointProfile.getEffectiveDate())))
                .withOptOut(endpointProfile.getOptOut())
                .withAttributes(endpointProfile.getAllAttributes())
                .withMetrics(endpointProfile.getAllMetrics())
                .withUser(user);
    }

    void buildEventPayload(AnalyticsEvent internalEvent,
                           Event event) {
        final Session session = new Session();

        session.withId(internalEvent.getSession().getSessionId());
        session.withStartTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent.getSession().getSessionStart())));
        if (internalEvent.getSession().getSessionStop() != null &&
            internalEvent.getSession().getSessionStop() != 0L) {
            session.withStopTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent.getSession().getSessionStop())));
        }
        if (internalEvent.getSession().getSessionDuration() != null &&
            internalEvent.getSession().getSessionDuration() != 0L) {
            session.withDuration(internalEvent.getSession().getSessionDuration().intValue());
        }

        final AndroidAppDetails appDetails = internalEvent.getAppDetails();
        event.withAppPackageName(appDetails.packageName())
                .withAppTitle(appDetails.getAppTitle())
                .withAppVersionCode(appDetails.versionCode())
                .withAttributes(internalEvent.getAllAttributes())
                .withClientSdkVersion(internalEvent.getSdkVersion())
                .withEventType(internalEvent.getEventType())
                .withMetrics(internalEvent.getAllMetrics())
                .withSdkName(internalEvent.getSdkName())
                .withSession(session)
                .withTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent.getEventTimestamp())));
    }
}
