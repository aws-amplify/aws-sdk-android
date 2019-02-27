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

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.internal.crypto.CryptoTestUtils;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.SetBucketLoggingConfigurationRequest;

import org.junit.After;
import org.junit.Test;

import java.util.Date;

/**
 * Integration tests for the Amazon S3 bucket logging operations.
 *
 * @author fulghum@amazon.com
 */
public class BucketLoggingIntegrationTest extends S3IntegrationTestBase {

    private String loggingBucketName = "bucket-logging-integ-test-" + new Date().getTime();

    /**
     * Releases all resources created by this test.
     */
    @After
    public void tearDown() {
        if (CryptoTestUtils.runTimeConsumingTests())
            s3.deleteBucket(loggingBucketName);
    }

    /**
     * Tests the bucket logging operations by turning logging on and off for a
     * bucket and verifying the updates.
     */
    @Test
    public void testBucketLoggingOperations() throws Exception {
        if (!CryptoTestUtils.runTimeConsumingTests()) {
            System.out
                    .println("Please set the environment variable, export RUN_TIME_CONSUMING_TESTS=true, to run the testBucketLoggingOperations test");
            return;
        }
        // setup for the tests
        s3.createBucket(loggingBucketName);
        s3.setBucketAcl(loggingBucketName, CannedAccessControlList.LogDeliveryWrite);

        // Test the initial logging
        BucketLoggingConfiguration loggingStatus = s3
                .getBucketLoggingConfiguration(loggingBucketName);
        assertFalse(loggingStatus.isLoggingEnabled());
        assertEquals(null, loggingStatus.getLogFilePrefix());
        assertEquals(null, loggingStatus.getDestinationBucketName());

        // Enable logging
        s3.setBucketLoggingConfiguration(new SetBucketLoggingConfigurationRequest(
                loggingBucketName,
                new BucketLoggingConfiguration(loggingBucketName, "log-prefix")));

        // Test the updated logging
        loggingStatus = waitForLoggingConfigurationToBeEnabled();
        assertTrue(loggingStatus.isLoggingEnabled());
        assertEquals("log-prefix", loggingStatus.getLogFilePrefix());
        assertEquals(loggingBucketName, loggingStatus.getDestinationBucketName());

        // Disable logging
        s3.setBucketLoggingConfiguration(new SetBucketLoggingConfigurationRequest(
                loggingBucketName, new BucketLoggingConfiguration()));

        // Verify that logging was disabled
        loggingStatus = waitForLoggingConfigurationToBeDisabled();
        assertFalse(loggingStatus.isLoggingEnabled());
        assertEquals(null, loggingStatus.getLogFilePrefix());
        assertEquals(null, loggingStatus.getDestinationBucketName());
    }

    /**
     * Waits for the logging of the bucket to be enabled. A runtime exception
     * will be thrown if this method doesn't detect logging is enabled before
     * the ending period.
     *
     * @throws InterruptedException
     */
    private BucketLoggingConfiguration waitForLoggingConfigurationToBeEnabled()
            throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        BucketLoggingConfiguration loggingStatus = null;
        while (System.currentTimeMillis() < endTime) {
            loggingStatus = s3.getBucketLoggingConfiguration(loggingBucketName);
            ;
            if (loggingStatus.isLoggingEnabled()) {
                hits++;
            }
            else {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return loggingStatus;
        }
        maxPollTimeExceeded();
        return null;
    }

    /**
     * Waits for the logging of the bucket to be disabled. A runtime exception
     * will be thrown if this method doesn't detect logging is disabled before
     * the ending period.
     *
     * @throws InterruptedException
     */
    private BucketLoggingConfiguration waitForLoggingConfigurationToBeDisabled()
            throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        BucketLoggingConfiguration loggingStatus = null;
        while (System.currentTimeMillis() < endTime) {
            loggingStatus = s3.getBucketLoggingConfiguration(loggingBucketName);
            ;
            if (!loggingStatus.isLoggingEnabled()) {
                hits++;
            }
            else {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return loggingStatus;
        }
        maxPollTimeExceeded();
        return null;
    }

}
