/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.android.mobileanalytics.internal.delivery;

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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.android.mobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.android.mobileanalytics.internal.core.log.Logger;
import com.amazonaws.android.mobileanalytics.internal.core.util.StringUtil;
import com.amazonaws.android.mobileanalytics.internal.delivery.EventStore.EventIterator;
import com.amazonaws.android.mobileanalytics.internal.delivery.policy.DefaultDeliveryPolicyFactory;
import com.amazonaws.android.mobileanalytics.internal.delivery.policy.DeliveryPolicy;
import com.amazonaws.android.mobileanalytics.internal.delivery.policy.DeliveryPolicyFactory;
import com.amazonaws.android.mobileanalytics.internal.event.InternalEvent;
import com.amazonaws.android.mobileanalytics.internal.event.adapter.EventAdapter;
import com.amazonaws.android.mobileanalytics.internal.event.adapter.JSONEventAdapter;
import com.amazonaws.services.eventrecorder.model.PutEventsRequest;

public class DefaultDeliveryClient implements DeliveryClient {

    public static final String EVENTS_DIRECTORY = "events";

    private static final Logger logger = Logger.getLogger(DefaultDeliveryClient.class);
    private final static int MAX_EVENT_OPERATIONS = 1000;
    private final static int MAX_SUBMIT_OPERATIONS = 100;
    private static final int CLIPPED_EVENT_LENGTH = 5;
    static final String KEY_MAX_SUBMISSION_SIZE = "maxSubmissionSize";
    static final long DEFAULT_MAX_SUBMISSION_SIZE = 1024 * 100;
    static final String KEY_MAX_SUBMISSIONS_ALLOWED = "maxSubmissionAllowed";
    static final int DEFAULT_MAX_SUBMISSIONS_ALLOWED = 3;
    static final Set<Integer> RETRY_REQUEST_CODES;

    private final DeliveryPolicyFactory policyFactory;
    private final ExecutorService eventsRunnableQueue;
    private final ExecutorService submissionRunnableQueue;
    private final AnalyticsContext context;
    private final ERSRequestBuilder requestBuilder;
    private final EventStore eventStore;
    private final EventAdapter<JSONObject> eventAdapter;
    private final AtomicLong avgWriteEventTimeMillis = new AtomicLong(25L);
    private final AtomicLong eventsProcessed = new AtomicLong(0L);

    static {
        RETRY_REQUEST_CODES = new HashSet<Integer>();
        RETRY_REQUEST_CODES.add(401);
        RETRY_REQUEST_CODES.add(404);
        RETRY_REQUEST_CODES.add(407);
        RETRY_REQUEST_CODES.add(408);
    }

