/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.Constants.PUT_RECORDS_MAX_RECORDS;

import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.FileRecordStore;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.FileRecordStore.RecordIterator;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.JSONRecordAdapter;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.services.kinesis.model.PutRecordsResult;
import com.amazonaws.services.kinesis.model.PutRecordsResultEntry;
import com.amazonaws.util.VersionInfoUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * The KinesisRecorder is a high level client meant for storing
 * PutRecordRequests on the users Android device. This allows developers to
 * retain requests when the device is offline. It can also increase performance
 * and battery efficiency since the wi-fi or cell network does not need to be
 * woken up as frequently.
 * <p/>
 * Note: KinesisRecorder uses all synchronous calls regardless of the
 * AmazonKinesisClient passed in. Therefore you should not call KinesisRecorder
 * methods on the main thread.
 * <p/>
 * To use KinesisRecorder create an AmazonKinesisClient and an directory that is
 * private to your application. The directory passed should be empty the first
 * time you instantiate KinesisRecorder, and should only be used for
 * KinesisRecorder to prevent collision. Additionally you may pass an instance
 * of KinesisRecorderConfig in order to set parameters on KinesisRecorder (Such
 * as the maximum amount of storage KinesisRecorder may use).
 * <p/>
 * Warning: You should not create multiple KinesisRecorders given the same
 * directory. Doing so is an error and behavior is undefined.
 * <p/>
 * Note: KinesisRecorder stores the requests in plain-text, and does not perform
 * additional security measures outside of what the Android OS offers by
 * default. Therefore it is recommended you pass a directory that is only
 * visible to your application, and additionally do not store highly sensitive
 * information using Kinesis Recorder.
 */
public class KinesisRecorder {
    private static final String TAG = "KinesisRecorder";

    /** TheRecordStore is responsible for saving requests to be sent later **/
    FileRecordStore recordStore;

    /**
     * The RecordAdapter is responsible for converting PutRecordRequests to and
     * from JSON
     **/
    private JSONRecordAdapter adapter;

    /**
     * The low-level AmazonKinesisClient used to send requests to Amazon Kinesis
     **/
    AmazonKinesisClient client;

    /**
     * The configurable options for Kinesis Recorder, includes the
     * ClientConfiguration of the low level client
     **/
    private KinesisRecorderConfig config;

    /** The directory that all requests are being saved to **/
    private File directory;

    private static final String USER_AGENT = KinesisRecorder.class.getName() + "/"
            + VersionInfoUtils.getVersion();

    /**
     * Constructs a new Kinesis Recorder specifying a directory that Kinesis
     * Recorder has exclusive access to for storing requests. Note: Kinesis
     * Recorder is synchronous, and it's methods should not be called on the
     * main thread. Note: Kinesis Recorder stores requests in plain-text, we
     * recommend using a directory that is only readable by your application and
     * not storing highly sensitive information in requests stored by Kinesis
     * Recorder.
     *
     * @param credentialsProvider The credentials provider to use when making
     *            requests to AWS
     * @param region The region of Amazon Kinesis this Recorder should save and
     *            send requests to.
     * @param directory An empty directory KinesisRecorder can use for storing
     *            requests.
     */
    public KinesisRecorder(File directory, Regions region,
            AWSCredentialsProvider credentialsProvider) {
        this(directory, region, credentialsProvider, new KinesisRecorderConfig());
    }

