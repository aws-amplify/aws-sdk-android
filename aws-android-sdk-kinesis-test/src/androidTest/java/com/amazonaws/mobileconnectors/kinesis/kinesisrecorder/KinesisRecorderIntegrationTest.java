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

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import static org.junit.Assert.assertTrue;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.model.DescribeStreamResult;
import com.amazonaws.services.kinesis.model.GetRecordsRequest;
import com.amazonaws.services.kinesis.model.GetRecordsResult;
import com.amazonaws.services.kinesis.model.GetShardIteratorRequest;
import com.amazonaws.services.kinesis.model.GetShardIteratorResult;
import com.amazonaws.services.kinesis.model.LimitExceededException;
import com.amazonaws.services.kinesis.model.Record;
import com.amazonaws.services.kinesis.model.ResourceInUseException;
import com.amazonaws.services.kinesis.model.ResourceNotFoundException;
import com.amazonaws.services.kinesis.model.Shard;
import com.amazonaws.services.kinesis.model.ShardIteratorType;
import com.amazonaws.services.kinesis.model.StreamDescription;

import com.amazonaws.util.StringUtils;

import org.json.JSONException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class KinesisRecorderIntegrationTest extends KinesisRecorderIntegrationTestBase {

    private static final String TAG = "KinesisRecorderIntegrationTest";

    // Constants for Kinesis tests
    private static final String DATA_STRING_PREFIX = "KinesisData";
    private static final String DELIMITER = "/";
    private static final int NUM_SHARDS = 5;

    private static final String STREAM_NAME = "Android_" + TAG;

    // directory where Kinesis Recorder saves records
    private static final String DIR_NAME = "KinesisRecorderDirectory";
    private File directory;

    private AmazonKinesisClient client;
    private KinesisRecorder recorder;
    private final Set<String> dataRecordSet = new HashSet<String>();
    private List<Shard> shards;

    // Create the stream for our tests once
    @BeforeClass
    public static void createStream() throws InterruptedException, JSONException {
        AmazonKinesisClient client = makeClient();

        boolean streamIsCreated = false;
        do {
            try {
                Log.d(TAG, "Creating stream, this may take some time");
                client.createStream(STREAM_NAME, NUM_SHARDS);
                streamIsCreated = true;
                Log.d(TAG, "Stream is created.");
            } catch (ResourceInUseException re) {
                // if stream exists, try to delete it and create it again
                Log.d(TAG, "Stream already exists. Deleting...");
                waitUntilStreamIsDeleted(client);
            }
        } while (!streamIsCreated);

    }

    @Before
    public void setup() throws InterruptedException, JSONException {
        client = makeClient();

        try {
            shards = getShardsAfterStreamIsReady(client, NUM_SHARDS);
        } catch (LimitExceededException e) {
            Log.d(TAG, "limit exceeded, make sure test account hasn't exceeded shard limit");
            throw e;
        }

        directory = makeDirectory();
        recorder = makeRecorder(directory, false);
    }

    @Test
    public void testPut() {
        // batch 5 records with 5 partition keys
        int i = 0;
        for (; i < 5; i++) {
            String dataStr = DATA_STRING_PREFIX + DELIMITER + String.valueOf(i);
            dataRecordSet.add(dataStr);
            recorder.saveRecord(dataStr.getBytes(StringUtils.UTF8), STREAM_NAME);
        }

        recorder.submitAllRecords();

        // submit one record
        String parKey = "PartitionKey" + i;
        String dataStr = DATA_STRING_PREFIX + DELIMITER + parKey;
        dataRecordSet.add(dataStr);
        recorder.saveRecord(dataStr.getBytes(StringUtils.UTF8), STREAM_NAME);

        recorder.submitAllRecords();

        try {
            Log.d(TAG, "Sleeping for 10 seconds");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.interrupted();
        }

        Log.d(TAG, "Reading records");
        Set partitionKeys = new HashSet();

        readRecordsFromKinesis(partitionKeys);

        if (!dataRecordSet.isEmpty()) {
            Log.e(TAG, "Missing records from shards.");
            Log.e(TAG, "Sleeping for 10 more seconds and trying again");
            try {
                Log.d(TAG, "Sleeping for 10 seconds");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            readRecordsFromKinesis(partitionKeys);
            assertTrue("Still missing records from shards.", dataRecordSet.isEmpty());
        }
    }

    @Test
    public void testReadEmptyLines() throws IOException {
        //Note: Same logic handles null line check
        
        final String streamName = "stream34";

        final FileManager fileManager = new FileManager(directory);
        final FileRecordStore recordStore = new FileRecordStore(directory,
                Constants.RECORDS_FILE_NAME, 100L);

        final File recordsDirectory = fileManager.getDirectory(Constants.RECORDS_DIRECTORY);
        final File recordsFile = new File(recordsDirectory, Constants.RECORDS_FILE_NAME);
        
        final PrintWriter out = new PrintWriter(recordsFile);
        out.println();
        out.println(streamName + ",base64string");
        out.close();
        
        Log.d(TAG, "Reading next batch of records...");
        final String nextStream = recorder.nextBatch(recordStore.iterator(), new ArrayList<byte[]>(), 3, 1024);
        Log.d(TAG, "Finished reading records.");
        
        assertTrue("Stream should not be null due to corrupt line in file.",
                   streamName.equals(nextStream));
    }

    @Test
    public void testReadCorruptLines() throws IOException {
        final String streamName = "stream34";

        final FileManager fileManager = new FileManager(directory);
        final FileRecordStore recordStore = new FileRecordStore(directory,
                Constants.RECORDS_FILE_NAME, 100L);

        final File recordsDirectory = fileManager.getDirectory(Constants.RECORDS_DIRECTORY);
        final File recordsFile = new File(recordsDirectory, Constants.RECORDS_FILE_NAME);
        
        final PrintWriter out = new PrintWriter(recordsFile);
        out.println("_____");
        out.println(streamName + ",base64string");
        out.close();
        
        Log.d(TAG, "Reading next batch of records...");
        final String nextStream = recorder.nextBatch(recordStore.iterator(), new ArrayList<byte[]>(), 3, 1024);
        Log.d(TAG, "Finished reading records.");
        
        assertTrue("Stream should not be null due to corrupt line in file.",
        		   streamName.equals(nextStream));
    }

    @Test
    public void testPutWithGzip() {
        boolean wasGzipEnabled = recorder.getKinesisRecorderConfig().getClientConfiguration().isEnableGzip();

        recorder.getKinesisRecorderConfig().getClientConfiguration().setEnableGzip(true);

        // batch 25 records with 5 partition keys. A large payload is necessary to trigger a gzip
        // encoded response from the service
        int i = 0;
        for (i = 0; i < 25; i++) {
            String dataStr = DATA_STRING_PREFIX + DELIMITER + String.valueOf(i);
            dataRecordSet.add(dataStr);
            recorder.saveRecord(dataStr.getBytes(StringUtils.UTF8), STREAM_NAME);
        }

        recorder.submitAllRecords();

        // submit one record
        String parKey = "PartitionKey" + i;
        String dataStr = DATA_STRING_PREFIX + DELIMITER + parKey;
        dataRecordSet.add(dataStr);
        recorder.saveRecord(dataStr.getBytes(StringUtils.UTF8), STREAM_NAME);

        recorder.submitAllRecords();

        try {
            Log.d(TAG, "Sleeping for 10 seconds");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.interrupted();
        }

        Log.d(TAG, "Reading records");
        Set partitionKeys = new HashSet();

        readRecordsFromKinesis(partitionKeys);

        if (!dataRecordSet.isEmpty()) {
            Log.e(TAG, "Missing records from shards.");
            Log.e(TAG, "Sleeping for 10 more seconds and trying again");
            try {
                Log.d(TAG, "Sleeping for 10 seconds");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            readRecordsFromKinesis(partitionKeys);
            assertTrue("Still missing records from shards.", dataRecordSet.isEmpty());
        }

        recorder.getKinesisRecorderConfig().getClientConfiguration().setEnableGzip(wasGzipEnabled);

    }

    private void readRecordsFromKinesis(Set partitionKeys) {
        for (Shard shard : shards) {
            String shardId = shard.getShardId();
            Log.d(TAG, "Reading from shard: " + shardId);

            GetShardIteratorRequest getShardIterRq = new GetShardIteratorRequest();
            getShardIterRq.setStreamName(STREAM_NAME);
            getShardIterRq.setShardId(shardId);
            getShardIterRq.setShardIteratorType(ShardIteratorType.TRIM_HORIZON);

            GetShardIteratorResult getShardIterRslt = client.getShardIterator(getShardIterRq);

            GetRecordsRequest getRecordsRq = new GetRecordsRequest();
            getRecordsRq.setShardIterator(getShardIterRslt.getShardIterator());
            getRecordsRq.setLimit(100);

            GetRecordsResult getRecordResult = client.getRecords(getRecordsRq);

            int currShardResultCount = 0;
            for (Record r : getRecordResult.getRecords()) {
                String recordStr = new String(r.getData().array(), StringUtils.UTF8);
                ++currShardResultCount;
                Log.d(TAG, "Retrieved a total of " + currShardResultCount + " records from shard "
                        + shardId);
                if (partitionKeys != null && dataRecordSet.contains(recordStr)) {
                    String partitionKey = r.getPartitionKey();
                    assertTrue("There are duplicated partition keys", !partitionKeys.contains(partitionKey));
                    partitionKeys.add(partitionKey);
                }
                dataRecordSet.remove(recordStr);
            }
        }

        assertTrue(dataRecordSet.isEmpty());
    }

    // Static utility methods

    private static AmazonKinesisClient makeClient() throws JSONException {
        AmazonKinesisClient client = new AmazonKinesisClient(makeCredentialsProvider());
        return client;
    }

    private static KinesisRecorder makeRecorder(File directory, boolean gzipEnabled) throws JSONException {
        KinesisRecorderConfig recorderConfig = new KinesisRecorderConfig();
        recorderConfig.getClientConfiguration().setEnableGzip(gzipEnabled);
        KinesisRecorder recorder = new KinesisRecorder(directory, Regions.US_EAST_1,
                makeCredentialsProvider(), recorderConfig);
        return recorder;
    }

    private static AWSCredentialsProvider makeCredentialsProvider() throws JSONException {
        Context appContext = InstrumentationRegistry.getTargetContext();
        String identityPoolId = getPackageConfigure().getString("identity_pool_id");
        AWSCredentialsProvider provider = new CognitoCachingCredentialsProvider(appContext,
                identityPoolId, Regions.US_EAST_1);
        return provider;
    }

    private static File makeDirectory() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        File directory = new File(appContext.getApplicationContext().getFilesDir(), DIR_NAME);
        directory.mkdir();
        return directory;
    }

    private static List<Shard> getShardsAfterStreamIsReady(AmazonKinesisClient client, int numShards)
            throws InterruptedException {
        long giveUpTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(45);
        while (System.currentTimeMillis() < giveUpTimeMillis) {
            Thread.sleep(1000);
            DescribeStreamResult describeStream = client.describeStream(STREAM_NAME);
            StreamDescription streamDescription = describeStream.getStreamDescription();
            List<Shard> shards = streamDescription.getShards();
            if (shards == null || shards.size() != numShards) {
                continue;
            }
            Log.d(TAG, "Stream is ready for use.");
            return shards;
        }
        return null;
    }

    private static boolean waitUntilStreamIsDeleted(AmazonKinesisClient client) {
        // delete stream
        int retries = 1;
        while (true) {
            try {
                client.deleteStream(STREAM_NAME);
                break;
            } catch (Exception e) {
                retries++;
                if (retries > 3) {
                    Log.e(TAG, "Encountered an exception when deleting the stream.", e);
                    return false;
                }
            }
        }

        // wait till stream is deleted
        retries = 1;
        while (true) {
            try {
                Thread.sleep(retries * 1000);
                client.describeStream(STREAM_NAME);
                Log.d(TAG, "Stream is still not deleted... waiting " + retries
                        + "  second(s)");
            } catch (Exception e) {
                if (e instanceof ResourceNotFoundException) {
                    return true;
                }
            }

            retries++;
            if (retries > 30) {
                throw new RuntimeException(
                        "Stream still exists after deleting. Consider refactoring in case of eventual consistency");
            }
        }
    }

}
