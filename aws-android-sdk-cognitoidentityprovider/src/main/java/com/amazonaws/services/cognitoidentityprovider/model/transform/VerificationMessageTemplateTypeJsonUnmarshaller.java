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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VerificationMessageTemplateType
 */
class VerificationMessageTemplateTypeJsonUnmarshaller implements
        Unmarshaller<VerificationMessageTemplateType, JsonUnmarshallerContext> {

    public VerificationMessageTemplateType unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VerificationMessageTemplateType verificationMessageTemplateType = new VerificationMessageTemplateType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SmsMessage")) {
                verificationMessageTemplateType.setSmsMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailMessage")) {
                verificationMessageTemplateType.setEmailMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailSubject")) {
                verificationMessageTemplateType.setEmailSubject(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailMessageByLink")) {
                verificationMessageTemplateType.setEmailMessageByLink(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailSubjectByLink")) {
                verificationMessageTemplateType.setEmailSubjectByLink(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultEmailOption")) {
                verificationMessageTemplateType.setDefaultEmailOption(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return verificationMessageTemplateType;
    }

    private static VerificationMessageTemplateTypeJsonUnmarshaller instance;

    public static VerificationMessageTemplateTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerificationMessageTemplateTypeJsonUnmarshaller();
        return instance;
    }
}
