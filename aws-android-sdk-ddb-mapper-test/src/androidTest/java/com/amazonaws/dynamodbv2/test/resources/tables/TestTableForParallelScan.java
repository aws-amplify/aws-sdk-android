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

package com.amazonaws.dynamodbv2.test.resources.tables;

import com.amazonaws.dynamodbv2.test.util.DynamoDBTestBase;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.ParallelScanIntegrationTest;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

/**
 * Test table for {@link ParallelScanIntegrationTest}
 */
public class TestTableForParallelScan extends DynamoDBTableResource {

    public static final String TABLE_NAME = "java-sdk-parallel-scan";
    public static final String HASH_KEY_NAME = "hash";
    public static final Long READ_CAPACITY = 10L;
    public static final Long WRITE_CAPACITY = 5L;
    public static final ProvisionedThroughput DEFAULT_PROVISIONED_THROUGHPUT =
            new ProvisionedThroughput().withReadCapacityUnits(READ_CAPACITY)
                    .withWriteCapacityUnits(WRITE_CAPACITY);

    @Override
    protected AmazonDynamoDB getClient() {
        return DynamoDBTestBase.getClient();
    }

    @Override
    protected CreateTableRequest getCreateTableRequest() {
        CreateTableRequest createTableRequest = new CreateTableRequest()
                .withTableName(TABLE_NAME)
                .withKeySchema(
                        new KeySchemaElement().withAttributeName(HASH_KEY_NAME)
                                .withKeyType(KeyType.HASH))
                .withAttributeDefinitions(
                        new AttributeDefinition().withAttributeName(
                                HASH_KEY_NAME).withAttributeType(
                                ScalarAttributeType.N))
                .withProvisionedThroughput(DEFAULT_PROVISIONED_THROUGHPUT);
        return createTableRequest;
    }

}
