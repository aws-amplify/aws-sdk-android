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

package com.amazonaws.services.sqs;

import android.util.Log;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.services.sqs.model.AddPermissionRequest;
import com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.DeleteQueueRequest;
import com.amazonaws.services.sqs.model.GetQueueAttributesRequest;
import com.amazonaws.services.sqs.model.GetQueueAttributesResult;
import com.amazonaws.services.sqs.model.GetQueueUrlRequest;
import com.amazonaws.services.sqs.model.GetQueueUrlResult;
import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest;
import com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult;
import com.amazonaws.services.sqs.model.ListQueuesRequest;
import com.amazonaws.services.sqs.model.ListQueuesResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.QueueAttributeName;
import com.amazonaws.services.sqs.model.ReceiptHandleIsInvalidException;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.RemovePermissionRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.amazonaws.services.sqs.model.SetQueueAttributesRequest;

import org.json.JSONException;
import org.junit.After;
import org.junit.Test;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Integration tests for the SQS Java client.
 */
public class SqsIntegrationTest extends IntegrationTestBase {
    public static final String TAG = SqsIntegrationTest.class.getSimpleName();

    private static final String ATTRIBUTE_VALUE = "42";
    private static final String ATTRIBUTE_NAME = "VisibilityTimeout";
    private static final String SPECIAL_CHARS = "%20%25~!@#$^&*(){}[]_-+\\<>/?";

    private static final String MESSAGE_BODY = "foobarbazbar" + SPECIAL_CHARS;
    private long dateTime = new Date().getTime();
    private String queueName = "android-sdk-integ-test-queue-" + dateTime;
    private String queueUrl;

    private String deadLetterQueueName = "android-sdk-integ-test-dlq-" + dateTime;
    private String deadLetterQueueUrl;
    private String deadLetterConfigAttributeName = "RedrivePolicy";



    private String getDeadLetterQueueArn() throws JSONException {

        return  "arn:aws:sqs:" + getPackageConfigure().getString("test_region") + ":" + getAccountId()+ ":"
                + deadLetterQueueName;
    }

    private String getDeadLetterConfigAttributeValue() throws JSONException {
        return "{\"maxReceiveCount\" : 5, \"deadLetterTargetArn\" : \""
                + getDeadLetterQueueArn() + "\"}";
    }

