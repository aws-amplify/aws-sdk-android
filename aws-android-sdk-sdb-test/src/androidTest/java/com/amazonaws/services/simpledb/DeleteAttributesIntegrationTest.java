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

import com.amazonaws.services.simpledb.model.DeleteAttributesRequest;
import com.amazonaws.services.simpledb.model.MissingParameterException;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB DeleteAttributes
 * operation.
 *
 */
public class DeleteAttributesIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that calling the DeleteAttribute operation without a domain name,
     * or item name specified throws a MissingParameterException.
     */
    @Test
    public void testDeleteAttributesMissingParameterException() {
        DeleteAttributesRequest request = new DeleteAttributesRequest();
        request.setItemName("foo");
        try {
            sdb.deleteAttributes(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }

        request = new DeleteAttributesRequest();
        request.setDomainName("foo");
        try {
            sdb.deleteAttributes(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that calling the DeleteAttributes operation with a non-existent
     * domain name throws a NoSuchDomainException.
     */
    @Test
    public void testDeleteAttributesNoSuchDomainException() {
        DeleteAttributesRequest request = new DeleteAttributesRequest();
        request.setDomainName("foobarbazbarbashbarbazfoo");
        request.setItemName("foobarbazbarbashbarbazfoo");
        try {
            sdb.deleteAttributes(request);
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (NoSuchDomainException e) {
            assertValidException(e);
        }
    }
}
