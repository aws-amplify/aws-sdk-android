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

package com.amazonaws.services.sns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.services.sns.model.CreatePlatformApplicationRequest;
import com.amazonaws.services.sns.model.CreatePlatformApplicationResult;
import com.amazonaws.services.sns.model.CreatePlatformEndpointRequest;
import com.amazonaws.services.sns.model.CreatePlatformEndpointResult;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.DeleteEndpointRequest;
import com.amazonaws.services.sns.model.DeletePlatformApplicationRequest;
import com.amazonaws.services.sns.model.DeleteTopicRequest;
import com.amazonaws.services.sns.model.Endpoint;
import com.amazonaws.services.sns.model.GetEndpointAttributesRequest;
import com.amazonaws.services.sns.model.GetEndpointAttributesResult;
import com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest;
import com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult;
import com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest;
import com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult;
import com.amazonaws.services.sns.model.ListPlatformApplicationsResult;
import com.amazonaws.services.sns.model.PlatformApplication;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sns.model.SetEndpointAttributesRequest;
import com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MobilePushIntegrationTest extends SNSIntegrationTestBase {

    private final String platformAppName = "AndroidSDKTestApp" + new Random().nextInt();
    private String platformCredential;
    private String token;

    @Before
    public void setup() throws JSONException {
        platformCredential = getPackageConfigure().getString("platform_credential");
        token =  getPackageConfigure().getString("token");
    }

    /**
     * Tests for mobile push API
     *
     * @throws InterruptedException
     */
    @Test
    public void testMobilePushOperations() throws InterruptedException {

        String platformApplicationArn = null;
        String endpointArn = null;
        String topicArn = null;

        try {
            final CreateTopicResult createTopicResult = sns
                    .createTopic(new CreateTopicRequest("TestTopic"));
            topicArn = createTopicResult.getTopicArn();

            // List platform applications
            ListPlatformApplicationsResult listPlatformAppsResult = sns.listPlatformApplications();
            final int platformAppsCount = listPlatformAppsResult.getPlatformApplications().size();
            for (final PlatformApplication platformApp : listPlatformAppsResult.getPlatformApplications()) {
                assertNotNull(platformApp.getPlatformApplicationArn());
                validateAttributes(platformApp.getAttributes());
            }

            // Create a platform application for GCM.
            final Map<String, String> attributes = new HashMap<String, String>();
            attributes.put("PlatformCredential", platformCredential);
            attributes.put("PlatformPrincipal", "NA");
            attributes.put("EventEndpointCreated", topicArn);
            attributes.put("EventEndpointDeleted", topicArn);
            attributes.put("EventEndpointUpdated", topicArn);
            attributes.put("EventDeliveryAttemptFailure", topicArn);
            attributes.put("EventDeliveryFailure", "");
            final CreatePlatformApplicationResult createPlatformAppResult = sns
                    .createPlatformApplication(
                            new CreatePlatformApplicationRequest().withName(platformAppName)
                                    .withPlatform("GCM").withAttributes(attributes));
            assertNotNull(createPlatformAppResult.getPlatformApplicationArn());
            platformApplicationArn = createPlatformAppResult.getPlatformApplicationArn();

            Thread.sleep(5 * 1000);
            listPlatformAppsResult = sns.listPlatformApplications();
            assertEquals(platformAppsCount + 1,
                    listPlatformAppsResult.getPlatformApplications().size());

            // Get attributes
            GetPlatformApplicationAttributesResult getPlatformAttributesResult = sns
                    .getPlatformApplicationAttributes(
                            new GetPlatformApplicationAttributesRequest()
                                    .withPlatformApplicationArn(platformApplicationArn));
            validateAttributes(getPlatformAttributesResult.getAttributes());

            // Set attributes
            attributes.clear();
            attributes.put("EventDeliveryFailure", topicArn);

            sns.setPlatformApplicationAttributes(new SetPlatformApplicationAttributesRequest()
                    .withPlatformApplicationArn(platformApplicationArn).withAttributes(attributes));

            Thread.sleep(1 * 1000);
            // Verify attribute change
            getPlatformAttributesResult = sns.getPlatformApplicationAttributes(
                    new GetPlatformApplicationAttributesRequest()
                            .withPlatformApplicationArn(platformApplicationArn));
            validateAttribute(getPlatformAttributesResult.getAttributes(), "EventDeliveryFailure",
                    topicArn);

            // Create platform endpoint
            final CreatePlatformEndpointResult createPlatformEndpointResult = sns
                    .createPlatformEndpoint(
                            new CreatePlatformEndpointRequest()
                                    .withPlatformApplicationArn(platformApplicationArn)
                                    .withCustomUserData("Custom Data").withToken(token));
            assertNotNull(createPlatformEndpointResult.getEndpointArn());
            endpointArn = createPlatformEndpointResult.getEndpointArn();

            // List platform endpoints
            Thread.sleep(5 * 1000);
            final ListEndpointsByPlatformApplicationResult listEndpointsResult = sns
                    .listEndpointsByPlatformApplication(
                            new ListEndpointsByPlatformApplicationRequest()
                                    .withPlatformApplicationArn(platformApplicationArn));
            assertTrue(listEndpointsResult.getEndpoints().size() == 1);
            for (final Endpoint endpoint : listEndpointsResult.getEndpoints()) {
                assertNotNull(endpoint.getEndpointArn());
                validateAttributes(endpoint.getAttributes());
            }

            // Publish to the endpoint
            final PublishResult publishResult = sns
                    .publish(new PublishRequest().withMessage("Mobile push test message")
                            .withSubject("Mobile Push test subject").withTargetArn(endpointArn));
            assertNotNull(publishResult.getMessageId());

            // Get endpoint attributes
            GetEndpointAttributesResult getEndpointAttributesResult = sns
                    .getEndpointAttributes(
                            new GetEndpointAttributesRequest().withEndpointArn(endpointArn));
            validateAttributes(getEndpointAttributesResult.getAttributes());

            // Set endpoint attributes
            attributes.clear();
            attributes.put("CustomUserData", "Updated Custom Data");
            sns.setEndpointAttributes(
                    new SetEndpointAttributesRequest().withEndpointArn(endpointArn)
                            .withAttributes(attributes));

            Thread.sleep(1 * 1000);
            // Validate set endpoint attributes
            getEndpointAttributesResult = sns
                    .getEndpointAttributes(
                            new GetEndpointAttributesRequest().withEndpointArn(endpointArn));
            validateAttribute(getEndpointAttributesResult.getAttributes(), "CustomUserData",
                    "Updated Custom Data");

        } finally {
            if (platformApplicationArn != null) {
                if (endpointArn != null) {
                    // Delete endpoint
                    sns.deleteEndpoint(new DeleteEndpointRequest().withEndpointArn(endpointArn));
                }
                // Delete application platform
                sns.deletePlatformApplication(
                        new DeletePlatformApplicationRequest()
                                .withPlatformApplicationArn(platformApplicationArn));
            }
            if (topicArn != null) {
                // Delete the topic
                sns.deleteTopic(new DeleteTopicRequest(topicArn));
            }
        }
    }

    private void validateAttributes(Map<String, String> attributes) {
        for (final Map.Entry<String, String> attribute : attributes.entrySet()) {
            assertNotNull(attribute.getKey());
            assertNotNull(attribute.getValue());
        }
    }

    private void validateAttribute(Map<String, String> attributes, String key, String expectedValue) {
        if (attributes.containsKey(key)) {
            if (attributes.get(key).equals(expectedValue)) {
                return;
            }
            fail(String.format("The key %s didn't have the expected value %s. Actual value : %s ",
                    key, expectedValue,
                    attributes.get(key)));
        }
        fail(String.format("The key %s wasn't present in the Map.", key));
    }
}