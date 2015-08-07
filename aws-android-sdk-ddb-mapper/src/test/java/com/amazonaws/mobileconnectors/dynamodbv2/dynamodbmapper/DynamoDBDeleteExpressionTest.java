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
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DynamoDBDeleteExpressionTest {

    @Test
    public void testWithAndAddMethods() {
        DynamoDBDeleteExpression de = new DynamoDBDeleteExpression();

        assertNotNull(de.withConditionalOperator(ConditionalOperator.AND));
        assertEquals(de.getConditionalOperator(), ConditionalOperator.AND.toString());

        assertNotNull(de.withConditionalOperator("OR"));
        assertEquals(de.getConditionalOperator(), ConditionalOperator.OR.toString());

        assertNotNull(de.withConditionExpression("ce"));
        assertEquals(de.getConditionExpression(), "ce");

        Map<String, ExpectedAttributeValue> ea = new HashMap<String, ExpectedAttributeValue>();
        assertNotNull(de.withExpected(ea));
        assertEquals(de.getExpected(), ea);
        ExpectedAttributeValue expected = new ExpectedAttributeValue();
        assertNotNull(de.withExpectedEntry("eave", expected));
        assertEquals(de.getExpected().get("eave"), expected);

        Map<String, String> ean = new HashMap<String, String>();
        assertNotNull(de.withExpressionAttributeNames(ean));
        assertSame(de.getExpressionAttributeNames(), ean);
        assertNotNull(de.addExpressionAttributeNamesEntry("eane", "eaneValue"));
        assertEquals(de.getExpressionAttributeNames().get("eane"), "eaneValue");
        de.clearExpressionAttributeNamesEntries();
        assertNull(de.getExpressionAttributeNames());

        Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
        assertNotNull(de.withExpressionAttributeValues(eav));
        assertSame(de.getExpressionAttributeValues(), eav);
        AttributeValue eave = new AttributeValue();
        assertNotNull(de.addExpressionAttributeValuesEntry("eave", eave));
        assertSame(de.getExpressionAttributeValues().get("eave"), eave);
        de.clearExpressionAttributeValuesEntries();
        assertNull(de.getExpressionAttributeValues());
    }

    @Test
    public void testSetMethods() {
        DynamoDBDeleteExpression de = new DynamoDBDeleteExpression();

        de.setConditionalOperator(ConditionalOperator.AND);
        assertEquals(de.getConditionalOperator(), ConditionalOperator.AND.toString());

        de.setConditionalOperator("OR");
        assertEquals(de.getConditionalOperator(), ConditionalOperator.OR.toString());

        de.setConditionExpression("ce");
        assertEquals(de.getConditionExpression(), "ce");

        Map<String, ExpectedAttributeValue> ea = new HashMap<String, ExpectedAttributeValue>();
        de.setExpected(ea);
        assertEquals(de.getExpected(), ea);

        Map<String, String> ean = new HashMap<String, String>();
        de.setExpressionAttributeNames(ean);
        assertSame(de.getExpressionAttributeNames(), ean);

        Map<String, AttributeValue> eav = new HashMap<String, AttributeValue>();
        de.setExpressionAttributeValues(eav);
        assertSame(de.getExpressionAttributeValues(), eav);
    }
}
