/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryFormat;
import com.amazonaws.services.s3.model.inventory.InventoryFrequency;
import com.amazonaws.services.s3.model.inventory.InventoryIncludedObjectVersions;
import com.amazonaws.services.s3.model.inventory.InventoryOptionalField;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class BucketInventorySaxUnmarshallerTest {
    private static final String GET_RESPONSE = "/resources/unmarshalling/InventoryConfiguration.xml";
    private static final String LIST_RESPONSE = "/resources/unmarshalling/ListBucketInventoryConfigurationsResponse.xml";

    @Test
    public void getResponse_unmarshalls_properly() throws Exception {
        InventoryConfiguration configuration = parseGetBucketInventoryConfigurationResponse(GET_RESPONSE).getInventoryConfiguration();

        assertEquals("inventory-id", configuration.getId());

        InventoryS3BucketDestination s3BucketDestination = configuration.getDestination().getS3BucketDestination();
        assertEquals(InventoryFormat.CSV.toString(), s3BucketDestination.getFormat());
        assertEquals("accountId", s3BucketDestination.getAccountId());
        assertEquals("arn:aws:s3:::bucket", s3BucketDestination.getBucketArn());
        assertEquals("prefix", s3BucketDestination.getPrefix());

        assertTrue(configuration.isEnabled());
        assertEquals("prefix", ((InventoryPrefixPredicate) configuration.getInventoryFilter().getPredicate()).getPrefix());
        assertEquals(InventoryIncludedObjectVersions.All.toString(), configuration.getIncludedObjectVersions());

        List<String> optionalFields = configuration.getOptionalFields();
        assertEquals(3, optionalFields.size());
        assertTrue(optionalFields.containsAll(Arrays.asList(
                        InventoryOptionalField.LastModifiedDate.toString(),
                        InventoryOptionalField.StorageClass.toString(),
                        InventoryOptionalField.ReplicationStatus.toString())));
        assertFalse(optionalFields.contains(InventoryOptionalField.Size.toString()));

        assertEquals(InventoryFrequency.Daily.toString(), configuration.getSchedule().getFrequency());
    }

    @Test
    public void listResponse_unmarshalls_properly() throws Exception {
        ListBucketInventoryConfigurationsResult result = parseListBucketInventoryConfigurationsResponse(LIST_RESPONSE);

        assertTrue(result.isTruncated());
        assertEquals("token1", result.getContinuationToken());
        assertEquals("token2", result.getNextContinuationToken());

        List<InventoryConfiguration> inventoryConfigurationList = result.getInventoryConfigurationList();
        assertEquals(2, inventoryConfigurationList.size());
        InventoryConfiguration configuration = inventoryConfigurationList.get(0);

        assertEquals("configId", configuration.getId());

        InventoryS3BucketDestination s3BucketDestination = configuration.getDestination().getS3BucketDestination();
        assertEquals(InventoryFormat.CSV.toString(), s3BucketDestination.getFormat());
        assertEquals("accountId", s3BucketDestination.getAccountId());
        assertEquals("arn:aws:s3:::bucket", s3BucketDestination.getBucketArn());
        assertEquals("prefix", s3BucketDestination.getPrefix());

        assertTrue(configuration.isEnabled());
        assertEquals("prefix", ((InventoryPrefixPredicate) configuration.getInventoryFilter().getPredicate()).getPrefix());
        assertEquals(InventoryIncludedObjectVersions.All.toString(), configuration.getIncludedObjectVersions());

        List<String> optionalFields = configuration.getOptionalFields();
        assertEquals(3, optionalFields.size());
        assertTrue(optionalFields.containsAll(Arrays.asList(
                InventoryOptionalField.LastModifiedDate.toString(),
                InventoryOptionalField.StorageClass.toString(),
                InventoryOptionalField.ReplicationStatus.toString())));
        assertFalse(optionalFields.contains(InventoryOptionalField.Size.toString()));

        assertEquals(InventoryFrequency.Daily.toString(), configuration.getSchedule().getFrequency());

        // Assert second Inventory configuration
        configuration = inventoryConfigurationList.get(1);
        assertEquals("configId2", configuration.getId());
        assertNull(configuration.getInventoryFilter().getPredicate());
    }

    /**
     * @param resourceLocation
     *            Location of resource containing XML to unmarshall
     * @return Marshalled response
     */
    private GetBucketInventoryConfigurationResult parseGetBucketInventoryConfigurationResponse(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseGetBucketInventoryConfigurationResponse(getClass().getResourceAsStream(resourceLocation))
                .getResult();
    }

    private ListBucketInventoryConfigurationsResult parseListBucketInventoryConfigurationsResponse(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseBucketListInventoryConfigurationsResponse(getClass().getResourceAsStream(resourceLocation))
                .getResult();
    }
}
