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

package com.amazonaws.services.translate;

import com.amazonaws.testutils.AWSTestBase;
import org.junit.Before;

import java.io.IOException;

public abstract class TranslateIntegrationTestBase extends AWSTestBase {

    /** The Translate client for all tests to use */
    protected static AmazonTranslateClient translateClient;

    /**
     * Loads the AWS account info for the integration tests and creates a
     * Translate client for tests to use.
     */
    @Before
    public void setUp() throws IOException {
        setUpCredentials();
        translateClient = new AmazonTranslateClient(credentials);
    }
}
