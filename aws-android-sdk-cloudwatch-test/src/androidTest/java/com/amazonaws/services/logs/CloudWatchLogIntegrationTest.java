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

package com.amazonaws.services.logs;

import com.amazonaws.services.logs.model.CreateLogStreamRequest;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.UUID;

public class CloudWatchLogIntegrationTest extends AWSTestBase {

    /** Log Group Name. */
    private String LOG_GROUP_NAME = "com/amazonaws/tests";

    /** The CloudWatchLogs client for all tests to use. */
    private AmazonCloudWatchLogsClient cloudWatchLogsClient;

    /**
     * Loads the AWS account info for the integration tests and creates a
     * CloudWatchLogs client for tests to use.
     */
    @Before
    public void setUp() throws IOException {
        setUpCredentials();
        cloudWatchLogsClient = new AmazonCloudWatchLogsClient(credentials);
    }

    @Test
    public void testCreateStream() {
        CreateLogStreamRequest request = new CreateLogStreamRequest();
        request.setLogGroupName(LOG_GROUP_NAME);
        request.setLogStreamName("cloudwatchlogs.integrationtests." + UUID.randomUUID().toString());
        try {
            // This creates a new stream with above name in LOG_GROUP_NAME which expires after 7 days
            cloudWatchLogsClient.createLogStream(request);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue("createLogStream should not have an exception.", false);
        }
    }
}