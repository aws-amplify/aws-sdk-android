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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.dynamodbv2.test.util.DynamoDBTestBase;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableResult;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableResult;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.util.Tables;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncServiceIntegrationTest extends DynamoDBTestBase {

    /** The DynamoDB asynchronous client to be used in this test. */
    private static AmazonDynamoDBAsyncClient dynamoAsync;

    /** Hashset to record all of the tables created in this test. */
    private static final HashSet<String> createdTableNames = new HashSet<String>();

    /** Name prefix of all the tables to be created in this test. */
    private static final String ASYNC_TEST_TABLE_NAME_PREFIX = "async-java-sdk-"
            + System.currentTimeMillis() + "-";

    private static final String HASH_KEY_NAME = "hash";

    /**
     * Overrding setUp() and tearDown in DynamoDBIntegrationTestBase.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        setUpCredentials();
        dynamoAsync = new AmazonDynamoDBAsyncClient(credentials);

        /*
         * Point the "dynamo" defined in test base to the reference of the async
         * client object that we are using, so that the utility methods will use
         * the async client.
         */
        dynamo = dynamoAsync;

    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("**********************************************************");
        System.out.println("*****************  AfterClass Procedure  *****************");
        System.out.println("**********************************************************");
        dynamoAsync.getExecutorService().shutdown();
        for (String tableName : createdTableNames) {
            try {
                Tables.waitForTableToBecomeActive(dynamo, tableName);
                dynamoAsync.deleteTable(new DeleteTableRequest(tableName));
            } catch (Exception e) {
                System.out.println("Error when trying to delect table [" + tableName + "]");
                System.out.println("Error detail: " + e.toString());
            }
        }
    }

    /**
     * Tests getting the CreateTableResult by polling Future object.
     */
    @Test(timeout = 60 * 1000)
    public void testAsyncCreateTableByPollingFuture() throws Exception {
        String TABLE_POLLINGFUTURE_SINGLETEST = ASYNC_TEST_TABLE_NAME_PREFIX
                + "testTimeForPollingFuture";
        if (Tables.doesTableExist(dynamo, TABLE_POLLINGFUTURE_SINGLETEST) == false) {
            // Create a table
            recordCreatedTestTable(TABLE_POLLINGFUTURE_SINGLETEST);
            CreateTableRequest createTableRequest = new CreateTableRequest()
                    .withTableName(TABLE_POLLINGFUTURE_SINGLETEST)
                    .withKeySchema(
                            new KeySchemaElement().withAttributeName(HASH_KEY_NAME).withKeyType(
                                    KeyType.HASH))
                    .withAttributeDefinitions(
                            new AttributeDefinition().withAttributeName(HASH_KEY_NAME)
                                    .withAttributeType(
                                            ScalarAttributeType.S));
            createTableRequest.setProvisionedThroughput(new ProvisionedThroughput()
                    .withReadCapacityUnits(20L).withWriteCapacityUnits(10L));

            // Call the async method to create the table
            Future<CreateTableResult> futureCreateTableResult = dynamoAsync
                    .createTableAsync(createTableRequest);
            long startPollingTime = System.currentTimeMillis();
            while (!futureCreateTableResult.isDone()) {
                // POLLING....
                // We need to check whether the task is somehow canceled
                if (futureCreateTableResult.isCancelled()) {
                    fail("[" + TABLE_POLLINGFUTURE_SINGLETEST + "] table is unexpectly canceled.");
                }
            }
            long finishPollingTime = System.currentTimeMillis();
            long timeForPolling = finishPollingTime - startPollingTime;
            System.out.println("We wasted " + timeForPolling + "ms in polling the Future!");

            TableDescription createdTableDescription = futureCreateTableResult.get()
                    .getTableDescription();
            System.out.println("Created Table: " + createdTableDescription);

            // Check whether the table is correctly created
            assertEquals(TABLE_POLLINGFUTURE_SINGLETEST, createdTableDescription.getTableName());
            assertNotNull(createdTableDescription.getTableStatus());
            assertEquals(HASH_KEY_NAME, createdTableDescription.getKeySchema().get(0)
                    .getAttributeName());
            assertEquals(KeyType.HASH.toString(), createdTableDescription.getKeySchema().get(0)
                    .getKeyType());
            assertEquals(HASH_KEY_NAME, createdTableDescription.getAttributeDefinitions().get(0)
                    .getAttributeName());
            assertEquals(ScalarAttributeType.S.toString(), createdTableDescription
                    .getAttributeDefinitions().get(0).getAttributeType());
        }
    }

    /**
     * Tests asynchronously processing the CreateTableResult by passing the
     * callback handler.
     */
    @Test(timeout = 60 * 1000)
    public void testAsyncCreateTableByCallback() throws Exception {
        final String TABLE_CALlBACK_SINGLETEST = ASYNC_TEST_TABLE_NAME_PREFIX
                + "testTimeForCallback";
        if (Tables.doesTableExist(dynamo, TABLE_CALlBACK_SINGLETEST) == false) {
            // Create a table
            recordCreatedTestTable(TABLE_CALlBACK_SINGLETEST);
            CreateTableRequest createTableRequest = new CreateTableRequest()
                    .withTableName(TABLE_CALlBACK_SINGLETEST)
                    .withKeySchema(
                            new KeySchemaElement().withAttributeName(HASH_KEY_NAME).withKeyType(
                                    KeyType.HASH))
                    .withAttributeDefinitions(
                            new AttributeDefinition().withAttributeName(HASH_KEY_NAME)
                                    .withAttributeType(
                                            ScalarAttributeType.S));
            createTableRequest.setProvisionedThroughput(new ProvisionedThroughput()
                    .withReadCapacityUnits(20L).withWriteCapacityUnits(20L));

            final long startTime = System.currentTimeMillis();
            // Call the async method to create the table
            dynamoAsync.createTableAsync(createTableRequest,
                    new AsyncHandler<CreateTableRequest, CreateTableResult>() {

                        @Override
                        public void onError(Exception exception) {
                            System.out.println("MysteriousException during creating table: ["
                                    + TABLE_CALlBACK_SINGLETEST + "]");
                            fail("Error detail: " + exception.toString());
                        }

                        @Override
                        public void onSuccess(CreateTableRequest request, CreateTableResult result) {
                            long endTime = System.currentTimeMillis();
                            long timeForPolling = endTime - startTime;
                            System.out.println("The callback function is called after "
                                    + timeForPolling + "ms.");

                            // Check whether the table is correctly created
                            TableDescription createdTableDescription = result.getTableDescription();
                            System.out.println("Created Table: " + createdTableDescription);
                            assertEquals(TABLE_CALlBACK_SINGLETEST,
                                    createdTableDescription.getTableName());
                            assertNotNull(createdTableDescription.getTableStatus());
                            assertEquals(HASH_KEY_NAME,
                                    createdTableDescription.getKeySchema().get(0)
                                            .getAttributeName());
                            assertEquals(KeyType.HASH.toString(), createdTableDescription
                                    .getKeySchema().get(0).getKeyType());
                            assertEquals(HASH_KEY_NAME, createdTableDescription
                                    .getAttributeDefinitions().get(0).getAttributeName());
                            assertEquals(ScalarAttributeType.S.toString(), createdTableDescription
                                    .getAttributeDefinitions().get(0).getAttributeType());
                        }
                    });
        }
    }

    /**
     * Tests async handler for AmazonServiceException.
     */
    @Test(timeout = 60 * 1000)
    public void testServiceExceptionCallback() throws Exception {
        DeleteTableRequest deleteNonexistentTableRequest = new DeleteTableRequest(
                "NONEXISTENT_TABLE");
        try {
            Future<DeleteTableResult> futureDeleteTableResult = dynamoAsync.deleteTableAsync(
                    deleteNonexistentTableRequest,
                    new AsyncHandler<DeleteTableRequest, DeleteTableResult>() {

                        @Override
                        public void onError(Exception exception) {
                            assertTrue(exception instanceof AmazonServiceException);

                            AmazonServiceException ase = (AmazonServiceException) exception;
                            assertTrue(ase.getErrorCode().equalsIgnoreCase(
                                    "ResourceNotFoundException"));
                        }

                        @Override
                        public void onSuccess(DeleteTableRequest request, DeleteTableResult result) {
                            fail("We are not supposed to be in onCompleted handler!");
                        }
                    });
            // For backward compatibility, we need to make sure that the ASE is
            // rethrown to the calling thread
            // So... we wait for it!!
            System.out.println("Waiting for the ServiceExeption rethrown into the main thread!");
            futureDeleteTableResult.get();
            fail("Expected AmazonServiceException, but wasn't thrown");
        } catch (AmazonServiceException ex) {
            fail("The exception should be wrapped in ExcecutionException!");
        } catch (ExecutionException ex) {
            System.out.println("Successully catch the ExcecutionException in the calling thread!");
            assertTrue(ex.getCause() instanceof AmazonServiceException);
        } catch (Exception ex) {
            fail("The exception should be wrapped in ExcecutionException!");
        }
    }

    /**
     * Tests async handler for other runtime exceptions.
     */
    @Test(timeout = 60 * 1000)
    public void testClientExceptionCallback() throws Exception {
        // Passing a null request would trigger an AmazonClientExeption by
        CreateTableRequest createTableRequest = null;
        try {
            Future<CreateTableResult> futureDeleteTableResult = dynamoAsync.createTableAsync(
                    createTableRequest,
                    new AsyncHandler<CreateTableRequest, CreateTableResult>() {
                        @Override
                        public void onError(Exception exception) {
                            assertTrue(exception instanceof NullPointerException);
                        }

                        @Override
                        public void onSuccess(CreateTableRequest request, CreateTableResult result) {
                            fail("We are not supposed to be in onCompleted handler!");
                        }
                    });
            // For backward compatibility, we need to make sure that the ACE is
            // rethrown to the calling thread
            // So... we wait for it!!
            System.out.println("Waiting for the ClientExeption rethrown into the main thread!");
            futureDeleteTableResult.get();
            fail("Expected AmazonServiceException, but wasn't thrown");
        } catch (AmazonServiceException ex) {
            fail("The exception should be wrapped in ExcecutionException!");
        } catch (ExecutionException ex) {
            System.out.println("Successully catch the ExcecutionException in the calling thread!");
            assertTrue(ex.getCause() instanceof NullPointerException);
        } catch (Exception ex) {
            fail("The exception should be wrapped in ExcecutionException!");
        }
    }

    /**
     * Stress test on putItemAsync result handler.
     */
    @Test(timeout = 10 * 60 * 1000)
    public void stressTestAsyncCallbacks() throws Exception {
        final String TABLE_CALLBACK_STRESSTEST = ASYNC_TEST_TABLE_NAME_PREFIX
                + "stressTestAsyncCallbacks";
        final int STRESS_TEST_REQUEST_NUM = 20;
        final HashMap<Integer, Long> initialData = new HashMap<Integer, Long>();
        final HashMap<Integer, Long> responseTime = new HashMap<Integer, Long>();
        // Create the table
        if (Tables.doesTableExist(dynamo, TABLE_CALLBACK_STRESSTEST) == false) {
            // Create a table
            recordCreatedTestTable(TABLE_CALLBACK_STRESSTEST);
            CreateTableRequest createTableRequest = new CreateTableRequest()
                    .withTableName(TABLE_CALLBACK_STRESSTEST)
                    .withKeySchema(
                            new KeySchemaElement().withAttributeName(HASH_KEY_NAME).withKeyType(
                                    KeyType.HASH))
                    .withAttributeDefinitions(
                            new AttributeDefinition().withAttributeName(HASH_KEY_NAME)
                                    .withAttributeType(
                                            ScalarAttributeType.S));

            createTableRequest.setProvisionedThroughput(new ProvisionedThroughput()
                    .withReadCapacityUnits(20L)
                    .withWriteCapacityUnits((long) STRESS_TEST_REQUEST_NUM));

            TableDescription createdTableDescription = dynamoAsync.createTable(createTableRequest)
                    .getTableDescription();
            System.out.println("Created Table: " + createdTableDescription);
            assertEquals(TABLE_CALLBACK_STRESSTEST, createdTableDescription.getTableName());
            assertNotNull(createdTableDescription.getTableStatus());
            assertEquals(HASH_KEY_NAME, createdTableDescription.getKeySchema().get(0)
                    .getAttributeName());
            assertEquals(KeyType.HASH.toString(), createdTableDescription.getKeySchema().get(0)
                    .getKeyType());
            assertEquals(HASH_KEY_NAME, createdTableDescription.getAttributeDefinitions().get(0)
                    .getAttributeName());
            assertEquals(ScalarAttributeType.S.toString(), createdTableDescription
                    .getAttributeDefinitions().get(0).getAttributeType());
        }
        try {
            Tables.waitForTableToBecomeActive(dynamo, TABLE_CALLBACK_STRESSTEST);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
        // Use synchronized method to put some initial data
        long initialStartTime = System.currentTimeMillis();
        try {
            for (int request_id = 0; request_id < STRESS_TEST_REQUEST_NUM; request_id++) {
                Map<String, AttributeValue> item = new HashMap<String, AttributeValue>();
                item.put(HASH_KEY_NAME, new AttributeValue(Integer.toString(request_id)));
                long initialRequestTime = System.currentTimeMillis();
                item.put("request_time", new AttributeValue(Long.toString(initialRequestTime)));
                initialData.put(request_id, initialRequestTime);
                PutItemRequest putItemRequest = new PutItemRequest(TABLE_CALLBACK_STRESSTEST, item)
                        .withReturnValues(ReturnValue.NONE.toString());
                dynamoAsync.putItem(putItemRequest);
            }
        } catch (Exception e) {
            fail("Error during putting initial data!");
        }
        final long initialPutTime = System.currentTimeMillis() - initialStartTime;
        System.out
                .println("**************************************************************************************");
        System.out.println(initialPutTime + "ms spent in putting " + STRESS_TEST_REQUEST_NUM
                + " initial items.");
        System.out
                .println("**************************************************************************************");
        // Now use asynchronized method to update these entries
        final long asyncStartTime = System.currentTimeMillis();
        try {
            for (int request_id = 0; request_id < STRESS_TEST_REQUEST_NUM; request_id++) {
                final int request_id_context = request_id;
                Map<String, AttributeValue> item = new HashMap<String, AttributeValue>();
                item.put(HASH_KEY_NAME, new AttributeValue(Integer.toString(request_id)));
                long asyncRequestTime = System.currentTimeMillis();
                item.put("request_time", new AttributeValue(Long.toString(asyncRequestTime)));
                PutItemRequest putItemRequest = new PutItemRequest(TABLE_CALLBACK_STRESSTEST, item)
                        .withReturnValues(ReturnValue.ALL_OLD.toString());
                dynamoAsync.putItemAsync(putItemRequest,
                        new AsyncHandler<PutItemRequest, PutItemResult>() {

                            @Override
                            public void onError(Exception exception) {
                                fail("Unexpected error during updating table ["
                                        + TABLE_CALLBACK_STRESSTEST + "].");
                            }

                            @Override
                            public void onSuccess(PutItemRequest request, PutItemResult result) {
                                // PROCESS THE RESPOND
                                // Check that values in PutItemResult are the
                                // same as recorded in initialData
                                int responsedRequestID = Integer.parseInt(result.getAttributes()
                                        .get(HASH_KEY_NAME).getS());
                                long responsedRequestTime = Long.parseLong(result.getAttributes()
                                        .get("request_time").getS());
                                assertEquals(responsedRequestTime,
                                        initialData.get(responsedRequestID).longValue());
                                // PROCESS THE CONTEXT
                                // Check that we have access to the context of
                                // the AsyncHandler
                                assertEquals(responsedRequestID, request_id_context);
                                // Record the time of the response
                                responseTime.put(responsedRequestID, System.currentTimeMillis());
                                // Check whether the stress test is finished
                                if (responseTime.size() == STRESS_TEST_REQUEST_NUM) {
                                    long asyncPutResponseTime = System.currentTimeMillis()
                                            - asyncStartTime;
                                    System.out
                                            .println("***********************************************************************************************************************");
                                    System.out.println(asyncPutResponseTime
                                            + "ms spent in waiting for all the "
                                            + STRESS_TEST_REQUEST_NUM
                                            + " responses of putItemAsync requests.");
                                    System.out.println("Time spent on synchronized requests: "
                                            + initialPutTime + " ms.");
                                    System.out.println("Time spent on asynchronized requests: "
                                            + asyncPutResponseTime + " ms.");
                                    System.out
                                            .println("***********************************************************************************************************************");
                                }
                            }
                        });
            }
        } catch (Exception e) {
            fail("Error during updating data by asynchronized method!");
        }
        long asyncPutTime = System.currentTimeMillis() - asyncStartTime;
        System.out
                .println("**************************************************************************************");
        System.out.println(asyncPutTime
                + " ms spent in the main thread for calling the asynchonized method!");
        System.out
                .println("**************************************************************************************");
        try {
            System.out.println("Waiting for all the asynchronized responses.");
            Thread.sleep(initialPutTime);
        } catch (Exception e) {
            fail("Error during waiting for the asynchronized responses!");
        }
    }

    /**
     * Record the created test table, so that tearDown() will clean up all these
     * temporary tables.
     */
    private static void recordCreatedTestTable(String tableName) {
        createdTableNames.add(tableName);
    }
}
