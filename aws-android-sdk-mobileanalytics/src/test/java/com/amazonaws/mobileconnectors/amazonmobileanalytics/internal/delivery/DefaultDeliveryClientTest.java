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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore.EventIterator;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy.DefaultDeliveryPolicyFactory;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy.DeliveryPolicy;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.adapter.EventAdapter;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.utils.AnalyticsContextBuilder;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;
import com.amazonaws.services.mobileanalytics.model.PutEventsRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class DefaultDeliveryClientTest extends MobileAnalyticsTestBase {

    private static final String SDK_NAME = "AppIntelligenceSDK";
    private static final String SDK_VERSION = "test";
    private static final String UNIQUE_ID = "abc123";

    public static final String EVENTS_DIR = "events";

    private DefaultDeliveryClient target;

    ThreadPoolExecutor mockEventExecutor = Mockito.mock(ThreadPoolExecutor.class);
    ThreadPoolExecutor mockSubmissionExecutor = Mockito.mock(ThreadPoolExecutor.class);
    AmazonMobileAnalyticsClient mockErs = Mockito.mock(AmazonMobileAnalyticsClient.class);
    ERSRequestBuilder mockRequestBuilder = Mockito.mock(ERSRequestBuilder.class);
    Configuration mockConfig = Mockito.mock(Configuration.class);
    EventStore mockEventStore = Mockito.mock(EventStore.class);
    DefaultDeliveryPolicyFactory mockFactory = Mockito.mock(DefaultDeliveryPolicyFactory.class);
    PutEventsRequest mockRequest = Mockito.mock(PutEventsRequest.class);
    @SuppressWarnings("unchecked")
    EventAdapter<JSONObject> mockAdapter = (EventAdapter<JSONObject>) Mockito
            .mock(EventAdapter.class);
    @SuppressWarnings("unchecked")
    BlockingQueue<Runnable> mockEventQueue = (BlockingQueue<Runnable>) Mockito
            .mock(BlockingQueue.class);
    @SuppressWarnings("unchecked")
    BlockingQueue<Runnable> mockSubmissionQueue = (BlockingQueue<Runnable>) Mockito
            .mock(BlockingQueue.class);

    @SuppressWarnings("unchecked")
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        AnalyticsContext mockContext = new AnalyticsContextBuilder()
                .withSdkInfo(SDK_NAME, SDK_VERSION)
                .withUniqueIdValue(UNIQUE_ID)
                .withERSClient(mockErs)
                .withConfiguration(mockConfig)
                .build();

        when(
                mockConfig.optLong(DefaultDeliveryClient.KEY_MAX_SUBMISSION_SIZE,
                        DefaultDeliveryClient.DEFAULT_MAX_SUBMISSION_SIZE)).thenReturn(
                DefaultDeliveryClient.DEFAULT_MAX_SUBMISSION_SIZE);

        when(mockEventQueue.remainingCapacity()).thenReturn(2);
        when(mockEventExecutor.getQueue()).thenReturn(mockEventQueue);

        when(
                mockConfig.optInt(DefaultDeliveryClient.KEY_MAX_SUBMISSIONS_ALLOWED,
                        DefaultDeliveryClient.DEFAULT_MAX_SUBMISSIONS_ALLOWED)).thenReturn(
                DefaultDeliveryClient.DEFAULT_MAX_SUBMISSIONS_ALLOWED);

        when(mockRequest.getRequestClientOptions()).thenReturn(new RequestClientOptions());
        when(mockRequestBuilder.createRecordEventsRequest(any(JSONArray.class), any(String.class)))
                .thenReturn(mockRequest);
        target = new DefaultDeliveryClient(mockContext, mockFactory, mockEventExecutor,
                mockSubmissionExecutor, mockRequestBuilder, mockEventStore, mockAdapter);
    }

    @Test
    public void enqueueEventForDelivery_writeMultipleEventsToDisk_eventsStoredInNewlineFile()
            throws JSONException {

        InternalEvent mockEvent = mock(InternalEvent.class);
        when(mockEvent.getEventType()).thenReturn("event_type");

        // return the expected json anytime we use adapter to create json object
        JSONObject expectedJson = new JSONObject();
        expectedJson.put("event_type", "event_type");
        when(mockAdapter.translateFromEvent(mockEvent)).thenReturn(expectedJson);

        // enqueue an event 3 times
        target.enqueueEventForDelivery(mockEvent);
        target.enqueueEventForDelivery(mockEvent);
        target.enqueueEventForDelivery(mockEvent);

        ArgumentCaptor<Runnable> runnableCaptor = ArgumentCaptor.forClass(Runnable.class);
        verify(mockEventExecutor, times(3)).execute(runnableCaptor.capture());
        assertThat(runnableCaptor.getAllValues().size(), is(3));
        for (Runnable runnable : runnableCaptor.getAllValues()) {
            runnable.run();
        }

        // capture the strings that were written to the event store
        ArgumentCaptor<String> putEventCaptor = ArgumentCaptor.forClass(String.class);
        verify(mockEventStore, times(3)).put(putEventCaptor.capture());

        assertThat(putEventCaptor.getAllValues().size(), is(3));
        for (String eventString : putEventCaptor.getAllValues()) {
            assertThat(eventString, is(expectedJson.toString()));
        }
    }

    @Test
    public void attemptDelivery_verifyPayloadEventsDeleted() throws JSONException {

        final JSONObject expectedJson = new JSONObject();
        expectedJson.put("event_type", "event_type");

        // mock the file store to return 3 events via hasNext iterator calls
        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true, true, true, true, false);
        when(mockIterator.peek()).thenReturn(expectedJson.toString());
        when(mockIterator.next()).thenReturn(expectedJson.toString());
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        when(mockRequestBuilder.createRecordEventsRequest(any(JSONArray.class), any(String.class)))
                .thenAnswer(
                        new Answer<PutEventsRequest>() {
                            @Override
                            public PutEventsRequest answer(InvocationOnMock invocation)
                                    throws Throwable {
                                JSONArray requestArray = (JSONArray) invocation.getArguments()[0];
                                assertThat(requestArray.length(), is(3));
                                for (int i = 0; i < 3; i++) {
                                    assertThat(requestArray.get(i).toString(),
                                            is(expectedJson.toString()));
                                }
                                return mockRequest;
                            }
                        });

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockIterator, times(1)).removeReadEvents();
    }

    @Test
    public void attemptDelivery_verifyBatchedPayloadEventsDeleted() throws JSONException {

        final JSONObject expectedJson = new JSONObject();
        expectedJson.put("event_type", "event_type");

        // mock the file store to return 3 events via hasNext iterator calls
        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true, true, true, true, true, true, false);
        when(mockIterator.peek()).thenReturn(expectedJson.toString());
        when(mockIterator.next()).thenReturn(expectedJson.toString());
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Set the maxSubmissionSize to only allow one event at a time so we
        // should get 3 requests with this maxSubmissionSize
        when(
                mockConfig.optLong(DefaultDeliveryClient.KEY_MAX_SUBMISSION_SIZE,
                        DefaultDeliveryClient.DEFAULT_MAX_SUBMISSION_SIZE)).thenReturn(27L);

        //
        when(mockRequestBuilder.createRecordEventsRequest(any(JSONArray.class), any(String.class)))
                .thenAnswer(
                        new Answer<PutEventsRequest>() {
                            @Override
                            public PutEventsRequest answer(InvocationOnMock invocation)
                                    throws Throwable {
                                JSONArray requestArray = (JSONArray) invocation.getArguments()[0];
                                assertThat(requestArray.length(), is(1));
                                assertThat(requestArray.get(0).toString(),
                                        is(expectedJson.toString()));
                                return mockRequest;
                            }
                        });

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockRequestBuilder, times(3)).createRecordEventsRequest(any(JSONArray.class),
                any(String.class));
        verify(mockIterator, times(3)).removeReadEvents();
    }

    @Test
    public void attemptDelivery_submissionTimePolicyPreventsSubmission() {

        setupMockPolicies(true, false);

        target.attemptDelivery();

        verifyAndRunSubmissionExecutorService(1);
        verify(mockEventStore, times(0)).iterator();
    }

    @Test
    public void attemptDelivery_connectivityTimePolicyPreventsSubmission() {

        setupMockPolicies(false, true);

        target.attemptDelivery();

        verifyAndRunSubmissionExecutorService(1);
        verify(mockEventStore, times(0)).iterator();
    }

    @Test
    public void attemptDelivery_policiesNotifiedAfterSuccessfulSubmission() {

        List<DeliveryPolicy> policies = setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verifiyPolicyList(policies, true);
    }

    @Test
    public void attemptDelivery_policiesNotifiedAfterRecoverableServerErrorResponse() {

        List<DeliveryPolicy> policies = setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw forbidden exception
        AmazonServiceException mockForbidden = Mockito.mock(AmazonServiceException.class);
        when(mockForbidden.getErrorCode()).thenReturn("AccessDenied");
        Mockito.doThrow(mockForbidden).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verifiyPolicyList(policies, false);
    }

    @Test
    public void attemptDelivery_policiesNotifiedAfterNonRecoverableServerErrorResponse() {

        List<DeliveryPolicy> policies = setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw validation exception
        AmazonServiceException mockForbidden = Mockito.mock(AmazonServiceException.class);
        when(mockForbidden.getErrorCode()).thenReturn("ValidationException");
        Mockito.doThrow(mockForbidden).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        // We consider this 'successful' because we delete the stored requests
        // and will not be retrying the request
        verifiyPolicyList(policies, true);
    }

    @Test
    public void attemptDelivery_ValidationResponseResultsInEventsDeleted() {

        setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw validation exception
        AmazonServiceException mockForbidden = Mockito.mock(AmazonServiceException.class);
        when(mockForbidden.getErrorCode()).thenReturn("ValidationException");
        Mockito.doThrow(mockForbidden).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockIterator, times(1)).removeReadEvents();

    }

    @Test
    public void attemptDelivery_BadRequestExceptionResponseResultsInEventsDeleted() {

        setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw validation exception
        AmazonServiceException mockForbidden = Mockito.mock(AmazonServiceException.class);
        when(mockForbidden.getErrorCode()).thenReturn("BadRequestException");
        Mockito.doThrow(mockForbidden).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockIterator, times(1)).removeReadEvents();

    }

    @Test
    public void attemptDelivery_SerializationExceptionResponseResultsInEventsDeleted() {

        setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw validation exception
        AmazonServiceException mockForbidden = Mockito.mock(AmazonServiceException.class);
        when(mockForbidden.getErrorCode()).thenReturn("SerializationException");
        Mockito.doThrow(mockForbidden).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockIterator, times(1)).removeReadEvents();

    }

    @Test
    public void attemptDelivery_RecoverableResponseResultsInEventsNotDeleted() {

        setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(true).thenReturn(false);
        when(mockIterator.peek()).thenReturn("{'event':'event'}").thenReturn("{'event':'event'}")
                .thenReturn(null);
        when(mockIterator.next()).thenReturn("{'event':'event'}").thenReturn(null);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw forbidden exception
        AmazonServiceException mockForbidden = Mockito.mock(AmazonServiceException.class);
        when(mockForbidden.getErrorCode()).thenReturn("AccessDenied");
        Mockito.doThrow(mockForbidden).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockIterator, times(0)).removeReadEvents();

    }

    @Test
    public void attemptDelivery_UnexpectedExceptionResponseResultsInEventsNotDeleted() {

        setupMockPolicies(true, true);

        EventIterator mockIterator = mock(EventIterator.class);
        when(mockIterator.hasNext()).thenReturn(false);
        when(mockEventStore.iterator()).thenReturn(mockIterator);

        // Make ERSClient throw I/O exception
        RuntimeException mockException = Mockito.mock(RuntimeException.class);
        Mockito.doThrow(mockException).when(mockErs).putEvents(any(PutEventsRequest.class));

        target.attemptDelivery();

        verifyAndRunEventsExecutorService(1);
        verifyAndRunSubmissionExecutorService(1);
        verify(mockIterator, times(0)).removeReadEvents();

    }

    private List<DeliveryPolicy> setupMockPolicies(boolean connectivityAllowed,
            boolean submissionTimeAllowed) {
        List<DeliveryPolicy> policies = new ArrayList<DeliveryPolicy>();
        policies.add(setupConnectivityPolicy(connectivityAllowed));
        policies.add(setupForceSubmissionTimePolicy(submissionTimeAllowed));
        return policies;

    }

    private static void verifiyPolicyList(List<DeliveryPolicy> policies,
            boolean expectedHandleDeliveryAttempt) {
        for (DeliveryPolicy policy : policies) {
            verify(policy, times(1)).handleDeliveryAttempt(expectedHandleDeliveryAttempt);
        }
    }

    private DeliveryPolicy setupConnectivityPolicy(boolean returnVal) {
        DeliveryPolicy policy = mock(DeliveryPolicy.class);
        when(policy.isAllowed()).thenReturn(returnVal);
        when(mockFactory.newConnectivityPolicy()).thenReturn(policy);
        return policy;
    }

    private DeliveryPolicy setupForceSubmissionTimePolicy(boolean returnVal) {
        DeliveryPolicy policy = mock(DeliveryPolicy.class);
        when(policy.isAllowed()).thenReturn(returnVal);
        when(mockFactory.newForceSubmissionTimePolicy()).thenReturn(policy);
        return policy;
    }

    private void verifyAndRunEventsExecutorService(int numExpectedRunnables) {
        ArgumentCaptor<Runnable> runnableCaptor = ArgumentCaptor.forClass(Runnable.class);
        verify(mockEventExecutor, times(numExpectedRunnables)).execute(runnableCaptor.capture());

        for (Runnable enqueueRunnable : runnableCaptor.getAllValues()) {
            enqueueRunnable.run();
        }
    }

    private void verifyAndRunSubmissionExecutorService(int numExpectedRunnables) {
        ArgumentCaptor<Runnable> runnableCaptor = ArgumentCaptor.forClass(Runnable.class);
        verify(mockSubmissionExecutor, times(numExpectedRunnables)).execute(
                runnableCaptor.capture());

        for (Runnable enqueueRunnable : runnableCaptor.getAllValues()) {
            enqueueRunnable.run();
        }
    }

}
