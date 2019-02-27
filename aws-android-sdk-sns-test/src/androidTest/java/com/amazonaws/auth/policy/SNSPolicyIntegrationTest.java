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

package com.amazonaws.auth.policy;

import com.amazonaws.auth.policy.Statement.Effect;
import com.amazonaws.auth.policy.actions.SNSActions;
import com.amazonaws.auth.policy.conditions.SNSConditionFactory;
import com.amazonaws.services.sns.SNSIntegrationTestBase;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.DeleteTopicRequest;
import com.amazonaws.services.sns.model.SetTopicAttributesRequest;

import org.junit.After;
import org.junit.Test;

/**
 * Integration tests for the service specific access control policy code
 * provided by the SNS client.
 */
public class SNSPolicyIntegrationTest extends SNSIntegrationTestBase {
    private String topicArn;

    /** Releases all test resources */
    @After
    public void tearDown() throws Exception {
        sns.deleteTopic(new DeleteTopicRequest(topicArn));
    }

    /**
     * Tests that we can construct valid policies with SNS specific
     * conditions/resources/etc.
     */
    @Test
    public void testPolicies() throws Exception {
        String topicName = "android-sns-policy-integ-test-" + System.currentTimeMillis();
        topicArn = sns.createTopic(new CreateTopicRequest(topicName)).getTopicArn();

        Policy policy = new Policy()
                .withStatements(new Statement(Effect.Allow)
                        .withActions(SNSActions.Subscribe)
                        .withPrincipals(Principal.AllUsers)
                        .withResources(new Resource(topicArn))
                        .withConditions(
                                SNSConditionFactory.newEndpointCondition("*@amazon.com"),
                                SNSConditionFactory.newProtocolCondition("email")));
        sns.setTopicAttributes(new SetTopicAttributesRequest(topicArn, "Policy", policy.toJson()));
    }
}
