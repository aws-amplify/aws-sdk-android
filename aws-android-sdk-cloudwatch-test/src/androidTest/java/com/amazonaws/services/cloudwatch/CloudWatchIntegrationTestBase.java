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

package com.amazonaws.services.cloudwatch;


import com.amazonaws.testutils.AWSTestBase;

import org.junit.BeforeClass;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Base class for CloudWatch integration tests. Provides convenience methods for
 * creating test data, and automatically loads AWS credentials from a properties
 * file on disk and instantiates clients for the individual tests to use.
 *
 */
public abstract class CloudWatchIntegrationTestBase extends AWSTestBase {

    /** The CloudWatch client for all tests to use */
    protected static AmazonCloudWatch cloudwatch;

    /**
     * Loads the AWS account info for the integration tests and creates a
     * CloudWatch client for tests to use.
     */
    @BeforeClass
    public static void setUp() throws FileNotFoundException, IOException {
        setUpCredentials();
        cloudwatch = new AmazonCloudWatchClient(credentials);
    }
}
