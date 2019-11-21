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

package com.amazonaws.services.connectparticipant;

import android.support.test.runner.AndroidJUnit4;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.connect.AmazonConnectClient;
import com.amazonaws.services.connect.model.ParticipantDetails;
import com.amazonaws.services.connect.model.StartChatContactRequest;
import com.amazonaws.services.connectparticipant.model.CreateParticipantConnectionRequest;
import com.amazonaws.services.connectparticipant.model.DisconnectParticipantRequest;
import com.amazonaws.services.connectparticipant.model.GetTranscriptRequest;
import com.amazonaws.services.connectparticipant.model.SendMessageRequest;
import com.amazonaws.services.connectparticipant.model.SendMessageResult;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ConnectParticipantInstrumentedTest extends AWSTestBase {

    private AmazonConnectClient connectClient;
    private AmazonConnectParticipantClient chatClient;

    private String instanceId;
    private String adminUserName;
    private String contactFlowId;

    private String participantToken;
    private String connectionToken;

    private boolean isDisconnected = true;

    private String TAG = ConnectParticipantInstrumentedTest.class.getSimpleName();

    @Before
    public void setUp() throws Exception {
        setUpCredentials();
        connectClient = new AmazonConnectClient(credentials);
        chatClient = new AmazonConnectParticipantClient();
        instanceId = getPackageConfigure("connect").getString("instanceId");
        adminUserName = getPackageConfigure("connect").getString("adminUserName");
        contactFlowId = getPackageConfigure("connect").getString("contactFlowId");

        StartChatContactRequest startchatContactRequest = new StartChatContactRequest();
        ParticipantDetails participantDetails = new ParticipantDetails();
        participantDetails.setDisplayName(adminUserName);

        participantToken = connectClient.startChatContact(startchatContactRequest
                .withInstanceId(instanceId)
                .withContactFlowId(contactFlowId)
                .withParticipantDetails(participantDetails)
        ).getParticipantToken();
    }

    @After
    public void tearDown() {
        disconnect();
    }

    @Test
    public void testCreateConnection() {
        assertNotEmpty(getConnectionToken());
    }

    @Test
    public void testDisconnect() {
        getConnectionToken();
        disconnect();
        try {
            chatClient.getTranscript(new GetTranscriptRequest().withConnectionToken(participantToken));
            fail("Disconnected participant should not be able to invoke an API");
        } catch (AmazonServiceException e) {
            assertValidException(e);
        }
    }

    @Test
    public void testSendChatMessage() {
        final String message = "This is a test message";

        SendMessageRequest sendMessageRequest = new SendMessageRequest()
                .withConnectionToken(getConnectionToken())
                .withContent(message)
                .withContentType("text/plain");
        SendMessageResult sendMessageResult = chatClient.sendMessage(sendMessageRequest);

        assertNotEmpty(sendMessageResult.getId());
    }

    // Generates a singleton connection authentication token to use in this test
    private String getConnectionToken() {
        if (connectionToken == null || isDisconnected) {
            CreateParticipantConnectionRequest createParticipantConnectionRequest = new CreateParticipantConnectionRequest()
                    .withParticipantToken(participantToken)
                    .withType("CONNECTION_CREDENTIALS");
            connectionToken = chatClient.createParticipantConnection(createParticipantConnectionRequest)
                    .getConnectionCredentials()
                    .getConnectionToken();
            isDisconnected = false;
        }
        return connectionToken;
    }

    // Disconnect and invalidate participant token
    private void disconnect() {
        if (isDisconnected) {
            return;
        }
        DisconnectParticipantRequest disconnectParticipantRequest = new DisconnectParticipantRequest();
        disconnectParticipantRequest.setConnectionToken(participantToken);
        chatClient.disconnectParticipant(disconnectParticipantRequest);
        isDisconnected = true;
    }
}