    public static DefaultDeliveryClient newInstance(AnalyticsContext context, boolean allowWANDelivery) {

        // create a service that is single threaded and only allows
        // MAX_OPERATIONS to be enqueued at one time
        ExecutorService eventsExService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(
                MAX_EVENT_OPERATIONS), new ThreadPoolExecutor.DiscardPolicy());
        ExecutorService submissionsExService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(
                MAX_SUBMIT_OPERATIONS), new ThreadPoolExecutor.DiscardPolicy());
        ERSRequestBuilder requestBuilder = ERSRequestBuilder.newBuilder();
        DeliveryPolicyFactory policyFactory = new DefaultDeliveryPolicyFactory(context, allowWANDelivery);

        return new DefaultDeliveryClient(context, policyFactory, eventsExService, submissionsExService, requestBuilder,
                FileEventStore.newInstance(context), new JSONEventAdapter());
    }

    private DefaultDeliveryClient(AnalyticsContext context, DeliveryPolicyFactory policyFactory, final ExecutorService eventsRunnableQueue,
            final ExecutorService submissionRunnableQueue, ERSRequestBuilder requestBuilder, EventStore eventStore,
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
                    boolean eventStored = eventStore.put(eventAdapter.translateFromEvent(event).toString());
                    // log that an event has been recorded
                    if (eventStored) {
                        logger.devi(String.format("Event: '%s' recorded to local filestore",
                                StringUtil.clipString(event.getEventType(), CLIPPED_EVENT_LENGTH, true)));
                        logger.v(String.format("Time of enqueueEventForDelivery: %d", System.currentTimeMillis() - start));
                    } else {
                        logger.devw(String.format("Event: '%s' failed to record to local filestore",
                                StringUtil.clipString(event.getEventType(), CLIPPED_EVENT_LENGTH, true)));
                    }
                } catch (EventStoreException e) {
                    logger.devw(String.format("Event: '%s' failed to record to local filestore",
                            StringUtil.clipString(event.getEventType(), CLIPPED_EVENT_LENGTH, true)));
                } finally {
                    calculateAndSetAverageWriteEventTime(origEventsProcessed, startEnqueueTimeMillis);
                }
            }
        });
    }

    private void calculateAndSetAverageWriteEventTime(long origEventsProcessed, long enqueueTimeMillis) {
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

    public void attemptDelivery(final List<DeliveryPolicy> policies) {
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
                        logger.devd("Policy "+policy.getClass()+" is not allowed");
                        return;
                    }
                }

                try {
                    submitWaitLatch.await(getSubmissionLatchWaitTime(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                }

                boolean successful = true;
                final long maxRequestSize = context.getConfiguration().optLong(KEY_MAX_SUBMISSION_SIZE, DEFAULT_MAX_SUBMISSION_SIZE);

                // get the batched items (they are stored in the event store as
                // json strings
                JSONArray eventArray = new JSONArray();
                EventIterator iter = eventStore.iterator();
                long currentRequestLength = 0L;

                int submissions = 0;
                int maxAllowedSubmissions = context.getConfiguration().optInt(KEY_MAX_SUBMISSIONS_ALLOWED, DEFAULT_MAX_SUBMISSIONS_ALLOWED);
                while (iter.hasNext() && submissions < maxAllowedSubmissions) {
                    try {
                        long eventLength = (iter.peek() != null) ? iter.peek().length() : 0L;
                        if (currentRequestLength + eventLength <= maxRequestSize) {
                            currentRequestLength += eventLength;
                            eventArray.put(new JSONObject(iter.next()));
                        } else {
                            successful = submitEvents(eventArray, policies);
                            if (successful) {
                                submissions++;
                                iter.removeReadEvents();
                                eventArray = new JSONArray();
                                currentRequestLength = 0L;
                            } else {
                                break;
                            }
                        }
                    } catch (JSONException e) {
                        logger.e("Could not convert stored event into json", e);
                    }
                }

                // Send the remainder batch to the server if everything has been
                // successful in the previous batches
                if (successful && eventArray.length() > 0) {
                    if (submitEvents(eventArray, policies)) {
                        iter.removeReadEvents();
                    }
                }
                logger.v(String.format("Time of attemptDelivery: %d", System.currentTimeMillis() - start));
            }
        });

    }

    private boolean submitEvents(final JSONArray eventArray, final List<DeliveryPolicy> policies) {
        boolean submitted = false;
        // package them into an ers request
        PutEventsRequest request = requestBuilder.createRecordEventsRequest(eventArray,context.getNetworkType());
        if (request == null) {
            logger.e("There was an error when building the http request");
            return submitted;
        }

        try {
            context.getERSClient().putEvents(request);
            logger.devi(String.format("Successful submission of %d events", eventArray.length()));
            return true;
        } catch (AmazonServiceException e) {
            logger.deve("AmazonServiceException occured during send of put event ",e);
            String errorCode = e.getErrorCode();
            if(errorCode.equalsIgnoreCase("ValidationException") || errorCode.equalsIgnoreCase("SerializationException") || errorCode.equalsIgnoreCase("BadRequestException")){
                logger.e(String.format("Failed to submit events to EventService: statusCode: "+e.getStatusCode()+" errorCode: ", errorCode));
                logger.deve(String.format("Failed submission of %d events, events will be removed", eventArray.length()),e);
                return true;
            } else {
                logger.devw("Unable to successfully deliver events to server. Events will be saved, error likely recoverable.  Response status code " + e.getStatusCode() + " , response error code "+e.getErrorCode()
                        + e.getMessage());
                logger.w("Recieved an error response: " + e.getMessage());
            }
        } catch (Exception e2){
            logger.devw("Unable to successfully deliver events to server. Events will be saved, error likely recoverable."
                    + e2.getMessage());
        }
        
        // inform the policies that we've attempted a submission
        for (DeliveryPolicy policy : policies) {
            policy.handleDeliveryAttempt(submitted);
        }

        return submitted;
    }

    private List<String> getBatchedItems() {

        // get the batched items (they are stored in the event store as json
        // strings
        List<String> batchedEvents = new ArrayList<String>();
        EventIterator iter = eventStore.iterator();
        while (iter.hasNext()) {
            batchedEvents.add(iter.next());
        }
        return batchedEvents;
    }

    @Override
    public String[] batchedEvents() {
        final CountDownLatch eventsReadyLatch = new CountDownLatch(1);
        eventsRunnableQueue.execute(new Runnable() {
            @Override
            public void run() {
                eventsReadyLatch.countDown();
            }
        });
        try {
            eventsReadyLatch.await(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logger.e("timeout waiting for batchedEvents", e);
        }

        List<String> batchedEvents = getBatchedItems();
        return getBatchedItems().toArray(new String[batchedEvents.size()]);
    }
}
