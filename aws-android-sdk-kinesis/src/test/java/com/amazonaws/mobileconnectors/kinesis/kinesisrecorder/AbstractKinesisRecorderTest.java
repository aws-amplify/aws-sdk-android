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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore.RecordIterator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class AbstractKinesisRecorderTest {
    private static final String STREAM_NAME = "mock_stream";
    private static final String RECORD_FILE_NAME = "mock_recorder_file.csv";

    private RecordSender sender;
    private AbstractKinesisRecorder recorder;
    private DeadLetterListener deadLetterListener;

    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    static class MockAbstractKinesisRecorder extends AbstractKinesisRecorder {
        private RecordSender sender;

        protected MockAbstractKinesisRecorder(FileRecordStore recordStore,
                KinesisRecorderConfig config) {
            super(recordStore, config);
        }

        private void setRecordSender(RecordSender sender) {
            this.sender = sender;
        }

        @Override
        protected RecordSender getRecordSender() {
            return sender;
        }
    }

    @Before
    public void setup() throws IOException {
        sender = Mockito.mock(RecordSender.class);
        deadLetterListener = Mockito.mock(DeadLetterListener.class);
        KinesisRecorderConfig config = new KinesisRecorderConfig()
                .withDeadLetterListener(deadLetterListener);
        FileRecordStore recordStore = new FileRecordStore(temp.newFolder(), RECORD_FILE_NAME,
                config.getMaxStorageSize());
        MockAbstractKinesisRecorder mockRecorder = new MockAbstractKinesisRecorder(recordStore,
                config);
        mockRecorder.setRecordSender(sender);
        recorder = mockRecorder;
    }

    @Test
    public void testSaveRecord() {
        assertEquals("no record", 0, recorder.getDiskBytesUsed());
        for (int i = 0; i < 10; i++) {
            long diskUsage = recorder.getDiskBytesUsed();
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
            assertTrue("record saved", recorder.getDiskBytesUsed() > diskUsage);
        }
        recorder.deleteAllRecords();
        assertEquals("no record", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testConfiguration() {
        assertNotNull("configuration", recorder.getKinesisRecorderConfig());
        assertEquals("default disk usage limit", new KinesisRecorderConfig().getMaxStorageSize(),
                recorder.getDiskByteLimit());
    }

    @Test
    public void testNextBatchLimit() throws IOException {
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        List<byte[]> data = new ArrayList<byte[]>();
        RecordIterator iterator;

        iterator = recorder.recordStore.iterator();
        String streamName = recorder.nextBatch(iterator, data, 1, 5 * 1024);
        assertEquals("read 1 records", 1, data.size());
        assertEquals("stream name", STREAM_NAME, streamName);
        iterator.close();

        iterator = recorder.recordStore.iterator();
        recorder.nextBatch(iterator, data, 10, 5 * 1024);
        assertEquals("read 5 records", 5, data.size());
        iterator.close();

        iterator = recorder.recordStore.iterator();
        recorder.nextBatch(iterator, data, 10, 5 * 1024 - 10);
        // allows 1 record to bring the total size over the limit
        assertEquals("read 5 records", 5, data.size());
        iterator.close();
    }

    @Test
    public void testNextBatch() throws IOException {
        int maxCount = 6;
        int maxSize = 10 * 1024;

        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        String anotherStream = "another_stream";
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), anotherStream);
        }
        List<byte[]> data = new ArrayList<byte[]>();

        // read all data
        RecordIterator iterator = recorder.recordStore.iterator();
        iterator = recorder.recordStore.iterator();
        String streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("read 6 records", 6, data.size());
        assertEquals("stream name", STREAM_NAME, streamName);
        streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("read 4 records", 4, data.size());
        assertEquals("stream name", STREAM_NAME, streamName);

        // next batch belongs to a different stream
        streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("read 6 records", 6, data.size());
        assertEquals("stream name", anotherStream, streamName);
        streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("read 4 records", 4, data.size());
        assertEquals("stream name", anotherStream, streamName);

        // reach the end
        streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("no more records", 0, data.size());
        assertNull("no stream", streamName);
        iterator.close();
    }

    @Test
    public void testNextBatchWithRemove() throws IOException {
        int maxCount = 100;
        int maxSize = 100 * 1024;

        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        String anotherStream = "another_stream";
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), anotherStream);
        }
        List<byte[]> data = new ArrayList<byte[]>();

        // read all data
        RecordIterator iterator = recorder.recordStore.iterator();
        iterator = recorder.recordStore.iterator();
        String streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("read 10 records", 10, data.size());
        assertEquals("stream name", STREAM_NAME, streamName);
        iterator.removeReadRecords();
        streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("read 10 records", 10, data.size());
        assertEquals("stream name", anotherStream, streamName);
        iterator.removeReadRecords();
        streamName = recorder.nextBatch(iterator, data, maxCount, maxSize);
        assertEquals("no more records", 0, data.size());
        assertNull("no stream", streamName);
        iterator.close();
        assertEquals("empty record store", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testSubmitAllRecords() {
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        String anotherStream = "another_stream";
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), anotherStream);
        }
        Mockito.when(sender.sendBatch(Mockito.anyString(), Mockito.anyListOf(byte[].class)))
                .thenReturn(new ArrayList<byte[]>());
        recorder.submitAllRecords();
        assertEquals("no records after submitAllRecords", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testSubmitAllRecordsWithRecoverableFailures() {
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        long size = recorder.getDiskBytesUsed();
        AmazonServiceException ase = new AmazonServiceException("some failures");
        Mockito.when(sender.sendBatch(Mockito.anyString(), Mockito.anyListOf(byte[].class)))
                .thenThrow(ase);
        Mockito.when(sender.isRecoverable(ase)).thenReturn(true);
        try {
            recorder.submitAllRecords();
            fail("Should throw exception");
        } catch (AmazonClientException ace) {
            assertSame("same exception", ase, ace);
        }
        assertEquals("no records sent", size, recorder.getDiskBytesUsed());
    }

    @Test
    public void testSubmitAllRecordsWithUnmarshallFailures() {
        List<byte[]> data = new LinkedList<byte[]>();
        for (int i = 0; i < 10; i++) {
            final byte[] data_i = randomBytes(1024);
            data.add(data_i);
            recorder.saveRecord(data_i, STREAM_NAME);
        }
        long size = recorder.getDiskBytesUsed();
        AmazonServiceException ase = new AmazonServiceException("Unable to unmarshall error response");
        Mockito.when(sender.sendBatch(Mockito.anyString(), Mockito.anyListOf(byte[].class)))
                .thenThrow(ase);
        Mockito.when(sender.isRecoverable(ase)).thenReturn(false);
        try {
            recorder.submitAllRecords();
            fail("Should throw exception");
        } catch (AmazonClientException ace) {
            assertSame("same exception", ase, ace);
        }
        Mockito.verify(sender, Mockito.times(2))
                .sendBatch(Mockito.anyString(), Mockito.anyList());

        ArgumentCaptor<String> streamNameCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<List> dataCaptor = ArgumentCaptor.forClass(List.class);

        Mockito.verify(deadLetterListener, Mockito.times(1))
                .onRecordsDropped(streamNameCaptor.capture(), dataCaptor.capture());
        assertEquals("same stream name submitted", STREAM_NAME, streamNameCaptor.getValue());
        List<byte[]> deadData = dataCaptor.getValue();
        assertEquals("same data submitted", data.size(), deadData.size());
        for (int i = 0; i < data.size(); ++i) {
            assertTrue("same data submitted", Arrays.equals(data.get(i), deadData.get(i)));
        }
        assertEquals("records removed to keep streaming", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testSubmitAllRecordsWithNonRecoverableFailures() {
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        AmazonServiceException ase = new AmazonServiceException("some failures");
        Mockito.when(sender.sendBatch(Mockito.anyString(), Mockito.anyListOf(byte[].class)))
                .thenThrow(ase);
        Mockito.when(sender.isRecoverable(ase)).thenReturn(false);
        try {
            recorder.submitAllRecords();
            fail("Should throw exception");
        } catch (AmazonClientException ace) {
            assertSame("same exception", ase, ace);
        }
        assertEquals("records removed", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testSubmitAllRecordsWithPartialFailures() {
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        Mockito.when(sender.sendBatch(Mockito.anyString(), Mockito.anyListOf(byte[].class)))
                // one of the records fails, but succeeds the next time
                .thenReturn(Arrays.asList(randomBytes(1024)))
                .thenReturn(new ArrayList<byte[]>());
        recorder.submitAllRecords();
        assertEquals("records removed", 0, recorder.getDiskBytesUsed());
    }

    @Test
    public void testSubmitAllRecordsWithPartialFailuresExceedsMaxRetry() {
        for (int i = 0; i < 10; i++) {
            recorder.saveRecord(randomBytes(1024), STREAM_NAME);
        }
        Mockito.when(sender.sendBatch(Mockito.anyString(), Mockito.anyListOf(byte[].class)))
                // one of the records always failes
                .thenReturn(Arrays.asList(randomBytes(1024)));
        recorder.submitAllRecords();
        assertTrue("records not removed", recorder.getDiskBytesUsed() > 0);
    }

    private byte[] randomBytes(int length) {
        byte[] data = new byte[length];
        new Random().nextBytes(data);
        return data;
    }
}
