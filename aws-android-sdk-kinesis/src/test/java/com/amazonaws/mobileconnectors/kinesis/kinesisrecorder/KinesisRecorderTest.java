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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.Constants;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.FileRecordStore.RecordIterator;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.JSONRecordAdapter;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.services.kinesis.model.PutRecordsResult;
import com.amazonaws.services.kinesis.model.PutRecordsResultEntry;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class KinesisRecorderTest {

    private static final File TEST_DIRECTORY = new File("KinesisRecorderTest");
    private static final String STREAM_NAME = "TestStream";
    private static final AWSCredentialsProvider CREDENTIALS_PROVIDER = new StaticCredentialsProvider(
            new AnonymousAWSCredentials());

    private KinesisRecorder recorder;
    private File recordDirectory;
    private File recordFile;

    @Before
    public void setup() throws IOException {
        if (!TEST_DIRECTORY.exists()) {
            assertTrue(TEST_DIRECTORY.mkdir());
        }

        recorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1, CREDENTIALS_PROVIDER);

        recordDirectory = new File(TEST_DIRECTORY, Constants.RECORDS_DIRECTORY);
        if (!recordDirectory.exists()) {
            recordDirectory.mkdir();
        }

        recordFile = new File(recordDirectory, Constants.RECORDS_FILE_NAME);

        if (recordFile.exists()) {
            assertTrue(recordFile.delete());
            assertTrue(recordFile.createNewFile());
        }

    }

    @After
    public void teardown() {
        if (TEST_DIRECTORY.exists()) {
            if (recordDirectory.exists()) {
                if (recordFile.exists()) {
                    assertTrue(recordFile.delete());
                }
                assertTrue(recordDirectory.delete());
            }
            assertTrue(TEST_DIRECTORY.delete());
        }

    }

    @Test
    public void testGetDiskBytesUsed() throws IOException {

        assertTrue(recordFile.exists());
        assertTrue(recordFile.isFile());

        assertEquals(recordFile.length(), 0L);
        recorder.saveRecord("test".getBytes(), STREAM_NAME);

        assertEquals(recorder.getDiskBytesUsed(), recordFile.length());
        assertTrue(recorder.getDiskBytesUsed() > 0 && recorder.getDiskBytesUsed() < 200);
    }

    @Test
    public void testDeleteAllRecords() throws IOException {
        // empty file
        assertEquals(recordFile.length(), 0L);
        recorder.deleteAllRecords();
        assertEquals(recordFile.length(), 0L);

        // test deletion with single record
        String data = "TestData";
        recorder.saveRecord(data.getBytes(), STREAM_NAME);

        Long singleRecordLength = recordFile.length();

        assertTrue("KinesisRecorder is not saving to file as we expect", singleRecordLength > 0L);
        recorder.deleteAllRecords();
        assertEquals(recordFile.length(), 0L);

        // test deletion with multiple records
        Long tempLength = 0L;
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(data.getBytes(), STREAM_NAME);
            assertTrue("KinesisRecorder is not saving to file as we expect",
                    recordFile.length() > tempLength);
            tempLength += singleRecordLength;
        }
        recorder.deleteAllRecords();
        assertEquals(recordFile.length(), 0L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullRecord() throws IOException {
        recorder.saveRecord(null, "stream");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyData() throws IOException {
        byte[] data = new byte[0];
        recorder.saveRecord(data, "stream");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStream() throws IOException {
        recorder.saveRecord("valid".getBytes(), "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullStream() throws IOException {
        recorder.saveRecord("valid".getBytes(), null);
    }

    @Test
    public void getDiskByteLimit() {
        KinesisRecorderConfig config = new KinesisRecorderConfig();
        KinesisRecorder byteLimitRecorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1,
                CREDENTIALS_PROVIDER, config);

        assertEquals(byteLimitRecorder.getDiskByteLimit(), config.getMaxStorageSize());
    }

    @Test
    public void testBelongsInBatchSameStreamName() throws JSONException {

        PutRecordRequest req = new PutRecordRequest();
        byte[] data = new String("data").getBytes();
        req.withStreamName("Stream1").withPartitionKey("TestKey")
                .withData(ByteBuffer.wrap(data));
        JSONObject entry = new JSONRecordAdapter().translateFromRecord(req);

        assertTrue(recorder.belongsInBatch(entry, "Stream1", new HashSet<PutRecordsRequestEntry>()));
    }

    @Test
    public void testBelongsInBatchDifferentStreamName() throws JSONException {

        PutRecordRequest req = new PutRecordRequest();
        byte[] data = new String("data").getBytes();
        req.withStreamName("Stream1").withPartitionKey("TestKey")
                .withData(ByteBuffer.wrap(data));
        JSONObject entry = new JSONRecordAdapter().translateFromRecord(req);

        assertFalse(recorder
                .belongsInBatch(entry, "Stream2", new HashSet<PutRecordsRequestEntry>()));
    }

    @Test
    public void testBelongsInBatchMaxEntriesExceeded() throws JSONException {

        PutRecordRequest req = new PutRecordRequest();
        byte[] data = new String("data").getBytes();
        req.withStreamName("Stream1").withPartitionKey("TestKey")
                .withData(ByteBuffer.wrap(data));
        JSONObject entry = new JSONRecordAdapter().translateFromRecord(req);

        Set<PutRecordsRequestEntry> entrySet = new HashSet<PutRecordsRequestEntry>();

        for (int i = 0; i <= Constants.PUT_RECORDS_MAX_RECORDS; i++) {
            PutRecordsRequestEntry record = new PutRecordsRequestEntry();
            record.withData(ByteBuffer.wrap(String.valueOf(i).getBytes()));
            entrySet.add(record);
        }

        assertFalse(recorder.belongsInBatch(entry, "Stream1", entrySet));
    }

    @Test
    public void testGetRecursiveSizeOfDirectory() throws IOException {

        File topDir = new File("topDir");
        File bottomDir = new File(topDir, "bottomDir");
        File topFile = new File(topDir, "topFile");
        File bottomFile = new File(bottomDir, "bottomFile");
        FileOutputStream topFos = null;
        FileOutputStream bottomFos = null;
        try {
            topDir.mkdir();
            bottomDir.mkdir();
            topFile.createNewFile();
            bottomFile.createNewFile();
            topFos = new FileOutputStream(topFile);
            bottomFos = new FileOutputStream(bottomFile);

            String topContent = "topContent";
            String bottomContent = "bottomContent";
            int totalLength = topContent.getBytes().length + bottomContent.getBytes().length;

            topFos.write(topContent.getBytes());
            bottomFos.write(bottomContent.getBytes());

            assertEquals(recorder.getRecursiveSizeOfDirectory(topDir), totalLength);

        } finally {
            if (topFos != null)
                topFos.close();

            if (bottomFos != null)
                bottomFos.close();

            bottomFile.delete();
            bottomDir.delete();
            topFile.delete();
            topDir.delete();
        }
    }

    @Test
    public void testNonRecoverableErrors() {

        assertFalse(recorder.isRecoverable("ValidationError"));
        assertFalse(recorder.isRecoverable("MissingParameter"));
        assertFalse(recorder.isRecoverable("MissingAction"));
        assertFalse(recorder.isRecoverable("MalformedQueryString"));
        assertFalse(recorder.isRecoverable("InvalidQueryParameter"));
        assertFalse(recorder.isRecoverable("InvalidParameterValue"));
        assertFalse(recorder.isRecoverable("InvalidParameterCombination"));
        assertFalse(recorder.isRecoverable("InvalidAction"));
        assertFalse(recorder.isRecoverable("InvalidArgumentException"));
    }

    @Test
    public void testGetConfig() {
        KinesisRecorderConfig testConfig = new KinesisRecorderConfig().withMaxStorageSize(100);
        KinesisRecorder configRecorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1,
                CREDENTIALS_PROVIDER, testConfig);
        assertEquals(testConfig.getMaxStorageSize(), configRecorder.getKinesisRecorderConfig()
                .getMaxStorageSize());
    }

    @Test
    public void testSavingRecoverableRecordAfterSubmit() throws JSONException, IOException {

        PutRecordsResult mockResult = new PutRecordsResult();
        List<PutRecordsResultEntry> resultList = new ArrayList<PutRecordsResultEntry>();

        PutRecordsResultEntry fineEntry = new PutRecordsResultEntry();
        fineEntry.withShardId("TestId");
        resultList.add(fineEntry);

        PutRecordsResultEntry recoverableEntry = new PutRecordsResultEntry();
        recoverableEntry.withErrorCode("ProvisionedThroughputExceededException");
        resultList.add(recoverableEntry);

        mockResult.withRecords(resultList);

        KinesisRecorder submitRecorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1,
                CREDENTIALS_PROVIDER);

        assertEquals(submitRecorder.getDiskBytesUsed(), 0L);

        AmazonKinesisClient mockClient = Mockito.mock(AmazonKinesisClient.class);
        when(mockClient.putRecords(any(PutRecordsRequest.class))).thenReturn(mockResult);

        submitRecorder.client = mockClient;

        String testStream = "testStream";
        List<PutRecordsRequestEntry> entries = new ArrayList<PutRecordsRequestEntry>();
        entries.add(new PutRecordsRequestEntry().withData(ByteBuffer.wrap("FineData".getBytes())));
        PutRecordsRequestEntry badEntry = new PutRecordsRequestEntry().withData(ByteBuffer
                .wrap("BadData".getBytes()));
        entries.add(badEntry);

        submitRecorder.submit(testStream, entries);

        RecordIterator itr = submitRecorder.recordStore.iterator();
        int size = 0;
        String last = null;
        while (itr.hasNext()) {
            size++;
            last = itr.next();
        }

        assertEquals(size, 1);

        assertArrayEquals(JSONRecordAdapter.getData(new JSONObject(last)).array(), badEntry
                .getData()
                .array());
    }

    @Test
    public void testRemovingNonRecoverableRecordAfterSubmit() throws JSONException, IOException {

        PutRecordsResult mockResult = new PutRecordsResult();
        List<PutRecordsResultEntry> resultList = new ArrayList<PutRecordsResultEntry>();

        PutRecordsResultEntry fineEntry = new PutRecordsResultEntry();
        fineEntry.withShardId("TestId");
        resultList.add(fineEntry);

        PutRecordsResultEntry recoverableEntry = new PutRecordsResultEntry();
        recoverableEntry.withErrorCode("ValidationError");
        resultList.add(recoverableEntry);

        mockResult.withRecords(resultList);

        KinesisRecorder submitRecorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1,
                CREDENTIALS_PROVIDER);

        assertEquals(submitRecorder.getDiskBytesUsed(), 0L);

        AmazonKinesisClient mockClient = Mockito.mock(AmazonKinesisClient.class);
        when(mockClient.putRecords(any(PutRecordsRequest.class))).thenReturn(mockResult);

        submitRecorder.client = mockClient;

        String testStream = "testStream";
        List<PutRecordsRequestEntry> entries = new ArrayList<PutRecordsRequestEntry>();
        entries.add(new PutRecordsRequestEntry().withData(ByteBuffer.wrap("FineData".getBytes())));
        PutRecordsRequestEntry badEntry = new PutRecordsRequestEntry().withData(ByteBuffer
                .wrap("ValidationErrorData".getBytes()));
        entries.add(badEntry);

        submitRecorder.submit(testStream, entries);

        RecordIterator itr = submitRecorder.recordStore.iterator();
        int size = 0;
        while (itr.hasNext()) {
            size++;
            itr.next();
        }

        assertEquals(size, 0);
    }

    @Test
    public void testSavingRecoverableExceptionAfterSubmit() throws JSONException, IOException {
        AmazonServiceException ThroughputException = new AmazonServiceException("Test");
        ThroughputException.setErrorCode("ThroughputException");

        KinesisRecorder submitRecorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1,
                CREDENTIALS_PROVIDER);
        AmazonKinesisClient mockClient = Mockito.mock(AmazonKinesisClient.class);
        when(mockClient.putRecords(any(PutRecordsRequest.class))).thenThrow(ThroughputException);

        submitRecorder.client = mockClient;

        String testStream = "testStream";
        List<PutRecordsRequestEntry> entries = new ArrayList<PutRecordsRequestEntry>();
        PutRecordsRequestEntry badEntry = new PutRecordsRequestEntry().withData(ByteBuffer
                .wrap("ThroughputException".getBytes()));
        entries.add(badEntry);

        try {
            submitRecorder.submit(testStream, entries);
        } catch (AmazonServiceException e) {
            assertEquals(e.getErrorCode(), "ThroughputException");
        }

        RecordIterator itr = submitRecorder.recordStore.iterator();
        int size = 0;
        String last = null;
        while (itr.hasNext()) {
            size++;
            last = itr.next();
        }

        assertEquals(size, 1);

        assertArrayEquals(JSONRecordAdapter.getData(new JSONObject(last)).array(), badEntry
                .getData()
                .array());
    }

    @Test
    public void testSuccessfulSubmitAllWithMultipleStreamsRemovesAllRecordsOnDisk()
            throws IOException {

        KinesisRecorder submitRecorder = new KinesisRecorder(TEST_DIRECTORY, Regions.US_EAST_1,
                CREDENTIALS_PROVIDER);

        assertEquals(submitRecorder.getDiskBytesUsed(), 0L);

        submitRecorder.saveRecord("test1".getBytes(), "testStream");
        submitRecorder.saveRecord("test2".getBytes(), "testStream2");

        assertTrue(submitRecorder.getDiskBytesUsed() > 0L);

        AmazonKinesisClient mockClient = Mockito.mock(AmazonKinesisClient.class);
        when(mockClient.putRecords(any(PutRecordsRequest.class))).thenReturn(
                Mockito.mock(PutRecordsResult.class));

        submitRecorder.client = mockClient;

        submitRecorder.submitAllRecords();

        assertEquals(submitRecorder.getDiskBytesUsed(), 0L);
    }

}
