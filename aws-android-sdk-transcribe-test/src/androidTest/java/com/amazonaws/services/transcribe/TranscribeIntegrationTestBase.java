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

package com.amazonaws.services.transcribe;

import android.support.test.InstrumentationRegistry;

import com.amazonaws.testutils.AWSTestBase;
import com.amazonaws.transcribetest.R;

import org.json.JSONObject;
import org.junit.Before;

import java.io.IOException;

public class TranscribeIntegrationTestBase extends AWSTestBase {

    /** The Transcribe client for all tests to use */
    protected static AmazonTranscribeClient transcribeClient;

    /** Package name in testconfiguration.json */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
                                                    getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure()  {
        return getPackageConfigure(PACKAGE_NAME);
    }

    /**
     * Loads the AWS account info for the integration tests and creates a
     * Transcribe client for tests to use.
     */
    @Before
    public void setUp() throws IOException {
        setUpCredentials();
        transcribeClient = new AmazonTranscribeClient(credentials);
    }
}
