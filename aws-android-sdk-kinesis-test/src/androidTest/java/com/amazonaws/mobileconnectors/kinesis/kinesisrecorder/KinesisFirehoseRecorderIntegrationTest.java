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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesisfirehose.model.ResourceNotFoundException;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

public class KinesisFirehoseRecorderIntegrationTest extends KinesisRecorderIntegrationTestBase {

    private static final String STREAM_NAME = "kinesis_firehose_recorder_test_dont_delete";

    private KinesisFirehoseRecorder recorder;
    private AWSCredentialsProvider provider;

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    @Before
    public void setup() throws JSONException {

        provider = new CognitoCredentialsProvider(getPackageConfigure().getString("identity_pool_id"),
                Regions.US_EAST_1);
    }

    @Test
    public void testSubmitRecord() throws IOException {
        recorder = new KinesisFirehoseRecorder(temp.newFolder(), Regions.US_WEST_2, provider);
        final int count = 200;
        final int length = 10 * 1024;
        for (int i = 0; i < count; i++) {
            recorder.saveRecord(randomBytes(length), STREAM_NAME);
        }

        recorder.submitAllRecords();
        assertEquals("all sent", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testInvalidStream() throws IOException {
        recorder = new KinesisFirehoseRecorder(temp.newFolder(), Regions.US_WEST_2, provider);
        final String streamName = "non_existing_stream";
        final int count = 10;
        final int length = 10 * 1024;
        for (int i = 0; i < count; i++) {
            recorder.saveRecord(randomBytes(length), streamName);
        }

        try {
            recorder.submitAllRecords();
            fail("should throw exception");
        } catch (final AmazonClientException ace) {
            assertTrue(ace instanceof ResourceNotFoundException);
        }
        assertEquals("invalid records removed", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testPartitionKey() throws IOException {
        recorder = new KinesisFirehoseRecorder(temp.newFolder(), Regions.US_WEST_2, provider,
                new KinesisRecorderConfig().withPartitionKey(UUID.randomUUID().toString()));
        final int count = 200;
        final int length = 10 * 1024;
        for (int i = 0; i < count; i++) {
            recorder.saveRecord(randomBytes(length), STREAM_NAME);
        }

        recorder.submitAllRecords();
        assertEquals("all sent", 0, recorder.getDiskBytesUsed());
    }

    private byte[] randomBytes(int length) {
        final byte[] data = new byte[length];
        new Random().nextBytes(data);
        return data;
    }
}
