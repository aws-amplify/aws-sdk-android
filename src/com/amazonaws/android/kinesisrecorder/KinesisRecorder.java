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
package com.amazonaws.android.kinesisrecorder;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.android.kinesisrecorder.internal.FileRecordStore;
import com.amazonaws.android.kinesisrecorder.internal.JSONRecordAdapter;
import com.amazonaws.android.kinesisrecorder.internal.RecordStore;
import com.amazonaws.android.kinesisrecorder.internal.RecordStore.RecordIterator;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.model.PutRecordRequest;

/**
 * The KinesisRecorder is a high level client meant for storing
 * PutRecordRequests on the users Android device. This allows developers to
 * retain requests when the device is offline. It can also increase performance
 * and battery efficiency since the wi-fi or cell network does not need to be
 * woken up as frequently.
 * 
 * Note: KinesisRecorder uses all synchronous calls regardless of the
 * AmazonKinesisClient passed in. Therefore you should not call KinesisRecorder
 * methods on the main thread.
 * 
 * To use KinesisRecorder create an AmazonKinesisClient and an directory that is
 * private to your application. The directory passed should be empty the first
 * time you instantiate KinesisRecorder, and should only be used for
 * KinesisRecorder to prevent collision. Additionally you may pass an instance
 * of KinesisRecorderConfig in order to set parameters on KinesisRecorder (Such
 * as the maximum amount of storage KinesisRecorder may use).
 * 
 * Warning: You should not create multiple KinesisRecorders given the same
 * directory. Doing so is an error and behavior is undefined.
 * 
 * Note: KinesisRecorder stores the requests in plain-text, and does not perform
 * additional security measures outside of what the Android OS offers by
 * default. Therefore it is recommended you pass a directory that is only
 * visible to your application, and additionally do not store highly sensitive
 * information using Kinesis Recorder.
 * 
 */
public class KinesisRecorder {

    protected static final Log log = LogFactory.getLog(KinesisRecorder.class);

    /** TheRecordStore is responsible for saving requests to be sent later **/
    private RecordStore recordStore;

    /**
     * The RecordAdapter is responsible for converting PutRecordRequests to and
     * from JSON
     **/
    private JSONRecordAdapter adapter;

    /**
     * The low-level AmazonKinesisClient used to send requests to Amazon Kinesis
     **/
    private AmazonKinesisClient client;

    /**
     * The configurable options for Kinesis Recorder, includes the
     * ClientConfiguration of the low level client
     **/
    private KinesisRecorderConfig config;

    /** The directory that all requests are being saved to **/
    private File directory;

    private static final String USER_AGENT = "KinesisRecorder";

    /**
     * Constructs a new Kinesis Recorder specifying a directory that Kinesis
     * Recorder has exclusive access to for storing requests.
     * 
     * Note: Kinesis Recorder is synchronous, and it's methods should not be
     * called on the main thread.
     * 
     * Note: Kinesis Recorder stores requests in plain-text, we recommend using
     * a directory that is only readable by your application and not storing
     * highly sensitive information in requests stored by Kinesis Recorder.
     * 
     * @param credentialsProvider
     *            The credentials provider to use when making requests to AWS
     * @param region
     *            The region of Amazon Kinesis this Recorder should save and
     *            send requests to.
     * @param directory
     *            An empty directory KinesisRecorder can use for storing
     *            requests.
     */
    public KinesisRecorder(AWSCredentialsProvider credentialsProvider, Regions region, File directory) {
        this(credentialsProvider, region, directory, new KinesisRecorderConfig());
    }

    /**
     * Constructs a new Kinesis Recorder specifying a directory that Kinesis
     * Recorder has exclusive access to for storing requests. Allows specifying
     * various aspects of Kinesis Recorder through the KinesisRecorderConfig
     * parameter.
     * 
     * Note: Kinesis Recorder is synchronous, and it's methods should not be
     * called on the main thread.
     * 
     * Note: Kinesis Recorder stores requests in plain-text, we recommend using
     * a directory that is only readable by your application and not storing
     * highly sensitive information in requests stored by Kinesis Recorder.
     * 
     * @param credentialsProvider
     *            The credentials provider to use when making requests to AWS
     * @param region
     *            The region of Amazon Kinesis this Recorder should save and
     *            send requests to.
     * @param directory
     *            An empty directory KinesisRecorder can use for storing
     *            requests.
     * @param config
     *            Allows configuring various parameters of the recorder
     */
    public KinesisRecorder(AWSCredentialsProvider credentialsProvider, Regions region, File directory, KinesisRecorderConfig config) {
        if (directory == null || credentialsProvider == null || region == null || config == null) {
            throw new IllegalArgumentException(
                    "You must pass a non-null credentialsProvider, region, directory, and config to KinesisRecordStore");
        }

        this.config = new KinesisRecorderConfig(config);
        this.directory = directory;
        this.recordStore = new FileRecordStore(directory, this.config);
        this.adapter = new JSONRecordAdapter();
        this.client = new AmazonKinesisClient(credentialsProvider, this.config.getClientConfiguration().withUserAgent(USER_AGENT));
        client.setRegion(Region.getRegion(region));

    }

