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
 * JSON unmarshaller for POJO EmailConfigurationType
 */
class EmailConfigurationTypeJsonUnmarshaller implements
        Unmarshaller<EmailConfigurationType, JsonUnmarshallerContext> {

    public EmailConfigurationType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EmailConfigurationType emailConfigurationType = new EmailConfigurationType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SourceArn")) {
                emailConfigurationType.setSourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplyToEmailAddress")) {
                emailConfigurationType.setReplyToEmailAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailSendingAccount")) {
                emailConfigurationType.setEmailSendingAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("From")) {
                emailConfigurationType.setFrom(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationSet")) {
                emailConfigurationType.setConfigurationSet(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return emailConfigurationType;
    }

    private static EmailConfigurationTypeJsonUnmarshaller instance;

    public static EmailConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EmailConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
