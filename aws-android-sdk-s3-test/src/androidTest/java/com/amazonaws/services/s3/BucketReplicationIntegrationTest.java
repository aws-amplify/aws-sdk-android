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

package com.amazonaws.services.s3;

import static com.amazonaws.services.s3.internal.Constants.MB;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.internal.crypto.CryptoTestUtils;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.GetBucketReplicationConfigurationRequest;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.ReplicationRuleStatus;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

@Ignore("This test requires an IAM role with the ability to replicate data between S3 buckets. Previously it " +
        "was hard-coded (ROLE), but the original account was deactivated. Since this test covers an uncommon" +
        "use-case for users of the Android SDK and is testing generated code, we're disabling it.")
public class BucketReplicationIntegrationTest extends
        S3IntegrationTestBase {

    /**
     * source bucket name for the replication integration test
     */
    private static final String SOURCE_BUCKET_NAME = "android-sdk-bucket-replication-integ-test-"
            + System.currentTimeMillis();

    /**
     * destination bucket name for the replication integration test
     */
    private static final String DESTINATION_BUCKET_NAME = "android-sdk-bucket-dest-replication-integ-test-"
            + System.currentTimeMillis();

    private static final String RULE1 = "replication-rule-1-"
            + System.currentTimeMillis();
    private static final String RULE2 = "replication-rule-2-"
            + System.currentTimeMillis();

    private static final String DEST_BUCKET_ARN = "arn:aws:s3:::"
            + DESTINATION_BUCKET_NAME;

    /**
     * ARN of the IAM role used for replication.
     */
    private static final String ROLE = "arn:aws:iam::467018229527:role/PowerUser";

    private static final long CONTENT_LENGTH = 2 * MB;

    private static File file = null;

    private static final Log LOG = LogFactory.getLog(CryptoTestUtils.class);

    /**
     * creates the s3 bucket, sns topic and sqs queue. also authorizes s3 to
     * publish messages to the sns and sqs.
     */
    @Before
    public void setUpBucket() throws Exception {
        S3IntegrationTestBase.setUp();
        euS3.createBucket(SOURCE_BUCKET_NAME);
        s3.createBucket(DESTINATION_BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(SOURCE_BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(DESTINATION_BUCKET_NAME);
        euS3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                SOURCE_BUCKET_NAME,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));
        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                DESTINATION_BUCKET_NAME,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));
        file = getRandomTempFile("foo", CONTENT_LENGTH);
    }

    @After
    public void teardownBucket() {
        try {
            CryptoTestUtils.deleteBucketAndAllContents(euS3,
                    SOURCE_BUCKET_NAME);
            CryptoTestUtils.deleteBucketAndAllContents(s3,
                    DESTINATION_BUCKET_NAME);
            if (file != null) {
                file.delete();
            }
        } catch (Exception e) {
            LOG.error(
                    "Failure to clear resources for "
                            + BucketReplicationIntegrationTest.class
                                    .getCanonicalName(),
                    e);
        }
    }

    public void testBucketReplication() {
        testSetAndRetrieveReplicationConfiguration();
        testDeleteConfiguration();
    }

    public void testSetAndRetrieveReplicationConfiguration() {

        // Setting new configuration and retrieving.
        BucketReplicationConfiguration configuration = new BucketReplicationConfiguration();

        configuration.addRule(
                RULE1,
                new ReplicationRule()
                        .withPrefix("testPrefix1")
                        .withStatus(ReplicationRuleStatus.Enabled)
                        .withDestinationConfig(
                                new ReplicationDestinationConfig()
                                        .withBucketARN(DEST_BUCKET_ARN)));
        configuration.addRule(
                RULE2,
                new ReplicationRule()
                        .withPrefix("testPrefix2")
                        .withStatus(ReplicationRuleStatus.Enabled)
                        .withDestinationConfig(
                                new ReplicationDestinationConfig()
                                        .withBucketARN(DEST_BUCKET_ARN)));

        euS3.setBucketReplicationConfiguration(SOURCE_BUCKET_NAME,
                configuration);

        BucketReplicationConfiguration retrievedReplicationConfig = euS3
                .getBucketReplicationConfiguration(SOURCE_BUCKET_NAME);

        ReplicationRule replRule1 = retrievedReplicationConfig.getRule(RULE1);
        ReplicationRule replRule2 = retrievedReplicationConfig.getRule(RULE2);
        assertNotNull(replRule1);
        assertNotNull(replRule2);
        assertEquals("testPrefix1", replRule1.getPrefix());
        assertEquals(DEST_BUCKET_ARN, replRule1.getDestinationConfig()
                .getBucketARN());
        assertEquals(ROLE, retrievedReplicationConfig.getRoleARN());

        assertEquals("testPrefix2", replRule2.getPrefix());
        assertEquals(DEST_BUCKET_ARN, replRule2.getDestinationConfig()
                .getBucketARN());

        // disabling second rule.
        replRule2.setStatus(ReplicationRuleStatus.Disabled);
        BucketReplicationConfiguration updatedConfiguration = new BucketReplicationConfiguration()
                .addRule(RULE1, replRule1).addRule(RULE2, replRule2)
                .withRoleARN(ROLE);
        euS3.setBucketReplicationConfiguration(SOURCE_BUCKET_NAME,
                updatedConfiguration);
        GetBucketReplicationConfigurationRequest getBucketReplicationConfigurationRequest = new GetBucketReplicationConfigurationRequest(
                SOURCE_BUCKET_NAME);
        retrievedReplicationConfig = euS3
                .getBucketReplicationConfiguration(getBucketReplicationConfigurationRequest);

        replRule1 = retrievedReplicationConfig.getRule(RULE1);
        replRule2 = retrievedReplicationConfig.getRule(RULE2);
        assertNotNull(replRule1);
        assertNotNull(replRule2);
        assertEquals("testPrefix1", replRule1.getPrefix());
        assertEquals(DEST_BUCKET_ARN, replRule1.getDestinationConfig()
                .getBucketARN());
        assertEquals(ReplicationRuleStatus.Enabled.toString(),
                replRule1.getStatus());

        assertEquals("testPrefix2", replRule2.getPrefix());
        assertEquals(DEST_BUCKET_ARN, replRule2.getDestinationConfig()
                .getBucketARN());
        assertEquals(ReplicationRuleStatus.Disabled.toString(),
                replRule2.getStatus());
    }

    private void testDeleteConfiguration() {
        euS3.deleteBucketReplicationConfiguration(SOURCE_BUCKET_NAME);
        try {
            euS3.getBucketReplicationConfiguration(SOURCE_BUCKET_NAME);
            fail("An exception must be thrown from the service as there is no replication configuration for the bucket");
        } catch (AmazonS3Exception e) {
            if (LOG.isDebugEnabled()) {
                LOG.debug(
                        "Exception is thrown as there is no replicaton configuration for the bucket.",
                        e);
            }
        }
    }
}
