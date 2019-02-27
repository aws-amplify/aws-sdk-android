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

package com.amazonaws.services.sns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.DeleteTopicRequest;
import com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest;
import com.amazonaws.services.sns.model.GetTopicAttributesRequest;
import com.amazonaws.services.sns.model.GetTopicAttributesResult;
import com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest;
import com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult;
import com.amazonaws.services.sns.model.ListSubscriptionsResult;
import com.amazonaws.services.sns.model.ListTopicsResult;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest;
import com.amazonaws.services.sns.model.SetTopicAttributesRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sns.model.SubscribeResult;
import com.amazonaws.services.sns.model.Subscription;
import com.amazonaws.services.sns.util.Topics;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.DeleteQueueRequest;
import com.amazonaws.services.sqs.model.GetQueueAttributesRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.SetQueueAttributesRequest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Integration tests for Cloudcast operations.
 */
public class CloudcastIntegrationTest extends SNSIntegrationTestBase {

    /** The ARN of the topic created by these tests */
    private String topicArn;

    /** The URL of the SQS queue created to receive notifications */
    private String queueUrl;

    private String subscriptionArn;

    private final String DELIVERY_POLICY = "{ " + "  \"healthyRetryPolicy\":" + "    {"
            + "       \"minDelayTarget\": 1," + "       \"maxDelayTarget\": 1,"
            + "       \"numRetries\": 1, "
            + "       \"numMaxDelayRetries\": 0, " + "       \"backoffFunction\": \"linear\""
            + "     }" + "}";

    @Before
    public void setup() {
        topicArn = null;
        queueUrl = null;
        subscriptionArn = null;
    }

    /** Releases all resources used by this test */
    @After
    public void tearDown() throws Exception {
        if (topicArn != null) {
            sns.deleteTopic(new DeleteTopicRequest(topicArn));
        }
        if (queueUrl != null) {
            sqs.deleteQueue(new DeleteQueueRequest(queueUrl));
        }
        if (subscriptionArn != null) {
            sns.unsubscribe(subscriptionArn);
        }
    }

    /**
     * Tests that we can correctly handle exceptions from SNS.
     */
    @Test
    public void testCloudcastExceptionHandling() {
        try {
            sns.createTopic(new CreateTopicRequest().withName(""));
        } catch (final AmazonServiceException ase) {
            assertEquals("InvalidParameter", ase.getErrorCode());
            assertEquals(ErrorType.Client, ase.getErrorType());
            assertTrue(ase.getMessage().length() > 5);
            assertTrue(ase.getRequestId().length() > 5);
            assertTrue(ase.getServiceName().length() > 5);
            assertEquals(400, ase.getStatusCode());
        }
    }

    /** Tests the functionality in the Topics utility class. */
    @Test
    public void testTopics_subscribeQueue() throws Exception {
        topicArn = sns.createTopic(
                new CreateTopicRequest("subscribeTopicTest-" + System.currentTimeMillis()))
                .getTopicArn();
        queueUrl = sqs.createQueue(
                new CreateQueueRequest("subscribeTopicTest-" + System.currentTimeMillis()))
                .getQueueUrl();

        subscriptionArn = Topics.subscribeQueue(sns, sqs, topicArn, queueUrl);
        assertNotNull(subscriptionArn);

        // Verify that the queue is receiving messages
        sns.publish(new PublishRequest(topicArn, "Hello SNS World").withSubject("Subject"));
        final String message = receiveMessage();
        final Map<String, String> messageDetails = parseJSON(message);
        assertEquals("Hello SNS World", messageDetails.get("Message"));
        assertEquals("Subject", messageDetails.get("Subject"));
        assertNotNull(messageDetails.get("MessageId"));
        assertNotNull(messageDetails.get("Signature"));
    }

    @Test
    public void testSendUnicodeMessages() throws InterruptedException {
        final String unicodeMessage = "你好";
        final String unicodeSubject = "主题";
        topicArn = sns.createTopic(
                new CreateTopicRequest("unicodeMessageTest-" + System.currentTimeMillis()))
                .getTopicArn();
        queueUrl = sqs.createQueue(
                new CreateQueueRequest("unicodeMessageTest-" + System.currentTimeMillis()))
                .getQueueUrl();

        subscriptionArn = Topics.subscribeQueue(sns, sqs, topicArn, queueUrl);
        assertNotNull(subscriptionArn);

        // Verify that the queue is receiving unicode messages
        sns.publish(new PublishRequest(topicArn, unicodeMessage).withSubject(unicodeSubject));
        final String message = receiveMessage();
        final Map<String, String> messageDetails = parseJSON(message);
        assertEquals(unicodeMessage, messageDetails.get("Message"));
        assertEquals(unicodeSubject, messageDetails.get("Subject"));
        assertNotNull(messageDetails.get("MessageId"));
        assertNotNull(messageDetails.get("Signature"));

        sns.deleteTopic(topicArn);
        topicArn = null;
        sqs.deleteQueue(queueUrl);
        queueUrl = null;
    }

