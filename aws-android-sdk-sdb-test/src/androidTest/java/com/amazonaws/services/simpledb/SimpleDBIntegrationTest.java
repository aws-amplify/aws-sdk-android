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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpledb.model.Attribute;
import com.amazonaws.services.simpledb.model.AttributeDoesNotExistException;
import com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest;
import com.amazonaws.services.simpledb.model.BatchPutAttributesRequest;
import com.amazonaws.services.simpledb.model.DeleteAttributesRequest;
import com.amazonaws.services.simpledb.model.DomainMetadataRequest;
import com.amazonaws.services.simpledb.model.DomainMetadataResult;
import com.amazonaws.services.simpledb.model.GetAttributesRequest;
import com.amazonaws.services.simpledb.model.GetAttributesResult;
import com.amazonaws.services.simpledb.model.ListDomainsRequest;
import com.amazonaws.services.simpledb.model.ListDomainsResult;
import com.amazonaws.services.simpledb.model.NoSuchDomainException;
import com.amazonaws.services.simpledb.model.PutAttributesRequest;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;
import com.amazonaws.services.simpledb.model.ReplaceableItem;
import com.amazonaws.services.simpledb.model.SelectRequest;
import com.amazonaws.services.simpledb.model.SelectResult;
import com.amazonaws.services.simpledb.model.UpdateCondition;

import org.junit.AfterClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Integration test for the Amazon SimpleDB Java client library. Runs through a
 * test case that calls all SimpleDB operations, starting with creating a new
 * domain, then modifying the data in that domain, running queries, and finally
 * deleting the domain at the end of the test.
 *
 */
