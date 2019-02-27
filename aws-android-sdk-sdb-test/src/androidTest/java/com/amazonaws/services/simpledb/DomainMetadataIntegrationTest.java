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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.services.simpledb.model.DomainMetadataRequest;
import com.amazonaws.services.simpledb.model.MissingParameterException;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB DomainMetadata
 * operation.
 *
 */
public class DomainMetadataIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that a NoSuchDomainException is thrown when the client calls the
     * domainMetadata service method with a non-existent domain name.
     */
    @Test
    public void testDomainMetadataInvalidParameterException() {
        final String imaginaryDomainName = "AnImaginaryDomainNameThatDoesntExist";

        DomainMetadataRequest request = new DomainMetadataRequest();
        request.setDomainName(imaginaryDomainName);

        try {
            sdb.domainMetadata(request);
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (NoSuchDomainException e) {
            assertValidException(e);

            assertNotNull(e.getBoxUsage());
            assertTrue(e.getBoxUsage().floatValue() > 0);

            assertEquals(400, e.getStatusCode());
        }
    }

    /**
     * Tests that a MissingParameterException is thrown when the client calls
     * the domainMetadata service method without specifying a domain name.
     */
    @Test
    public void testDomainMetadataMissingParameterException() {
        DomainMetadataRequest request = new DomainMetadataRequest();

        try {
            sdb.domainMetadata(request);
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);

            assertNotNull(e.getBoxUsage());
            assertTrue(e.getBoxUsage().floatValue() > 0);

            assertEquals(400, e.getStatusCode());
        }
    }

}
