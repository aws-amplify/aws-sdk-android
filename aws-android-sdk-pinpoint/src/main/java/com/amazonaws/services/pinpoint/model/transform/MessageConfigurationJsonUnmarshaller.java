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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MessageConfiguration
 */
class MessageConfigurationJsonUnmarshaller implements
        Unmarshaller<MessageConfiguration, JsonUnmarshallerContext> {

    public MessageConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MessageConfiguration messageConfiguration = new MessageConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ADMMessage")) {
                messageConfiguration.setADMMessage(MessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("APNSMessage")) {
                messageConfiguration.setAPNSMessage(MessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaiduMessage")) {
                messageConfiguration.setBaiduMessage(MessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultMessage")) {
                messageConfiguration.setDefaultMessage(MessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmailMessage")) {
                messageConfiguration.setEmailMessage(CampaignEmailMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GCMMessage")) {
                messageConfiguration.setGCMMessage(MessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SMSMessage")) {
                messageConfiguration.setSMSMessage(CampaignSmsMessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return messageConfiguration;
    }

    private static MessageConfigurationJsonUnmarshaller instance;

    public static MessageConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageConfigurationJsonUnmarshaller();
        return instance;
    }
}
