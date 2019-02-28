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

package com.amazonaws.services.simpledb;

import static org.junit.Assert.fail;

import com.amazonaws.services.simpledb.model.InvalidQueryExpressionException;
import com.amazonaws.services.simpledb.model.MissingParameterException;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;
import com.amazonaws.services.simpledb.model.SelectRequest;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB Select operation.
 *
 */
public class SelectIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that the Select operation throws a MissingParameterException when
     * DomainName isn't specified.
     */
    @Test
    public void testSelectMissingParameterException() {
        SelectRequest request = new SelectRequest();
        try {
            sdb.select(request);
            fail("Excepted MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that the Select operation throws a NoSuchDomainException when a
     * non-existent domain name is specified.
     */
    @Test
    public void testSelectNoSuchDomainException() {
        SelectRequest request = new SelectRequest();
        try {
            sdb.select(request.withSelectExpression("select * from foobarbazbarbashbar"));
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (NoSuchDomainException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that the Select operation throws an InvalidQueryExpressionException
     * when an invalid query is passed.
     */
    @Test
    public void testSelectInvalidQueryExpressionException() {
        SelectRequest request = new SelectRequest();
        try {
            sdb.select(request.withSelectExpression("foobarbazbar"));
            fail("Expected InvalidQueryExpressionException, but wasn't thrown");
        } catch (InvalidQueryExpressionException e) {
            assertValidException(e);
        }
    }

}
