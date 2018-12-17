/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO DirectMessageConfiguration
 */
class DirectMessageConfigurationJsonUnmarshaller implements
        Unmarshaller<DirectMessageConfiguration, JsonUnmarshallerContext> {

    public DirectMessageConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DirectMessageConfiguration directMessageConfiguration = new DirectMessageConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ADMMessage")) {
                directMessageConfiguration.setADMMessage(ADMMessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("APNSMessage")) {
                directMessageConfiguration.setAPNSMessage(APNSMessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaiduMessage")) {
                directMessageConfiguration.setBaiduMessage(BaiduMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultMessage")) {
                directMessageConfiguration.setDefaultMessage(DefaultMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultPushNotificationMessage")) {
                directMessageConfiguration
                        .setDefaultPushNotificationMessage(DefaultPushNotificationMessageJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EmailMessage")) {
                directMessageConfiguration.setEmailMessage(EmailMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GCMMessage")) {
                directMessageConfiguration.setGCMMessage(GCMMessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SMSMessage")) {
                directMessageConfiguration.setSMSMessage(SMSMessageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VoiceMessage")) {
                directMessageConfiguration.setVoiceMessage(VoiceMessageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return directMessageConfiguration;
    }

    private static DirectMessageConfigurationJsonUnmarshaller instance;

    public static DirectMessageConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectMessageConfigurationJsonUnmarshaller();
        return instance;
    }
}
