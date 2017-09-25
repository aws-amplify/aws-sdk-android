/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;


import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore.RecordIterator;
import com.amazonaws.util.StringUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * An abstract class for Amazon Kinesis recorders. It manages local file store
 * that temporarily saves records and sends these records later.
 */
public abstract class AbstractKinesisRecorder {
    private static final Log LOGGER = LogFactory.getLog(AbstractKinesisRecorder.class);
    private static final int MAX_RETRY_COUNT = 3;

    /**
     * Maximum number of records per batch. Note that Kinesis Stream and Kinesis
     * Firehose have much higher limits. The limits are lowered for performance
     * consideration.
     */
    private static final int MAX_RECORDS_PER_BATCH = 128;
    /**
     * Maximum size in bytes of records in PutRecordBatch.
     */
    private static final int MAX_BATCH_RECORDS_SIZE_BYTES = 512 * 1024;

    /**
     * The configurable options for Kinesis Recorder, includes the
     * ClientConfiguration of the low level client.
     */
    protected KinesisRecorderConfig config;
    protected FileRecordStore recordStore;

    /**
     * A LinkedHashMap-backed Buffer that will ensure that the next
     * batch for a given stream is filled to maximum capacity before being
     * submitted.
     */
    protected class BatchHashBuffer extends LinkedHashMap<String, List<byte[]>> {
        public BatchHashBuffer() {
            super();
        }

        public void clearBatch(String key) {
            this.put(key, new ArrayList<byte[]>());
        }

        public List<byte[]> get(String key) {
            if (key == null)
                return new ArrayList<byte[]>();
            else
                return super.get(key);
        }
    }
    protected BatchHashBuffer batchBuffer;

    /**
     * Gets the sender to send saved records.
     *
     * @return a {@link RecordSender}
     */
    protected abstract RecordSender getRecordSender();

    /**
     * Creates a {@link AbstractKinesisRecorder}.
     *
     * @param recordStore local file store that keeps Kinesis records
     * @param config configuration
     */
    protected AbstractKinesisRecorder(FileRecordStore recordStore, KinesisRecorderConfig config) {
        if (recordStore == null) {
            throw new IllegalArgumentException("Record store can't be null");
        }
        this.recordStore = recordStore;
        this.config = config;
        clearBatchBuffer();
    }

    /**
     * Initializes a BatchHashBuffer.
     * For each stream name in the record store, a key value pair is created
     * where the key is the stream name, and the value is an empty batch
     * to be filled with records to max capacity before being returned by nextBatch().
     */
    protected void clearBatchBuffer() {
        this.batchBuffer = new BatchHashBuffer();
    }

    /**
     * Saves a string to local storage to be sent later. It's a convenient
     * method to save the UTF-8 encoded bytes of the string.
     *
     * @param data A string to submit to the stream
     * @param streamName The stream to submit the data to.
     */
    public void saveRecord(String data, String streamName) {
        saveRecord(data.getBytes(StringUtils.UTF8), streamName);
    }

    /**
     * Saves a record to local storage to be sent later. The record will be
     * submitted to the streamName provided with a randomly generated partition
     * key to ensure equal distribution across shards. Note: Since operation
     * involves file I/O it is recommended not to call this method on the main
     * thread to ensure responsive applications.
     *
     * @param data The data to submit to the stream
     * @param streamName The stream to submit the data to.
     */
    public void saveRecord(byte[] data, String streamName) {
        try {
            recordStore.put(FileRecordParser.asString(streamName, data));
        } catch (final IOException e) {
            throw new AmazonClientException("Error saving record", e);
        }
    }

    /**
     * Submits all requests saved to Amazon Kinesis. Requests that are
     * successfully sent will be deleted from the device. Requests that fail due
     * to the device being offline will stop the submission process and be kept.
     * Requests that fail due to other reasons (such as the request being
     * invalid) will be deleted. Note: Since KinesisRecorder uses synchronous
     * methods to make calls to Amazon Kinesis, do not call submitAll() on the
     * main thread of your application.
     *
     * @throws AmazonClientException Thrown if there was an unrecoverable error
     *             during submission. Note: If the request appears to be
     *             invalid, the record will be deleted. If the request appears
     *             to be valid, it will be kept.
     */
    public synchronized void submitAllRecords() {
        final RecordSender sender = getRecordSender();
        final RecordIterator iterator = recordStore.iterator();
        String streamName = null;
        int retry = 0;
        int count = 0;
        clearBatchBuffer();
        try {
            while ((iterator.hasNext() || !batchBuffer.isEmpty()) && retry < MAX_RETRY_COUNT) {
                streamName = nextBatch(iterator, streamName, MAX_RECORDS_PER_BATCH,
                        MAX_BATCH_RECORDS_SIZE_BYTES);
                if (streamName == null || this.batchBuffer.get(streamName).isEmpty()) {
                    break;
                }

                try {

                    final List<byte[]> failures = sender.sendBatch(streamName, this.batchBuffer.get(streamName));
                    final int successCount = this.batchBuffer.get(streamName).size() - failures.size();
                    count += successCount;

                    /**
                     * We hold off on removing records until we are sure that we
                     * have successfully made the request. We would prefer to
                     * send duplicates than to lose records. This is still not a
                     * perfect solution as there is a chance for loss between
                     * removing the read records and re-saving the failed
                     * records.
                     * https://github.com/aws/aws-sdk-android/issues/225 If this
                     * errors it will throw an IOException. We don't wrap it so
                     * it's handled separately from network errors which will be
                     * wrapped by an AmazonClientException.
                     */
                    iterator.removeReadRecords();

                    if (successCount == 0) {
                        // no record went through, increase retry count.
                        retry++;
                    }
                    if (!failures.isEmpty()) {
                        for (final byte[] bytes : failures) {
                            saveRecord(bytes, streamName);
                        }
                    }

                } catch (final AmazonClientException ace) {
                    if (sender.isRecoverable(ace)) {
                        LOGGER.error(
                                "ServiceException in submit all, the values of the data inside the requests appears valid.  The request will be kept",
                                ace);
                    } else {
                        try {
                            iterator.removeReadRecords();
                        } catch (final IOException e) {
                            throw new AmazonClientException("Failed to drop bad records.", e);
                        }
                        // We have reason to believe the values in the request
                        // is invalid and cannot be sent or recovered.
                        LOGGER.error(
                                "ServiceException in submit all, the last request is presumed to be the cause and will be dropped",
                                ace);
                    }
                    batchBuffer.clear();
                    throw ace;
                } catch (final IOException e) {
                    throw new AmazonClientException("Failed to remove read records", e);
                }
            }
        } finally {
            LOGGER.debug(String.format("submitAllRecords sent %d records", count));
            if (batchBuffer.isEmpty())
                batchBuffer = null;
            else
                LOGGER.error("Batch Buffer deallocated before being emptied");
            try {
                iterator.close();
            } catch (final IOException e) {
                throw new AmazonClientException("Failed to close record file", e);
            }
        }
    }

