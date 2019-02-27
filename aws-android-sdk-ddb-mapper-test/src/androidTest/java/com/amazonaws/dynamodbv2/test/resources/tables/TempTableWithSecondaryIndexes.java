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
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.services.dynamodbv2.model.ProjectionType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

/**
 * The table used by SecondaryIndexesIntegrationTest
 */
public class TempTableWithSecondaryIndexes extends DynamoDBTableResource {

    public static final String TEMP_TABLE_NAME = "java-sdk-indexes-" + System.currentTimeMillis();
    public static final String HASH_KEY_NAME = "hash_key";
    public static final String RANGE_KEY_NAME = "range_key";
    public static final String LSI_NAME = "local_secondary_index";
    public static final String LSI_RANGE_KEY_NAME = "local_secondary_index_attribute";
    public static final String GSI_NAME = "global_secondary_index";
    public static final String GSI_HASH_KEY_NAME = "global_secondary_index_hash_attribute";
    public static final String GSI_RANGE_KEY_NAME = "global_secondary_index_range_attribute";
    public static final ProvisionedThroughput GSI_PROVISIONED_THROUGHPUT = new ProvisionedThroughput(
            5L, 5L);

    @Override
    protected AmazonDynamoDB getClient() {
        return DynamoDBTestBase.getClient();
    }

    /**
     * Table schema: Hash Key : HASH_KEY_NAME (S) Range Key : RANGE_KEY_NAME (N)
     * LSI schema: Hash Key : HASH_KEY_NAME (S) Range Key : LSI_RANGE_KEY_NAME
     * (N) GSI schema: Hash Key : GSI_HASH_KEY_NAME (N) Range Key :
     * GSI_RANGE_KEY_NAME (N)
     */
    @Override
    protected CreateTableRequest getCreateTableRequest() {
        CreateTableRequest createTableRequest = new CreateTableRequest()
                .withTableName(TEMP_TABLE_NAME)
                .withKeySchema(
                        new KeySchemaElement().withAttributeName(HASH_KEY_NAME)
                                .withKeyType(KeyType.HASH),
                        new KeySchemaElement()
                                .withAttributeName(RANGE_KEY_NAME).withKeyType(
                                        KeyType.RANGE))
                .withAttributeDefinitions(
                        new AttributeDefinition().withAttributeName(
                                HASH_KEY_NAME).withAttributeType(
                                ScalarAttributeType.S),
                        new AttributeDefinition().withAttributeName(
                                RANGE_KEY_NAME).withAttributeType(
                                ScalarAttributeType.N),
                        new AttributeDefinition().withAttributeName(
                                LSI_RANGE_KEY_NAME).withAttributeType(
                                ScalarAttributeType.N),
                        new AttributeDefinition().withAttributeName(
                                GSI_HASH_KEY_NAME).withAttributeType(
                                ScalarAttributeType.S),
                        new AttributeDefinition().withAttributeName(
                                GSI_RANGE_KEY_NAME).withAttributeType(
                                ScalarAttributeType.N))
                .withProvisionedThroughput(BasicTempTable.DEFAULT_PROVISIONED_THROUGHPUT)
                .withLocalSecondaryIndexes(
                        new LocalSecondaryIndex()
                                .withIndexName(LSI_NAME)
                                .withKeySchema(
                                        new KeySchemaElement()
                                                .withAttributeName(
                                                        HASH_KEY_NAME)
                                                .withKeyType(KeyType.HASH),
                                        new KeySchemaElement()
                                                .withAttributeName(
                                                        LSI_RANGE_KEY_NAME)
                                                .withKeyType(KeyType.RANGE))
                                .withProjection(
                                        new Projection()
                                                .withProjectionType(ProjectionType.KEYS_ONLY)))
                .withGlobalSecondaryIndexes(
                        new GlobalSecondaryIndex().withIndexName(GSI_NAME)
                                .withKeySchema(
                                        new KeySchemaElement()
                                                .withAttributeName(
                                                        GSI_HASH_KEY_NAME)
                                                .withKeyType(KeyType.HASH),
                                        new KeySchemaElement()
                                                .withAttributeName(
                                                        GSI_RANGE_KEY_NAME)
                                                .withKeyType(KeyType.RANGE))
                                .withProjection(
                                        new Projection()
                                                .withProjectionType(ProjectionType.KEYS_ONLY))
                                .withProvisionedThroughput(
                                        GSI_PROVISIONED_THROUGHPUT));
        return createTableRequest;
    }

}
