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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsResult;
import com.amazonaws.services.kinesis.model.PutRecordsResultEntry;
import com.amazonaws.services.kinesisfirehose.model.InvalidArgumentException;
import com.amazonaws.util.StringUtils;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class KinesisStreamRecordSenderTest {
 
    private static final String USER_AGENT = "test_agent";

    private KinesisStreamRecordSender sender;
    private AmazonKinesis client;
    

    @Before
    public void setup() {
        client = Mockito.mock(AmazonKinesis.class);
        sender = new KinesisStreamRecordSender(client, USER_AGENT);
    }

    @Test
    public void testSendBatch() {
        String streamName = "stream";
        int count = 10;

        // create an ok result
        PutRecordsResult result = new PutRecordsResult();
        List<PutRecordsResultEntry> entries = new ArrayList<PutRecordsResultEntry>();
        result.setFailedRecordCount(0);
        for (int i = 0; i < count; i++) {
            PutRecordsResultEntry entry = new PutRecordsResultEntry();
            entry.setSequenceNumber("record_id_" + i);
            entries.add(entry);
        }
        result.setRecords(entries);

        // create data
        List<byte[]> data = new ArrayList<byte[]>();
        for (int i = 0; i < count; i++) {
            data.add(("record" + i).getBytes(StringUtils.UTF8));
        }
        Mockito.when(client.putRecords(any(PutRecordsRequest.class))).thenReturn(result);
        List<byte[]> failures = sender.sendBatch(streamName, data);

        ArgumentCaptor<PutRecordsRequest> argument = ArgumentCaptor
                .forClass(PutRecordsRequest.class);
        Mockito.verify(client).putRecords(argument.capture());

        String userAgent = argument.getValue().getRequestClientOptions()
                .getClientMarker(Marker.USER_AGENT);

        final List<PutRecordsRequestEntry> records  = argument.getValue().getRecords();
        HashSet partitionKeys = new HashSet();
        for(PutRecordsRequestEntry record:records)
        {
            String partitionKey = record.getPartitionKey();
            assertFalse("There are duplicated partition keys", partitionKeys.contains(partitionKey));
            partitionKeys.add(partitionKey);

        }


        // For some reason userAgent has a leading space
        assertTrue("user agent", userAgent.contains(USER_AGENT));
        assertTrue("no failures", failures.isEmpty());
    }

    @Test
    public void testSendBatchWithFailure() {
        String streamName = "stream";
        int count = 10;

        // create a result with failures
        PutRecordsResult result = new PutRecordsResult();
        List<PutRecordsResultEntry> entries = new ArrayList<PutRecordsResultEntry>();
        result.setFailedRecordCount(5);
        for (int i = 0; i < count; i++) {
            PutRecordsResultEntry entry = new PutRecordsResultEntry();
            // fail every other record
            if (i % 2 == 0) {
                entry.setSequenceNumber("record_id_" + i);
            } else {
                entry.setErrorCode("ServiceUnavailable");
            }
            entries.add(entry);
        }
        result.setRecords(entries);

        // create data
        List<byte[]> data = new ArrayList<byte[]>();
        for (int i = 0; i < count; i++) {
            data.add(("record" + i).getBytes(StringUtils.UTF8));
        }
        Mockito.when(client.putRecords(any(PutRecordsRequest.class))).thenReturn(result);
        List<byte[]> failures = sender.sendBatch(streamName, data);

        assertTrue("has 5 failures", failures.size() == 5);
        for (int i = 0; i < 5; i++) {
            String failedRecordString = "record" + (i * 2 + 1);
            assertEquals(failedRecordString, new String(failures.get(i), StringUtils.UTF8));
        }
    }

    @Test(expected = AmazonClientException.class)
    public void testSendBatchException() {
        String streamName = "stream";
        int count = 10;

        // create an ok result
        PutRecordsResult result = new PutRecordsResult();
        List<PutRecordsResultEntry> entries = new ArrayList<PutRecordsResultEntry>();
        result.setFailedRecordCount(0);
        for (int i = 0; i < count; i++) {
            PutRecordsResultEntry entry = new PutRecordsResultEntry();
            entry.setSequenceNumber("record_id_" + i);
            entries.add(entry);
        }
        result.setRecords(entries);

        // create data
        List<byte[]> data = new ArrayList<byte[]>();
        for (int i = 0; i < count; i++) {
            data.add(("record" + i).getBytes(StringUtils.UTF8));
        }
        Mockito.when(client.putRecords(any(PutRecordsRequest.class))).thenThrow(
                new InvalidArgumentException("invalid argument"));
        sender.sendBatch(streamName, data);
    }

    @Test
    public void testIsRecoverableClientException() {
        AmazonClientException aceNoCause = new AmazonClientException("failure");
        assertFalse(sender.isRecoverable(aceNoCause));
        AmazonClientException aceOtherCause = new AmazonClientException("failure",
                new NullPointerException());
        assertFalse(sender.isRecoverable(aceOtherCause));
        AmazonClientException aceWithIOException = new AmazonClientException("failure",
                new IOException());
        assertTrue(sender.isRecoverable(aceWithIOException));
    }

    @Test
    public void testIsRecoverableServiceException() {
        assertFalse(sender.isRecoverable(getServiceException("")));
        assertTrue(sender.isRecoverable(getServiceException("InternalFailure")));
        assertTrue(sender.isRecoverable(getServiceException("ServiceUnavailable")));
        assertTrue(sender.isRecoverable(getServiceException("Throttling")));
        assertTrue(sender
                .isRecoverable(getServiceException("ProvisionedThroughputExceededException")));
    }

    private AmazonServiceException getServiceException(String errorCode) {
        AmazonServiceException ase = new AmazonServiceException("some error message");
        ase.setErrorCode(errorCode);
        return ase;
    }
}
