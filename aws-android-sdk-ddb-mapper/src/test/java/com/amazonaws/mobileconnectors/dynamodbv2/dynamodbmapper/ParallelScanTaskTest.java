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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParallelScanTaskTest {

    private static final String TABLE = "testTable";
    private static final AmazonDynamoDB mockClient = EasyMock.createMock(AmazonDynamoDB.class);

    @Before
    public void setup() {
        EasyMock.reset(mockClient);
    }

    @Test
    public void getTableName() {

        ScanRequest scan1 = new ScanRequest().withTableName(TABLE);
        ScanRequest scan2 = new ScanRequest().withTableName(TABLE);

        List<ScanRequest> list = new ArrayList<ScanRequest>();
        list.add(scan1);
        list.add(scan2);

        ParallelScanTask testTask = new ParallelScanTask(mockClient, list);

        assertEquals(testTask.getTableName(), TABLE);

    }

    @Test
    public void scanNextPageOfSegmentWithExclusiveStartKey() {
        EasyMock.reset(mockClient);

        ScanRequest scan1 = new ScanRequest().withTableName(TABLE);
        List<ScanRequest> list = new ArrayList<ScanRequest>();
        list.add(scan1);

        Map<String, AttributeValue> lastEvaluatedKey = new HashMap<String, AttributeValue>();
        lastEvaluatedKey.put("TestPrimaryKey", new AttributeValue().withS("Test1"));
        ScanResult result = new ScanResult().withLastEvaluatedKey(lastEvaluatedKey);

        ParallelScanTask testTask = new ParallelScanTask(mockClient, list);

        EasyMock.expect(mockClient.scan(scan1)).andReturn(result);
        EasyMock.replay(mockClient);

        testTask.scanNextPageOfSegment(0, false);

        EasyMock.verify(mockClient);
        EasyMock.reset(mockClient);

        Capture<ScanRequest> captureArgument = new Capture<ScanRequest>();
        ScanResult mockResult = EasyMock.createMock(ScanResult.class);
        EasyMock.expect(mockResult.getLastEvaluatedKey()).andReturn(null).anyTimes();
        EasyMock.expect(mockClient.scan(EasyMock.capture(captureArgument))).andReturn(mockResult);
        EasyMock.replay(mockClient, mockResult);

        testTask.scanNextPageOfSegment(0, true);

        EasyMock.verify(mockClient);
        assertEquals(
                captureArgument.getValue().getExclusiveStartKey().get("TestPrimaryKey").getS(),
                "Test1");
    }

    @Test
    public void scanNextPageOfSegmentWithoutExclusiveStartKey() {
        EasyMock.reset(mockClient);

        ScanRequest scan1 = new ScanRequest().withTableName(TABLE);
        List<ScanRequest> list = new ArrayList<ScanRequest>();
        list.add(scan1);

        Map<String, AttributeValue> lastEvaluatedKey = new HashMap<String, AttributeValue>();
        lastEvaluatedKey.put("TestPrimaryKey", new AttributeValue().withS("Test1"));
        ScanResult result = new ScanResult().withLastEvaluatedKey(lastEvaluatedKey);

        ParallelScanTask testTask = new ParallelScanTask(mockClient, list);

        EasyMock.expect(mockClient.scan(scan1)).andReturn(result);
        EasyMock.replay(mockClient);

        testTask.scanNextPageOfSegment(0, false);

        EasyMock.verify(mockClient);
        EasyMock.reset(mockClient);

        Capture<ScanRequest> captureArgument = new Capture<ScanRequest>();
        ScanResult mockResult = EasyMock.createMock(ScanResult.class);
        EasyMock.expect(mockResult.getLastEvaluatedKey()).andReturn(null).anyTimes();
        EasyMock.expect(mockClient.scan(EasyMock.capture(captureArgument))).andReturn(
                mockResult);
        EasyMock.replay(mockClient, mockResult);

        testTask.scanNextPageOfSegment(0, false);

        EasyMock.verify(mockClient);
        assertNull(captureArgument.getValue().getExclusiveStartKey());
    }

    @Test
    public void testGetNextBatchOfScanResults() {
        EasyMock.reset(mockClient);
        // Test nextBatch with multiple calls correctly handles when some of the
        // scan results have more data
        ScanRequest scan1 = new ScanRequest().withTableName(TABLE).withConditionalOperator("OR");
        ScanRequest scan2 = new ScanRequest().withTableName(TABLE);
        List<ScanRequest> list = new ArrayList<ScanRequest>();
        list.add(scan1);
        list.add(scan2);

        Map<String, AttributeValue> lastEvaluatedKey = new HashMap<String, AttributeValue>();
        lastEvaluatedKey.put("TestPrimaryKey", new AttributeValue().withS("Test1"));
        ScanResult resultWithMoreData = new ScanResult().withLastEvaluatedKey(lastEvaluatedKey);
        ScanResult result2NoMoreData = new ScanResult().withLastEvaluatedKey(null);

        ParallelScanTask testTask = new ParallelScanTask(mockClient, list);

        EasyMock.expect(mockClient.scan(scan1)).andReturn(resultWithMoreData);
        EasyMock.expect(mockClient.scan(scan2)).andReturn(result2NoMoreData);
        EasyMock.replay(mockClient);

        List<ScanResult> firstBatch = testTask.getNextBatchOfScanResults();
        EasyMock.verify(mockClient);
        assertEquals(firstBatch.size(), 2);
        assertTrue(firstBatch.contains(resultWithMoreData));
        assertTrue(firstBatch.contains(result2NoMoreData));

        EasyMock.reset(mockClient);
        EasyMock.expect(mockClient.scan(scan1)).andReturn(result2NoMoreData);
        EasyMock.replay(mockClient);

        List<ScanResult> secondBatch = testTask.getNextBatchOfScanResults();

        EasyMock.verify(mockClient);

        // Odd behavior that it doesn't just returna list of size one. But the
        // existing code just returns the same size list with null entries for
        // completed results
        assertEquals(secondBatch.size(), 2);
        assertEquals(secondBatch.get(0), result2NoMoreData);
        assertNull(secondBatch.get(1));
    }

    @Test
    public void testIsAllSegmentScansFinished() {
        ScanRequest scan1 = new ScanRequest().withTableName(TABLE);
        List<ScanRequest> list = new ArrayList<ScanRequest>();
        list.add(scan1);

        ScanResult resultNoMoreData = new ScanResult().withLastEvaluatedKey(null);

        ParallelScanTask testTask = new ParallelScanTask(mockClient, list);

        EasyMock.expect(mockClient.scan(scan1)).andReturn(resultNoMoreData);
        EasyMock.replay(mockClient);

        List<ScanResult> firstBatch = testTask.getNextBatchOfScanResults();

        assertTrue(testTask.isAllSegmentScanFinished());
    }
}
