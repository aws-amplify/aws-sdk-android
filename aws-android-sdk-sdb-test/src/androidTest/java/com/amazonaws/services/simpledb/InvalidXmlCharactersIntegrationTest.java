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

import com.amazonaws.services.simpledb.model.Attribute;
import com.amazonaws.services.simpledb.model.CreateDomainRequest;
import com.amazonaws.services.simpledb.model.DeleteDomainRequest;
import com.amazonaws.services.simpledb.model.Item;
import com.amazonaws.services.simpledb.model.PutAttributesRequest;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;
import com.amazonaws.services.simpledb.model.SelectRequest;
import com.amazonaws.services.simpledb.model.SelectResult;

import org.junit.After;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Tests that we can handle SimpleDBs base64 encoding attributes when users
 * upload data that isn't XML-compatible.
 *
 */
public class InvalidXmlCharactersIntegrationTest extends SimpleDBIntegrationTestBase {

    private static String domainName = "invalid-characters-integ-test-" + new Date().getTime();
    private static final String NON_XML_COMPATIBLE_STRING = "\u0001" + "foobar";

    /** Releases all resources used by this test */
    @After
    public void tearDown() throws Exception {
        sdb.deleteDomain(new DeleteDomainRequest()
                .withDomainName(domainName));
    }

    /**
     * Tests that when non-XML compatible strings are used in SimpleDB data,
     * that we're correctly able to message to the user when those values have
     * been base64 encoded when they are sent back in service responses.
     */
    @Test
    public void testInvalidXmlCharacters() throws Exception {
        createTestData();

        SelectResult selectResult =
                sdb.select(new SelectRequest()
                        .withSelectExpression("SELECT * FROM `" + domainName + "`"));

        List<Item> items = selectResult.getItems();
        assertEquals(1, items.size());

        Item item = items.get(0);
        assertEquals(null, item.getAlternateNameEncoding());

        assertEquals(1, item.getAttributes().size());
        Attribute attribute = item.getAttributes().get(0);
        assertEquals(null, attribute.getAlternateNameEncoding());
        assertEquals(null, attribute.getAlternateValueEncoding());
    }

    /*
     * Private Helper Methods
     */

    /**
     * Creates all the test data required by this test, including the test
     * domain, an item with a name containing a non-XML compatible character,
     * and an attribute with a name and value containing non-XML compatible
     * characters.
     */
    private void createTestData() throws Exception {
        sdb.createDomain(new CreateDomainRequest()
                .withDomainName(domainName));

        ReplaceableAttribute attribute = new ReplaceableAttribute()
                .withName(NON_XML_COMPATIBLE_STRING)
                .withValue(NON_XML_COMPATIBLE_STRING);
        sdb.putAttributes(new PutAttributesRequest()
                .withDomainName(domainName)
                .withItemName(NON_XML_COMPATIBLE_STRING)
                .withAttributes(new ReplaceableAttribute[] {
                    attribute
                }));

        // Sleep 5s to let data propagate
        Thread.sleep(5 * 1000);
    }
}
