/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * A task thats runs DynamoDB scan operations in parallel.
 */
public class ParallelScanTask {

    /**
     * The list of hard copies of ScanRequest with different segment number.
     */
    private final List<ScanRequest> parallelScanRequests;

    private final int totalSegments;

    /**
     * Cache all the future tasks, so that we can extract the exception when we
     * see failed segment scan.
     */
    private final List<Future<ScanResult>> segmentScanFutureTasks;

    /**
     * Cache all the most recent ScanResult on each segment.
     */
    private final List<ScanResult> segmentScanResults;

    /**
     * The current state of the scan on each segment. Used as the monitor for
     * synchronization.
     */
    private final List<SegmentScanState> segmentScanStates;

    private final ExecutorService executorService;

    private final AmazonDynamoDB dynamo;

    @Deprecated
    @SuppressWarnings("checkstyle:javadocmethod")
    public ParallelScanTask(DynamoDBMapper mapper, AmazonDynamoDB dynamo,
            List<ScanRequest> parallelScanRequests) {
        this(dynamo, parallelScanRequests);
    }

    ParallelScanTask(AmazonDynamoDB dynamo, List<ScanRequest> parallelScanRequests) {
        this.dynamo = dynamo;
        this.parallelScanRequests = parallelScanRequests;
        this.totalSegments = parallelScanRequests.size();
        executorService = Executors.newCachedThreadPool();

        // Create synchronized views of the list to guarantee any changes are
        // visible across all threads.
        segmentScanFutureTasks = Collections.synchronizedList(new ArrayList<Future<ScanResult>>(
                totalSegments));
        segmentScanResults = Collections.synchronizedList(new ArrayList<ScanResult>(totalSegments));
        segmentScanStates = Collections.synchronizedList(new ArrayList<SegmentScanState>(
                totalSegments));

        initSegmentScanStates();
    }

    String getTableName() {
        return parallelScanRequests.get(0).getTableName();
    }

    /**
     * returns is the parallel scan is finished.
     *
     * @return true if scans are finished, false if it isnt.
     */
    public boolean isAllSegmentScanFinished() {
        synchronized (segmentScanStates) {
            for (int segment = 0; segment < totalSegments; segment++) {
                if (segmentScanStates.get(segment) != SegmentScanState.SegmentScanCompleted) {
                    return false;
                }
            }
            // Shut down if all data have been scanned and loaded.
            executorService.shutdown();
            return true;
        }
    }

    /**
     * Gets the next batch of scan results.
     * 
     * @return list of {@link ScanResult}
     */
    public List<ScanResult> getNextBatchOfScanResults() {
        /**
         * Kick-off all the parallel scan tasks.
         */
        startScanNextPages();
        /**
         * Wait till all the tasks have finished.
         */
        synchronized (segmentScanStates) {
            while (segmentScanStates.contains(SegmentScanState.Waiting)
                    || segmentScanStates.contains(SegmentScanState.Scanning)) {
                try {
                    segmentScanStates.wait();
                } catch (final InterruptedException ie) {
                    throw new AmazonClientException("Parallel scan interrupted by other thread.",
                            ie);
                }
            }
            /**
             * Keep the lock on segmentScanStates until all the cached results
             * are marshaled and returned.
             */
            return marshalParallelScanResults();
        }

    }

    private void startScanNextPages() {
        for (int segment = 0; segment < totalSegments; segment++) {
            final int currentSegment = segment;
            final SegmentScanState currentSegmentState = segmentScanStates.get(currentSegment);
            /**
             * Assert: Should never see any task in state of "Scanning" when
             * starting a new batch.
             */
            if (currentSegmentState == SegmentScanState.Scanning) {
                throw new AmazonClientException(
                        "Should never see a 'Scanning' state when starting parallel scans.");
            }
            /**
             * Skip any failed or completed segment, and clear the corresponding
             * cached result.
             */
            else if (currentSegmentState == SegmentScanState.Failed
                    || currentSegmentState == SegmentScanState.SegmentScanCompleted) {
                segmentScanResults.set(currentSegment, null);
                continue;
            }
            /**
             * Otherwise, submit a new future task and save it in
             * segmentScanFutureTasks.
             */
            else {
                // Update the state to "Scanning" and notify any waiting thread.
                synchronized (segmentScanStates) {
                    segmentScanStates.set(currentSegment, SegmentScanState.Scanning);
                    segmentScanStates.notifyAll();
                }
                final Future<ScanResult> futureTask = executorService.submit(new Callable<ScanResult>() {
                    @Override
                    public ScanResult call() throws Exception {
                        try {
                            if (currentSegmentState == SegmentScanState.HasNextPage) {
                                return scanNextPageOfSegment(currentSegment, true);
                            }
                            else if (currentSegmentState == SegmentScanState.Waiting) {
                                return scanNextPageOfSegment(currentSegment, false);
                            }
                            else {
                                throw new AmazonClientException(
                                        "Should not start a new future task");
                            }
                        } catch (final Exception e) {
                            synchronized (segmentScanStates) {
                                segmentScanStates.set(currentSegment, SegmentScanState.Failed);
                                segmentScanStates.notifyAll();
                            }
                            throw e;
                        }
                    }
                });
                // Cache the future task (for getting the Exceptions in the
                // working thread).
                segmentScanFutureTasks.set(currentSegment, futureTask);
            }
        }
    }