    /**
     * Reads a batch of records belonging to the same stream into a LinkedHashMap-backed buffer.
     * If a batch for a given stream name reaches max capacity, the batch
     * will be returned immediately. All remaining batches in the buffer that have not reached
     * max capacity will be the next batches to be returned. If a batch is read successfully,
     * the stream name is returned.
     *
     * @param iterator record iterator
     * @param lastStreamName last stream name. Pass null on first call to nextBatch().
     * @param maxCount maximum number of records in a batch
     * @param maxSize a threshold that concludes a batch. It allows one extra
     *            record that brings the total size over this threshold.
     * @return the stream name that the batch belongs to
     */
    protected String nextBatch(RecordIterator iterator, String lastStreamName, int maxCount,
            int maxSize) {
        if (lastStreamName != null)
            this.batchBuffer.remove(lastStreamName);

        final FileRecordParser frp = new FileRecordParser();
        while (iterator.hasNext()) {
            final String line = iterator.peek();
            if (line == null || line.isEmpty()) {
                continue;
            }
            // parse a line. Skip in case of corrupted data
            try {
                frp.parse(line);
            } catch (final Exception e) {
                LOGGER.warn("Failed to read line. Skip.", e);
                iterator.next();
                continue;
            }
            // add record to respective batch in the buffer
            if (this.batchBuffer.get(frp.streamName) == null) {
                this.batchBuffer.clearBatch(frp.streamName);
            }
            this.batchBuffer.get(frp.streamName).add(frp.bytes);
            int count = this.batchBuffer.get(frp.streamName).size();
            int size = calculateBatchSize(this.batchBuffer.get(frp.streamName));
            iterator.next();
            // when the limit is reached, return the stream name of the filled batch
            if (count >= maxCount || size >= maxSize) {
                lastStreamName = frp.streamName;
                return lastStreamName;
            }
        }
        // return the stream name of any remaining data in the buffer
        for(Map.Entry<String, List<byte[]>> entry : batchBuffer.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                lastStreamName = entry.getKey();
                return lastStreamName;
            }
        }
        return null;
    }

    /**
     * Calculates the size of a batch in the batch buffer
     *
     * @param batch, a batch from batchBuffer
     * @return the size of the batch in bytes
     */
    protected int calculateBatchSize(List<byte[]> batch) {
        int size = 0;
        for (byte[] record : batch) {
            size += record.length;
        }
        return size;
    }

    /**
     * Returns the KinesisRecorderConfig this Kinesis Recorder is using. This is
     * either the config passed into the constructor or the default one if one
     * was not specified.
     *
     * @return The KinesisRecorderConfig
     */
    public KinesisRecorderConfig getKinesisRecorderConfig() {
        return config;
    }

    /**
     * Returns the number of bytes KinesisRecorder currently has stored in the
     * directory passed in the constructor.
     *
     * @return long The number of bytes used
     */
    public long getDiskBytesUsed() {
        return recordStore.getFileSize();
    }

    /**
     * Returns the max number of bytes that this Kinesis Recorder will store on
     * disk. This is the same as specified in getMaxStorageSize() in the
     * KinesisRecorderConfig, either the one passed into the constructor or the
     * default one that was constructed.
     *
     * @return The number of bytes allowed
     */
    public long getDiskByteLimit() {
        return config.getMaxStorageSize();
    }

    /**
     * Removes all requests saved to disk in the directory provided this
     * KinesisRecorder.
     */
    public synchronized void deleteAllRecords() {
        try {
            recordStore.iterator().removeAllRecords();
        } catch (final IOException e) {
            throw new AmazonClientException("Error deleting events", e);
        }
    }
}
