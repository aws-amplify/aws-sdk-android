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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.Condition;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DynamoDBScanExpressionTest {

    @Test
    public void testWithAndAddMethods() {
        DynamoDBScanExpression se = new DynamoDBScanExpression();

        assertNotNull(se.withConditionalOperator("lt"));
        assertEquals(se.getConditionalOperator(), "lt");

        Map<String, AttributeValue> esk = new HashMap<String, AttributeValue>();
        assertNotNull(se.withExclusiveStartKey(esk));
        assertSame(se.getExclusiveStartKey(), esk);

        Map<String, String> ean = new HashMap<String, String>();
        assertNotNull(se.withExpressionAttributeNames(ean));
        assertSame(se.getExpressionAttributeNames(), ean);
        assertNotNull(se.addExpressionAttributeNamesEntry("test", "add"));
        assertEquals(se.getExpressionAttributeNames().get("test"), "add");
        se.clearExpressionAttributeNamesEntries();
        assertNull(se.getExpressionAttributeNames());

        Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
        assertNotNull(se.withExpressionAttributeValues(eav));
        assertSame(se.getExpressionAttributeValues(), eav);
        AttributeValue av = new AttributeValue();
        assertNotNull(se.addExpressionAttributeValuesEntry("test", av));
        assertSame(se.getExpressionAttributeValues().get("test"), av);
        se.clearExpressionAttributeValuesEntries();
        assertNull(se.getExpressionAttributeValues());

        Condition c = new Condition();
        assertNotNull(se.withFilterConditionEntry("testName", c));
        assertSame(se.getScanFilter().get("testName"), c);
        Condition other = new Condition();
        se.addFilterCondition("otherFilter", other);
        assertSame(se.getScanFilter().get("otherFilter"), other);

        assertNotNull(se.withFilterExpression("testFilter"));
        assertEquals(se.getFilterExpression(), "testFilter");

        assertNotNull(se.withLimit(5));
        assertEquals(se.getLimit().intValue(), 5);

        Map<String, Condition> filter = new HashMap<String, Condition>();
        assertNotNull(se.withScanFilter(filter));
        assertSame(se.getScanFilter(), filter);

        assertNotNull(se.withSegment(2));
        assertEquals(se.getSegment().intValue(), 2);

        assertNotNull(se.withTotalSegments(10));
        assertEquals(se.getTotalSegments().intValue(), 10);
    }

    @Test
    public void testSetMethods() {
        DynamoDBScanExpression se = new DynamoDBScanExpression();

        se.setConditionalOperator("lt");
        assertEquals(se.getConditionalOperator(), "lt");

        Map<String, AttributeValue> esk = new HashMap<String, AttributeValue>();
        se.setExclusiveStartKey(esk);
        assertSame(se.getExclusiveStartKey(), esk);

        Map<String, String> ean = new HashMap<String, String>();
        se.setExpressionAttributeNames(ean);
        assertSame(se.getExpressionAttributeNames(), ean);

        Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
        se.setExpressionAttributeValues(eav);
        assertSame(se.getExpressionAttributeValues(), eav);

        se.setFilterExpression("testFilter");
        assertEquals(se.getFilterExpression(), "testFilter");

        se.setLimit(5);
        assertEquals(se.getLimit().intValue(), 5);

        Map<String, Condition> filter = new HashMap<String, Condition>();
        se.setScanFilter(filter);
        assertSame(se.getScanFilter(), filter);

        se.setSegment(2);
        assertEquals(se.getSegment().intValue(), 2);

        se.setTotalSegments(10);
        assertEquals(se.getTotalSegments().intValue(), 10);
    }

}