    private List<ScanResult> marshalParallelScanResults() {
        final List<ScanResult> scanResults = new LinkedList<ScanResult>();
        for (int segment = 0; segment < totalSegments; segment++) {
            final SegmentScanState currentSegmentState = segmentScanStates.get(segment);
            /**
             * Rethrow the exception from any failed segment scan.
             */
            if (currentSegmentState == SegmentScanState.Failed) {
                try {
                    segmentScanFutureTasks.get(segment).get();
                    throw new AmazonClientException("No Exception found in the failed scan task.");
                } catch (final ExecutionException ee) {
                    if (ee.getCause() instanceof AmazonClientException) {
                        throw (AmazonClientException) (ee.getCause());
                    } else {
                        throw new AmazonClientException(
                                "Internal error during the scan on segment #" + segment + ".",
                                ee.getCause());
                    }
                } catch (final Exception e) {
                    throw new AmazonClientException("Error during the scan on segment #" + segment
                            + ".", e);
                }
            }
            /**
             * Get the ScanResult from cache if the segment scan has finished.
             */
            else if (currentSegmentState == SegmentScanState.HasNextPage
                    || currentSegmentState == SegmentScanState.SegmentScanCompleted) {
                final ScanResult scanResult = segmentScanResults.get(segment);
                scanResults.add(scanResult);
            }
            else if (currentSegmentState == SegmentScanState.Waiting
                    || currentSegmentState == SegmentScanState.Scanning) {
                throw new AmazonClientException(
                        "Should never see a 'Scanning' or 'Waiting' state when marshalling parallel scan results.");
            }
        }
        return scanResults;
    }

    ScanResult scanNextPageOfSegment(int currentSegment, boolean checkLastEvaluatedKey) {
        final ScanRequest segmentScanRequest = parallelScanRequests.get(currentSegment);
        if (checkLastEvaluatedKey) {
            final ScanResult lastScanResult = segmentScanResults.get(currentSegment);
            segmentScanRequest.setExclusiveStartKey(lastScanResult.getLastEvaluatedKey());
        } else {
            segmentScanRequest.setExclusiveStartKey(null);
        }
        final ScanResult scanResult = dynamo.scan(DynamoDBMapper.applyUserAgent(segmentScanRequest));

        /**
         * Cache the scan result in segmentScanResults. We should never try to
         * get these scan results by calling get() on the cached future tasks.
         */
        segmentScanResults.set(currentSegment, scanResult);

        /**
         * Update the state and notify any waiting thread.
         */
        synchronized (segmentScanStates) {
            if (null == scanResult.getLastEvaluatedKey()) {
                segmentScanStates.set(currentSegment, SegmentScanState.SegmentScanCompleted);
            } else {
                segmentScanStates.set(currentSegment, SegmentScanState.HasNextPage);
            }
            segmentScanStates.notifyAll();
        }
        return scanResult;
    }

    private void initSegmentScanStates() {
        for (int segment = 0; segment < totalSegments; segment++) {
            segmentScanFutureTasks.add(null);
            segmentScanResults.add(null);
            segmentScanStates.add(SegmentScanState.Waiting);
        }
    }

    /**
     * Enumeration of the possible states of the scan on a segment.
     */
    private static enum SegmentScanState {
        /**
         * The scan on the segment is waiting for resources to execute and has
         * not started yet.
         */
        Waiting,

        /** The scan is in process, and hasn't finished yet. */
        Scanning,

        /** The scan has already failed. */
        Failed,

        /**
         * The scan on the current page has finished, but there are more pages
         * in the segment to be scanned.
         */
        HasNextPage,

        /** The scan on the whole segment has completed. */
        SegmentScanCompleted,
    }
}
