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

package com.amazonaws.services.dynamodbv2;

import com.amazonaws.dynamodbv2.test.resources.tables.BasicTempTableWithLowThroughput;
import com.amazonaws.dynamodbv2.test.util.DynamoDBTestBase;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.testutils.resources.RequiredResources;
import com.amazonaws.testutils.resources.RequiredResources.RequiredResource;
import com.amazonaws.testutils.resources.RequiredResources.ResourceCreationPolicy;
import com.amazonaws.testutils.resources.RequiredResources.ResourceRetentionPolicy;
import com.amazonaws.testutils.resources.ResourceCentricBlockJUnit4ClassRunner;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/**
 * DynamoDB integration tests around ProvisionedThroughput/throttling errors.
 */
@RunWith(ResourceCentricBlockJUnit4ClassRunner.class)
@RequiredResources({
        @RequiredResource(resource = BasicTempTableWithLowThroughput.class,
                creationPolicy = ResourceCreationPolicy.ALWAYS_RECREATE,
                retentionPolicy = ResourceRetentionPolicy.DESTROY_AFTER_ALL_TESTS)
})
public class ProvisionedThroughputThrottlingIntegrationTest extends DynamoDBTestBase {

    private static final String tableName = BasicTempTableWithLowThroughput.TEMP_TABLE_NAME;
    private static final String HASH_KEY_NAME = BasicTempTableWithLowThroughput.HASH_KEY_NAME;

    @BeforeClass
    public static void setUp() throws Exception {
        DynamoDBTestBase.setUpTestBase();
    }

    /**
     * Tests that throttling errors and delayed retries are automatically
     * handled for users. We trigger ProvisionedThroughputExceededExceptions
     * here because of the low throughput on our test table, but users shouldn't
     * see any problems because of the backoff and retry strategy.
     */
    @Test
    public void testProvisionedThroughputExceededRetryHandling() throws Exception {
        for (int i = 0; i < 20; i++) {
            Map<String, AttributeValue> item = Collections.singletonMap(HASH_KEY_NAME,
                    new AttributeValue(UUID.randomUUID().toString()));
            dynamo.putItem(new PutItemRequest(tableName, item));
        }
    }

}
