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

import com.amazonaws.services.simpledb.model.DeleteDomainRequest;
import com.amazonaws.services.simpledb.model.MissingParameterException;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB DeleteDomain
 * operation.
 *
 */
public class DeleteDomainIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that the DeleteDomain operation throws a MissingParameterException
     * if the domain name isn't specified.
     */
    @Test
    public void testDeleteDomainMissingParameterException() {
        DeleteDomainRequest request = new DeleteDomainRequest();

        try {
            sdb.deleteDomain(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

}
