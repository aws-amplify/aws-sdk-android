
package com.amazonaws.services.sqs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

public class SimplifiedMethodIntegrationTest extends IntegrationTestBase {
    private final static String QUEUE_NAME = "java-integration-test-" + System.currentTimeMillis();
    private static final String ATTRIBUTE_VALUE = "42";
    private static final String ATTRIBUTE_NAME = "VisibilityTimeout";
    private static final String MESSAGE_BODY = "foobarbazbar";

    private String queueUrl;

    /** Releases all resources used by these tests */
    @After
    public void tearDown() throws Exception {
        sqs.deleteQueue(queueUrl);
    }

    @Test
    public void testSimplifiedMethods() throws InterruptedException {
        // CreateQueue
        queueUrl = sqs.createQueue(QUEUE_NAME).getQueueUrl();
        assertNotEmpty(queueUrl);

        // GetQueue
        GetQueueUrlResult getQueueUrlResult = sqs.getQueueUrl(QUEUE_NAME);
        assertEquals(queueUrl, getQueueUrlResult.getQueueUrl());

        // ListQueue
        ListQueuesResult listQueuesResult = sqs.listQueues(QUEUE_NAME);
        assertEquals((Integer) 1, (Integer) listQueuesResult.getQueueUrls().size());
        assertTrue(listQueuesResult.getQueueUrls().get(0).endsWith(queueUrl));

        // SetAttributes
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put(ATTRIBUTE_NAME, ATTRIBUTE_VALUE);
        sqs.setQueueAttributes(queueUrl, attributes);

        Thread.sleep(1000 * 10);
        GetQueueAttributesResult queueAttributesResult = sqs.getQueueAttributes(queueUrl,
                Arrays.asList(ATTRIBUTE_NAME));
        assertTrue(1 == queueAttributesResult.getAttributes().size());
        Map<String, String> attributes2 = queueAttributesResult.getAttributes();
        assertTrue(1 == attributes2.size());
        assertNotNull(attributes2.get(ATTRIBUTE_NAME));

        // AddPermission
        sqs.addPermission(queueUrl, "foo-label", Arrays.asList("599169622985"),
                Arrays.asList("SendMessage", "DeleteMessage"));

        // RemovePermission
        Thread.sleep(1000 * 2);
        sqs.removePermission(queueUrl, "foo-label");

        // SendMessage - send several to ensure we have something in our queue
        for (int i = 0; i < 10; i++) {
            SendMessageResult sendMessageResult = sqs.sendMessage(queueUrl, MESSAGE_BODY);
            assertNotEmpty(sendMessageResult.getMessageId());
            assertNotEmpty(sendMessageResult.getMD5OfMessageBody());
        }

        // ReceiveMessage
        ReceiveMessageResult receiveMessageResult = sqs.receiveMessage(queueUrl);
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
        SendMessageBatchResult sendMessageBatchResult = sqs.sendMessageBatch(queueUrl,
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
        sqs.changeMessageVisibility(queueUrl, receiptHandle, 123);

        // DeleteMessage
        sqs.deleteMessage(queueUrl, receiptHandle);

    }
}
