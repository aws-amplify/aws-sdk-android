/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore.RecordIterator;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.util.VersionInfoUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * The KinesisRecorder is a high level client meant for storing records on the
 * users Android device. This allows developers to retain requests when the
 * device is offline. It can also increase performance and battery efficiency
 * since the wi-fi or cell network does not need to be woken up as frequently.
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
 * <p/>
 * KinesisRecorder requires an IAM policy that allows PutRecords action on the
 * target stream. Here is an example:
 *
 * <pre>
 * {
 *   "Version": "2012-10-17",
 *   "Statement": [{
 *     "Effect": "Allow",
 *     "Action": [ "kinesis:PutRecords" ],
 *     "Resource": [
 *       "arn:aws:kinesis:us-east-1:123456789012:stream/my_stream"
 *     ]
 *   }]
 * }
 * </pre>
 */
public class KinesisRecorder extends AbstractKinesisRecorder {

    private static final Log LOGGER = LogFactory.getLog(KinesisRecorder.class);

    /**
     * Name of local file record store.
     */
    private static final String RECORD_FILE_NAME = "kinesis_stream_records";
    /**
     * User agent string to identify {@link KinesisRecorder}.
     */
    private static final String USER_AGENT = KinesisRecorder.class.getName() + "/"
            + VersionInfoUtils.getVersion();

    /**
     * The maximum size of a data blob (the data payload before Base64-encoding)
     * is up to 1 MB.
     */
    private static final int MAX_RECORD_SIZE_BYTES = 1024 * 1024;
    /**
     * Valid stream name pattern.
     */
    private static final Pattern STREAM_NAME_PATTERN = Pattern.compile("[a-zA-Z0-9_.-]{1,128}");

    private final KinesisStreamRecordSender sender;

    /**
     * Constructs a new Kinesis Recorder specifying a directory that Kinesis
     * Recorder has exclusive access to for storing requests.
     * <p>
     * Note: Kinesis Recorder is synchronous, and it's methods should not be
     * called on the main thread.
     * <p>
     * Note: Kinesis Recorder stores requests in plain-text, we recommend using
     * a directory that is only readable by your application and not storing
     * highly sensitive information in requests stored by Kinesis Recorder.
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
        super(new FileRecordStore(directory, RECORD_FILE_NAME,
                config.getMaxStorageSize()), config);

        if (directory == null || credentialsProvider == null || region == null || config == null) {
            throw new IllegalArgumentException(
                    "You must pass a non-null credentialsProvider, region, directory, and config to KinesisRecordStore");
        }

        final AmazonKinesis client = new AmazonKinesisClient(credentialsProvider,
                config.getClientConfiguration());
        client.setRegion(Region.getRegion(region));
        sender = new KinesisStreamRecordSender(client, USER_AGENT, config.getPartitionKey());

        checkUpgrade(directory);
    }

    /**
     * Constructs a {@link KinesisRecorder}. It allows you to inject
     * dependencies.
     *
     * @param sender a {@link KinesisStreamRecordSender}
     * @param recordStore record store
     * @param config configuration
     */
    KinesisRecorder(KinesisStreamRecordSender sender, FileRecordStore recordStore,
            KinesisRecorderConfig config) {
        super(recordStore, config);
        this.sender = sender;
    }

    private void checkUpgrade(final File directory) {
        final File recordsDir = new File(directory, Constants.RECORDS_DIRECTORY);
        final File oldRecordsFile = new File(recordsDir, Constants.RECORDS_FILE_NAME);
        // if the records file exists, run upgrade in a background thread
        if (oldRecordsFile.isFile()) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    upgrade(directory);
                }
            }).start();
        }
    }

    /**
     * Ports Kinesis records in old records file into the new place and in new
     * format.
     *
     * @param directory working directory
     */
    void upgrade(File directory) {
        synchronized (KinesisRecorder.this) {
            final File recordsDir = new File(directory, Constants.RECORDS_DIRECTORY);
            final File oldRecordsFile = new File(recordsDir, Constants.RECORDS_FILE_NAME);
            if (!oldRecordsFile.isFile()) {
                return;
            }

            // iterate through all records in the old records file
            final FileRecordStore frs = new FileRecordStore(directory, Constants.RECORDS_FILE_NAME,
                    Long.MAX_VALUE);
            final RecordIterator iterator = frs.iterator();
            while (iterator.hasNext()) {
                try {
                    final JSONObject json = new JSONObject(iterator.next());
                    saveRecord(JSONRecordAdapter.getData(json).array(),
                            JSONRecordAdapter.getStreamName(json));
                } catch (final JSONException e) {
                    LOGGER.debug("caught exception", e);
                    continue;
                }
            }
            try {
                iterator.close();
            } catch (final IOException e) {
                LOGGER.debug("caught exception", e);
            }
            oldRecordsFile.delete();
        }
    }

    @Override
    protected RecordSender getRecordSender() {
        return sender;
    }

    @Override
    public void saveRecord(byte[] data, String streamName) {
        if (streamName == null || !STREAM_NAME_PATTERN.matcher(streamName).matches()) {
            throw new IllegalArgumentException("Invalid stream name: " + streamName);
        }
        if (data == null || data.length == 0 || data.length > MAX_RECORD_SIZE_BYTES) {
            throw new IllegalArgumentException("Invalid data size.");
        }
        super.saveRecord(data, streamName);
    }
}
