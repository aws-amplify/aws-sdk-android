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

package com.amazonaws.services.kinesis;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.kinesis.model.CreateStreamRequest;
import com.amazonaws.services.kinesis.model.DeleteStreamRequest;
import com.amazonaws.services.kinesis.model.DescribeStreamRequest;
import com.amazonaws.services.kinesis.model.DescribeStreamResult;
import com.amazonaws.services.kinesis.model.GetRecordsRequest;
import com.amazonaws.services.kinesis.model.GetRecordsResult;
import com.amazonaws.services.kinesis.model.GetShardIteratorRequest;
import com.amazonaws.services.kinesis.model.GetShardIteratorResult;
import com.amazonaws.services.kinesis.model.HashKeyRange;
import com.amazonaws.services.kinesis.model.InvalidArgumentException;
import com.amazonaws.services.kinesis.model.ListStreamsRequest;
import com.amazonaws.services.kinesis.model.ListStreamsResult;
import com.amazonaws.services.kinesis.model.MergeShardsRequest;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.services.kinesis.model.PutRecordResult;
import com.amazonaws.services.kinesis.model.Record;
import com.amazonaws.services.kinesis.model.ResourceNotFoundException;
import com.amazonaws.services.kinesis.model.SequenceNumberRange;
import com.amazonaws.services.kinesis.model.Shard;
import com.amazonaws.services.kinesis.model.ShardIteratorType;
import com.amazonaws.services.kinesis.model.SplitShardRequest;
import com.amazonaws.services.kinesis.model.StreamDescription;
import com.amazonaws.services.kinesis.model.StreamStatus;
import com.amazonaws.util.StringUtils;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.List;

public class KinesisIntegrationTest extends KinesisIntegrationTestBase {

