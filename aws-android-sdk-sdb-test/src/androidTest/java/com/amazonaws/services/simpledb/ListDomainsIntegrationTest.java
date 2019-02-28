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
import static org.junit.Assert.fail;

import com.amazonaws.services.simpledb.model.InvalidParameterValueException;
import com.amazonaws.services.simpledb.model.ListDomainsRequest;
import com.amazonaws.services.simpledb.model.ListDomainsResult;

import org.junit.Test;

import java.util.List;

/**
 * Integration tests for the SimpleDB ListDomains operation. This test currently
 * requires at least two domains to exist in the current users account,
 * otherwise they won't be able to run correctly and will exit early instead of
 * failing. TODO: Eventually we should update this integration test so that it
 * creates any data that it needs.
 *
 */
public class ListDomainsIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * Tests that the listDomains operation returns a list of domain names,
     * correctly limited by the max domains parameter.
     */
    @Test
    public void testListDomainsMaxDomains() throws Exception {
        ListDomainsRequest request = new ListDomainsRequest();
        request.setMaxNumberOfDomains(new Integer(1));

        ListDomainsResult listDomains = sdb.listDomains(request);
        assertNotNull(listDomains);

        if (listDomains.getDomainNames().size() < 2) {
            System.err.println("Unable to run " + this.getClass().getName()
                    + " integration test with the current AWS account"
                    + " because not enough domains are present to test list pagination");
            return;
        }

        List<String> domainNames = listDomains.getDomainNames();
        assertNotNull(domainNames);
        assertEquals(1, domainNames.size());
        assertNotNull(listDomains.getNextToken());
    }

    /**
     * Tests that the nextToken parameter works correctly with the listDomains
     * operation by asking for one domain name, then calling listDomains again
     * with the nextToken from the previous result and verifying that a
     * different domain name is returned.
     */
    @Test
    public void testListDomainsNextToken() throws Exception {
        ListDomainsRequest request = new ListDomainsRequest();
        request.setMaxNumberOfDomains(new Integer(1));

        ListDomainsResult listDomainsResult = sdb.listDomains(request);

        if (listDomainsResult.getDomainNames().size() < 2) {
            System.err.println("Unable to run " + this.getClass().getName()
                    + " integration test with the current AWS account"
                    + " because not enough domains are present to test list pagination");
            return;
        }

        String firstDomainName = listDomainsResult.getDomainNames().get(0);

        request.setNextToken(listDomainsResult.getNextToken());
        String secondDomainName =
                sdb.listDomains(request).getDomainNames().get(0);

        assertFalse(firstDomainName.equals(secondDomainName));
    }

    /**
     * Tests that an InvalidParameterValueException is thrown when the client
     * calls the listDomains service method with an invalid parameter value.
     */
    @Test
    public void testListDomainsInvalidParameterValueException() throws Exception {
        ListDomainsRequest request = new ListDomainsRequest();
        request.setMaxNumberOfDomains(new Integer(-1));

        try {
            sdb.listDomains(request);
            fail("Expected InvalidParameterValueException, but wasn't thrown");
        } catch (InvalidParameterValueException e) {
            assertValidException(e);
        }
    }

    /*
     * TODO: Not sure how to trigger the InvalidNextTokenException. What makes a
     * token invalid?
     */

}
