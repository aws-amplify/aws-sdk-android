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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SendCustomVerificationEmailRequest
 */
public class SendCustomVerificationEmailRequestMarshaller implements
        Marshaller<Request<SendCustomVerificationEmailRequest>, SendCustomVerificationEmailRequest> {

    public Request<SendCustomVerificationEmailRequest> marshall(
            SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest) {
        if (sendCustomVerificationEmailRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendCustomVerificationEmailRequest)");
        }

        Request<SendCustomVerificationEmailRequest> request = new DefaultRequest<SendCustomVerificationEmailRequest>(
                sendCustomVerificationEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendCustomVerificationEmail");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (sendCustomVerificationEmailRequest.getEmailAddress() != null) {
            prefix = "EmailAddress";
            String emailAddress = sendCustomVerificationEmailRequest.getEmailAddress();
            request.addParameter(prefix, StringUtils.fromString(emailAddress));
        }
        if (sendCustomVerificationEmailRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = sendCustomVerificationEmailRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (sendCustomVerificationEmailRequest.getConfigurationSetName() != null) {
            prefix = "ConfigurationSetName";
            String configurationSetName = sendCustomVerificationEmailRequest
                    .getConfigurationSetName();
            request.addParameter(prefix, StringUtils.fromString(configurationSetName));
        }

        return request;
    }
}
