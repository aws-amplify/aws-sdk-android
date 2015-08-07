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
import static org.junit.Assert.assertSame;

import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DynamoDBSaveExpressionTest {

    @Test
    public void testWithMethods() {
        DynamoDBSaveExpression se = new DynamoDBSaveExpression();

        ConditionalOperator co = ConditionalOperator.AND;
        assertNotNull(se.withConditionalOperator(co));
        assertEquals(se.getConditionalOperator(), co.toString());

        assertNotNull(se.withConditionalOperator("OR"));
        assertEquals(se.getConditionalOperator(), ConditionalOperator.OR.toString());

        Map<String, ExpectedAttributeValue> expected = new HashMap<String, ExpectedAttributeValue>();
        assertNotNull(se.withExpected(expected));
        assertSame(se.getExpected(), expected);

        ExpectedAttributeValue eav = new ExpectedAttributeValue();
        assertNotNull(se.withExpectedEntry("eav", eav));
        assertSame(se.getExpected().get("eav"), eav);
    }

    @Test
    public void testSetMethods() {
        DynamoDBSaveExpression se = new DynamoDBSaveExpression();

        ConditionalOperator co = ConditionalOperator.AND;
        se.setConditionalOperator(co);
        assertEquals(se.getConditionalOperator(), co.toString());

        se.setConditionalOperator("OR");
        assertEquals(se.getConditionalOperator(), ConditionalOperator.OR.toString());

        Map<String, ExpectedAttributeValue> expected = new HashMap<String, ExpectedAttributeValue>();
        se.setExpected(expected);
        assertSame(se.getExpected(), expected);

    }

}
