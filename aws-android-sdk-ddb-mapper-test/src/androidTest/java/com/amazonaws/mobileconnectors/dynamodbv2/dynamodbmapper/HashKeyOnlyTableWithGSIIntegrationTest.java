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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import static org.junit.Assert.assertEquals;

import com.amazonaws.dynamodbv2.test.util.DynamoDBTestBase;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.services.dynamodbv2.model.ProjectionType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.util.Tables;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Integration test for GSI support with a table that has no primary range key
 * (only a primary hash key).
 */
public class HashKeyOnlyTableWithGSIIntegrationTest extends DynamoDBMapperIntegrationTestBase {

    public static final String HASH_KEY_ONLY_TABLE_NAME = "no-primary-range-key-gsi-test";

    @BeforeClass
    public static void setUp() {
        DynamoDBTestBase.setUpTestBase();
        List<KeySchemaElement> keySchema = new ArrayList<KeySchemaElement>();
        keySchema.add(new KeySchemaElement("id", KeyType.HASH));

        CreateTableRequest req = new CreateTableRequest(HASH_KEY_ONLY_TABLE_NAME, keySchema)
                .withProvisionedThroughput(new ProvisionedThroughput(10L, 10L))
                .withAttributeDefinitions(
                        new AttributeDefinition("id", ScalarAttributeType.S),
                        new AttributeDefinition("status", ScalarAttributeType.S),
                        new AttributeDefinition("ts", ScalarAttributeType.S))
                .withGlobalSecondaryIndexes(
                        new GlobalSecondaryIndex()
                                .withProvisionedThroughput(new ProvisionedThroughput(10L, 10L))
                                .withIndexName("statusAndCreation")
                                .withKeySchema(
                                        new KeySchemaElement("status", KeyType.HASH),
                                        new KeySchemaElement("ts", KeyType.RANGE))
                                .withProjection(
                                        new Projection().withProjectionType(ProjectionType.ALL)));

        if (Tables.doesTableExist(dynamo, HASH_KEY_ONLY_TABLE_NAME) == false) {
            dynamo.createTable(req);
        }

        Tables.waitForTableToBecomeActive(dynamo, HASH_KEY_ONLY_TABLE_NAME);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        dynamo.deleteTable(HASH_KEY_ONLY_TABLE_NAME);
    }

    @DynamoDBTable(tableName = HASH_KEY_ONLY_TABLE_NAME)
    public static class User {
        private String id;
        private String status;
        private String ts;

        @DynamoDBHashKey
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @DynamoDBIndexHashKey(globalSecondaryIndexName = "statusAndCreation")
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @DynamoDBIndexRangeKey(globalSecondaryIndexName = "statusAndCreation")
        public String getTs() {
            return ts;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }
    }

    /**
     * Tests that we can query using the hash/range GSI on our hash-key only
     * table.
     */
    @Test
    public void testGSIQuery() throws Exception {
        DynamoDBMapper mapper = new DynamoDBMapper(dynamo);
        String status = "foo-status";

        User user = new User();
        user.setId("123");
        user.setStatus(status);
        user.setTs("321");
        mapper.save(user);

        DynamoDBQueryExpression<User> expr = new DynamoDBQueryExpression<User>()
                .withIndexName("statusAndCreation")
                .withLimit(100)
                .withConsistentRead(false)
                .withHashKeyValues(user)
                .withRangeKeyCondition("ts",
                        new Condition()
                                .withComparisonOperator(ComparisonOperator.GT)
                                .withAttributeValueList(new AttributeValue("100")));

        PaginatedQueryList<User> query = mapper.query(User.class, expr);
        assertEquals(1, query.size());
        assertEquals(status, query.get(0).getStatus());
    }

}
