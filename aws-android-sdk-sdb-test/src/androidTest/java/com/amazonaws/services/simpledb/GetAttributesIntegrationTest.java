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

import com.amazonaws.services.simpledb.model.GetAttributesRequest;
import com.amazonaws.services.simpledb.model.MissingParameterException;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB GetAttributes
 * operation.
 *
 */
public class GetAttributesIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that the GetAttributes operation throws a NoSuchDomainException
     * when an invalid domain is specified.
     */
    @Test
    public void testGetAttributesNoSuchDomainException() {
        GetAttributesRequest request = new GetAttributesRequest();

        request.setItemName("foobar");
        request.setDomainName("foobarbazbarbashbar");

        try {
            sdb.getAttributes(request);
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (NoSuchDomainException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that the GetAttributes operation throws a MissingParameterException
     * if either domain name or item name aren't specified.
     */
    @Test
    public void testGetAttributesMissingParameterException() {
        GetAttributesRequest request = new GetAttributesRequest();
        try {
            sdb.getAttributes(request.withItemName("foobar"));
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }

        request = new GetAttributesRequest();
        try {
            sdb.getAttributes(request.withDomainName("foobar"));
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

}
