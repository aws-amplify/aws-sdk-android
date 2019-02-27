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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.mobileconnectors.dynamodbv2.document.DeleteItemOperationConfig;
import com.amazonaws.mobileconnectors.dynamodbv2.document.PutItemOperationConfig;
import com.amazonaws.mobileconnectors.dynamodbv2.document.Table;
import com.amazonaws.mobileconnectors.dynamodbv2.document.UpdateItemOperationConfig;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Document;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBBool;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBEntry;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBList;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBNull;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Primitive;
import com.amazonaws.mobileconnectors.dynamodbv2.document.internal.JsonUtils;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.util.Tables;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import javax.net.ssl.X509TrustManager;

public class DocumentCRUDIntegrationTest extends DynamoDBIntegrationTestBase {

    protected static final String STRING_HASH_KEY_NAME = "key";
    protected static final String HASH_KEY_TABLE_NAME = "aws-android-sdk-hash-key-table";

    static class TrustAllManager implements X509TrustManager {
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] certs, String authType) {
            // No-op, to trust all certs
        }

        @Override
        public void checkServerTrusted(X509Certificate[] certs, String authType) {
            // No-op, to trust all certs
        }
    }

    @BeforeClass
    public static void setUp() throws Exception {
        setUpCredentials();

        final ClientConfiguration cc = new ClientConfiguration()
                .withTrustManager(new TrustAllManager());

        dynamo = new AmazonDynamoDBClient(credentials, cc);

        if (!Tables.doesTableExist(dynamo, HASH_KEY_TABLE_NAME)) {

            // Create a table
            final String keyName = STRING_HASH_KEY_NAME;
            final CreateTableRequest createTableRequest = new CreateTableRequest()
                    .withTableName(HASH_KEY_TABLE_NAME)
                    .withKeySchema(
                            new KeySchemaElement().withAttributeName(keyName).withKeyType(
                                    KeyType.HASH))
                    .withAttributeDefinitions(
                            new AttributeDefinition().withAttributeName(keyName).withAttributeType(
                                    ScalarAttributeType.S));
            createTableRequest.setProvisionedThroughput(new ProvisionedThroughput()
                    .withReadCapacityUnits(10L)
                    .withWriteCapacityUnits(5L));

            try {
                final TableDescription createdTableDescription = dynamo
                        .createTable(createTableRequest)
                        .getTableDescription();

                assertEquals(HASH_KEY_TABLE_NAME, createdTableDescription.getTableName());
                assertNotNull(createdTableDescription.getTableStatus());
                assertEquals(keyName, createdTableDescription.getKeySchema().get(0)
                        .getAttributeName());
                assertEquals(KeyType.HASH.toString(), createdTableDescription.getKeySchema().get(0)
                        .getKeyType());

            } catch (final Exception e) {
                e.printStackTrace();
            }
            Tables.waitForTableToBecomeActive(dynamo, HASH_KEY_TABLE_NAME);
        }
    }

    @AfterClass
    public static void cleanup() {
        dynamo.deleteTable(HASH_KEY_TABLE_NAME);
    }

    @Test
    public void putItemTests() throws Throwable {
        final Table table = Table.loadTable(dynamo, HASH_KEY_TABLE_NAME);

        assertNotNull(table);

        final Document doc = new Document();
        doc.put("key", UUID.randomUUID().toString());
        doc.put("value", "value1");

        final Document anotherDocument = new Document();
        anotherDocument.put("test1", "value2");
        doc.put("anotherDoc", anotherDocument);
        final Set<String> arrayOfString = new HashSet<String>();
        arrayOfString.add("string1");
        arrayOfString.add("string2");
        doc.put("pl", arrayOfString);

        final DynamoDBList dl = new DynamoDBList();
        for (int i = 0; i < 5; i++) {
            final Document dlDoc = new Document();
            dlDoc.put("key-" + i, "value-" + i);
            dl.add(dlDoc);
        }
        // doc.put("dynamodblist", dl);

        doc.put("numberkey", Integer.MAX_VALUE);
        doc.put("longkey", Long.MAX_VALUE);
        doc.put("floatkey", Float.MAX_VALUE);
        doc.put("nullvalue", DynamoDBNull.NULL);
        doc.put("boolvalue", false);

        final String json = JsonUtils.toJson(doc, true);

        table.putItem(doc);

    }

    @Test
    public void putItemTestsUsingJson() {
        final String uuid = UUID.randomUUID().toString();
        final Table table = Table.loadTable(dynamo, HASH_KEY_TABLE_NAME);
        final String inputJson = "{\"key\":" + uuid
                + ",\"integer\": 123123123,\"float\": 123123.12312,\"bool\": false,\"StringSet\": [ \"string1\", \"string2\"],\"List\": [{\"key-1\": \"value-1\"},{\"key-2\": \"value-2\"}]}";

        final Document documentFromJson = Document.fromJson(inputJson);

        assertEquals(documentFromJson.get("key").asString(), uuid);
        assertEquals(documentFromJson.get("float").asNumber().doubleValue(), 123123.12312, 0);
        assertEquals(documentFromJson.get("integer").asNumber().intValue(), 123123123);
        Assert.assertTrue(documentFromJson.get("StringSet") instanceof DynamoDBList);

        final DynamoDBList ddl = documentFromJson.get("List").asDynamoDBList();
        int count = 0;
        for (final Iterator iterator = ddl.iterator(); iterator.hasNext();) {
            final DynamoDBEntry dynamoDBEntry = (DynamoDBEntry) iterator.next();
            Assert.assertTrue(dynamoDBEntry instanceof Document);
            final Document d = (Document) dynamoDBEntry;
            if (count == 0) {
                Assert.assertEquals(d.get("key-1").asString(), "value-1");
            } else {
                Assert.assertEquals(d.get("key-2").asString(), "value-2");
            }
            count++;
        }
        table.putItem(documentFromJson);
    }

    @Test
    public void putItemTestsUsingJson2() {
        final String uuid = UUID.randomUUID().toString();
        final Table table = Table.loadTable(dynamo, HASH_KEY_TABLE_NAME);
        final String inputJson = "{\"key\":" + uuid
                + ",\"integer\": 123123123,\"float\": 123123.12312,\"bool\": false,\"StringSet\": [ \"string1\", \"string2\"],\"List\": [{\"key-1\": \"value-1\"},{\"key-2\": \"value-2\"}],\"anotherDoc\": {\"testing1\": \"value1\"}}";

        final Document documentFromJson = Document.fromJson(inputJson);

        assertEquals(documentFromJson.get("key").asString(), uuid);
        assertEquals(documentFromJson.get("float").asNumber().doubleValue(), 123123.12312, 0);
        assertEquals(documentFromJson.get("integer").asNumber().intValue(), 123123123);
        Assert.assertTrue(documentFromJson.get("StringSet") instanceof DynamoDBList);

        final DynamoDBList ddl = documentFromJson.get("List").asDynamoDBList();
        int count = 0;
        for (final Iterator iterator = ddl.iterator(); iterator.hasNext();) {
            final DynamoDBEntry dynamoDBEntry = (DynamoDBEntry) iterator.next();
            Assert.assertTrue(dynamoDBEntry instanceof Document);
            final Document d = (Document) dynamoDBEntry;
            if (count == 0) {
                Assert.assertEquals(d.get("key-1").asString(), "value-1");
            } else {
                Assert.assertEquals(d.get("key-2").asString(), "value-2");
            }
            count++;
        }
        final Document response = table.putItem(documentFromJson,
                new PutItemOperationConfig().withReturnValues(ReturnValue.ALL_OLD));
        assertNotNull(response);
    }

    @Test
    public void putGetItem() {
        final String uuid = UUID.randomUUID().toString();
        final Table table = Table.loadTable(dynamo, HASH_KEY_TABLE_NAME);
        final String inputJson = "{\"key\":" + uuid
                + ",\"integer\": 123123123,\"float\": 123123.12312,\"bool\": false,\"StringSet\": [ \"string1\", \"string2\"],\"List\": [{\"key-1\": \"value-1\"},{\"key-2\": \"value-2\"}],\"anotherDoc\": {\"testing1\": \"value1\"}}";

        final Document documentFromJson = Document.fromJson(inputJson);
        final Document response = table.putItem(documentFromJson,
                new PutItemOperationConfig().withReturnValues(ReturnValue.ALL_OLD));
        assertNotNull(response);

        final Document getItemDocument = table.getItem(new Primitive(uuid));
        assertNotNull(getItemDocument);
    }

    @Test
    public void testCrudOperation() {
        final String uuid = UUID.randomUUID().toString();
        final Table table = Table.loadTable(dynamo, HASH_KEY_TABLE_NAME);
        final String inputJson = "{\"key\":" + uuid
                + ",\"integer\": 51123123,\"float\": 123123.12312,\"bool\": false,\"StringSet\": [ \"string1\", \"string2\"],"
                + "\"List\": [{\"key-1\": \"value-1\"},{\"key-2\": \"value-2\"}],\"anotherDoc\": {\"testing1\": \"value1\"}, \"str\":\"strValue\"}";

        final Document documentFromJson = Document.fromJson(inputJson);
        final Document response = table.putItem(documentFromJson,
                new PutItemOperationConfig().withReturnValues(ReturnValue.ALL_OLD));
        assertNotNull(response);

        final Document getItemDocument = table.getItem(new Primitive(uuid));
        assertNotNull(getItemDocument);
        
        // check individual values
        assertEquals(getItemDocument.get("key").asString(), uuid);
        assertEquals(getItemDocument.get("float").asNumber().doubleValue(), 123123.12312, 0);
        assertEquals(getItemDocument.get("integer").asNumber().intValue(), 51123123);

        getItemDocument.put("bool", DynamoDBBool.TRUE);
        getItemDocument.put("str", "newValue");

        final Document updatedDocument = table.updateItem(getItemDocument,
                new UpdateItemOperationConfig().withReturnValues(ReturnValue.ALL_NEW));
        
        assertEquals(updatedDocument.get("str").asString(),"newValue"); // make sure the value is updated to set value
        assertEquals(updatedDocument.get("bool").asBoolean(), true); // make sure the value is updated to set value
        assertEquals(getItemDocument, updatedDocument);

        final Document deletedDocument = table.deleteItem(new Primitive(uuid),
                new DeleteItemOperationConfig().withReturnValues(ReturnValue.ALL_OLD));
        assertEquals(getItemDocument, deletedDocument);
    }

    @Test
    public void testCollection() {
        final String uuid = UUID.randomUUID().toString();
        final Table table = Table.loadTable(dynamo, HASH_KEY_TABLE_NAME);

        final Document document = new Document();
        document.put("key", uuid);
        document.put("EmptyList", new DynamoDBList());
        document.put("EmptyMap", new Document());
        table.putItem(document);

        final Document retrieved = table.getItem(new Primitive(uuid));

        final DynamoDBEntry mapEntry = retrieved.get("EmptyMap");
        assertNotNull(mapEntry);
        assertNotNull(mapEntry.asDocument());
        assertEquals(0, mapEntry.asDocument().size());

        final DynamoDBEntry listEntry = retrieved.get("EmptyList");
        assertNotNull(listEntry);
        assertNotNull(listEntry.asDynamoDBList());
        assertEquals(0, listEntry.asDynamoDBList().size());
    }


}
