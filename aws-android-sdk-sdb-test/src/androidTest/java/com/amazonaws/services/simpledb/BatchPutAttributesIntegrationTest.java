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

import com.amazonaws.services.simpledb.model.BatchPutAttributesRequest;
import com.amazonaws.services.simpledb.model.DuplicateItemNameException;
import com.amazonaws.services.simpledb.model.MissingParameterException;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;
import com.amazonaws.services.simpledb.model.ReplaceableItem;

import org.junit.Test;

/**
 * Integration tests for the exceptional cases of the SimpleDB
 * BatchPutAttributes operation.
 *
 */
public class BatchPutAttributesIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that calling BatchPutAttributes with two items with the same name
     * causes a DuplicateItemNameException to be thrown.
     */
    @Test
    public void testBatchPutAttributesDuplicateItemNameException() {
        BatchPutAttributesRequest request = new BatchPutAttributesRequest();

        ReplaceableItem item = new ReplaceableItem("foo",
                newReplaceableAttributeList(new ReplaceableAttribute[] {
                    new ReplaceableAttribute("foo", "bar", Boolean.TRUE)
                }));
        request.setItems(newReplaceableItemList(new ReplaceableItem[] {
                item, item
        }));

        try {
            sdb.batchPutAttributes(request);
            fail("Expected DuplicateItemNameException, but wasn't thrown");
        } catch (DuplicateItemNameException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that when a domain name, item name, attribute name, or attribute
     * value isn't supplied to a BatchPutAttributes call, a
     * MissingParameterException is thrown.
     */
    @Test
    public void testBatchPutAttributesMissingParameterException() {
        BatchPutAttributesRequest request = new BatchPutAttributesRequest();
        ReplaceableItem item = new ReplaceableItem("foo",
                newReplaceableAttributeList(new ReplaceableAttribute[] {
                    new ReplaceableAttribute("foo", "foo", Boolean.TRUE)
                }));
        request.setItems(newReplaceableItemList(new ReplaceableItem[] {
            item
        }));
        try {
            sdb.batchPutAttributes(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }

        request = new BatchPutAttributesRequest();
        item = new ReplaceableItem("foo", newReplaceableAttributeList(new ReplaceableAttribute[] {
            new ReplaceableAttribute("foo", null, Boolean.TRUE)
        }));
        request.setItems(newReplaceableItemList(new ReplaceableItem[] {
            item
        }));
        request.setDomainName("foo");
        try {
            sdb.batchPutAttributes(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }

        request = new BatchPutAttributesRequest();
        item = new ReplaceableItem("foo", newReplaceableAttributeList(new ReplaceableAttribute[] {
            new ReplaceableAttribute(null, "bar", Boolean.TRUE)
        }));
        request.setItems(newReplaceableItemList(new ReplaceableItem[] {
            item
        }));
        request.setDomainName("foo");
        try {
            sdb.batchPutAttributes(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }

        request = new BatchPutAttributesRequest();
        item = new ReplaceableItem(null, newReplaceableAttributeList(new ReplaceableAttribute[] {
            new ReplaceableAttribute("foo", "bar", Boolean.TRUE)
        }));
        request.setItems(newReplaceableItemList(new ReplaceableItem[] {
            item
        }));
        request.setDomainName("foo");
        try {
            sdb.batchPutAttributes(request);
            fail("Expected MissingParameterException, but wasn't thrown");
        } catch (MissingParameterException e) {
            assertValidException(e);
        }
    }

    /**
     * Tests that when a non-existent domain name is specified to the
     * BatchPutAttributes operation, a NoSuchDomainException is thrown.
     */
    @Test
    public void testBatchPutAttributesNoSuchDomainException() {
        BatchPutAttributesRequest request = new BatchPutAttributesRequest();
        ReplaceableItem item = new ReplaceableItem("foo",
                newReplaceableAttributeList(new ReplaceableAttribute[] {
                    new ReplaceableAttribute("foo", "foo", Boolean.TRUE)
                }));
        request.setDomainName("ADomainNameThatDoesntExist");
        request.setItems(newReplaceableItemList(new ReplaceableItem[] {
            item
        }));
        try {
            sdb.batchPutAttributes(request);
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (NoSuchDomainException e) {
            assertValidException(e);
        }
    }

}
