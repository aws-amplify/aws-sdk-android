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
 * JSON marshaller for POJO MessageTemplateType
 */
class MessageTemplateTypeJsonMarshaller {

    public void marshall(MessageTemplateType messageTemplateType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (messageTemplateType.getSMSMessage() != null) {
            String sMSMessage = messageTemplateType.getSMSMessage();
            jsonWriter.name("SMSMessage");
            jsonWriter.value(sMSMessage);
        }
        if (messageTemplateType.getEmailMessage() != null) {
            String emailMessage = messageTemplateType.getEmailMessage();
            jsonWriter.name("EmailMessage");
            jsonWriter.value(emailMessage);
        }
        if (messageTemplateType.getEmailSubject() != null) {
            String emailSubject = messageTemplateType.getEmailSubject();
            jsonWriter.name("EmailSubject");
            jsonWriter.value(emailSubject);
        }
        jsonWriter.endObject();
    }

    private static MessageTemplateTypeJsonMarshaller instance;

    public static MessageTemplateTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageTemplateTypeJsonMarshaller();
        return instance;
    }
}
