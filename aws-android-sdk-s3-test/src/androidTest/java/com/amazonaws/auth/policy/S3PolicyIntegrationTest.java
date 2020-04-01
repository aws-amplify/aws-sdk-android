/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.policy;

import com.amazonaws.auth.policy.actions.S3Actions;
import com.amazonaws.auth.policy.conditions.ConditionFactory;
import com.amazonaws.auth.policy.conditions.S3ConditionFactory;
import com.amazonaws.auth.policy.conditions.StringCondition;
import com.amazonaws.auth.policy.conditions.StringCondition.StringComparisonType;
import com.amazonaws.auth.policy.resources.S3BucketResource;
import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.model.CannedAccessControlList;

import org.junit.After;
import org.junit.Test;

/**
 * Integration tests for the service specific access control policy code
 * provided by the S3 client.
 */
public class S3PolicyIntegrationTest extends S3IntegrationTestBase {

    /** Name of the bucket created by this test */
    private static final String BUCKET_NAME = "android-sdk-custom-bucket-policy-integ-test-"
            + System.currentTimeMillis();

    /** Release all allocated resources */
    @After
    public void tearDown() {
        s3.deleteBucket(BUCKET_NAME);
    }

    /**
     * Tests that the S3 specific access control policy code works as expected.
     */
    @Test
    public void testPolicies() throws Exception {
        s3.createBucket(BUCKET_NAME);

        Policy policy = new Policy().withStatements(
                new Statement(Statement.Effect.Allow)
                        .withActions(S3Actions.AllS3Actions)
                        .withPrincipals(Principal.AllUsers)
                        .withResources(new S3BucketResource(BUCKET_NAME))
                        .withConditions(
                                S3ConditionFactory
                                        .newCannedACLCondition(CannedAccessControlList.Private)));
        s3.setBucketPolicy(BUCKET_NAME, policy.toJson());

        policy = new Policy()
                .withStatements(
                        new Statement(Statement.Effect.Allow)
                                .withActions(S3Actions.AllS3Actions)
                                .withPrincipals(Principal.AllUsers)
                                .withResources(new S3BucketResource(BUCKET_NAME))
                                .withConditions(
                                        S3ConditionFactory
                                                .newCannedACLCondition(CannedAccessControlList.AuthenticatedRead),
                                        new StringCondition(StringComparisonType.StringEquals,
                                                ConditionFactory.USER_AGENT_CONDITION_KEY,
                                                "foo*")),
                        new Statement(Statement.Effect.Allow)
                                .withActions(S3Actions.ListObjectVersions)
                                .withResources(new S3BucketResource(BUCKET_NAME))
                                .withPrincipals(Principal.AllUsers));
        s3.setBucketPolicy(BUCKET_NAME, policy.toJson());
    }

}
