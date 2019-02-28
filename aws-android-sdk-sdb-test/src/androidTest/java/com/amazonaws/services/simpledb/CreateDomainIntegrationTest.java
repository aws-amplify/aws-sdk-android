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

import com.amazonaws.services.simpledb.model.CreateDomainRequest;
import com.amazonaws.services.simpledb.model.InvalidParameterValueException;
import com.amazonaws.services.simpledb.model.MissingParameterException;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB CreateDomain
 * operation.
 *
 */
public class CreateDomainIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that calling CreateDomain with an invalid domain name throws an
     * InvalidParameterValueException.
     */
    @Test
    public void testCreateDomainInvalidParameterValueException() {
        CreateDomainRequest request = new CreateDomainRequest();
        request.setDomainName("''''''''''````````^^**&&@@!!??;;::[[{{]]}}||\\``''''");
        try {
            sdb.createDomain(request);
            fail("Expected InvalidParameterValueException, but wasn't thrown");
        } catch (InvalidParameterValueException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that calling CreateDomain without specifying a domain name throws a
     * MissingParameterException.
     */
    @Test
    public void testCreateDomainMissingParameterException() {
        CreateDomainRequest request = new CreateDomainRequest();
        try {
            sdb.createDomain(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

}
