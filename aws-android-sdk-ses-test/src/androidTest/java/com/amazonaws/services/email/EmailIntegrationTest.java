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

package com.amazonaws.services.email;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.GetSendStatisticsResult;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.RawMessage;
import com.amazonaws.services.simpleemail.model.SendDataPoint;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.amazonaws.services.simpleemail.model.SendRawEmailRequest;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * Integration tests for the AWS Email Service. We can't easily test that we
 * actually receive emails, so we rely on the service's 200 OK responses to our
 * requests. TODO: The Email service uses the new AWS3 signing protocol, so it'd
 * be good to test operations over both HTTP and HTTPS (since the signing
 * protocol differs depending on which you use), but right now, the endpoint
 * only supports HTTPS.
 */
public class EmailIntegrationTest extends SESIntegrationTestBase {

    /**
     * Tests that we can send email using the HTTPS endpoint on the AWS Email
     * Service.
     */
    @Test
    public void testHttpsEndpointOperations() throws Exception {
        email.sendEmail(new SendEmailRequest()
                .withMessage(newMessage("HTTPS Test " + System.currentTimeMillis()))
                .withDestination(new Destination().withToAddresses(DESTINATION))
                .withSource(DESTINATION));

        ByteBuffer byteBuffer = ByteBuffer.wrap(loadRawMessage(RAW_MESSAGE).getBytes());
        email.sendRawEmail(new SendRawEmailRequest()
                .withRawMessage(new RawMessage().withData(byteBuffer)));

        GetSendStatisticsResult sendStatistics = email.getSendStatistics();
        assertTrue(sendStatistics.getSendDataPoints().size() > 0);
        for (SendDataPoint dataPoint : sendStatistics.getSendDataPoints()) {
            assertNotNull(dataPoint.getBounces());
            assertNotNull(dataPoint.getComplaints());
            assertNotNull(dataPoint.getDeliveryAttempts());
            assertNotNull(dataPoint.getTimestamp());
        }
    }

    private Message newMessage(String subject) {
        Content content = new Content().withData(subject);
        Message message = new Message()
                .withSubject(content)
                .withBody(new Body().withText(content));

        return message;
    }

}
