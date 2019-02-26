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
import org.junit.Before;
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

    // directory where Kinesis Recorder saves records
    private File directory;
    private static final String DIR_NAME = "KinesisRecorderDirectory";
    private static final String STREAM_NAME = "Android_" + TAG;

    private KinesisRecorder recorder;
    private boolean initCompleted = false;
    private final Set<String> dataRecordSet = new HashSet<String>();
    private List<Shard> shards;
    private AmazonKinesisClient client;

    @Before
    public void setup() throws InterruptedException, JSONException {

        Context appContext = InstrumentationRegistry.getTargetContext();
        if (!initCompleted) {
            AWSCredentialsProvider provider = new CognitoCachingCredentialsProvider(appContext,
                    getPackageConfigure().getString("identity_pool_id"), Regions.US_EAST_1);

            client = new AmazonKinesisClient(provider);

            int numShards = 5;

            // Create the stream for our tests
            boolean streamIsCreated = false;
            do {
                try {
                    Log.d(TAG, "Creating stream, this may take some time");
                    client.createStream(STREAM_NAME, numShards);
                    Log.d(TAG, "Stream created, getting shards");
                    shards = getShardsAfterStreamIsReady(numShards);
                    streamIsCreated = true;
                    Log.d(TAG, "Stream is created.");
                } catch (ResourceInUseException re) {
                    // if stream exists, try to delete it and create it again
                    Log.d(TAG, "Stream already exists. Deleting...");
                    waitUntilStreamIsDeleted();
                } catch (LimitExceededException e) {
                    Log.d(TAG, "limit exceeded, going to retry with less shards");
                    if (numShards > 1) {
                        numShards--;
                    } else {
                        throw e;
                    }
                }
            } while (!streamIsCreated);

            directory = new File(appContext.getApplicationContext().getFilesDir(), DIR_NAME);
            directory.mkdir();
            recorder = new KinesisRecorder(directory, Regions.US_EAST_1, provider);
            initCompleted = true;
        }
    }
    @Test
    public void testPut() {
        // batch 5 records with 5 partition keys
        int i = 0;
        for (i = 0; i < 5; i++) {
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

    private List<Shard> getShardsAfterStreamIsReady(int numShards)
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

    private boolean waitUntilStreamIsDeleted() {
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
                        "Stream still exists after deleting.  Consider refactoring incase of eventual consistency");
            }
        }
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
                if(partitionKeys != null && dataRecordSet.contains(recordStr)) {
                    String partitionKey = r.getPartitionKey();
                    assertTrue("There are duplicated partition keys", !partitionKeys.contains(partitionKey));
                    partitionKeys.add(partitionKey);
                }
                dataRecordSet.remove(recordStr);

            }
        }

        assertTrue(dataRecordSet.isEmpty());
    }
}
