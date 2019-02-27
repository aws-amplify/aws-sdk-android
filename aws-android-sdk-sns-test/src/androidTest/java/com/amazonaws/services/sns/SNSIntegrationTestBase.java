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

import android.support.test.InstrumentationRegistry;

import static org.junit.Assert.fail;

import com.amazonaws.services.sns.model.Subscription;
import com.amazonaws.services.sns.model.Topic;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.snstest.R;
import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.util.json.JsonUtils;

import org.json.JSONObject;
import org.junit.BeforeClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Base class for SNS integration tests; responsible for loading AWS account
 * info for running the tests, and instantiating clients, etc.
 *
 */
public abstract class SNSIntegrationTestBase extends AWSTestBase {

    protected static AmazonSNS sns;
    protected static AmazonSQS sqs;

    /** Package name in testconfiguration.json */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
                                                    getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure()  {
        return getPackageConfigure(PACKAGE_NAME);
    }

    /**
     * Loads the AWS account info for the integration tests and creates SNS and
     * SQS clients for tests to use.
     */
    @BeforeClass
    public static void setUp() throws FileNotFoundException, IOException {
        setUpCredentials();
        sns = new AmazonSNSClient(credentials);
        sqs = new AmazonSQSClient(credentials);
        sqs.setEndpoint("sqs.us-west-2.amazonaws.com");
        sns.setEndpoint("sns.us-west-2.amazonaws.com");
    }

    /**
     * Asserts that the list of topics contains one with the specified ARN,
     * otherwise fails the current test.
     */
    protected void assertTopicIsPresent(List<Topic> topics, String topicArn) {
        for (java.util.Iterator iterator = topics.iterator(); iterator.hasNext();) {
            Topic topic = (Topic) iterator.next();
            if (topic.getTopicArn().equals(topicArn))
                return;
        }

        fail("Topic '" + topicArn + "' was not present in specified list of topics.");
    }

    /**
     * Asserts that the list of subscriptions contains one with the specified
     * ARN, otherwise fails the current test.
     */
    protected void assertSubscriptionIsPresent(List<Subscription> subscriptions,
            String subscriptionArn) {
        for (java.util.Iterator iterator = subscriptions.iterator(); iterator.hasNext();) {
            Subscription subscription = (Subscription) iterator.next();
            if (subscription.getSubscriptionArn().equals(subscriptionArn))
                return;
        }

        fail("Subscription '" + subscriptionArn
                + "' was not present in specified list of subscriptions.");
    }

    /**
     * Turns a one level deep JSON string into a Map.
     */
    protected Map<String, String> parseJSON(String jsonmessage) {
        return JsonUtils.jsonToMap(jsonmessage);
    }

}
