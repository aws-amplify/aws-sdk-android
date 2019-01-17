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
 * StAX request marshaller for CreateCustomVerificationEmailTemplateRequest
 */
public class CreateCustomVerificationEmailTemplateRequestMarshaller
        implements
        Marshaller<Request<CreateCustomVerificationEmailTemplateRequest>, CreateCustomVerificationEmailTemplateRequest> {

    public Request<CreateCustomVerificationEmailTemplateRequest> marshall(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest) {
        if (createCustomVerificationEmailTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCustomVerificationEmailTemplateRequest)");
        }

        Request<CreateCustomVerificationEmailTemplateRequest> request = new DefaultRequest<CreateCustomVerificationEmailTemplateRequest>(
                createCustomVerificationEmailTemplateRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateCustomVerificationEmailTemplate");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (createCustomVerificationEmailTemplateRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = createCustomVerificationEmailTemplateRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (createCustomVerificationEmailTemplateRequest.getFromEmailAddress() != null) {
            prefix = "FromEmailAddress";
            String fromEmailAddress = createCustomVerificationEmailTemplateRequest
                    .getFromEmailAddress();
            request.addParameter(prefix, StringUtils.fromString(fromEmailAddress));
        }
        if (createCustomVerificationEmailTemplateRequest.getTemplateSubject() != null) {
            prefix = "TemplateSubject";
            String templateSubject = createCustomVerificationEmailTemplateRequest
                    .getTemplateSubject();
            request.addParameter(prefix, StringUtils.fromString(templateSubject));
        }
        if (createCustomVerificationEmailTemplateRequest.getTemplateContent() != null) {
            prefix = "TemplateContent";
            String templateContent = createCustomVerificationEmailTemplateRequest
                    .getTemplateContent();
            request.addParameter(prefix, StringUtils.fromString(templateContent));
        }
        if (createCustomVerificationEmailTemplateRequest.getSuccessRedirectionURL() != null) {
            prefix = "SuccessRedirectionURL";
            String successRedirectionURL = createCustomVerificationEmailTemplateRequest
                    .getSuccessRedirectionURL();
            request.addParameter(prefix, StringUtils.fromString(successRedirectionURL));
        }
        if (createCustomVerificationEmailTemplateRequest.getFailureRedirectionURL() != null) {
            prefix = "FailureRedirectionURL";
            String failureRedirectionURL = createCustomVerificationEmailTemplateRequest
                    .getFailureRedirectionURL();
            request.addParameter(prefix, StringUtils.fromString(failureRedirectionURL));
        }

        return request;
    }
}
