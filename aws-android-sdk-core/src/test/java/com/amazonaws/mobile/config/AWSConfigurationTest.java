/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobile.config;


import com.amazonaws.auth.CognitoCredentialsProvider;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

@RunWith(RobolectricTestRunner.class)
public class AWSConfigurationTest {

    private static final String jsonString = "{\n" +
            "  \"UserAgent\": \"aws-amplify-cli/0.1.0\",\n" +
            "  \"Version\": \"1.0\",\n" +
            "  \"IdentityManager\": {\n" +
            "    \"Default\": {}\n" +
            "  },\n" +
            "  \"AppSync\": {\n" +
            "    \"Default\": {\n" +
            "      \"ApiUrl\": \"redacted\",\n" +
            "      \"Region\": \"us-east-1\",\n" +
            "      \"AuthMode\": \"API_KEY\",\n" +
            "      \"ApiKey\": \"da2-xyz\",\n" +
            "      \"ClientDatabasePrefix\": \"redacted\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"CredentialsProvider\": {\n" +
            "    \"CognitoIdentity\": {\n" +
            "      \"Default\": {\n" +
            "        \"PoolId\": \"redacted\",\n" +
            "        \"Region\": \"us-east-1\"\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

    @Test
    public void testAWSConfigurationWithJSONObject() {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);

            AWSConfiguration awsConfiguration = new AWSConfiguration(jsonObject);
            assertNotNull(awsConfiguration);

            assertNotNull(awsConfiguration.optJsonObject("AppSync"));
            assertEquals("API_KEY", awsConfiguration.optJsonObject("AppSync").getString("AuthMode"));
        } catch (JSONException e) {
            fail("Error in constructing AWSConfiguration." + e.getLocalizedMessage());
        }
    }

    @Test
    public void testCognitoCachingCredentialsProviderWithAWSConfiguration() {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);

            AWSConfiguration awsConfiguration = new AWSConfiguration(jsonObject);
            assertNotNull(awsConfiguration);
            CognitoCredentialsProvider cognitoCredentialsProvider = new CognitoCredentialsProvider(awsConfiguration);
            assertNotNull(cognitoCredentialsProvider);
        } catch (JSONException e) {
            fail("Error in constructing AWSConfiguration." + e.getLocalizedMessage());
        }
    }

    @Test
    public void testAWSConfigurationWithNullJSONObject() {
        try {
            JSONObject jsonObject = null;
            new AWSConfiguration(jsonObject);
            fail("No exception thrown when a null JSONObject is passed in.");
        } catch (IllegalArgumentException e) {
            assertEquals("JSONObject cannot be null.", e.getLocalizedMessage());
        }
    }
}
