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

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore.RecordIterator;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.UUID;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class KinesisRecorderTest {

    private static final String WORKING_DIRECTORY = "KinesisRecorderTest";

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    private AWSCredentialsProvider provider;
    private KinesisRecorder recorder;

    @Before
    public void setup() throws IOException {
        provider = new StaticCredentialsProvider(new AnonymousAWSCredentials());
        recorder = new KinesisRecorder(temp.newFolder(WORKING_DIRECTORY), Regions.US_EAST_1,
                provider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullRecord() throws IOException {
        recorder.saveRecord((byte[]) null, "stream");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyData() throws IOException {
        byte[] data = new byte[0];
        recorder.saveRecord(data, "stream");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStream() throws IOException {
        recorder.saveRecord("valid".getBytes(StringUtils.UTF8), "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullStream() throws IOException {
        recorder.saveRecord("valid".getBytes(StringUtils.UTF8), null);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testUpgrade() throws Exception {
        File directory = temp.newFolder();
        FileRecordStore recordStore = new FileRecordStore(directory, Constants.RECORDS_FILE_NAME,
                5 * 1024 * 1024);
        String streamName = "stream";
        int length = 1024;
        JSONRecordAdapter adapter = new JSONRecordAdapter();
        for (int i = 0; i < 10; i++) {
            PutRecordRequest req = new PutRecordRequest();
            req.setStreamName(streamName);
            byte[] bytes = randomBytes(length);
            req.setData(ByteBuffer.wrap(bytes));
            req.setPartitionKey(UUID.randomUUID().toString());
            recordStore.put(adapter.translateFromRecord(req).toString());
        }

        recorder = new KinesisRecorder(directory, Regions.US_EAST_1, provider);
        Thread.sleep(1000);
        RecordIterator iterator = recorder.recordStore.iterator();
        FileRecordParser frp = new FileRecordParser();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            frp.parse(iterator.next());
            assertEquals("same stream", streamName, frp.streamName);
            assertEquals("same data length", length, frp.bytes.length);
        }
        assertEquals("has 10 records from upgrade", 10, count);
    }

    private byte[] randomBytes(int length) {
        byte[] data = new byte[length];
        new Random().nextBytes(data);
        return data;
    }
}
