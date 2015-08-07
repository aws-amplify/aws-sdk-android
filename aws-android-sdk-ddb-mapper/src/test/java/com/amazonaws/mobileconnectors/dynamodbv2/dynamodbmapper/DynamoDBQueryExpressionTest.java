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
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DynamoDBQueryExpressionTest {

    @Test
    public void testWithAndAddMethods() {
        DynamoDBQueryExpression<Object> qe = new DynamoDBQueryExpression<Object>();

        assertNotNull(qe.withConditionalOperator(ConditionalOperator.AND));
        assertEquals(qe.getConditionalOperator(), ConditionalOperator.AND.toString());

        assertNotNull(qe.withConditionalOperator("OR"));
        assertEquals(qe.getConditionalOperator(), "OR");

        assertNotNull(qe.withConsistentRead(true));
        assertTrue(qe.isConsistentRead());

        Map<String, AttributeValue> esk = new HashMap<String, AttributeValue>();
        assertNotNull(qe.withExclusiveStartKey(esk));
        assertSame(qe.getExclusiveStartKey(), esk);

        Map<String, String> ean = new HashMap<String, String>();
        assertNotNull(qe.withExpressionAttributeNames(ean));
        assertSame(qe.getExpressionAttributeNames(), ean);
        assertNotNull(qe.addExpressionAttributeNamesEntry("eane", "eaneValue"));
        assertEquals(qe.getExpressionAttributeNames().get("eane"), "eaneValue");
        qe.clearExpressionAttributeNamesEntries();
        assertNull(qe.getExpressionAttributeNames());

        Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
        assertNotNull(qe.withExpressionAttributeValues(eav));
        assertSame(qe.getExpressionAttributeValues(), eav);
        AttributeValue eave = new AttributeValue();
        assertNotNull(qe.addExpressionAttributeValuesEntry("eave", eave));
        assertSame(qe.getExpressionAttributeValues().get("eave"), eave);
        qe.clearExpressionAttributeValuesEntries();
        assertNull(qe.getExpressionAttributeValues());

        assertNotNull(qe.withFilterExpression("fe"));
        assertEquals(qe.getFilterExpression(), "fe");

        Object hk = new Object();
        assertNotNull(qe.withHashKeyValues(hk));
        assertSame(qe.getHashKeyValues(), hk);

        assertNotNull(qe.withIndexName("index"));
        assertEquals(qe.getIndexName(), "index");

        assertNotNull(qe.withLimit(5));
        assertEquals(qe.getLimit().intValue(), 5);

        Map<String, Condition> filter = new HashMap<String, Condition>();
        assertNotNull(qe.withQueryFilter(filter));
        assertSame(qe.getQueryFilter(), filter);

        Condition ec = new Condition();
        assertNotNull(qe.withQueryFilterEntry("entry", ec));
        assertSame(qe.getQueryFilter().get("entry"), ec);

        Condition rkc = new Condition();
        assertNotNull(qe.withRangeKeyCondition("rkc", rkc));
        assertSame(qe.getRangeKeyConditions().get("rkc"), rkc);

        Map<String, Condition> rkcs = new HashMap<String, Condition>();
        assertNotNull(qe.withRangeKeyConditions(rkcs));
        assertSame(qe.getRangeKeyConditions(), rkcs);

        assertNotNull(qe.withScanIndexForward(true));
        assertTrue(qe.isScanIndexForward());
    }

    @Test
    public void testSetMethods() {
        DynamoDBQueryExpression<Object> qe = new DynamoDBQueryExpression<Object>();

        qe.setConditionalOperator(ConditionalOperator.AND);
        assertEquals(qe.getConditionalOperator(), ConditionalOperator.AND.toString());

        qe.setConditionalOperator("OR");
        assertEquals(qe.getConditionalOperator(), "OR");

        qe.setConsistentRead(true);
        assertTrue(qe.isConsistentRead());

        Map<String, AttributeValue> esk = new HashMap<String, AttributeValue>();
        qe.setExclusiveStartKey(esk);
        assertSame(qe.getExclusiveStartKey(), esk);

        Map<String, String> ean = new HashMap<String, String>();
        qe.setExpressionAttributeNames(ean);
        assertSame(qe.getExpressionAttributeNames(), ean);

        Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
        qe.setExpressionAttributeValues(eav);
        assertSame(qe.getExpressionAttributeValues(), eav);
        qe.setFilterExpression("fe");
        assertEquals(qe.getFilterExpression(), "fe");

        Object hk = new Object();
        qe.setHashKeyValues(hk);
        assertSame(qe.getHashKeyValues(), hk);

        qe.setIndexName("index");
        assertEquals(qe.getIndexName(), "index");

        qe.setLimit(5);
        assertEquals(qe.getLimit().intValue(), 5);

        Map<String, Condition> filter = new HashMap<String, Condition>();
        qe.setQueryFilter(filter);
        assertSame(qe.getQueryFilter(), filter);

        Map<String, Condition> rkcs = new HashMap<String, Condition>();
        qe.setRangeKeyConditions(rkcs);
        assertSame(qe.getRangeKeyConditions(), rkcs);

        qe.setScanIndexForward(true);
        assertTrue(qe.isScanIndexForward());

    }

}
