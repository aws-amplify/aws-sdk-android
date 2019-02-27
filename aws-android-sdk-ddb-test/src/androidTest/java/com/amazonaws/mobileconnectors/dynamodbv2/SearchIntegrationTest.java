/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.dynamodbv2;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.mobileconnectors.dynamodbv2.DocumentCRUDIntegrationTest.TrustAllManager;
import com.amazonaws.mobileconnectors.dynamodbv2.document.Expression;
import com.amazonaws.mobileconnectors.dynamodbv2.document.QueryFilter;
import com.amazonaws.mobileconnectors.dynamodbv2.document.QueryOperationConfig;
import com.amazonaws.mobileconnectors.dynamodbv2.document.ScanOperationConfig;
import com.amazonaws.mobileconnectors.dynamodbv2.document.Search;
import com.amazonaws.mobileconnectors.dynamodbv2.document.Table;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Document;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.services.dynamodbv2.model.ProjectionType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.util.Tables;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SearchIntegrationTest extends DynamoDBIntegrationTestBase {

    protected static final String HASH_RANGE_TABLE_NAME = "aws-android-sdk-hash-range-key-table";

    @BeforeClass
    public static void Setup() throws FileNotFoundException, IOException {
        setUpCredentials();

        final ClientConfiguration cc = new ClientConfiguration()
                .withTrustManager(new TrustAllManager());

        dynamo = new AmazonDynamoDBClient(credentials, cc);

        if (!Tables.doesTableExist(dynamo, HASH_RANGE_TABLE_NAME)) {

            // Create a table
            final AttributeDefinition[] definitions = {
                    new AttributeDefinition().withAttributeName("Name").withAttributeType(
                            ScalarAttributeType.S),
                    new AttributeDefinition().withAttributeName("Age")
                            .withAttributeType(ScalarAttributeType.N),
                    new AttributeDefinition().withAttributeName("Company")
                            .withAttributeType(ScalarAttributeType.S),
                    new AttributeDefinition().withAttributeName("Score")
                            .withAttributeType(ScalarAttributeType.N),
                    new AttributeDefinition().withAttributeName("Manager")
                            .withAttributeType(ScalarAttributeType.S)
            };

            final CreateTableRequest createTableRequest = new CreateTableRequest()
                    .withTableName(HASH_RANGE_TABLE_NAME)
                    .withKeySchema(
                            new KeySchemaElement().withAttributeName("Name").withKeyType(
                                    KeyType.HASH),
                            new KeySchemaElement().withAttributeName("Age")
                                    .withKeyType(KeyType.RANGE))
                    .withAttributeDefinitions(Arrays.asList(definitions))
                    .withGlobalSecondaryIndexes(
                            new GlobalSecondaryIndex()
                                    .withIndexName("globalindex")
                                    .withKeySchema(new KeySchemaElement()
                                            .withAttributeName("Company").withKeyType(KeyType.HASH),
                                            new KeySchemaElement().withAttributeName("Score")
                                                    .withKeyType(KeyType.RANGE))
                                    .withProjection(
                                            new Projection().withProjectionType(ProjectionType.ALL))
                                    .withProvisionedThroughput(new ProvisionedThroughput(1L, 1L)))
                    .withLocalSecondaryIndexes(new LocalSecondaryIndex().withIndexName("localindex")
                            .withKeySchema(
                                    new KeySchemaElement().withAttributeName("Name")
                                            .withKeyType(KeyType.HASH),
                                    new KeySchemaElement().withAttributeName("Manager")
                                            .withKeyType(KeyType.RANGE))
                            .withProjection(
                                    new Projection().withNonKeyAttributes("Company", "Score")
                                            .withProjectionType(ProjectionType.INCLUDE)))
                    .withProvisionedThroughput(new ProvisionedThroughput(50L, 50L));

            try {
                dynamo.createTable(createTableRequest);

            } catch (final Exception e) {
                e.printStackTrace();
            }
            Tables.waitForTableToBecomeActive(dynamo, HASH_RANGE_TABLE_NAME);
        }
    }

    @AfterClass
    public static void cleanup() {
        try {
            dynamo.deleteTable(HASH_RANGE_TABLE_NAME);
        } catch (AmazonClientException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void query() {
        final Table table = Table.loadTable(dynamo, HASH_RANGE_TABLE_NAME);

        final Document doc1 = new Document();
        doc1.put("Name", "Gunnar");
        doc1.put("Age", 77);
        doc1.put("Job", "Retired");
        table.putItem(doc1);

        final Document doc2 = new Document();
        doc2.put("Name", "Gunnar");
        doc2.put("Age", 77);
        doc2.put("Job", "Electrician");
        table.putItem(doc2);

        final Expression expression = new Expression();
        expression.setExpressionStatement("Job = :job");
        expression.withExpressionAttibuteValues(":job", new Primitive("Electrician"));

        Search searchResult = table.query(new Primitive("Gunnar"), expression);
        List<Document> documents = searchResult.getAllResults();

        Assert.assertEquals(1, documents.size());
        Assert.assertEquals((Integer) 77, documents.get(0).asDocument().get("Age").asInt());

        searchResult = table.query(new QueryOperationConfig()
                .withFilter(new QueryFilter("Name", ComparisonOperator.EQ,
                        Arrays.asList(new AttributeValue("Gunnar"))))
                .withFilterExpression(expression));

        documents = searchResult.getAllResults();

        Assert.assertEquals(1, documents.size());
        Assert.assertEquals((Integer) 77, documents.get(0).asDocument().get("Age").asInt());

        table.deleteItem(new Primitive("Gunnar"), new Primitive(77));
    }

    @Test
    public void scan() {
        final Table table = Table.loadTable(dynamo, HASH_RANGE_TABLE_NAME);

        final Document doc1 = new Document();
        doc1.put("Name", "Lewis");
        doc1.put("Age", 7);
        doc1.put("School", "Elementary");
        table.putItem(doc1);

        final Document doc2 = new Document();
        doc2.put("Name", "Frida");
        doc2.put("Age", 3);
        doc2.put("School", "Preschool");
        table.putItem(doc2);

        final Expression expression = new Expression();
        expression.setExpressionStatement("Age > :age");
        expression.withExpressionAttibuteValues(":age", new Primitive(5));

        Search searchResult = table.scan(expression);
        List<Document> documents = searchResult.getAllResults();

        Assert.assertEquals(1, documents.size());
        Assert.assertEquals("Elementary", documents.get(0).asDocument().get("School").asString());

        searchResult = table.scan(new ScanOperationConfig()
                .withFilterExpression(expression));
        documents = searchResult.getAllResults();

        Assert.assertEquals(1, documents.size());
        Assert.assertEquals("Elementary", documents.get(0).asDocument().get("School").asString());
        table.deleteItem(new Primitive("Lewis"), new Primitive(7));
        table.deleteItem(new Primitive("Frida"), new Primitive(5));
    }

}
