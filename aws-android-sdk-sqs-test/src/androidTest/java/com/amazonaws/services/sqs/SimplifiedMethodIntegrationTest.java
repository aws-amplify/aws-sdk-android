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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.sqs.model.GetQueueAttributesResult;
import com.amazonaws.services.sqs.model.GetQueueUrlResult;
import com.amazonaws.services.sqs.model.ListQueuesResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResult;
import com.amazonaws.services.sqs.model.SendMessageResult;

import org.junit.After;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SimplifiedMethodIntegrationTest extends SQSIntegrationTestBase {
    private final static String QUEUE_NAME = "android-integration-test-" + System.currentTimeMillis();
    private static final String ATTRIBUTE_VALUE = "42";
    private static final String ATTRIBUTE_NAME = "VisibilityTimeout";
    private static final String MESSAGE_BODY = "foobarbazbar";

    private String queueUrl;

    /** Releases all resources used by these tests */
    @After
    public void tearDown() {
        try {
            sqsClient.deleteQueue(queueUrl);
        } catch (AmazonClientException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testSimplifiedMethods() throws InterruptedException {
        // CreateQueue
        queueUrl = sqsClient.createQueue(QUEUE_NAME).getQueueUrl();
        assertNotEmpty(queueUrl);

        // GetQueue
        GetQueueUrlResult getQueueUrlResult = sqsClient.getQueueUrl(QUEUE_NAME);
        assertEquals(queueUrl, getQueueUrlResult.getQueueUrl());

        // ListQueue
        ListQueuesResult listQueuesResult = sqsClient.listQueues(QUEUE_NAME);
        assertEquals((Integer) 1, (Integer) listQueuesResult.getQueueUrls().size());
        assertTrue(listQueuesResult.getQueueUrls().get(0).endsWith(queueUrl));

        // SetAttributes
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put(ATTRIBUTE_NAME, ATTRIBUTE_VALUE);
        sqsClient.setQueueAttributes(queueUrl, attributes);

        Thread.sleep(1000 * 10);
        GetQueueAttributesResult queueAttributesResult = sqsClient.getQueueAttributes(queueUrl,
                Arrays.asList(ATTRIBUTE_NAME));
        assertTrue(1 == queueAttributesResult.getAttributes().size());
        Map<String, String> attributes2 = queueAttributesResult.getAttributes();
        assertTrue(1 == attributes2.size());
        assertNotNull(attributes2.get(ATTRIBUTE_NAME));

        // AddPermission
        sqsClient.addPermission(queueUrl, "foo-label", Arrays.asList("599169622985"),
                Arrays.asList("SendMessage", "DeleteMessage"));

        // RemovePermission
        Thread.sleep(1000 * 2);
        sqsClient.removePermission(queueUrl, "foo-label");

        // SendMessage - send several to ensure we have something in our queue
        for (int i = 0; i < 10; i++) {
            SendMessageResult sendMessageResult = sqsClient.sendMessage(queueUrl, MESSAGE_BODY);
            assertNotEmpty(sendMessageResult.getMessageId());
            assertNotEmpty(sendMessageResult.getMD5OfMessageBody());
        }

        // ReceiveMessage
        ReceiveMessageResult receiveMessageResult = sqsClient.receiveMessage(queueUrl);
        assertFalse(receiveMessageResult.getMessages().isEmpty());
        Message message = receiveMessageResult.getMessages().get(0);
        assertEquals(MESSAGE_BODY, message.getBody());
        assertNotEmpty(message.getMD5OfBody());
        assertNotEmpty(message.getMessageId());
        assertNotEmpty(message.getReceiptHandle());

        for (java.util.Iterator iterator = message.getAttributes().entrySet().iterator(); iterator
                .hasNext();) {
            Object value = iterator.next();
            Entry<String, String> entry = (Entry<String, String>) value;

            assertNotEmpty((entry.getKey()));
            assertNotEmpty((entry.getValue()));
        }

        // SendMessageBatch
        SendMessageBatchResult sendMessageBatchResult = sqsClient.sendMessageBatch(queueUrl,
                Arrays.asList(
                        new SendMessageBatchRequestEntry().withId("1").withMessageBody("1"),
                        new SendMessageBatchRequestEntry().withId("2").withMessageBody("2"),
                        new SendMessageBatchRequestEntry().withId("3").withMessageBody("3"),
                        new SendMessageBatchRequestEntry().withId("4").withMessageBody("4"),
                        new SendMessageBatchRequestEntry().withId("5").withMessageBody("5")));

        assertNotNull(sendMessageBatchResult.getFailed());
        assertTrue(sendMessageBatchResult.getSuccessful().size() > 0);
        assertNotNull(sendMessageBatchResult.getSuccessful().get(0).getId());
        assertNotNull(sendMessageBatchResult.getSuccessful().get(0).getMD5OfMessageBody());
        assertNotNull(sendMessageBatchResult.getSuccessful().get(0).getMessageId());

        // ChangeMessageVisibility
        String receiptHandle = (receiveMessageResult.getMessages().get(0)).getReceiptHandle();
        sqsClient.changeMessageVisibility(queueUrl, receiptHandle, 123);

        // DeleteMessage
        sqsClient.deleteMessage(queueUrl, receiptHandle);
    }
}