    /**
     * Constructs a new Kinesis Recorder specifying a directory that Kinesis
     * Recorder has exclusive access to for storing requests. Allows specifying
     * various aspects of Kinesis Recorder through the KinesisRecorderConfig
     * parameter. Note: Kinesis Recorder is synchronous, and it's methods should
     * not be called on the main thread. Note: Kinesis Recorder stores requests
     * in plain-text, we recommend using a directory that is only readable by
     * your application and not storing highly sensitive information in requests
     * stored by Kinesis Recorder.
     *
     * @param credentialsProvider The credentials provider to use when making
     *            requests to AWS
     * @param region The region of Amazon Kinesis this Recorder should save and
     *            send requests to.
     * @param directory An empty directory KinesisRecorder can use for storing
     *            requests.
     * @param config Allows configuring various parameters of the recorder
     */
    public KinesisRecorder(File directory, Regions region,
            AWSCredentialsProvider credentialsProvider, KinesisRecorderConfig config) {
        if (directory == null || credentialsProvider == null || region == null || config == null) {
            throw new IllegalArgumentException(
                    "You must pass a non-null credentialsProvider, region, directory, and config to KinesisRecordStore");
        }

        this.directory = directory;
        this.config = new KinesisRecorderConfig(config);
        this.adapter = new JSONRecordAdapter();
        this.client = new AmazonKinesisClient(credentialsProvider,
                this.config.getClientConfiguration());
        client.setRegion(Region.getRegion(region));

        try {
            this.recordStore = new FileRecordStore(directory, this.config);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to initialize KinesisRecorder", e);
        }

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
        if (streamName == null || streamName.isEmpty() || data == null || data.length < 1) {
            throw new IllegalArgumentException(
                    "You must pass a non-null, non-empty stream name and non-empty data");
        }
        PutRecordRequest putRequest = new PutRecordRequest().withData(ByteBuffer.wrap(data))
                .withStreamName(streamName)
                .withPartitionKey(UUID.randomUUID().toString());
        try {
            recordStore.put(adapter.translateFromRecord(putRequest).toString());
        } catch (IOException e) {
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
        RecordIterator iterator = recordStore.iterator();
        LinkedList<PutRecordsRequestEntry> entries =
                new LinkedList<PutRecordsRequestEntry>();
        String stream = null;
        JSONObject json = null;
        while (iterator.hasNext()) {
            // first fill up list
            try {
                if (json == null) {
                    json = new JSONObject(iterator.peek());
                }
                if (entries.size() == 0) {
                    stream = JSONRecordAdapter.getStreamName(json);
                }
                if (belongsInBatch(json, stream, entries)) {
                    entries.add(new PutRecordsRequestEntry()
                            .withData(JSONRecordAdapter.getData(json))
                            .withPartitionKey(
                                    JSONRecordAdapter.getPartitionKey(json))
                            );
                    // set to null so we know we have to get the next one
                    json = null;
                    iterator.next();
                } else {
                    // note this modifies entries and iterator
                    try {
                        submitAndUpdate(stream, entries, iterator);
                    } catch (IOException e) {
                        throw new AmazonClientException("Error submitting events", e);
                    }
                }
            } catch (JSONException e) {
                Log.e(TAG,
                        "Record in record store was improperly formatted JSON, record will be dropped",
                        e);
                json = null;
                iterator.next();
            }
        }
        if (entries.size() > 0) {
            // note this modifies entries and iterator
            try {
                submitAndUpdate(stream, entries, iterator);
            } catch (IOException e) {
                throw new AmazonClientException("Error submitting events", e);
            }
        }
    }

    /**
     * Removes all requests saved to disk in the directory provided this
     * KinesisRecorder
     */
    public synchronized void deleteAllRecords() {
        try {
            recordStore.iterator().removeAllRecords();
        } catch (IOException e) {
            throw new AmazonClientException("Error deleting events", e);
        }
    }

    /**
     * Returns the number of bytes KinesisRecorder currently has stored in the
     * directory passed in the constructor
     *
     * @return long The number of bytes used
     */
    public long getDiskBytesUsed() {
        return getRecursiveSizeOfDirectory(directory);
    }

    /**
     * Returns the size of a directory including all sub-directories
     *
     * @param directory
     * @return
     */
    long getRecursiveSizeOfDirectory(File file) {
        if (!file.isDirectory()) {
            return directory.length();
        }

        long totalBytes = 0;
        for (File subFile : file.listFiles()) {
            if (subFile.isFile()) {
                totalBytes += subFile.length();
            } else if (subFile.isDirectory()) {
                totalBytes += getRecursiveSizeOfDirectory(subFile);
            }
        }
        return totalBytes;
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
     * Returns the KinesisRecorderConfig this Kinesis Recorder is using. This is
     * either the config passed into the constructor or the default one if one
     * was not specified
     *
     * @return The KinesisRecorderConfig
     */
    public KinesisRecorderConfig getKinesisRecorderConfig() {
        return config;
    }

    /*
     * returns true if the entry can be included in batch
     */
    boolean belongsInBatch(JSONObject entry, String stream,
            Collection<PutRecordsRequestEntry> entries) throws JSONException {
        boolean fromSameStream = JSONRecordAdapter.getStreamName(entry).equals(stream);
        boolean hasSpace =
                entries.size() + 1 <= PUT_RECORDS_MAX_RECORDS;
        return fromSameStream && hasSpace;
    }

    /*
     * Returns true iff the exception is recoverable and thus should be retried
     */
    boolean isRecoverable(String errorCode) {
        return !(errorCode.equalsIgnoreCase("ValidationError")
                || errorCode.equalsIgnoreCase("MissingParameter")
                || errorCode.equalsIgnoreCase("MissingAction")
                || errorCode.equalsIgnoreCase("MalformedQueryString")
                || errorCode.equalsIgnoreCase("InvalidQueryParameter")
                || errorCode.equalsIgnoreCase("InvalidParameterValue")
                || errorCode.equalsIgnoreCase("InvalidParameterCombination")
                || errorCode.equalsIgnoreCase("InvalidAction")
                || errorCode.equalsIgnoreCase("InvalidArgumentException"));
    }

    private void saveEntries(String stream,
            Collection<PutRecordsRequestEntry> entries) throws IOException {
        for (PutRecordsRequestEntry entry : entries) {
            saveEntry(stream, entry);
        }
    }

    private void saveEntry(String stream, PutRecordsRequestEntry entry) throws IOException {
        saveRecord(entry.getData().array(), stream);
    }

    /*
     * Makes and submits PutRecordsRequest using the given entries and stream
     */
    void submit(String stream,
            List<PutRecordsRequestEntry> entries) throws IOException {
        PutRecordsRequest request = new PutRecordsRequest()
                .withStreamName(stream)
                .withRecords(entries);
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        try {
            PutRecordsResult result = client.putRecords(request);
            for (int i = 0; i < result.getRecords().size(); i++) {
                PutRecordsResultEntry entry =
                        result.getRecords().get(i);
                // save the ones that can be retried
                if (entry.getErrorCode() != null
                        && isRecoverable(entry.getErrorCode())) {
                    saveEntry(stream, entries.get(i));
                }
            }
        } catch (AmazonClientException e) {
            if (PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION.shouldRetry(request, e, 1)) {
                Log.w(TAG,
                        "Error occured while sending request, request appears to be valid stopping submission but retaining records",
                        e);
                saveEntries(stream, entries);
            } else {
                if (e instanceof AmazonServiceException) {
                    if (!isRecoverable(((AmazonServiceException) e).getErrorCode()))
                    {
                        // We have reason to believe the values in the request
                        // is invalid and cannot be sent or recovered.
                        Log.e(TAG,
                                "ServiceException in submit all, the last request is presumed to be the cause and will be dropped",
                                e);
                    } else {
                        // There is no reason to believe the values are bad,
                        // otherissues such as invalid credentials may be the
                        // cause
                        // We should keep the records
                        saveEntries(stream, entries);
                        Log.e(TAG,
                                "ServiceException in submit all, the values of the data inside the requests appears valid.  The request will be kept",
                                e);
                    }
                }
            }
            throw e;
        }
    }

    /*
     * Submits and updates variables. Note that this modifies entries and
     * iterator
     */
    private void submitAndUpdate(String stream,
            List<PutRecordsRequestEntry> entries,
            RecordIterator iterator) throws IOException {
        iterator.removeReadRecords();
        // if we can't add it, we should submit request
        submit(stream, entries);
        entries.clear();
    }
}
