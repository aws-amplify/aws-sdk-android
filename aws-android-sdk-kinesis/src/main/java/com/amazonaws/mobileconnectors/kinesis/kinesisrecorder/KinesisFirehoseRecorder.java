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
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClient;
import com.amazonaws.util.VersionInfoUtils;

import java.io.File;
import java.util.regex.Pattern;

/**
 * The {@link KinesisFirehoseRecorder} is a high level client for Amazon Kinesis
 * Firehose. It can cache data on users' Android device and send them in a batch
 * later.
 * <p/>
 * Note: {@link KinesisFirehoseRecorder#submitAllRecords()} is a synchronous
 * method that sends cached data to Amazon Kinesis over the network. Therefore
 * you should not call KinesisRecorder methods on the main thread.
 * <p/>
 * Warning: You should not create multiple {@link KinesisFirehoseRecorder} given
 * the same directory. Doing so is an error and behavior is undefined.
 * <p/>
 * Note: {@link KinesisFirehoseRecorder} stores the requests in plain-text, and
 * does not perform additional security measures outside of what the Android OS
 * offers by default. Therefore it is recommended you pass a directory that is
 * only visible to your application, and additionally do not store highly
 * sensitive information using {@link KinesisFirehoseRecorder}.
 * 
 * <pre>
 * // working directory for the recorder
 * File directory = context.getCachedDir();
 * // AWS Firehose region
 * Regions region = Regions.US_WEST_2;
 * // initialize a credentials provider
 * AWSCredentialsProvider provider = new CognitoCachingCredentialsProvider(
 *         context,
 *         &quot;identityPoolId&quot;,
 *         Regions.US_EAST_1);
 * KinesisFirehoseRecorder firehoseRecorder = new KinesisFirehoseRecorder(
 *         directory, region, provider);
 * // save some strings
 * String streamName = &quot;my_stream&quot;; // Firehose delivery stream name
 * firehoseRecorder.saveRecord(&quot;Hello world!\n&quot;, streamName);
 * firehoseRecorder.saveRecord(&quot;Streaming data to S3 via Firehose is easy.\n&quot;, streamName);
 * 
 * // send previously save data to Amazon Firehose
 * // Note: submitAllRecords() makes network calls, so wrap it in an AsyncTask.
 * new AsyncTask&lt;Void, Void, Void&gt;() {
 *     &#064;Override
 *     protected Void doInBackground(Void... v) {
 *         try {
 *             firehoseRecorder.submitAllRecords();
 *         } catch (AmazonClientException ace) {
 *             // error occurs.
 *         }
 *     }
 * }.execute();
 * </pre>
 * 
 * {@link KinesisFirehoseRecorder} requires an IAM policy that allows
 * PutRecordBatch action on the target delivery stream. Here is an example:
 * 
 * <pre>
 * {
 *   "Version": "2012-10-17",
 *   "Statement": [{
 *     "Effect": "Allow",
 *     "Action": [ "firehose:PutRecordBatch" ],
 *     "Resource": [
 *       "arn:aws:firehose:us-east-1:123456789012:deliverystream/my_stream"
 *     ]
 *   }]
 * }
 * </pre>
 */
public class KinesisFirehoseRecorder extends AbstractKinesisRecorder {

    /**
     * Name of local file record store.
     */
    private static final String RECORD_FILE_NAME = "kinesis_firehose_records";
    /**
     * User agent string to identify {@link KinesisFirehoseRecorder}.
     */
    private static final String USER_AGENT = KinesisFirehoseRecorder.class.getName() + "/"
            + VersionInfoUtils.getVersion();

    /**
     * The maximum size of a record sent to Firehose, before base64-encoding, is
     * 1000 KB.
     */
    private static final int MAX_RECORD_SIZE_BYTES = 1000 * 1024;
    /**
     * Valid stream name pattern.
     */
    private static final Pattern STREAM_NAME_PATTERN = Pattern.compile("[a-zA-Z0-9_.-]{1,64}");

    private FirehoseRecordSender sender;

    /**
     * Constructs a new Kinesis Firehose Recorder specifying a directory that
     * the recorder has exclusive access to for storing requests.
     * <p>
     * Note: Kinesis Firehose Recorder is synchronous, and it's methods should
     * not be called on the main thread.
     * <p>
     * Note: Kinesis Firehose Recorder stores requests in plain-text, we
     * recommend using a directory that is only readable by your application and
     * not storing highly sensitive information in requests stored by Kinesis
     * Firehose Recorder.
     *
     * @param directory A directory {@link KinesisFirehoseRecorder} can use for
     *            storing requests.
     * @param region The region of Amazon Kinesis Firehose this Recorder should
     *            save and send requests to.
     * @param credentialsProvider The credentials provider to use when making
     *            requests to AWS
     */
    public KinesisFirehoseRecorder(File directory, Regions region,
            AWSCredentialsProvider credentialsProvider) {
        this(directory, region, credentialsProvider, new KinesisRecorderConfig());
    }

    /**
     * Constructs a new Kinesis Firehose Recorder specifying a directory that
     * the recorder has exclusive access to for storing requests.
     * <p>
     * Note: Kinesis Firehose Recorder is synchronous, and it's methods should
     * not be called on the main thread.
     * <p>
     * Note: Kinesis Firehose Recorder stores requests in plain-text, we
     * recommend using a directory that is only readable by your application and
     * not storing highly sensitive information in requests stored by Kinesis
     * Firehose Recorder.
     *
     * @param directory A directory {@link KinesisFirehoseRecorder} can use for
     *            storing requests.
     * @param region The region of Amazon Kinesis Firehose this Recorder should
     *            save and send requests to.
     * @param credentialsProvider The credentials provider to use when making
     *            requests to AWS
     * @param config Allows configuring various parameters of the recorder
     */
    public KinesisFirehoseRecorder(File directory, Regions region,
            AWSCredentialsProvider credentialsProvider, KinesisRecorderConfig config) {
        super(new FileRecordStore(directory, RECORD_FILE_NAME,
                config.getMaxStorageSize()), config);

        AmazonKinesisFirehose client = new AmazonKinesisFirehoseClient(credentialsProvider,
                config.getClientConfiguration());
        client.setRegion(Region.getRegion(region));
        sender = new FirehoseRecordSender(client, USER_AGENT);
    }

    /**
     * Constructs a {@link KinesisFirehoseRecorder}. It allows you to inject
     * dependencies.
     * 
     * @param sender a {@link FirehoseRecordSender}
     * @param recordStore record store
     * @param config configuration
     */
    KinesisFirehoseRecorder(FirehoseRecordSender sender, FileRecordStore recordStore,
            KinesisRecorderConfig config) {
        super(recordStore, config);
        this.sender = sender;
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
