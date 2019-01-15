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
 * StAX request marshaller for UpdateCustomVerificationEmailTemplateRequest
 */
public class UpdateCustomVerificationEmailTemplateRequestMarshaller
        implements
        Marshaller<Request<UpdateCustomVerificationEmailTemplateRequest>, UpdateCustomVerificationEmailTemplateRequest> {

    public Request<UpdateCustomVerificationEmailTemplateRequest> marshall(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest) {
        if (updateCustomVerificationEmailTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateCustomVerificationEmailTemplateRequest)");
        }

        Request<UpdateCustomVerificationEmailTemplateRequest> request = new DefaultRequest<UpdateCustomVerificationEmailTemplateRequest>(
                updateCustomVerificationEmailTemplateRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "UpdateCustomVerificationEmailTemplate");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (updateCustomVerificationEmailTemplateRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = updateCustomVerificationEmailTemplateRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (updateCustomVerificationEmailTemplateRequest.getFromEmailAddress() != null) {
            prefix = "FromEmailAddress";
            String fromEmailAddress = updateCustomVerificationEmailTemplateRequest
                    .getFromEmailAddress();
            request.addParameter(prefix, StringUtils.fromString(fromEmailAddress));
        }
        if (updateCustomVerificationEmailTemplateRequest.getTemplateSubject() != null) {
            prefix = "TemplateSubject";
            String templateSubject = updateCustomVerificationEmailTemplateRequest
                    .getTemplateSubject();
            request.addParameter(prefix, StringUtils.fromString(templateSubject));
        }
        if (updateCustomVerificationEmailTemplateRequest.getTemplateContent() != null) {
            prefix = "TemplateContent";
            String templateContent = updateCustomVerificationEmailTemplateRequest
                    .getTemplateContent();
            request.addParameter(prefix, StringUtils.fromString(templateContent));
        }
        if (updateCustomVerificationEmailTemplateRequest.getSuccessRedirectionURL() != null) {
            prefix = "SuccessRedirectionURL";
            String successRedirectionURL = updateCustomVerificationEmailTemplateRequest
                    .getSuccessRedirectionURL();
            request.addParameter(prefix, StringUtils.fromString(successRedirectionURL));
        }
        if (updateCustomVerificationEmailTemplateRequest.getFailureRedirectionURL() != null) {
            prefix = "FailureRedirectionURL";
            String failureRedirectionURL = updateCustomVerificationEmailTemplateRequest
                    .getFailureRedirectionURL();
            request.addParameter(prefix, StringUtils.fromString(failureRedirectionURL));
        }

        return request;
    }
}
