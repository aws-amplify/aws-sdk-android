/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import android.util.Log;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsManager;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore.EventIterator;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy.DefaultDeliveryPolicyFactory;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy.DeliveryPolicy;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.adapter.EventAdapter;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.adapter.JSONEventAdapter;
import com.amazonaws.services.mobileanalytics.model.PutEventsRequest;
import com.amazonaws.util.VersionInfoUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class DefaultDeliveryClient implements DeliveryClient {

    public static final String EVENTS_DIRECTORY = "events";
    private static final String USER_AGENT = MobileAnalyticsManager.class.getName() + "/"
            + VersionInfoUtils.getVersion();

    private static final String TAG = "DefaultDeliveryClient";
    private final static int MAX_EVENT_OPERATIONS = 1000;
    private final static int MAX_SUBMIT_OPERATIONS = 100;
    private static final int CLIPPED_EVENT_LENGTH = 5;
    static final String KEY_MAX_SUBMISSION_SIZE = "maxSubmissionSize";
    static final long DEFAULT_MAX_SUBMISSION_SIZE = 1024 * 100;
    static final String KEY_MAX_SUBMISSIONS_ALLOWED = "maxSubmissionAllowed";
    static final int DEFAULT_MAX_SUBMISSIONS_ALLOWED = 3;
    static final Set<Integer> RETRY_REQUEST_CODES;

    private final DefaultDeliveryPolicyFactory policyFactory;
    private final ExecutorService eventsRunnableQueue;
    private final ExecutorService submissionRunnableQueue;
    private final AnalyticsContext context;
    private final ERSRequestBuilder requestBuilder;
    private final EventStore eventStore;
    private final EventAdapter<JSONObject> eventAdapter;
    private final AtomicLong avgWriteEventTimeMillis = new AtomicLong(25L);
    private final AtomicLong eventsProcessed = new AtomicLong(0L);

    private long lastAttemptTime = 0;

    static {
        RETRY_REQUEST_CODES = new HashSet<Integer>();
        RETRY_REQUEST_CODES.add(401);
        RETRY_REQUEST_CODES.add(404);
        RETRY_REQUEST_CODES.add(407);
        RETRY_REQUEST_CODES.add(408);
    }

    public static DefaultDeliveryClient newInstance(AnalyticsContext context,
            boolean allowWANDelivery) {

        // create a service that is single threaded and only allows
        // MAX_OPERATIONS to be enqueued at one time
        ExecutorService eventsExService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(
                        MAX_EVENT_OPERATIONS), new ThreadPoolExecutor.DiscardPolicy());
        ExecutorService submissionsExService = new ThreadPoolExecutor(1, 1, 0L,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(
                        MAX_SUBMIT_OPERATIONS), new ThreadPoolExecutor.DiscardPolicy());
        ERSRequestBuilder requestBuilder = new ERSRequestBuilder();
        DefaultDeliveryPolicyFactory policyFactory = new DefaultDeliveryPolicyFactory(context,
                allowWANDelivery);

        return new DefaultDeliveryClient(context, policyFactory, eventsExService,
                submissionsExService, requestBuilder,
                FileEventStore.newInstance(context), new JSONEventAdapter());
    }

    DefaultDeliveryClient(AnalyticsContext context, DefaultDeliveryPolicyFactory policyFactory,
            final ExecutorService eventsRunnableQueue,
            final ExecutorService submissionRunnableQueue, ERSRequestBuilder requestBuilder,
            EventStore eventStore,
            EventAdapter<JSONObject> eventAdapter) {
        this.policyFactory = policyFactory;
        this.eventsRunnableQueue = eventsRunnableQueue;
        this.submissionRunnableQueue = submissionRunnableQueue;
        this.context = context;
        this.requestBuilder = requestBuilder;
        this.eventStore = eventStore;
        this.eventAdapter = eventAdapter;
    }

    @Override
    public void notify(InternalEvent event) {
        enqueueEventForDelivery(event);
    }

    @Override
    public void enqueueEventForDelivery(final InternalEvent event) {
        final long startEnqueueTimeMillis = System.currentTimeMillis();
        final long origEventsProcessed = eventsProcessed.get();
        eventsRunnableQueue.execute(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                try {
                    boolean eventStored = eventStore.put(eventAdapter.translateFromEvent(event)
                            .toString());
                    // log that an event has been recorded
                    if (eventStored) {
                        Log.i(TAG, String.format("Event: '%s' recorded to local filestore",
                                StringUtil.clipString(event.getEventType(), CLIPPED_EVENT_LENGTH,
                                        true)));
                        Log.d(TAG, String.format("Time of enqueueEventForDelivery: %d",
                                System.currentTimeMillis() - start));
                    } else {
                        Log.w(TAG, String.format(
                                "Event: '%s' failed to record to local filestore",
                                StringUtil.clipString(event.getEventType(), CLIPPED_EVENT_LENGTH,
                                        true)));
                    }
                } catch (EventStoreException e) {
                    Log.w(TAG,
                            String.format("Event: '%s' failed to record to local filestore",
                                    StringUtil.clipString(event.getEventType(),
                                            CLIPPED_EVENT_LENGTH, true)));
                } finally {
                    calculateAndSetAverageWriteEventTime(origEventsProcessed,
                            startEnqueueTimeMillis);
                }
            }
        });
    }

    private void calculateAndSetAverageWriteEventTime(long origEventsProcessed,
            long enqueueTimeMillis) {
        long currentEventsProcessed = eventsProcessed.addAndGet(1L);
        long eventsWrittenDelta = currentEventsProcessed - origEventsProcessed;
        long durationInMillis = System.currentTimeMillis() - enqueueTimeMillis;
        double decimalAvg = (double) durationInMillis / (double) eventsWrittenDelta;
        long avg = (long) Math.ceil(decimalAvg);
        avgWriteEventTimeMillis.set(avg);
    }

    private long getSubmissionLatchWaitTime() {
        // 1.5 is a buffer to allow more time since this is based on an average
        return (long) (avgWriteEventTimeMillis.get() * MAX_EVENT_OPERATIONS * 1.5);
    }

    @Override
    public void attemptDelivery() {
        List<DeliveryPolicy> policies = new ArrayList<DeliveryPolicy>();
        DeliveryPolicy forceSubmissionPolicy = policyFactory.newForceSubmissionTimePolicy();
        DeliveryPolicy connectivityPolicy = policyFactory.newConnectivityPolicy();
        if (connectivityPolicy != null) {
            policies.add(connectivityPolicy);
        }
        if (forceSubmissionPolicy != null) {
            policies.add(forceSubmissionPolicy);
        }
        attemptDelivery(policies);
    }

    /**
     * We only send if (time since last attempt) > minimumSubmissionInterval or
     * if user set clock back in time(which could mean we never submit if only
     * checking the first condition)
     *
     * @param long lastSubmissionAttemptTime The last time we attempted to
     *        submit to ERS
     * @param long minimumSubmissionInternal The minimum amount of time we must
     *        wait between submissions to ERS
     */
    boolean shouldAttemptDelivery(long lastSubmissionAttemptTime,
            long minimumSubmissionInterval) {
        return (System.currentTimeMillis() - lastSubmissionAttemptTime > minimumSubmissionInterval || System
                .currentTimeMillis()
                - lastSubmissionAttemptTime < 0);
    }

    /**
     * Gets the next array of json objects to submit, up to the max number of
     * events These events will be removed from the iterator
     *
     * @param itr
     * @param maxNumOfEvents
     * @return JSONArray the array of events
     * @throws JSONException
     */
    JSONArray getNextBatchToSubmit(EventIterator iter, long maxRequestSize)
            throws JSONException {
        if (iter == null) {
            throw new IllegalArgumentException(
                    "Iterator cannot be null");
        }

        long currentRequestSize = 0;
        long eventLength = (iter.peek() != null) ? iter.peek().length() : 0L;
        JSONArray eventArray = new JSONArray();
        while (currentRequestSize + eventLength <= maxRequestSize && iter.hasNext()) {
            currentRequestSize += eventLength;
            eventLength = (iter.peek() != null) ? iter.peek().length() : 0L;
            eventArray.put(new JSONObject(iter.next()));
        }

        return eventArray;
    }

    public void attemptDelivery(final List<DeliveryPolicy> policies) {

        if (shouldAttemptDelivery(lastAttemptTime, policyFactory.forceSubmissionInterval)) {
            lastAttemptTime = System.currentTimeMillis();

            final CountDownLatch submitWaitLatch = new CountDownLatch(1);
            eventsRunnableQueue.execute(new Runnable() {
                @Override
                public void run() {

                    submitWaitLatch.countDown();
                }
            });

            submissionRunnableQueue.execute(new Runnable() {

                @Override
                public void run() {
                    long start = System.currentTimeMillis();
                    for (DeliveryPolicy policy : policies) {
                        if (!policy.isAllowed()) {
                            Log.d(TAG, "Policy " + policy.getClass() + " is not allowed");
                            return;
                        }
                    }

                    try {
                        submitWaitLatch.await(getSubmissionLatchWaitTime(), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                    }
                    boolean successful = true;
                    final long maxRequestSize = context.getConfiguration().optLong(
                            KEY_MAX_SUBMISSION_SIZE, DEFAULT_MAX_SUBMISSION_SIZE);

                    // get the batched items (they are stored in the event store
                    // as
                    // json strings
                    JSONArray toSend = new JSONArray();
                    EventIterator iter = eventStore.iterator();

                    int submissions = 0;
                    int maxAllowedSubmissions = context.getConfiguration().optInt(
                            KEY_MAX_SUBMISSIONS_ALLOWED, DEFAULT_MAX_SUBMISSIONS_ALLOWED);
                    while (iter.hasNext() && submissions < maxAllowedSubmissions) {
                        try {
                            toSend = getNextBatchToSubmit(iter,
                                    maxRequestSize);

                            successful = submitEvents(toSend, policies);

                            if (successful) {
                                submissions++;
                                iter.removeReadEvents();
                            } else {
                                break;
                            }
                        } catch (JSONException e) {
                            Log.e(TAG, "Could not convert stored event into json", e);
                        } catch (Exception e) {
                            Log.e(TAG, "An internal error occured, events could not be submitted",
                                    e);
                        }
                    }

                    Log.v(TAG, String.format("Time of attemptDelivery: %d",
                            System.currentTimeMillis() - start));
                }
            });

        }
    }

    boolean submitEvents(final JSONArray eventArray, final List<DeliveryPolicy> policies) {
        boolean submitted = false;

        // package them into an ers request
        PutEventsRequest request = requestBuilder.createRecordEventsRequest(eventArray,
                context.getNetworkType());
        request.withClientContextEncoding("base64");

        request.getRequestClientOptions().appendUserAgent(USER_AGENT);

        try {
            context.getERSClient().putEvents(request);
            submitted = true;
            Log.i(TAG, String.format("Successful submission of %d events", eventArray.length()));

            for (DeliveryPolicy policy : policies) {
                policy.handleDeliveryAttempt(submitted);
            }

            return submitted;
        } catch (AmazonServiceException e) {
            Log.e(TAG, "AmazonServiceException occured during send of put event ", e);
            String errorCode = e.getErrorCode();
            if (errorCode.equalsIgnoreCase("ValidationException")
                    || errorCode.equalsIgnoreCase("SerializationException")
                    || errorCode.equalsIgnoreCase("BadRequestException")) {
                submitted = true;
                Log.e(TAG, String.format(
                        "Failed to submit events to EventService: statusCode: " + e.getStatusCode()
                                + " errorCode: ", errorCode));
                Log.e(TAG, String.format("Failed submission of %d events, events will be removed",
                        eventArray.length()), e);

                for (DeliveryPolicy policy : policies) {
                    policy.handleDeliveryAttempt(submitted);
                }

                return submitted;
            } else {
                Log.w(TAG,
                        "Unable to successfully deliver events to server. Events will be saved, error likely recoverable.  Response status code "
                                + e.getStatusCode() + " , response error code " + e.getErrorCode()
                                + e.getMessage());
                Log.w(TAG, "Recieved an error response: " + e.getMessage());

            }
        } catch (Exception e2) {
            Log.w(TAG,
                    "Unable to successfully deliver events to server. Events will be saved, error likely recoverable."
                            + e2.getMessage());
        }

        for (DeliveryPolicy policy : policies) {
            policy.handleDeliveryAttempt(submitted);
        }

        return submitted;
    }

}