    /**
     * Tests that we can invoke operations on Cloudcast and correctly interpret
     * the responses.
     */
    @Test
    public void testCloudcastOperations() throws Exception {

        // Create Topic
        final CreateTopicResult createTopicResult = sns
                .createTopic(new CreateTopicRequest("test-topic-" + System.currentTimeMillis()));
        topicArn = createTopicResult.getTopicArn();
        assertTrue(topicArn.length() > 1);

        // List Topics
        Thread.sleep(1000 * 5);
        final ListTopicsResult listTopicsResult = sns.listTopics();
        assertNotNull(listTopicsResult.getTopics());
        assertTopicIsPresent(listTopicsResult.getTopics(), topicArn);

        // Set Topic Attributes
        sns.setTopicAttributes(new SetTopicAttributesRequest().withTopicArn(topicArn)
                .withAttributeName("DisplayName")
                .withAttributeValue("MyTopicName"));

        // Get Topic Attributes
        final GetTopicAttributesResult getTopicAttributesResult = sns
                .getTopicAttributes(new GetTopicAttributesRequest().withTopicArn(topicArn));
        assertEquals("MyTopicName", getTopicAttributesResult.getAttributes().get("DisplayName"));

        // Subscribe an SQS queue for notifications
        final String queueArn = initializeReceivingQueue();
        final SubscribeResult subscribeResult = sns
                .subscribe(new SubscribeRequest().withEndpoint(queueArn).withProtocol("sqs")
                        .withTopicArn(topicArn));
        subscriptionArn = subscribeResult.getSubscriptionArn();
        assertTrue(subscriptionArn.length() > 1);

        // List Subscriptions by Topic
        Thread.sleep(1000 * 5);
        final ListSubscriptionsByTopicResult listSubscriptionsByTopicResult = sns
                .listSubscriptionsByTopic(new ListSubscriptionsByTopicRequest(topicArn));
        assertSubscriptionIsPresent(listSubscriptionsByTopicResult.getSubscriptions(),
                subscriptionArn);

        // List Subscriptions
        final List<Subscription> subscriptions = getAllSubscriptions(sns);
        assertSubscriptionIsPresent(subscriptions, subscriptionArn);

        // Get Subscription Attributes
        final Map<String, String> attributes = sns
                .getSubscriptionAttributes(new GetSubscriptionAttributesRequest(subscriptionArn))
                .getAttributes();
        assertTrue(attributes.size() > 0);
        final Entry<String, String> entry = attributes.entrySet().iterator().next();
        assertNotNull(entry.getKey());
        assertNotNull(entry.getValue());

        // Set Subscription Attributes
        sns.setSubscriptionAttributes(
                new SetSubscriptionAttributesRequest(subscriptionArn, "DeliveryPolicy",
                        DELIVERY_POLICY));

        // Publish
        sns.publish(new PublishRequest(topicArn, "Hello SNS World").withSubject("Subject"));

        // Receive Published Message
        final String message = receiveMessage();
        final Map<String, String> messageDetails = parseJSON(message);
        assertEquals("Hello SNS World", messageDetails.get("Message"));
        assertEquals("Subject", messageDetails.get("Subject"));
        assertNotNull(messageDetails.get("MessageId"));
        assertNotNull(messageDetails.get("Signature"));
    }

    /**
     * Get all subscriptions as a list of {@link Subscription} objects
     *
     * @param sns Client
     * @return List of all subscriptions
     */
    private List<Subscription> getAllSubscriptions(AmazonSNS sns) {
        ListSubscriptionsResult result = sns.listSubscriptions();
        final List<Subscription> subscriptions = new ArrayList<Subscription>(result
                .getSubscriptions());
        while (result.getNextToken() != null) {
            result = sns.listSubscriptions(result.getNextToken());
            subscriptions.addAll(result.getSubscriptions());
        }
        return subscriptions;
    }

