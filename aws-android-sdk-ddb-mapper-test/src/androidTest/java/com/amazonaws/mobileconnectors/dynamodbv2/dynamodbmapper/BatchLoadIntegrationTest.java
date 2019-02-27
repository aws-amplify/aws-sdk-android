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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BatchLoadIntegrationTest extends DynamoDBMapperIntegrationTestBase {

    // We don't start with the current system millis like other tests because
    // it's out of the range of some data types
    private static int start = 1;
    private static int byteStart = 1;
    private static int startKeyDebug = 1;
    DynamoDBMapper mapper = new DynamoDBMapper(dynamo, new DynamoDBMapperConfig(
            SaveBehavior.UPDATE,
            ConsistentReads.CONSISTENT, null));

    static class AmazonDymanoDBClientMock extends AmazonDynamoDBClient {

        static final int SLEEP_TIME_IN_MILLIS = 3000;

        @Override
        public BatchGetItemResult batchGetItem(BatchGetItemRequest arg0) {

            try {
                Thread.sleep(SLEEP_TIME_IN_MILLIS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                fail("Unable to initialize necessary test data. Exception message : "
                        + e.getMessage());
            }
            BatchGetItemResult result = new BatchGetItemResult();
            result.setResponses(new HashMap<String, List<Map<String, AttributeValue>>>());
            result.setUnprocessedKeys(arg0.getRequestItems());

            return result;
        }

    }

    @BeforeClass
    public static void setUp() throws Exception {
        setUpTableWithRangeAttribute();
    }

    @AfterClass
    public static void tearDown() {
        try {
            dynamo.deleteTable(new DeleteTableRequest(TABLE_WITH_RANGE_ATTRIBUTE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        waitForTableToBecomeDeleted(TABLE_WITH_RANGE_ATTRIBUTE);
    }

    @Test
    public void testBatchLoad() throws InterruptedException {
        // To see whether batchGet can handle more than 100 items per request
        final int numItems = 200;
        List<NumberSetAttributeClass> objs = new ArrayList<NumberSetAttributeClass>();
        List<KeyPair> keyPairs = new LinkedList<KeyPair>();
        Class<?> clazz = null;
        for (int i = 0; i < numItems; i++) {
            NumberSetAttributeClass obj = getUniqueNumericObject();
            objs.add(obj);
            clazz = obj.getClass();
            keyPairs.add(new KeyPair().withHashKey(obj.getKey()));
        }

        mapper.batchSave(objs);

        Map<Class<?>, List<KeyPair>> itemsToGet = new HashMap<Class<?>, List<KeyPair>>();
        Map<String, List<Object>> response = null;
        itemsToGet.put(clazz, keyPairs);
        response = mapper.batchLoad(itemsToGet);
        List<Object> items = response.get(TABLE_NAME);
        assertEquals(numItems, items.size());

        for (Object item : items) {
            objs.contains(item);
        }
        Thread.sleep(1000 * 10);
    }

    @Test
    public void testMultipleTables() {
        final int numItems = 55;
        Map<Class<?>, List<KeyPair>> itemsToGet = new HashMap<Class<?>, List<KeyPair>>();
        Class<?> clazz = null;
        List<KeyPair> keyPairs = new LinkedList<KeyPair>();
        List<Object> objs = new ArrayList<Object>();
        for (int i = 0; i < numItems * 2; i++) {
            NumberSetAttributeClass obj = getUniqueNumericObject();
            clazz = obj.getClass();
            keyPairs.add(new KeyPair().withHashKey(obj.getKey()));
            objs.add(obj);
        }
        itemsToGet.put(clazz, keyPairs);
        keyPairs = new LinkedList<KeyPair>();
        for (int i = 0; i < numItems; i++) {
            RangeKeyClass obj = getUniqueRangeKeyObject();
            clazz = obj.getClass();
            keyPairs.add(new KeyPair().withHashKey(obj.getKey()).withRangeKey(obj.getRangeKey()));
            objs.add(obj);
        }
        itemsToGet.put(clazz, keyPairs);
        Collections.shuffle(objs);

        mapper.batchSave(objs);

        Map<String, List<Object>> response = null;
        itemsToGet.put(clazz, keyPairs);
        response = mapper.batchLoad(itemsToGet);

        List<Object> itemsFromTableOne = response.get(TABLE_NAME);
        List<Object> itemsFromTableTwo = response.get(TABLE_WITH_RANGE_ATTRIBUTE);

        assertEquals(numItems * 2, itemsFromTableOne.size());
        assertEquals(numItems, itemsFromTableTwo.size());

        for (Object item : itemsFromTableOne) {
            assertTrue(objs.contains(item));
        }

        for (Object item : itemsFromTableTwo) {
            assertTrue(objs.contains(item));
        }
    }

    @Test
    public void testBoudaryCases() {
        // The request is an empty Map.
        Map<Class<?>, List<KeyPair>> itemsToGet = new HashMap<Class<?>, List<KeyPair>>();
        Map<String, List<Object>> response = null;
        response = mapper.batchLoad(itemsToGet);
        assertTrue(response.isEmpty());

        // The request only contains invalid key pairs
        List<KeyPair> keyPairs = new LinkedList<KeyPair>();
        Class<?> clazz = getUniqueNumericObject().getClass();
        keyPairs.add(new KeyPair().withHashKey("non-existant-key"));
        itemsToGet.clear();
        itemsToGet.put(clazz, keyPairs);
        response = mapper.batchLoad(itemsToGet);
        assertNotNull(response);
        List<Object> items = response.get(TABLE_NAME);
        assertNotNull(items);
        assertEquals(0, items.size());

        // The request does not contain any key pairs.
        itemsToGet.put(clazz, new LinkedList<KeyPair>());
        response = mapper.batchLoad(itemsToGet);
        assertTrue(response.isEmpty());
    }

    @Test
    public void testExponentialBackOffForBatchGetInMapper()
            throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        long startTime = System.currentTimeMillis();
        long maxBackOffTimePerRetry = DynamoDBMapper.MAX_BACKOFF_IN_MILLISECONDS;
        int NoOfRetries = DynamoDBMapper.BATCH_GET_MAX_RETRY_COUNT_ALL_KEYS;

        List<Object> objs = new ArrayList<Object>();
        NumberSetAttributeClass obj = getUniqueNumericObject();
        objs.add(obj);
        DynamoDBMapper mapper = new DynamoDBMapper(
                new AmazonDymanoDBClientMock());
        try {
            mapper.batchLoad(objs);
            fail("Expecting an expection due to exceed of number of retries.");
        } catch (Exception e) {
            long endTime = System.currentTimeMillis();
            assertTrue(((endTime - startTime)) > (maxBackOffTimePerRetry
            * NoOfRetries));
        }
    }

    private NumberSetAttributeClass getUniqueNumericObject() {
        NumberSetAttributeClass obj = new NumberSetAttributeClass();
        obj.setKey(String.valueOf(startKeyDebug++));
        obj.setBigDecimalAttribute(toSet(new BigDecimal(startKey++), new BigDecimal(startKey++),
                new BigDecimal(startKey++)));
        obj.setBigIntegerAttribute(toSet(new BigInteger("" + startKey++), new BigInteger(""
                + startKey++), new BigInteger("" + startKey++)));
        obj.setByteObjectAttribute(toSet(new Byte(nextByte()), new Byte(nextByte()), new Byte(
                nextByte())));
        obj.setDoubleObjectAttribute(toSet(new Double("" + start++), new Double("" + start++),
                new Double("" + start++)));
        obj.setFloatObjectAttribute(toSet(new Float("" + start++), new Float("" + start++),
                new Float("" + start++)));
        obj.setIntegerAttribute(toSet(new Integer("" + start++), new Integer("" + start++),
                new Integer("" + start++)));
        obj.setLongObjectAttribute(toSet(new Long("" + start++), new Long("" + start++), new Long(
                "" + start++)));
        obj.setBooleanAttribute(toSet(true, false));
        obj.setDateAttribute(toSet(new Date(startKey++), new Date(startKey++), new Date(startKey++)));
        Set<Calendar> cals = new HashSet<Calendar>();
        for (Date d : obj.getDateAttribute()) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            cals.add(cal);
        }
        obj.setCalendarAttribute(toSet(cals));
        return obj;
    }

    private RangeKeyClass getUniqueRangeKeyObject() {
        RangeKeyClass obj = new RangeKeyClass();
        obj.setKey(startKey++);
        obj.setIntegerAttribute(toSet(start++, start++, start++));
        obj.setBigDecimalAttribute(new BigDecimal(startKey++));
        obj.setRangeKey(start++);
        obj.setStringAttribute("" + startKey++);
        obj.setStringSetAttribute(toSet("" + startKey++, "" + startKey++, "" + startKey++));
        return obj;
    }

    private String nextByte() {
        return "" + byteStart++ % Byte.MAX_VALUE;
    }

}