    @Test
    public void testDescribeBogusStream() {
        try {
            client.describeStream(
                    new DescribeStreamRequest().withStreamName("bogus-stream-name")
                    );
            Assert.fail("Expected ResourceNotFoundException");
        } catch (ResourceNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void testDeleteBogusStream() {
        try {
            client.deleteStream(
                    new DeleteStreamRequest().withStreamName("bogus-stream-name")
                    );
            Assert.fail("Expected ResourceNotFoundException");
        } catch (ResourceNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void testGetIteratorForBogusStream() {
        try {
            client.getShardIterator(
                    new GetShardIteratorRequest()
                            .withStreamName("bogus-stream-name")
                            .withShardId("bogus-shard-id")
                            .withShardIteratorType(ShardIteratorType.LATEST)
                    );
            Assert.fail("Expected ResourceNotFoundException");
        } catch (ResourceNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void testGetFromNullIterator() {
        try {
            client.getRecords(new GetRecordsRequest());
            Assert.fail("Expected InvalidArgumentException");
        } catch (AmazonServiceException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void testGetFromBogusIterator() {
        try {
            client.getRecords(
                    new GetRecordsRequest()
                            .withShardIterator("bogusmonkeys")
                    );
            Assert.fail("Expected InvalidArgumentException");
        } catch (InvalidArgumentException exception) {
            exception.printStackTrace();
        }

    }

    @Test
    public void testKinesisOperations() throws Exception {
        String streamName = "java-test-stream-" + System.currentTimeMillis();
        boolean created = false;

        try {

            // Create a stream with one shard.
            System.out.println("Creating Stream...");
            client.createStream(
                    new CreateStreamRequest()
                            .withStreamName(streamName)
                            .withShardCount(1)
                    );
            System.out.println("  OK");
            created = true;

            // Verify that it shows up in a list call.
            findStreamInList(streamName);

            // Wait for it to become ACTIVE.
            System.out.println("Waiting for stream to become active...");
            List<Shard> shards = waitForStream(streamName);
            System.out.println("  OK");

            Assert.assertEquals(1, shards.size());
            Shard shard = shards.get(0);

            // Just to be really sure in case of eventual consistency...
            Thread.sleep(5000);

            testPuts(streamName, shard);

            // Wait a bit to make sure the records propagate.
            Thread.sleep(5000);

            System.out.println("Reading...");
            testGets(streamName, shard);
            System.out.println("  OK");

        } finally {
            if (created) {
                client.deleteStream(
                        new DeleteStreamRequest().withStreamName(streamName)
                        );
            }
        }
    }

    private void testGets(final String streamName, final Shard shard) {
        // Get an iterator for the first shard.
        GetShardIteratorResult iteratorResult = client.getShardIterator(
                new GetShardIteratorRequest()
                        .withStreamName(streamName)
                        .withShardId(shard.getShardId())
                        .withShardIteratorType(ShardIteratorType.AT_SEQUENCE_NUMBER)
                        .withStartingSequenceNumber(
                                shard.getSequenceNumberRange().getStartingSequenceNumber()
                        )
                );
        Assert.assertNotNull(iteratorResult);

        String iterator = iteratorResult.getShardIterator();
        Assert.assertNotNull(iterator);

        int tries = 0;
        GetRecordsResult result;
        List<Record> records;

        // Read the first record from the first shard (looping until it's
        // available).
        while (true) {
            tries += 1;
            if (tries > 100) {
                Assert.fail("Failed to read any records after 100 seconds");
            }

            result = client.getRecords(
                    new GetRecordsRequest()
                            .withShardIterator(iterator)
                            .withLimit(1)
                    );
            Assert.assertNotNull(result);
            Assert.assertNotNull(result.getRecords());
            Assert.assertNotNull(result.getNextShardIterator());

            records = result.getRecords();
            if (records.size() > 0) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }

            iterator = result.getNextShardIterator();
        }

        System.out.println("  [Succeeded after " + tries + " tries]");
        Assert.assertEquals(1, records.size());
        validateRecord(records.get(0), "See No Evil");

        // Read the second record from the first shard.
        result = client.getRecords(
                new GetRecordsRequest()
                        .withShardIterator(result.getNextShardIterator())
                );
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getRecords());
        Assert.assertNotNull(result.getNextShardIterator());

        records = result.getRecords();
        Assert.assertEquals(1, records.size());
        validateRecord(records.get(0), "See No Evil");

        // Try to read some more, get EOF.
        result = client.getRecords(
                new GetRecordsRequest()
                        .withShardIterator(result.getNextShardIterator())
                );
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getRecords());
        Assert.assertTrue(result.getRecords().isEmpty());
        Assert.assertNull(result.getNextShardIterator());
    }

    private void validateRecord(final Record record, String data) {
        Assert.assertNotNull(record);

        Assert.assertNotNull(record.getSequenceNumber());
        new BigInteger(record.getSequenceNumber());

        String value = new String(record.getData().array(), StringUtils.UTF8);
        Assert.assertEquals(data, value);

        Assert.assertNotNull(record.getPartitionKey());
    }

    private void testPuts(final String streamName, final Shard shard)
            throws InterruptedException {

        // Put a record into the shard.
        System.out.println("Putting two records...");
        PutRecordResult r1 = putRecord(streamName, "See No Evil");
        Assert.assertEquals(shard.getShardId(), r1.getShardId());

        // Check that it's sequence number is sane.
        BigInteger startingSQN = new BigInteger(
                shard.getSequenceNumberRange().getStartingSequenceNumber()
                );
        BigInteger sqn1 = new BigInteger(r1.getSequenceNumber());
        Assert.assertTrue(sqn1.compareTo(startingSQN) >= 0);

        // Put another record, which should show up later in the same shard.
        PutRecordResult r2 = putRecord(streamName, "See No Evil");
        Assert.assertEquals(shard.getShardId(), r2.getShardId());
        BigInteger sqn2 = new BigInteger(r2.getSequenceNumber());
        System.out.println("  OK");

        // Not guaranteed an order unless we explicitly ask for one, but
        // it has to at least be larger than the starting sqn.
        Assert.assertTrue(sqn2.compareTo(startingSQN) >= 0);

        // Split the shard in two: [0-1000) and [1000-*]
        System.out.println("Splitting the shard...");
        List<Shard> shards = splitShard(streamName, shard, 1000);
        System.out.println("  OK");

        // Sleep a bit for eventual consistency.
        Thread.sleep(5000);

        // Put records into the two new shards, one after another.
        System.out.println("Putting some more...");
        PutRecordResult r3 = putRecordExplicit(streamName, "999");
        PutRecordResult r4 = putRecordExplicit(streamName,
                "1000",
                r3.getSequenceNumber());

        BigInteger sqn3 = new BigInteger(r3.getSequenceNumber());
        BigInteger sqn4 = new BigInteger(r4.getSequenceNumber());
        Assert.assertTrue(sqn4.compareTo(sqn3) >= 0);
        System.out.println("  OK");

        // Merge the two shards back together.
        System.out.println("Merging the shards back together...");
        mergeShards(streamName,
                shards.get(1).getShardId(),
                shards.get(2).getShardId());
        System.out.println("  OK");
    }

    private List<Shard> splitShard(final String streamName,
            final Shard shard,
            final long splitHashKey)
            throws InterruptedException {

        client.splitShard(
                new SplitShardRequest()
                        .withStreamName(streamName)
                        .withShardToSplit(shard.getShardId())
                        .withNewStartingHashKey(Long.toString(splitHashKey))
                );

        List<Shard> shards = waitForStream(streamName);

        Assert.assertEquals(3, shards.size());

        Shard old = shards.get(0);
        Assert.assertEquals(shard.getShardId(), old.getShardId());
        Assert.assertNotNull(
                old.getSequenceNumberRange().getEndingSequenceNumber()
                );

        Shard new1 = shards.get(1);
        Assert.assertEquals(shard.getShardId(), new1.getParentShardId());
        validateHashKeyRange(new1.getHashKeyRange(), 0L, splitHashKey - 1);

        Shard new2 = shards.get(2);
        Assert.assertEquals(shard.getShardId(), new2.getParentShardId());
        validateHashKeyRange(new2.getHashKeyRange(), splitHashKey, null);
        Assert.assertEquals(old.getHashKeyRange().getEndingHashKey(),
                new2.getHashKeyRange().getEndingHashKey());

        return shards;
    }

    private List<Shard> mergeShards(final String streamName,
            final String shard1,
            final String shard2)
            throws InterruptedException {

        client.mergeShards(
                new MergeShardsRequest()
                        .withStreamName(streamName)
                        .withShardToMerge(shard1)
                        .withAdjacentShardToMerge(shard2)
                );

        List<Shard> shards = waitForStream(streamName);

        Assert.assertEquals(4, shards.size());
        Shard merged = shards.get(3);

        BigInteger start =
                new BigInteger(merged.getHashKeyRange().getStartingHashKey());
        BigInteger end =
                new BigInteger(merged.getHashKeyRange().getEndingHashKey());

        Assert.assertEquals(BigInteger.valueOf(0), start);
        Assert.assertTrue(end.compareTo(BigInteger.valueOf(1000)) >= 0);

        return shards;
    }

    private void validateHashKeyRange(final HashKeyRange range,
            final Long start,
            final Long end) {
        if (start != null) {
            Assert.assertEquals(BigInteger.valueOf(start),
                    new BigInteger(range.getStartingHashKey()));
        }
        if (end != null) {
            Assert.assertEquals(BigInteger.valueOf(end),
                    new BigInteger(range.getEndingHashKey()));
        }
    }

    private PutRecordResult putRecord(final String streamName,
            final String data) {

        PutRecordResult result = client.putRecord(
                new PutRecordRequest()
                        .withStreamName(streamName)
                        .withPartitionKey("foobar")
                        .withData(ByteBuffer.wrap(data.getBytes(StringUtils.UTF8)))
                );
        Assert.assertNotNull(result);

        Assert.assertNotNull(result.getShardId());
        Assert.assertNotNull(result.getSequenceNumber());

        return result;
    }

    private PutRecordResult putRecordExplicit(final String streamName,
            final String hashKey) {

        PutRecordResult result = client.putRecord(
                new PutRecordRequest()
                        .withStreamName(streamName)
                        .withPartitionKey("foobar")
                        .withExplicitHashKey(hashKey)
                        .withData(ByteBuffer.wrap("Speak No Evil".getBytes(StringUtils.UTF8)))
                );
        Assert.assertNotNull(result);

        Assert.assertNotNull(result.getShardId());
        Assert.assertNotNull(result.getSequenceNumber());

        return result;
    }

    private PutRecordResult putRecordExplicit(final String streamName,
            final String hashKey,
            final String minSQN) {

        PutRecordResult result = client.putRecord(
                new PutRecordRequest()
                        .withStreamName(streamName)
                        .withPartitionKey("foobar")
                        .withExplicitHashKey(hashKey)
                        .withSequenceNumberForOrdering(minSQN)
                        .withData(ByteBuffer.wrap("Hear No Evil".getBytes(StringUtils.UTF8)))
                );
        Assert.assertNotNull(result);

        Assert.assertNotNull(result.getShardId());
        Assert.assertNotNull(result.getSequenceNumber());

        return result;
    }

    private void findStreamInList(final String streamName) {
        boolean found = false;

        String start = null;
        while (true) {

            ListStreamsResult result = client.listStreams(
                    new ListStreamsRequest().withExclusiveStartStreamName(start)
                    );

            Assert.assertNotNull(result);

            List<String> names = result.getStreamNames();
            Assert.assertNotNull(names);

            if (names.size() > 0) {
                if (names.contains(streamName)) {
                    found = true;
                }

                start = names.get(names.size() - 1);
            }

            if (!result.getHasMoreStreams()) {
                break;
            }

        }

        Assert.assertTrue(found);
    }

    private List<Shard> waitForStream(final String streamName)
            throws InterruptedException {

        while (true) {
            DescribeStreamResult result = client.describeStream(
                    new DescribeStreamRequest().withStreamName(streamName)
                    );
            Assert.assertNotNull(result);

            StreamDescription description = result.getStreamDescription();
            Assert.assertNotNull(description);

            Assert.assertEquals(streamName, description.getStreamName());
            Assert.assertNotNull(description.getStreamARN());
            Assert.assertFalse(description.getHasMoreShards());

            StreamStatus status =
                    StreamStatus.valueOf(description.getStreamStatus());
            Assert.assertNotNull(status);

            if (status == StreamStatus.ACTIVE) {
                List<Shard> shards = description.getShards();
                validateShards(shards);

                return shards;
            }

            if (!(status == StreamStatus.CREATING
            || status == StreamStatus.UPDATING)) {

                Assert.fail("Unexpected status '" + status + "'");
            }

            Thread.sleep(1000);
        }
    }

    private void validateShards(final List<Shard> shards) {
        Assert.assertNotNull(shards);
        Assert.assertFalse(shards.isEmpty());

        for (Shard shard : shards) {
            Assert.assertNotNull(shard);
            Assert.assertNotNull(shard.getShardId());

            validateHashKeyRange(shard.getHashKeyRange());
            validateSQNRange(shard.getSequenceNumberRange());
        }

    }

    private void validateHashKeyRange(final HashKeyRange range) {

        Assert.assertNotNull(range);
        Assert.assertNotNull(range.getStartingHashKey());
        Assert.assertNotNull(range.getEndingHashKey());

        BigInteger start = new BigInteger(range.getStartingHashKey());
        BigInteger end = new BigInteger(range.getEndingHashKey());
        Assert.assertTrue(start.compareTo(end) <= 0);
    }

    private void validateSQNRange(final SequenceNumberRange range) {
        Assert.assertNotNull(range);
        Assert.assertNotNull(range.getStartingSequenceNumber());

        BigInteger start = new BigInteger(range.getStartingSequenceNumber());

        if (range.getEndingSequenceNumber() != null) {
            BigInteger end = new BigInteger(range.getEndingSequenceNumber());

            Assert.assertTrue(start.compareTo(end) <= 0);
        }
    }

}
