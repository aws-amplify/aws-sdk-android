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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpledb.model.ListDomainsRequest;

import org.junit.Test;

/**
 * Tests for client authentication errors.
 *
 */
public class AuthenticationErrorsIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that using an invalid access key and secret key throw an
     * AmazonServiceException with the InvalidClientTokenId error code.
     */
    @Test
    public void testInvalidClientTokenId() {
        AmazonSimpleDBClient client = new AmazonSimpleDBClient(
                new BasicAWSCredentials("accessKey", "secretKey"));

        try {
            client.listDomains(new ListDomainsRequest());
            fail("Expected exception not thrown");
        } catch (AmazonServiceException e) {
            assertEquals("InvalidClientTokenId", e.getErrorCode());
            assertTrue(e.getMessage().length() > 10);
            assertTrue(e.getRequestId().length() > 10);
        }
    }

    /**
     * Tests that using a valid access key with an invalid secret key throw an
     * AmazonServiceException with the SignatureDoesNotMatch error code.
     */
    @Test
    public void testSignatureDoesNotMatch() {
        String accessKey = credentials.getAWSAccessKeyId();
        AmazonSimpleDBClient client = new AmazonSimpleDBClient(
                new BasicAWSCredentials(accessKey, "secretKey"));

        try {
            client.listDomains(new ListDomainsRequest());
            fail("Expected exception not thrown");
        } catch (AmazonServiceException e) {
            assertEquals("SignatureDoesNotMatch", e.getErrorCode());
            assertTrue(e.getMessage().length() > 10);
            assertTrue(e.getRequestId().length() > 10);
        }
    }

}
