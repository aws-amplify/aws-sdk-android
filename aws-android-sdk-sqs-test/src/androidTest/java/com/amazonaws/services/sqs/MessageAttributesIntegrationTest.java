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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.DeleteQueueRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * Integration tests for the SQS message attributes.
 */
public class MessageAttributesIntegrationTest extends SQSIntegrationTestBase {

    private static final String MESSAGE_BODY = "message-body-" + System.currentTimeMillis();
    private static final String queueName = "android-sdk-message-attributes-integ-test-queue-"
            + System.currentTimeMillis();
    private static String queueUrl;

    @AfterClass
    public static void tearDown() {
        try {
            sqsClient.deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Tests SQS operations that involve message attributes checksum.
     */
    @Test
    public void testSqsOperations() {
        // Create a queue for testing
        CreateQueueRequest createQueueRequest = new CreateQueueRequest().withQueueName(queueName);
        CreateQueueResult createQueueResult = sqsClient.createQueue(createQueueRequest);
        queueUrl = createQueueResult.getQueueUrl();
        assertNotEmpty(queueUrl);

        // SendMessage, with message attributes
        SendMessageResult sendMessageResult = sqsClient.sendMessage(
                new SendMessageRequest(queueUrl, MESSAGE_BODY)
                        .withMessageAttributes(createRandomAttributeValues(10)));
        assertNotEmpty(sendMessageResult.getMD5OfMessageBody());
        assertNotEmpty(sendMessageResult.getMD5OfMessageAttributes());

        // ReceiveMessage, without requesting for message attributes
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(queueUrl)
                .withWaitTimeSeconds(5)
                .withVisibilityTimeout(0);
        ReceiveMessageResult receiveMessageResult = sqsClient.receiveMessage(receiveMessageRequest);
        assertFalse(receiveMessageResult.getMessages().isEmpty());
        Message message = receiveMessageResult.getMessages().get(0);
        assertEquals(MESSAGE_BODY, message.getBody());
        assertNotEmpty(message.getMD5OfBody());
        assertNull(message.getMD5OfMessageAttributes());

        // ReceiveMessage, and request for all message attributes
        receiveMessageRequest.withMessageAttributeNames("All");
        receiveMessageResult = sqsClient.receiveMessage(receiveMessageRequest);
        assertFalse(receiveMessageResult.getMessages().isEmpty());
        message = receiveMessageResult.getMessages().get(0);
        assertEquals(MESSAGE_BODY, message.getBody());
        assertNotEmpty(message.getMD5OfBody());
        assertNotEmpty(message.getMD5OfMessageAttributes());

        // SendMessageBatch
        SendMessageBatchResult sendMessageBatchResult = sqsClient
                .sendMessageBatch(new SendMessageBatchRequest()
                        .withQueueUrl(queueUrl).withEntries(
                                new SendMessageBatchRequestEntry("1", MESSAGE_BODY)
                                        .withMessageAttributes(createRandomAttributeValues(1)),
                                new SendMessageBatchRequestEntry("2", MESSAGE_BODY)
                                        .withMessageAttributes(createRandomAttributeValues(2)),
                                new SendMessageBatchRequestEntry("3", MESSAGE_BODY)
                                        .withMessageAttributes(createRandomAttributeValues(3)),
                                new SendMessageBatchRequestEntry("4", MESSAGE_BODY)
                                        .withMessageAttributes(createRandomAttributeValues(4)),
                                new SendMessageBatchRequestEntry("5", MESSAGE_BODY)
                                        .withMessageAttributes(createRandomAttributeValues(5))));
        assertTrue(sendMessageBatchResult.getSuccessful().size() > 0);
        assertNotEmpty(sendMessageBatchResult.getSuccessful().get(0).getId());
        assertNotEmpty(sendMessageBatchResult.getSuccessful().get(0).getMD5OfMessageBody());
        assertNotEmpty(sendMessageBatchResult.getSuccessful().get(0).getMD5OfMessageAttributes());
    }
}
