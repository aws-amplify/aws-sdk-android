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

import com.amazonaws.services.simpledb.model.MissingParameterException;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;
import com.amazonaws.services.simpledb.model.PutAttributesRequest;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Integration tests for the exceptional cases of the SimpleDB PutAttributes
 * operation.
 *
 */
public class PutAttributesIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that PutAttributes throws a MissingParameterException when the
     * request is missing required parameters.
     */
    @Test
    public void testPutAttributesMissingParameterException() {
        PutAttributesRequest request = new PutAttributesRequest();
        try {
            sdb.putAttributes(request.withDomainName("foo"));
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }

        request = new PutAttributesRequest();
        try {
            sdb.putAttributes(request.withItemName("foo"));
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that the PutAttributes operations throws a NoSuchDomainException if
     * a non-existent domain name is specified.
     */
    @Test
    public void testPutAttributesNoSuchDomainException() {
        PutAttributesRequest request = new PutAttributesRequest();
        request.setItemName("foobarbazbarbashbar");
        request.setDomainName("foobarbazbarbashbar");
        ArrayList<ReplaceableAttribute> attributes = new ArrayList<ReplaceableAttribute>();

        ReplaceableAttribute attribute = new ReplaceableAttribute();
        attribute.setName("foo");
        attribute.setValue("bar");
        attributes.add(attribute);
        request.setAttributes(attributes);

        try {
            sdb.putAttributes(request);
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (NoSuchDomainException e) {
            assertValidException(e);
        }
    }

}
