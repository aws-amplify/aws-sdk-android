/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EmailConfigurationType
 */
class EmailConfigurationTypeJsonMarshaller {

    public void marshall(EmailConfigurationType emailConfigurationType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (emailConfigurationType.getSourceArn() != null) {
            String sourceArn = emailConfigurationType.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (emailConfigurationType.getReplyToEmailAddress() != null) {
            String replyToEmailAddress = emailConfigurationType.getReplyToEmailAddress();
            jsonWriter.name("ReplyToEmailAddress");
            jsonWriter.value(replyToEmailAddress);
        }
        if (emailConfigurationType.getEmailSendingAccount() != null) {
            String emailSendingAccount = emailConfigurationType.getEmailSendingAccount();
            jsonWriter.name("EmailSendingAccount");
            jsonWriter.value(emailSendingAccount);
        }
        if (emailConfigurationType.getFrom() != null) {
            String from = emailConfigurationType.getFrom();
            jsonWriter.name("From");
            jsonWriter.value(from);
        }
        if (emailConfigurationType.getConfigurationSet() != null) {
            String configurationSet = emailConfigurationType.getConfigurationSet();
            jsonWriter.name("ConfigurationSet");
            jsonWriter.value(configurationSet);
        }
        jsonWriter.endObject();
    }

    private static EmailConfigurationTypeJsonMarshaller instance;

    public static EmailConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailConfigurationTypeJsonMarshaller();
        return instance;
    }
}