public class SimpleDBIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Name of the domain used for all the integration tests.
     */
    private static String domainName = "createDomainIntegrationTest-" + new Date().getTime();

    /**
     * All test data used in these integration tests.
     */
    private static final List<ReplaceableItem> ALL_TEST_DATA =
            newReplaceableItemList(new ReplaceableItem[] {
                    new ReplaceableItem("foo",
                            newReplaceableAttributeList(new ReplaceableAttribute[] {
                                    new ReplaceableAttribute("1", "2", Boolean.TRUE),
                                    new ReplaceableAttribute("3", "4", Boolean.TRUE),
                                    new ReplaceableAttribute("5", "6", Boolean.TRUE)
                            })),
                    new ReplaceableItem("boo",
                            newReplaceableAttributeList(new ReplaceableAttribute[] {
                                    new ReplaceableAttribute("X", "Y", Boolean.TRUE),
                                    new ReplaceableAttribute("Z", "Q", Boolean.TRUE)
                            })),
                    new ReplaceableItem("baa",
                            newReplaceableAttributeList(new ReplaceableAttribute[] {
                                    new ReplaceableAttribute("A", "B", Boolean.TRUE),
                                    new ReplaceableAttribute("C", "D", Boolean.TRUE),
                                    new ReplaceableAttribute("E", "F", Boolean.TRUE)
                            }))
            });

    /**
     * Sample item, named foo, with a few attributes, for all tests to use,
     * particularly the PutAttributes test code.
     */
    private static final ReplaceableItem FOO_ITEM = ALL_TEST_DATA.get(0);

    /**
     * List of two sample items with attributes for all tests to use,
     * particularly the BatchPutAttributes test code.
     */
    private static final List<ReplaceableItem> ITEM_LIST =
            newReplaceableItemList(new ReplaceableItem[] {
                    ALL_TEST_DATA.get(1), ALL_TEST_DATA.get(2)
            });

    /**
     * Responsible for cleaning up after all the integration tests, including
     * deleting any data that was created.
     */
    @AfterClass
    public static void tearDown() {
        try {
            deleteDomain(domainName);
        } catch (NoSuchDomainException e) {
        }
    }

    /**
     * Runs through a series of service calls on Amazon SimpleDB, which hit all
     * the operations available in the SimpleDB client. Since the operations
     * depend on the results of each other, we need to run them in a certain
     * order, so this method organizes the overall structure of the tests.
     */
    @Test
    public void testSimpleDB() throws Exception {
        gotestExplicitDefaultPorts();
        gotestOverriddenRequestCredentials();

        gotestCreateDomain();

        gotestPutAttributesWithNonMatchingUpdateCondition();

        gotestListDomains();

        gotestNewlineValues();

        gotestAsyncClientExceptions();

        gotestBatchDeleteAttributes();
        gotestDeleteDomain();
    }

    /*
     * Helper methods for individual components of the overall integration test.
     * Note that these aren't annotated as @Test methods, since we need to
     * control the order in which they run, so we call them directly in order
     * from the real test method.
     */

    /**
     * Tests that overridden request credentials are correctly used when
     * specified.
     */
    private void gotestOverriddenRequestCredentials() throws Exception {
        sdb.listDomains();

        ListDomainsRequest listDomainsRequest = new ListDomainsRequest();
        listDomainsRequest.setRequestCredentials(new BasicAWSCredentials("foo", "bar"));
        try {
            sdb.listDomains(listDomainsRequest);
            fail("Expected an authentication exception from bogus request credentials.");
        } catch (Exception e) {
        }
    }

    /**
     * When a user specifies an endpoint and includes the default ports, we
     * expect the requests to still complete successfully. Originally this broke
     * because Apache HttpClient wasn't honoring our explicit Host header and
     * was omitting the port when it was the default port.
     */
    private void gotestExplicitDefaultPorts() {
        sdb.setEndpoint("http://sdb.amazonaws.com:80");
        sdb.listDomains();

        sdb.setEndpoint("https://sdb.amazonaws.com:443");
        sdb.listDomains();
    }

    /**
     * Tests that empty string values are correct represented as the empty
     * string, and not null.
     */
    private void gotestEmptyStringValues() throws Exception {
        ReplaceableAttribute emptyValueAttribute = new ReplaceableAttribute().withName("empty")
                .withValue("");
        PutAttributesRequest request = new PutAttributesRequest(domainName, "emptyStringTestItem",
                null).withAttributes(new ReplaceableAttribute[] {
            emptyValueAttribute
        });
        sdb.putAttributes(request);

        SimpleDBResponseMetadata responseMetadata = sdb.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());

        List<Attribute> attributes = sdb.getAttributes(
                new GetAttributesRequest(domainName, "emptyStringTestItem")
                        .withConsistentRead(Boolean.TRUE)).getAttributes();

        assertEquals(1, attributes.size());
        assertEquals("empty", attributes.get(0).getName());
        assertNotNull(attributes.get(0).getValue());
        assertEquals("", attributes.get(0).getValue());
    }

    /**
     * Tests that values containing newlines are parsed correctly. If character
     * coalescing isn't enabled on the XML parser, then an element's character
     * data could be split into multiple character events and we could
     * potentially lose one.
     */
    private void gotestNewlineValues() throws Exception {
        String value = "foo\nbar\nbaz";
        ReplaceableAttribute newlineValueAttribute = new ReplaceableAttribute().withName("newline")
                .withValue(value);
        PutAttributesRequest request = new PutAttributesRequest(domainName, "newlineTestItem", null)
                .withAttributes(new ReplaceableAttribute[] {
                    newlineValueAttribute
                });
        sdb.putAttributes(request);

        List<Attribute> attributes = sdb.getAttributes(
                new GetAttributesRequest(domainName, "newlineTestItem")
                        .withConsistentRead(Boolean.TRUE)).getAttributes();

        assertEquals(1, attributes.size());
        assertEquals("newline", attributes.get(0).getName());
        assertNotNull(attributes.get(0).getValue());
        assertEquals(value, attributes.get(0).getValue());
    }

    /**
     * Runs a few quick tests to verify that the async client interface works
     * correctly.
     */
    private void gotestAsyncClient() throws Exception {
        ListDomainsRequest request = new ListDomainsRequest();
        Future<?> future = sdbAsync.listDomainsAsync(request);
        assertFalse(future.isDone());
        assertFalse(future.isCancelled());
        ListDomainsResult listDomainsResult = (ListDomainsResult) future.get();
        assertTrue(listDomainsResult.getDomainNames().contains(domainName));

        SimpleDBResponseMetadata responseMetadata = sdbAsync.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());
    }

    /**
     * Tests that exceptions are thrown correctly for the async client
     * interface.
     */
    private void gotestAsyncClientExceptions() throws Exception {
        DomainMetadataRequest request = new DomainMetadataRequest();
        request.setDomainName("FakeDomainThatDoesntExist");

        Future<?> future = sdbAsync.domainMetadataAsync(request);
        try {
            future.get();
            fail("Expected NoSuchDomainException, but wasn't thrown");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            assertTrue(cause instanceof NoSuchDomainException);
            assertValidException((AmazonServiceException) cause);
        }
    }

    /**
     * Tests that the createDomain operation correctly creates a new domain.
     */
    private void gotestCreateDomain() {
        assertFalse(doesDomainExist(domainName));
        createDomain(domainName);

        // Wait a few seconds for eventual consistency
        try {
            Thread.sleep(1000 * 5);
        } catch (Exception e) {
        }
        assertTrue(doesDomainExist(domainName));
    }

    /**
     * Tests that the deleteDomain operation correctly deletes a domain.
     */
    private void gotestDeleteDomain() {
        deleteDomain(domainName);
        assertFalse(doesDomainExist(domainName));
    }

    /**
     * Tests that the listDomains operation correctly returns a list of domains
     * that includes the domain we previously created in this test.
     */
    private void gotestListDomains() {
        ListDomainsResult listDomainsResult = sdb.listDomains();
        List<String> domainNames = listDomainsResult.getDomainNames();
        assertTrue(domainNames.contains(domainName));
    }

    /**
     * Tests that after calling the PutAttributes operation to add attributes of
     * an item to a domain, the attributes are correctly stored in the domain.
     */
    private void gotestPutAttributes() {
        PutAttributesRequest request = new PutAttributesRequest();
        request.setDomainName(domainName);
        request.setItemName(FOO_ITEM.getName());
        request.setAttributes(FOO_ITEM.getAttributes());
        sdb.putAttributes(request);

        SimpleDBResponseMetadata responseMetadata = sdb.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());

        assertItemsStoredInDomain(sdb, newReplaceableItemList(new ReplaceableItem[] {
            FOO_ITEM
        }), domainName);
    }

    /**
     * Tests that attributes are not added to an item in a domain when
     * PutAttributes is called with an UpdateCondition that isn't satisfied.
     */
    private void gotestPutAttributesWithNonMatchingUpdateCondition() {
        PutAttributesRequest request = new PutAttributesRequest();
        request.setDomainName(domainName);
        request.setItemName(FOO_ITEM.getName());
        request.setAttributes(FOO_ITEM.getAttributes());
        request.setExpected(new UpdateCondition()
                .withExists(Boolean.TRUE)
                .withName("non-existant-attribute-name")
                .withValue("non-existant-attribute-value"));

        try {
            sdb.putAttributes(request);
            fail("Expected an AttributeDoesNotExist error code, but didn't received one");
        } catch (AttributeDoesNotExistException e) {
            assertEquals("AttributeDoesNotExist", e.getErrorCode());
        }
    }

    /**
     * Tests that after calling the BatchPutAttributes operation to add items to
     * a domain, the items and attributes are correctly stored in the domain.
     */
    private void gotestBatchPutAttributes() {
        BatchPutAttributesRequest request = new BatchPutAttributesRequest();
        request.setDomainName(domainName);
        request.setItems(ITEM_LIST);
        sdb.batchPutAttributes(request);

        SimpleDBResponseMetadata responseMetadata = sdb.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());

        assertItemsStoredInDomain(sdb, ITEM_LIST, domainName);
    }

    /**
     * Tests that selecting data from a domain returns the expected items and
     * attributes.
     */
    private void gotestSelect() {
        // First try to select without consistent reads...
        SelectRequest request = new SelectRequest();
        request.setSelectExpression("select * from `" + domainName + "`");
        SelectResult selectResult = sdb.select(request);
        assertNull(selectResult.getNextToken());
        assertItemsPresent(ITEM_LIST, selectResult.getItems());
        assertItemsPresent(newReplaceableItemList(new ReplaceableItem[] {
            FOO_ITEM
        }), selectResult.getItems());

        SimpleDBResponseMetadata responseMetadata = sdb.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());

        // Try again with the consistent read parameter enabled...
        sdb.select(request.withConsistentRead(Boolean.TRUE));
        selectResult = sdb.select(request);
        assertNull(selectResult.getNextToken());
        assertItemsPresent(ITEM_LIST, selectResult.getItems());
        assertItemsPresent(newReplaceableItemList(new ReplaceableItem[] {
            FOO_ITEM
        }), selectResult.getItems());
    }

    /**
     * Tests that the domain metadata for the domain we created previously
     * matches what we've put into the domain.
     */
    private void gotestDomainMetadata() {
        DomainMetadataRequest request = new DomainMetadataRequest();
        request.setDomainName(domainName);
        DomainMetadataResult domainMetadataResult = sdb.domainMetadata(request);

        SimpleDBResponseMetadata responseMetadata = sdb.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());

        int expectedItemCount = 0;
        int expectedAttributeValueCount = 0;
        int expectedAttributeNameCount = 0;
        for (Iterator iterator = ALL_TEST_DATA.iterator(); iterator.hasNext();) {
            ReplaceableItem item = (ReplaceableItem) iterator.next();

            expectedItemCount++;
            expectedAttributeNameCount += item.getAttributes().size();
            expectedAttributeValueCount += item.getAttributes().size();
        }

        assertEquals(expectedItemCount, domainMetadataResult.getItemCount().intValue());
        assertEquals(expectedAttributeNameCount, domainMetadataResult.getAttributeNameCount()
                .intValue());
        assertEquals(expectedAttributeValueCount, domainMetadataResult.getAttributeValueCount()
                .intValue());
        assertNotNull(domainMetadataResult.getTimestamp());
    }

    /**
     * Tests that the GetAttributes operation returns the attributes we
     * previously stored in our test domain.
     */
    private void gotestGetAttributes() {
        GetAttributesRequest request = new GetAttributesRequest();
        request.setDomainName(domainName);
        request.setItemName(FOO_ITEM.getName());
        request.setConsistentRead(Boolean.TRUE);
        request.withAttributeNames(new String[] {
                FOO_ITEM.getAttributes().get(0).getName(),
                FOO_ITEM.getAttributes().get(1).getName()
        });

        GetAttributesResult getAttributesResult = sdb.getAttributes(request);
        SimpleDBResponseMetadata responseMetadata = sdb.getCachedResponseMetadata(request);
        assertTrue(responseMetadata.getBoxUsage() > 0);
        assertNotNull(responseMetadata.getRequestId());

        List<Attribute> attributes = getAttributesResult.getAttributes();
        Map<String, String> attributeValuesByName = convertAttributesToMap(attributes);

        assertEquals(2, attributeValuesByName.size());

        ReplaceableAttribute[] replaceableAttributes = new ReplaceableAttribute[] {
                FOO_ITEM.getAttributes().get(0), FOO_ITEM.getAttributes().get(1)
        };
        for (int index = 0; index < replaceableAttributes.length; index++) {
            ReplaceableAttribute expectedAttribute = replaceableAttributes[index];

            String expectedAttributeName = expectedAttribute.getName();
            assertTrue(attributeValuesByName.containsKey(expectedAttributeName));
            assertEquals(expectedAttribute.getValue(),
                    attributeValuesByName.get(expectedAttributeName));
        }
    }

    /**
     * Tests that existing attributes are correctly removed after calling the
     * DeleteAttributes operation.
     */
    private void gotestDeleteAttributes() {
        List<String> attributeNames = Arrays.asList(new String[] {
                FOO_ITEM.getAttributes().get(0).getName(),
                FOO_ITEM.getAttributes().get(1).getName()
        });
        List<Attribute> attributeList = new ArrayList<Attribute>();
        for (Iterator iterator = attributeNames.iterator(); iterator.hasNext();) {
            String attributeName = (String) iterator.next();
            attributeList.add(new Attribute().withName(attributeName));
        }

        assertTrue(doAttributesExistForItem(sdb, FOO_ITEM.getName(), domainName, attributeNames));

        DeleteAttributesRequest request = new DeleteAttributesRequest();
        request.setDomainName(domainName);
        request.setItemName(FOO_ITEM.getName());
        request.setAttributes(attributeList);
        request.setExpected(new UpdateCondition()
                .withExists(Boolean.FALSE)
                .withName("non-existant-attribute-name"));
        sdb.deleteAttributes(request);

        // Wait a few seconds for eventual consistency...
        try {
            Thread.sleep(5 * 1000);
        } catch (Exception e) {
        }

        assertFalse(doAttributesExistForItem(sdb, FOO_ITEM.getName(), domainName, attributeNames));
    }

    /**
     * Tests that we can correctly call BatchDeleteAttributes to delete multiple
     * items in one call.
     */
    private void gotestBatchDeleteAttributes() {
        // Add some test data
        BatchPutAttributesRequest request = new BatchPutAttributesRequest();
        request.setDomainName(domainName);
        request.setItems(ITEM_LIST);
        sdb.batchPutAttributes(request);
        assertItemsStoredInDomain(sdb, ITEM_LIST, domainName);

        // Delete 'em
        sdb.batchDeleteAttributes(new BatchDeleteAttributesRequest(domainName,
                newDeletableItemList(ITEM_LIST)));

        // Assert none of the items are still in the domain
        for (int i = 0; i < ITEM_LIST.size(); i++) {
            ReplaceableItem expectedItem = ITEM_LIST.get(i);
            assertFalse(doAttributesExistForItem(sdb, expectedItem.getName(), domainName,
                    newAttributeNameList(expectedItem.getAttributes())));
        }
    }

    /**
     * Tests that attributes are not removed when delete attributes is called
     * with an update condition that isn't satisfied.
     */
    private void gotestDeleteAttributesWithNonMatchingUpdateCondition() {
        List<String> attributeNames = Arrays.asList(new String[] {
                FOO_ITEM.getAttributes().get(0).getName(),
                FOO_ITEM.getAttributes().get(1).getName()
        });
        List<Attribute> attributeList = new ArrayList<Attribute>();
        for (Iterator iterator = attributeNames.iterator(); iterator.hasNext();) {
            String attributeName = (String) iterator.next();
            attributeList.add(new Attribute().withName(attributeName));
        }

        assertTrue(doAttributesExistForItem(sdb, FOO_ITEM.getName(), domainName, attributeNames));

        DeleteAttributesRequest request = new DeleteAttributesRequest();
        request.setDomainName(domainName);
        request.setItemName(FOO_ITEM.getName());
        request.setAttributes(attributeList);
        request.setExpected(new UpdateCondition()
                .withExists(Boolean.TRUE)
                .withName("non-existant-attribute-name")
                .withValue("non-existant-attribute-value"));

        try {
            sdb.deleteAttributes(request);
            fail("Expected an AttributeDoesNotExist error code, but didn't received one");
        } catch (AttributeDoesNotExistException e) {
            assertEquals("AttributeDoesNotExist", e.getErrorCode());
        }
    }

}