    @Test
    public void testSimplifiedMethods() throws InterruptedException {
        // Create Topic
        final CreateTopicResult createTopicResult = sns
                .createTopic("test-topic-" + System.currentTimeMillis());
        topicArn = createTopicResult.getTopicArn();
        assertTrue(topicArn.length() > 1);

        // List Topics
        Thread.sleep(1000 * 5);
        final ListTopicsResult listTopicsResult = sns.listTopics();
        assertNotNull(listTopicsResult.getTopics());
        assertTopicIsPresent(listTopicsResult.getTopics(), topicArn);

        // Set Topic Attributes
        sns.setTopicAttributes(topicArn, "DisplayName", "MyTopicName");

        // Get Topic Attributes
        final GetTopicAttributesResult getTopicAttributesResult = sns.getTopicAttributes(topicArn);
        assertEquals("MyTopicName", getTopicAttributesResult.getAttributes().get("DisplayName"));

        // Subscribe an SQS queue for notifications
        queueUrl = sqs.createQueue(
                new CreateQueueRequest("subscribeTopicTest-" + System.currentTimeMillis()))
                .getQueueUrl();
        final String queueArn = initializeReceivingQueue();
        final SubscribeResult subscribeResult = sns.subscribe(topicArn, "sqs", queueArn);
        final String subscriptionArn = subscribeResult.getSubscriptionArn();
        assertTrue(subscriptionArn.length() > 1);

        // List Subscriptions by Topic
        Thread.sleep(1000 * 5);
        final ListSubscriptionsByTopicResult listSubscriptionsByTopicResult = sns
                .listSubscriptionsByTopic(topicArn);
        assertSubscriptionIsPresent(listSubscriptionsByTopicResult.getSubscriptions(),
                subscriptionArn);

        // Get Subscription Attributes
        final Map<String, String> attributes = sns.getSubscriptionAttributes(subscriptionArn)
                .getAttributes();
        assertTrue(attributes.size() > 0);
        final Entry<String, String> entry = attributes.entrySet().iterator().next();
        assertNotNull(entry.getKey());
        assertNotNull(entry.getValue());

        // Set Subscription Attributes
        sns.setSubscriptionAttributes(subscriptionArn, "DeliveryPolicy", DELIVERY_POLICY);

        // Publish With Subject
        sns.publish(topicArn, "Hello SNS World", "Subject");

        // Receive Published Message
        String message = receiveMessage();
        Map<String, String> messageDetails = parseJSON(message);
        assertEquals("Hello SNS World", messageDetails.get("Message"));
        assertEquals("Subject", messageDetails.get("Subject"));
        assertNotNull(messageDetails.get("MessageId"));
        assertNotNull(messageDetails.get("Signature"));

        // Publish Without Subject
        sns.publish(topicArn, "Hello SNS World");

        // Receive Published Message
        message = receiveMessage();
        messageDetails = parseJSON(message);
        assertEquals("Hello SNS World", messageDetails.get("Message"));
        assertNotNull(messageDetails.get("MessageId"));
        assertNotNull(messageDetails.get("Signature"));

        // Add/Remove Permissions
        sns.addPermission(topicArn, "foo", Arrays.asList("750203240092"), Arrays.asList("Publish"));
        Thread.sleep(1000 * 5);
        sns.removePermission(topicArn, "foo");

        // Unsubscribe
        sns.unsubscribe(subscriptionArn);

        // Delete Topic
        sns.deleteTopic(topicArn);
        topicArn = null;
    }

    /*
     * Private Interface
     */
    /**
     * Polls the SQS queue created earlier in the test until we find our SNS
     * notification message and returns the base64 decoded message body.
     */
    private String receiveMessage() throws InterruptedException {
        int maxRetries = 15;
        while (maxRetries-- > 0) {
            Thread.sleep(1000 * 10);
            final List<Message> messages = sqs.receiveMessage(new ReceiveMessageRequest(queueUrl))
                    .getMessages();
            if (messages.size() > 0) {
                return new String(messages.get(0).getBody());
            }
        }

        fail("No SQS messages received after retrying " + maxRetries + "times");
        return null;
    }

    /**
     * Creates an SQS queue for this test to use when receiving SNS
     * notifications. We need to use an SQS queue because otherwise HTTP or
     * email notifications require a confirmation token that is sent via HTTP or
     * email. Plus an SQS queue lets us test that our notification was
     * delivered.
     */
    private String initializeReceivingQueue() throws InterruptedException {
        final String queueName = "sns-integ-test-" + System.currentTimeMillis();
        this.queueUrl = sqs.createQueue(new CreateQueueRequest(queueName)).getQueueUrl();

        Thread.sleep(1000 * 4);
        final String queueArn = sqs
                .getQueueAttributes(
                        new GetQueueAttributesRequest(queueUrl).withAttributeNames(new String[] {
                                "QueueArn"
                        }))
                .getAttributes().get("QueueArn");
        final HashMap<String, String> attributes = new HashMap<String, String>();
        attributes.put("Policy", generateSqsPolicyForTopic(queueArn, topicArn));
        sqs.setQueueAttributes(new SetQueueAttributesRequest(queueUrl, attributes));
        final int policyPropagationDelayInSeconds = 120;
        System.out.println("Sleeping " + policyPropagationDelayInSeconds
                + " seconds to let SQS policy propagate");
        Thread.sleep(1000 * policyPropagationDelayInSeconds);
        return queueArn;
    }

    /**
     * Creates a policy to apply to our SQS queue that allows our SNS topic to
     * deliver notifications to it. Note that this policy is for the SQS queue,
     * *not* for SNS.
     */
    private String generateSqsPolicyForTopic(String queueArn, String topicArn) {
        final String policy = "{ " + "  \"Version\":\"2008-10-17\"," + "  \"Id\":\"" + queueArn
                + "/policyId\","
                + "  \"Statement\": [" + "    {" + "        \"Sid\":\"" + queueArn
                + "/statementId\","
                + "        \"Effect\":\"Allow\"," + "        \"Principal\":{\"AWS\":\"*\"},"
                + "        \"Action\":\"SQS:SendMessage\"," + "        \"Resource\": \"" + queueArn
                + "\","
                + "        \"Condition\":{" + "            \"StringEquals\":{\"aws:SourceArn\":\""
                + topicArn + "\"}"
                + "        }" + "    }" + "  ]" + "}";

        return policy;
    }

}