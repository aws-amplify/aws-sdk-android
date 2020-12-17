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

package com.amazonaws.mobileconnectors.geo.tracker;

import android.location.Location;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.geo.AmazonLocationClient;
import com.amazonaws.services.geo.model.BatchUpdateDevicePositionRequest;
import com.amazonaws.services.geo.model.BatchUpdateDevicePositionResult;
import com.amazonaws.services.geo.model.DevicePositionUpdate;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class TrackingPublisher {
    private static final String TAG = TrackingPublisher.class.getSimpleName();
    private static final int DEFAULT_WORKER_POOL_SIZE = 5;
    private static final long DEFAULT_PUBLISH_INTERVAL_MS = TimeUnit.SECONDS.toMillis(60L);
    private static final long FINAL_FLUSH_WAIT_TIME_MS = TimeUnit.SECONDS.toMillis(5L);;
    private static final int DEFAULT_BATCH_SIZE = 10;
    private static final long TERMINATION_TIMEOUT_MS = 10;

    private final String deviceId;
    private final String trackerName;
    private final LinkedBlockingQueue<DevicePositionUpdate> positionUpdateQueue;
    private final LinkedBlockingQueue<BatchUpdateDevicePositionRequest> batchRequestQueue;
    private final ScheduledFuture<?> scheduledFuture;
    private final ScheduledExecutorService scheduledExecutorService;
    private final BatchPublisher batchPublisher;

    public TrackingPublisher(AmazonLocationClient locationClient,
                             String deviceId,
                             String trackerName) {
        this(locationClient,
             deviceId,
             trackerName,
             DEFAULT_WORKER_POOL_SIZE,
             DEFAULT_PUBLISH_INTERVAL_MS,
             DEFAULT_BATCH_SIZE,
            new EmptyTrackingListener());
    }

    public TrackingPublisher(AmazonLocationClient locationClient,
                             String deviceId,
                             String trackerName,
                             int workerPoolSize,
                             long publishIntervalMillis,
                             int batchSize,
                             TrackingListener listener) {
        this(locationClient,
             deviceId,
             trackerName,
             Executors.newScheduledThreadPool(workerPoolSize),
             publishIntervalMillis,
             batchSize,
             listener);
    }

    public TrackingPublisher(AmazonLocationClient locationClient,
                             String deviceId,
                             String trackerName,
                             ScheduledExecutorService scheduledExecutorService,
                             long publishIntervalMillis,
                             int batchSize,
                             TrackingListener listener) {
        this.deviceId = deviceId;
        this.trackerName = trackerName;
        positionUpdateQueue = new LinkedBlockingQueue<>(batchSize);
        batchRequestQueue = new LinkedBlockingQueue<>();
        batchPublisher = new BatchPublisher(locationClient, batchRequestQueue, listener);
        this.scheduledExecutorService = scheduledExecutorService;
        scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(batchPublisher,
                                                                       publishIntervalMillis,
                                                                       publishIntervalMillis,
                                                                       TimeUnit.MILLISECONDS);
    }

    /**
     * Adds a location to the location queue. If the location causes the batch size
     * to be exceeded, this will trigger the locations to be flushed from the location
     * queue into a batch request which will eventually be sent to the location service.
     * @param location - Location reported by the Android OS.
     */
    public synchronized void enqueue(Location location) {
        Log.d(TAG, "Enqueuing location.");
        DevicePositionUpdate positionUpdate = TrackingModelFactory.createDevicePositionUpdate(deviceId, location);
        try {
            positionUpdateQueue.add(positionUpdate);
        } catch (IllegalStateException exception) {
            flush(false);
            positionUpdateQueue.add(positionUpdate);
        }
    }

    /**
     * Stops the publisher from publishing. Should be used when terminating the object.
     */
    public void shutdown() {
        Log.i(TAG, "Shutting down tracking publisher.");
        this.scheduledExecutorService.shutdown();
        try {
            this.scheduledExecutorService.awaitTermination(TERMINATION_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            Log.i(TAG, "Tracking publisher shut down.");
        } catch (InterruptedException exception) {
            Log.w(TAG, "Service terminated during shutdown.", exception);
        }
        forceFlush();
    }

    /**
     * Checks the number of position updates waiting to be batched.
     * @return Number of position updates in the position queue.
     */
    public int pendingPositionUpdates() {
        return positionUpdateQueue.size();
    }

    /**
     * Checks the number of batches waiting to be sent to the location service.
     * @return Number of pending batches.
     */
    public int pendingBatches() {
        return batchRequestQueue.size();
    }


    /**
     * Force pending locations in the location queue to be batched and
     * sent to the location service. This method should only be invoked
     * in the event that a final flush of locations needs to be performed
     * (During a shutdown for example)
     */
    public void forceFlush() {
        Log.i(TAG, "Checking for remaining location updates.");
        flush(true);
    }

    /**
     * Creates a batch request from the current positions in the location queue
     * and adds it to the request queue.
     *
     * @param force If true, it will attempt to stop the regularly scheduled execution
     *              of the batch publisher and if successful, it will schedule the batch
     *              publisher to run immediately.
     */
    private void flush(boolean force) {
        if (positionUpdateQueue.size() > 0) {
            Log.i(TAG, "Flushing position update queue. Forced = " + force);
            BatchUpdateDevicePositionRequest newBatch = createNewBatch();
            positionUpdateQueue.drainTo(newBatch.getUpdates());
            batchRequestQueue.add(newBatch);
            if (force) {
                try {
                    Log.i(TAG, "Flushing remaining location updates.");
                    Thread forceFlushThread = new Thread(batchPublisher);
                    forceFlushThread.start();
                    forceFlushThread.join(FINAL_FLUSH_WAIT_TIME_MS);
                    Log.i(TAG, "Locations flushed.");
                } catch (InterruptedException exception) {
                    Log.w(TAG, "Tracking publisher was interrupted while flushing the location queue.");
                }
            }
        }
    }

    /**
     * Utility method to create a {@link BatchUpdateDevicePositionRequest} object.
     * @return An instance of {@link BatchUpdateDevicePositionRequest}
     */
    private BatchUpdateDevicePositionRequest createNewBatch() {
        BatchUpdateDevicePositionRequest batch = new BatchUpdateDevicePositionRequest();
        batch.setTrackerName(trackerName);
        batch.setUpdates(new ArrayList<DevicePositionUpdate>());
        return batch;
    }

    /**
     * Runnable that pulls all pending batch requests from a request queue
     * and sends them to the location service by invoking {@link AmazonLocationClient#batchUpdateDevicePosition}
     */
    static final class BatchPublisher implements Runnable {
        private final BlockingQueue<BatchUpdateDevicePositionRequest> requestQueue;
        private final AmazonLocationClient locationClient;
        private final TrackingListener listener;

        public BatchPublisher(AmazonLocationClient locationClient,
                              BlockingQueue<BatchUpdateDevicePositionRequest> requestQueue,
                              TrackingListener listener) {
            this.requestQueue = requestQueue;
            this.locationClient = locationClient;
            this.listener = listener;
        }

        @Override
        public void run() {
            Log.d(TAG, "Device location batches ready:" + requestQueue.size());
            while (!requestQueue.isEmpty()) {
                Log.i(TAG, "Publishing device location update batches.");
                try {
                    BatchUpdateDevicePositionRequest request = requestQueue.take();
                    BatchUpdateDevicePositionResult result = locationClient.batchUpdateDevicePosition(request);
                    Log.d(TAG, "Invoking onDataPublished callback.");
                    listener.onDataPublished(new TrackingPublishedEvent(request, result));
                } catch (InterruptedException exception) {
                    Log.e(TAG, "BatchPublisher interrupted.", exception);
                    listener.onDataPublicationError(TrackingError.serviceError(exception));
                    Thread.currentThread().interrupt();
                } catch (AmazonClientException exception) {
                    Log.e(TAG, "Exception invoking batchUpdateDevicePosition.", exception);
                }
            }
        }
    }
}