    /**
     * Saves a record to local storage to be sent later. The record will be
     * submitted to the streamName provided with a randomly generated partition
     * key to ensure equal distribution across shards.
     * 
     * Note: Since operation involves file I/O it is recommended not to call
     * this method on the main thread to ensure responsive applications.
     * 
     * @param data
     *            The data to submit to the stream
     * @param streamName
     *            The stream to submit the data to.
     */
    public void saveRecord(byte[] data, String streamName) {
        if (streamName == null || streamName.isEmpty() || data == null || data.length < 1) {
            throw new IllegalArgumentException("You must pass a non-null, non-empty stream name and non-empty data");
        }
        PutRecordRequest putRequest = new PutRecordRequest().withData(ByteBuffer.wrap(data)).withStreamName(streamName)
                .withPartitionKey(UUID.randomUUID().toString());

        recordStore.put(adapter.translateFromRecord(putRequest).toString());
    }

    /**
     * Submits all requests saved to Amazon Kinesis. Requests that are
     * successfully sent will be deleted from the device. Requests that fail due
     * to the device being offline will stop the submission process and be kept.
     * Requests that fail due to other reasons (such as the request being
     * invalid) will be deleted.
     * 
     * Note: Since KinesisRecorder uses synchronous methods to make calls to Amazon
     * Kinesis, do not call submitAll() on the main thread of your application.
     * 
     * @throws AmazonClientException Thrown if there was an unrecoverable error during submission.  Note:  If the request
     * appears to be invalid, the record will be deleted.  If the request appears to be valid, it will be kept. 
     */
    public synchronized void submitAllRecords() {
        RecordIterator iterator = recordStore.iterator();
        PutRecordRequest currentRequest = null;

        while (iterator.hasNext()) {
            try {
                JSONObject representation = new JSONObject(iterator.next());
                currentRequest = adapter.translateToRecord(representation);
                client.putRecord(currentRequest);
            } catch (JSONException e) {
                log.error("Record in record store was improperly formatted JSON, record will be dropped", e);
            } catch (AmazonClientException e) {
                iterator.removeReadRecords();
                if (PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION.shouldRetry(currentRequest, e, 1)) {
                    log.warn("Error occured while sending request, request appears to be valid stopping submission but retaining record", e);
                    saveRecord(currentRequest.getData().array(), currentRequest.getStreamName());
                    break;
                } else {
                    if(e instanceof AmazonServiceException){
                        AmazonServiceException serverError = (AmazonServiceException) e;
                        String errorCode = serverError.getErrorCode();
                            if(errorCode.equalsIgnoreCase("ValidationError") 
                                    || errorCode.equalsIgnoreCase("MissingParameter") 
                                    || errorCode.equalsIgnoreCase("MissingAction") 
                                    || errorCode.equalsIgnoreCase("MalformedQueryString") 
                                    || errorCode.equalsIgnoreCase("InvalidQueryParameter") 
                                    || errorCode.equalsIgnoreCase("InvalidParameterValue") 
                                    || errorCode.equalsIgnoreCase("InvalidParameterCombination")){
                                //We have reason to believe the values in the request is invalid and cannot be sent or recovered.
                                log.error("ClientException in submit all, the last record is presumed to be the cause and will be dropped", e);
                            }else{
                                //There is no reason to believe the values are bad, otherissues such as invalid credentials may be the cause
                                //We should keep the request around.
                                saveRecord(currentRequest.getData().array(), currentRequest.getStreamName());
                                log.error("ClientException in submit all, the values of the data inside the requests appears valid.  The request will be kept", e);
                            }
                        }
                }
                throw e;
            }
        }
        iterator.removeReadRecords();
    }

    /**
     * Removes all requests saved to disk in the directory provided this
     * KinesisRecorder
     */
    public synchronized void deleteAllRecords() {
        recordStore.iterator().removeAllRecords();
    }

    /**
     * Returns the number of bytes KinesisRecorder currently has stored in the
     * directory passed in the constructor
     * 
     * @return long
     */
    public long getDiskBytesUsed() {
        long totalBytes = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                totalBytes += file.length();
            } else {
                log.warn("Encountered directory " + file.getAbsolutePath() + " unexpectedly when getting total storage size");
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

}
