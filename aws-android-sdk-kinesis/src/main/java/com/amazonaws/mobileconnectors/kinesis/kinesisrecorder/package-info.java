/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Primary classes for interacting with the Kinesis connector for offline storage
 * of records, and improved performance when working with to Amazon Kinesis.
 * <p>
 * KinesisRecorder and KinesisFirehoseRecorder are high level clients for Amazon
 * Kinesis. They offer storing records on the users Android device before
 * sending to the server. This allows developers to retain requests when the
 * device is offline. It can also increase performance and battery efficiency
 * since the wi-fi or cell network does not need to be woken up as frequently.
 * <p>
 * KinesisRecorder and KinesisFirehoseRecorder are very similar. The main difference
 * is the destination. KinesisRecorder sends data to Amazon Kinesis Streams and
 * developer needs to write applications to process streamed data from the service.
 * Whereas the latter sends data to Amazon Kinesis Firehose which is a fully managed
 * service for delivering real-time streaming data to destinations such as Amazon
 * Simple Storage Service (Amazon S3) and Amazon Redshift.
 * <p>
 * The following is an example of KinesisFirehoseRecorder.
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
 */

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

