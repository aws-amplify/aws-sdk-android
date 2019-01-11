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

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CustomVerificationEmailTemplate
 */
class CustomVerificationEmailTemplateStaxMarshaller {

    public void marshall(CustomVerificationEmailTemplate _customVerificationEmailTemplate,
            Request<?> request, String _prefix) {
        String prefix;
        if (_customVerificationEmailTemplate.getTemplateName() != null) {
            prefix = _prefix + "TemplateName";
            String templateName = _customVerificationEmailTemplate.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (_customVerificationEmailTemplate.getFromEmailAddress() != null) {
            prefix = _prefix + "FromEmailAddress";
            String fromEmailAddress = _customVerificationEmailTemplate.getFromEmailAddress();
            request.addParameter(prefix, StringUtils.fromString(fromEmailAddress));
        }
        if (_customVerificationEmailTemplate.getTemplateSubject() != null) {
            prefix = _prefix + "TemplateSubject";
            String templateSubject = _customVerificationEmailTemplate.getTemplateSubject();
            request.addParameter(prefix, StringUtils.fromString(templateSubject));
        }
        if (_customVerificationEmailTemplate.getSuccessRedirectionURL() != null) {
            prefix = _prefix + "SuccessRedirectionURL";
            String successRedirectionURL = _customVerificationEmailTemplate
                    .getSuccessRedirectionURL();
            request.addParameter(prefix, StringUtils.fromString(successRedirectionURL));
        }
        if (_customVerificationEmailTemplate.getFailureRedirectionURL() != null) {
            prefix = _prefix + "FailureRedirectionURL";
            String failureRedirectionURL = _customVerificationEmailTemplate
                    .getFailureRedirectionURL();
            request.addParameter(prefix, StringUtils.fromString(failureRedirectionURL));
        }
    }

    private static CustomVerificationEmailTemplateStaxMarshaller instance;

    public static CustomVerificationEmailTemplateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomVerificationEmailTemplateStaxMarshaller();
        return instance;
    }
}
