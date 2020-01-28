/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.Constants;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class TransferUtilityTest {

    private static AWSConfiguration awsConfig;

    /**
     * Tests that transfer utility successfully mutated Amazon S3 client
     * if local testing flag is set to true.
     *
     * @throws Exception
     */
    @Test
    public void testLocalTestingEnabled() throws Exception {
        final String jsonString = "{\n" +
                "  \"S3TransferUtility\": {\n" +
                "    \"Default\": {\n" +
                "      \"Bucket\": \"name\",\n" +
                "      \"Region\": \"us-east-1\",\n" +
                "      \"DangerouslyConnectToHTTPEndpointForTesting\": true\n" +
                "    }\n" +
                "  }\n" +
                "}";

        try {
            JSONObject jsonConfig = new JSONObject(jsonString);
            awsConfig = new AWSConfiguration(jsonConfig);
        } catch (JSONException e) {
            fail("Error in constructing AWSConfiguration." + e.getLocalizedMessage());
        }

        AWSCredentials creds = new BasicAWSCredentials("accessKey", "secretKey");
        Region region = Region.getRegion(Regions.DEFAULT_REGION);
        AmazonS3Client s3 = new AmazonS3Client(creds, region);

        TransferUtility.builder()
                .context(RuntimeEnvironment.application.getApplicationContext())
                .awsConfiguration(awsConfig)
                .s3Client(s3)
                .build();

        assertEquals(s3.getEndpoint(), Constants.LOCAL_TESTING_ENDPOINT);
        assertTrue(s3.clientOptions.isPathStyleAccess());
        assertTrue(s3.clientOptions.isContentMd5CheckSkipped());
    }

    /**
     * Tests that transfer utility correctly ignored local testing branch
     * if local testing flag is set to false.
     *
     * @throws Exception
     */
    @Test
    public void testLocalTestingDisabled() throws Exception {
        final String jsonString = "{\n" +
                "  \"S3TransferUtility\": {\n" +
                "    \"Default\": {\n" +
                "      \"Bucket\": \"name\",\n" +
                "      \"Region\": \"us-east-1\",\n" +
                "      \"DangerouslyConnectToHTTPEndpointForTesting\": false\n" +
                "    }\n" +
                "  }\n" +
                "}";

        try {
            JSONObject jsonConfig = new JSONObject(jsonString);
            awsConfig = new AWSConfiguration(jsonConfig);
        } catch (JSONException e) {
            fail("Error in constructing AWSConfiguration." + e.getLocalizedMessage());
        }

        AWSCredentials creds = new BasicAWSCredentials("accessKey", "secretKey");
        Region region = Region.getRegion(Regions.DEFAULT_REGION);
        AmazonS3Client s3 = new AmazonS3Client(creds, region);

        TransferUtility.builder()
                .context(RuntimeEnvironment.application.getApplicationContext())
                .awsConfiguration(awsConfig)
                .s3Client(s3)
                .build();

        assertNotEquals(s3.getEndpoint(), Constants.LOCAL_TESTING_ENDPOINT);
        assertFalse(s3.clientOptions.isPathStyleAccess());
        assertFalse(s3.clientOptions.isContentMd5CheckSkipped());
    }

    /**
     * Tests that transfer utility correctly ignored local testing branch
     * if local testing flag is not specified.
     *
     * @throws Exception
     */
    @Test
    public void testLocalTestingUnset() throws Exception {
        final String jsonString = "{\n" +
                "  \"S3TransferUtility\": {\n" +
                "    \"Default\": {\n" +
                "      \"Bucket\": \"name\",\n" +
                "      \"Region\": \"us-east-1\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        try {
            JSONObject jsonConfig = new JSONObject(jsonString);
            awsConfig = new AWSConfiguration(jsonConfig);
        } catch (JSONException e) {
            fail("Error in constructing AWSConfiguration." + e.getLocalizedMessage());
        }

        AWSCredentials creds = new BasicAWSCredentials("accessKey", "secretKey");
        Region region = Region.getRegion(Regions.DEFAULT_REGION);
        AmazonS3Client s3 = new AmazonS3Client(creds, region);

        TransferUtility.builder()
                .context(RuntimeEnvironment.application.getApplicationContext())
                .awsConfiguration(awsConfig)
                .s3Client(s3)
                .build();

        assertNotEquals(s3.getEndpoint(), Constants.LOCAL_TESTING_ENDPOINT);
        assertFalse(s3.clientOptions.isPathStyleAccess());
        assertFalse(s3.clientOptions.isContentMd5CheckSkipped());
    }
}