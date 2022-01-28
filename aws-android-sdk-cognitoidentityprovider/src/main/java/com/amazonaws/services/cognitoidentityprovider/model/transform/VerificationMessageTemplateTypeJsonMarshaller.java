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
 * JSON marshaller for POJO VerificationMessageTemplateType
 */
class VerificationMessageTemplateTypeJsonMarshaller {

    public void marshall(VerificationMessageTemplateType verificationMessageTemplateType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (verificationMessageTemplateType.getSmsMessage() != null) {
            String smsMessage = verificationMessageTemplateType.getSmsMessage();
            jsonWriter.name("SmsMessage");
            jsonWriter.value(smsMessage);
        }
        if (verificationMessageTemplateType.getEmailMessage() != null) {
            String emailMessage = verificationMessageTemplateType.getEmailMessage();
            jsonWriter.name("EmailMessage");
            jsonWriter.value(emailMessage);
        }
        if (verificationMessageTemplateType.getEmailSubject() != null) {
            String emailSubject = verificationMessageTemplateType.getEmailSubject();
            jsonWriter.name("EmailSubject");
            jsonWriter.value(emailSubject);
        }
        if (verificationMessageTemplateType.getEmailMessageByLink() != null) {
            String emailMessageByLink = verificationMessageTemplateType.getEmailMessageByLink();
            jsonWriter.name("EmailMessageByLink");
            jsonWriter.value(emailMessageByLink);
        }
        if (verificationMessageTemplateType.getEmailSubjectByLink() != null) {
            String emailSubjectByLink = verificationMessageTemplateType.getEmailSubjectByLink();
            jsonWriter.name("EmailSubjectByLink");
            jsonWriter.value(emailSubjectByLink);
        }
        if (verificationMessageTemplateType.getDefaultEmailOption() != null) {
            String defaultEmailOption = verificationMessageTemplateType.getDefaultEmailOption();
            jsonWriter.name("DefaultEmailOption");
            jsonWriter.value(defaultEmailOption);
        }
        jsonWriter.endObject();
    }

    private static VerificationMessageTemplateTypeJsonMarshaller instance;

    public static VerificationMessageTemplateTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VerificationMessageTemplateTypeJsonMarshaller();
        return instance;
    }
}
