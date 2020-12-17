/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package mobileconnectors.geo.tracker;

import android.location.Location;

import com.amazonaws.mobileconnectors.geo.tracker.EmptyTrackingListener;
import com.amazonaws.mobileconnectors.geo.tracker.TrackingPublisher;
import com.amazonaws.services.geo.AmazonLocationClient;
import com.amazonaws.services.geo.model.BatchUpdateDevicePositionRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowLog;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static mobileconnectors.geo.tracker.MockLocationFactory.DEFAULT_ALTITUDE;
import static mobileconnectors.geo.tracker.MockLocationFactory.DEFAULT_LATITUDE;
import static mobileconnectors.geo.tracker.MockLocationFactory.DEFAULT_LONGITUDE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
public class TrackingPublisherTest {
    private static final int WORKER_POOL_SIZE = 5;
    private static final long PUBLISH_INTERVAL_MS = TimeUnit.SECONDS.toMillis(2);
    private static final int BATCH_SIZE = 10;
    private static final long LATCH_WAIT_BASE_TIMEOUT_MS = TimeUnit.SECONDS.toMillis(3);
    private static final String TRACKER_NAME = "TRACKER_NAME";

    private TrackingPublisher trackingPublisher;
    private AmazonLocationClient mockLocationClient;

    @Before
    public void setup() {
        ShadowLog.stream = System.out;
        mockLocationClient = mock(AmazonLocationClient.class);
        trackingPublisher = new TrackingPublisher(mockLocationClient,
                                                  "UNIT_TEST_DEVICE_ID",
                                                  TRACKER_NAME,
                                                  WORKER_POOL_SIZE,
                                                  PUBLISH_INTERVAL_MS,
                                                  BATCH_SIZE,
                                                  new EmptyTrackingListener());
    }


    /**
     * Enqueue a location and check that it going into the pending updates queue.
     */
    @Test
    public void enqueueLocationTest() {
        Location androidLocation = MockLocationFactory.createAndroidLocation(DEFAULT_LONGITUDE,
                                                                             DEFAULT_LATITUDE,
                                                                             DEFAULT_ALTITUDE);
        trackingPublisher.enqueue(androidLocation);

        assertEquals(1, trackingPublisher.pendingPositionUpdates());
    }

    /**
     * Enqueue enough locations to create one batch. Verify the batch gets enqueued
     * and any remaining locations are left in the location queue for an eventual next batch.
     * @throws InterruptedException Not expected.
     */
    @Test
    public void enqueueMoreThanBatchSizeTest() throws InterruptedException {
        int numOfLocationUpdates = 15;
        int expectedNumOfBatchesPublished = 1;
        int expectedNumOfLocationsRemaining = 5;
        final CountDownLatch latch = new CountDownLatch(expectedNumOfBatchesPublished);
        Location androidLocation = MockLocationFactory.createAndroidLocation(DEFAULT_LONGITUDE,
                                                                             DEFAULT_LATITUDE,
                                                                             DEFAULT_ALTITUDE);
        // Mock the batchUpdateDevicePosition method and countdown the latch when invoked
        MockLocationClientBehavior.latchedBatchUpdates(mockLocationClient, latch);

        // Enqueue 15 location updates
        for(int i = 0; i < numOfLocationUpdates; i++) {
            trackingPublisher.enqueue(androidLocation);
        }

        // There should be 1 batch queued.
        assertEquals(expectedNumOfBatchesPublished, trackingPublisher.pendingBatches());
        // There should be 5 location updates pending in the queue
        assertEquals(expectedNumOfLocationsRemaining, trackingPublisher.pendingPositionUpdates());

        latch.await(LATCH_WAIT_BASE_TIMEOUT_MS * expectedNumOfBatchesPublished, TimeUnit.SECONDS);
        // The client should have been called once.
        ArgumentCaptor<BatchUpdateDevicePositionRequest> requestArgumentCaptor =
                ArgumentCaptor.forClass(BatchUpdateDevicePositionRequest.class);
        verify(mockLocationClient,
                times(expectedNumOfBatchesPublished)).batchUpdateDevicePosition(requestArgumentCaptor.capture());

        // Verify the tracker name was set to the expected value.
        assertEquals(TRACKER_NAME, requestArgumentCaptor.getValue().getTrackerName());

        // No pending batches should be left.
        assertEquals(0, trackingPublisher.pendingBatches());
    }

    /**
     * Enqueue enough to create multiple batches.
     */
    @Test
    public void enqueueMultipleBatchesTest() throws InterruptedException {
        int numOfLocationUpdates = 53;
        int expectedNumOfBatchesPublished = 5;
        int expectedNumOfLocationsRemaining = 3;
        final CountDownLatch latch = new CountDownLatch(expectedNumOfBatchesPublished);

        Location androidLocation = MockLocationFactory.createAndroidLocation(DEFAULT_LONGITUDE,
                                                                             DEFAULT_LATITUDE,
                                                                             DEFAULT_ALTITUDE);
        // Mock the batchUpdateDevicePosition method and countdown the latch when invoked
        MockLocationClientBehavior.latchedBatchUpdates(mockLocationClient, latch);

        for(int i = 0; i < numOfLocationUpdates; i++) {
            trackingPublisher.enqueue(androidLocation);
        }

        assertEquals(expectedNumOfLocationsRemaining, trackingPublisher.pendingPositionUpdates());
        assertEquals(expectedNumOfBatchesPublished, trackingPublisher.pendingBatches());


        latch.await(LATCH_WAIT_BASE_TIMEOUT_MS * expectedNumOfBatchesPublished, TimeUnit.SECONDS);
        // The client should have been called once.
        verify(mockLocationClient, times(expectedNumOfBatchesPublished)).batchUpdateDevicePosition(any(BatchUpdateDevicePositionRequest.class));
        // No pending batches should be left.
        assertEquals(0, trackingPublisher.pendingBatches());
    }

    @Test
    public void forceFlushTest() throws InterruptedException {
        int numOfLocationUpdates = 5;
        int expectedNumOfBatchesPublished = 1;
        int expectedNumOfLocationsRemaining = 5;
        final CountDownLatch latch = new CountDownLatch(expectedNumOfBatchesPublished);
        Location androidLocation = MockLocationFactory.createAndroidLocation(DEFAULT_LONGITUDE,
                                                                             DEFAULT_LATITUDE,
                                                                             DEFAULT_ALTITUDE);
        // Mock the batchUpdateDevicePosition method and countdown the latch when invoked
        MockLocationClientBehavior.latchedBatchUpdates(mockLocationClient, latch);

        // Enqueue 5 location updates
        for(int i = 0; i < numOfLocationUpdates; i++) {
            trackingPublisher.enqueue(androidLocation);
        }

        // There should be 5 location updates pending in the queue
        assertEquals(expectedNumOfLocationsRemaining, trackingPublisher.pendingPositionUpdates());
        trackingPublisher.forceFlush();
        latch.await(LATCH_WAIT_BASE_TIMEOUT_MS * expectedNumOfBatchesPublished, TimeUnit.SECONDS);
        // The client should have been called once.
        verify(mockLocationClient, times(expectedNumOfBatchesPublished)).batchUpdateDevicePosition(any(BatchUpdateDevicePositionRequest.class));
        // No pending batches should be left.
        assertEquals(0, trackingPublisher.pendingBatches());
    }
}