    /** Releases all resources used by these tests */
    @After
    public void tearDown() throws Exception {
        try {
            sqsClient.deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
            sqsClient.deleteQueue(new DeleteQueueRequest().withQueueUrl(deadLetterQueueUrl));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Test using a client that points in one region, to work with a queue
     * that's in a different region.
     */
    @Test
    public void testCrossRegionQueueCalls() {
        // Create a new SQS client, hiding the shared instance, so that
        // we can change the endpoint without messing up other tests.
        AmazonSQSClient sqs = createSQS();
        sqs.setEndpoint("sqs.eu-west-1.amazonaws.com");

        // Create a queue in eu-west-1
        String euQueueURL = sqs.createQueue(
                new CreateQueueRequest("java-sdk-cross-region-test-" + System.currentTimeMillis()))
                .getQueueUrl();
        assertNotNull(getQueueCreationDate(sqs, euQueueURL));

        // Change the client's endpoint and verify that we can still access the
        // eu-west-1 queue
        sqs.setEndpoint("sqsClient.ap-southeast-2.amazonaws.com");
        assertNotNull(getQueueCreationDate(sqs, euQueueURL));
    }

    private String getQueueCreationDate(AmazonSQS sqs, String queueURL) {
        GetQueueAttributesRequest request = new GetQueueAttributesRequest(queueURL)
                .withAttributeNames(QueueAttributeName.CreatedTimestamp.toString());
        Map<String, String> attributes = sqs.getQueueAttributes(request).getAttributes();
        return attributes.get(QueueAttributeName.CreatedTimestamp.toString());
    }

    /**
     * Tests that each SQS operation can be called correctly, and that the
     * result data is correctly unmarshalled.
     */
    @Test
    public void testSqsOperations() throws Exception {
        // Create a queue for testing
        CreateQueueRequest createQueueRequest = new CreateQueueRequest().withQueueName(queueName);
        CreateQueueResult createQueueResult = sqsClient.createQueue(createQueueRequest);
        queueUrl = createQueueResult.getQueueUrl();

        // Get Queue URL
        GetQueueUrlResult getQueueUrlResult = sqsClient.getQueueUrl(new GetQueueUrlRequest()
                .withQueueName(queueName));
        assertEquals(queueUrl, getQueueUrlResult.getQueueUrl());

        // ListQueues
        ListQueuesRequest listQueuesRequest = new ListQueuesRequest()
                .withQueueNamePrefix(queueName);
        ListQueuesResult listQueuesResult = sqsClient.listQueues(listQueuesRequest);
        assertTrue(1 == listQueuesResult.getQueueUrls().size());
        assertEquals(queueUrl, listQueuesResult.getQueueUrls().get(0));

        // SetQueueAttributes
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put(ATTRIBUTE_NAME, ATTRIBUTE_VALUE);
        SetQueueAttributesRequest setQueueAttributesRequest = new SetQueueAttributesRequest();
        sqsClient.setQueueAttributes(setQueueAttributesRequest
                .withQueueUrl(queueUrl)
                .withAttributes(attributes));

        // GetQueueAttributes
        Thread.sleep(1000 * 10);
        GetQueueAttributesResult queueAttributesResult = sqsClient.getQueueAttributes(
                new GetQueueAttributesRequest()
                        .withQueueUrl(queueUrl)
                        .withAttributeNames(new String[] {
                            ATTRIBUTE_NAME
                        }));
        assertTrue(1 == queueAttributesResult.getAttributes().size());
        Map<String, String> attributes2 = queueAttributesResult.getAttributes();
        assertTrue(1 == attributes2.size());
        assertNotNull(attributes2.get(ATTRIBUTE_NAME));

        // AddPermission
        sqsClient.addPermission(new AddPermissionRequest()
                .withActions(new String[] {
                        "SendMessage", "DeleteMessage"
                })
                .withAWSAccountIds(new String[] {
                    "599169622985"
                })
                .withLabel("foo-label")
                .withQueueUrl(queueUrl));

        // RemovePermission
        Thread.sleep(1000 * 2);
        sqsClient.removePermission(new RemovePermissionRequest()
                .withLabel("foo-label")
                .withQueueUrl(queueUrl));

        // SendMessage - send several to ensure we have something in our queue
        for (int i = 0; i < 10; i++) {
            SendMessageResult sendMessageResult = sqsClient.sendMessage(
                    new SendMessageRequest()
                            .withDelaySeconds(1)
                            .withMessageBody(MESSAGE_BODY)
                            .withQueueUrl(queueUrl));
            assertNotEmpty(sendMessageResult.getMessageId());
            assertNotEmpty(sendMessageResult.getMD5OfMessageBody());
        }

        // ReceiveMessage
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest();
        ReceiveMessageResult receiveMessageResult = sqsClient.receiveMessage(
                receiveMessageRequest
                        .withQueueUrl(queueUrl)
                        .withWaitTimeSeconds(5)
                        .withMaxNumberOfMessages(new Integer(8))
                        .withAttributeNames(new String[] {
                                "SenderId", "SentTimestamp", "All"
                        }));
        assertFalse(receiveMessageResult.getMessages().isEmpty());
        Message message = receiveMessageResult.getMessages().get(0);
        assertEquals(MESSAGE_BODY, message.getBody());
        assertNotEmpty(message.getMD5OfBody());
        assertNotEmpty(message.getMessageId());
        assertNotEmpty(message.getReceiptHandle());
        assertTrue(message.getAttributes().size() > 3);

        for (java.util.Iterator iterator = message.getAttributes().entrySet().iterator(); iterator
                .hasNext();) {
            Object value = iterator.next();
            Entry<String, String> entry = (Entry<String, String>) value;

            assertNotEmpty((entry.getKey()));
            assertNotEmpty((entry.getValue()));
        }

        // SendMessageBatch
        SendMessageBatchResult sendMessageBatchResult = sqsClient
                .sendMessageBatch(new SendMessageBatchRequest()
                        .withQueueUrl(queueUrl).withEntries(
                                new SendMessageBatchRequestEntry().withId("1").withMessageBody(
                                        "1" + SPECIAL_CHARS),
                                new SendMessageBatchRequestEntry().withId("2").withMessageBody(
                                        "2" + SPECIAL_CHARS),
                                new SendMessageBatchRequestEntry().withId("3").withMessageBody(
                                        "3" + SPECIAL_CHARS),
                                new SendMessageBatchRequestEntry().withId("4").withMessageBody(
                                        "4" + SPECIAL_CHARS),
                                new SendMessageBatchRequestEntry().withId("5").withMessageBody(
                                        "5" + SPECIAL_CHARS)));
        assertNotNull(sendMessageBatchResult.getFailed());
        assertTrue(sendMessageBatchResult.getSuccessful().size() > 0);
        assertNotNull(sendMessageBatchResult.getSuccessful().get(0).getId());
        assertNotNull(sendMessageBatchResult.getSuccessful().get(0).getMD5OfMessageBody());
        assertNotNull(sendMessageBatchResult.getSuccessful().get(0).getMessageId());

        // ChangeMessageVisibility
        String receiptHandle = (receiveMessageResult.getMessages().get(0)).getReceiptHandle();
        sqsClient.changeMessageVisibility(new ChangeMessageVisibilityRequest()
                .withQueueUrl(queueUrl)
                .withReceiptHandle(receiptHandle)
                .withVisibilityTimeout(new Integer(123)));

        // DeleteMessage
        sqsClient.deleteMessage(new DeleteMessageRequest()
                .withQueueUrl(queueUrl)
                .withReceiptHandle(receiptHandle));

        // Tests configuring a dead-letter queue
        // Create the queue used for dead-letter
        CreateQueueResult createDLQResult = sqsClient.createQueue(new CreateQueueRequest()
                .withQueueName(deadLetterQueueName));
        deadLetterQueueUrl = createDLQResult.getQueueUrl();
        assertNotNull(deadLetterQueueUrl);
        Log.e(TAG, "deadLetterQueueUrl:" + deadLetterQueueUrl);
        // Configure the DLQ
        sqsClient.setQueueAttributes(new SetQueueAttributesRequest().withQueueUrl(
                queueUrl).withAttributes(
                Collections.singletonMap(deadLetterConfigAttributeName,
                        getDeadLetterConfigAttributeValue())));
        // List the DLQ
        Thread.sleep(1000 * 10);
        ListDeadLetterSourceQueuesResult listDeadLetterSourceQueuesResult = sqsClient
                .listDeadLetterSourceQueues(new ListDeadLetterSourceQueuesRequest()
                        .withQueueUrl(deadLetterQueueUrl));
        assertTrue(listDeadLetterSourceQueuesResult.getQueueUrls().contains(queueUrl));

        // Exception handling
        try {
            sqsClient.deleteMessage(new DeleteMessageRequest().withQueueUrl(queueUrl).withReceiptHandle(
                    "x"));
            fail("Expected an AmazonServiceException, but wasn't thrown");
        } catch (ReceiptHandleIsInvalidException e) {
            assertEquals("ReceiptHandleIsInvalid", e.getErrorCode());
            assertEquals(ErrorType.Client, e.getErrorType());
            assertNotEmpty(e.getMessage());
            assertNotEmpty(e.getRequestId());
            assertEquals("AmazonSQS", e.getServiceName());
            assertTrue(e.getStatusCode() >= 400 && e.getStatusCode() < 500);
        }

        // DeleteQueue
        sqsClient.deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
    }

    /**
     * In the following test, we purposely setting the time offset to trigger a
     * clock skew error. The time offset must be fixed and then we validate the
     * global value for time offset has been update.
     */
    @Test
    public void testClockSkew() {
        SDKGlobalConfiguration.setGlobalTimeOffset(3600);
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() == 3600);
        sqsClient.shutdown();
        sqsClient = createSQS();
        sqsClient.listQueues();

        assertTrue("Clockskew is fixed!", SDKGlobalConfiguration.getGlobalTimeOffset() < 3600);
    }
}
