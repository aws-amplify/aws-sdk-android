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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DirectMessageConfiguration
 */
class DirectMessageConfigurationJsonMarshaller {

    public void marshall(DirectMessageConfiguration directMessageConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (directMessageConfiguration.getADMMessage() != null) {
            ADMMessage aDMMessage = directMessageConfiguration.getADMMessage();
            jsonWriter.name("ADMMessage");
            ADMMessageJsonMarshaller.getInstance().marshall(aDMMessage, jsonWriter);
        }
        if (directMessageConfiguration.getAPNSMessage() != null) {
            APNSMessage aPNSMessage = directMessageConfiguration.getAPNSMessage();
            jsonWriter.name("APNSMessage");
            APNSMessageJsonMarshaller.getInstance().marshall(aPNSMessage, jsonWriter);
        }
        if (directMessageConfiguration.getBaiduMessage() != null) {
            BaiduMessage baiduMessage = directMessageConfiguration.getBaiduMessage();
            jsonWriter.name("BaiduMessage");
            BaiduMessageJsonMarshaller.getInstance().marshall(baiduMessage, jsonWriter);
        }
        if (directMessageConfiguration.getDefaultMessage() != null) {
            DefaultMessage defaultMessage = directMessageConfiguration.getDefaultMessage();
            jsonWriter.name("DefaultMessage");
            DefaultMessageJsonMarshaller.getInstance().marshall(defaultMessage, jsonWriter);
        }
        if (directMessageConfiguration.getDefaultPushNotificationMessage() != null) {
            DefaultPushNotificationMessage defaultPushNotificationMessage = directMessageConfiguration
                    .getDefaultPushNotificationMessage();
            jsonWriter.name("DefaultPushNotificationMessage");
            DefaultPushNotificationMessageJsonMarshaller.getInstance().marshall(
                    defaultPushNotificationMessage, jsonWriter);
        }
        if (directMessageConfiguration.getEmailMessage() != null) {
            EmailMessage emailMessage = directMessageConfiguration.getEmailMessage();
            jsonWriter.name("EmailMessage");
            EmailMessageJsonMarshaller.getInstance().marshall(emailMessage, jsonWriter);
        }
        if (directMessageConfiguration.getGCMMessage() != null) {
            GCMMessage gCMMessage = directMessageConfiguration.getGCMMessage();
            jsonWriter.name("GCMMessage");
            GCMMessageJsonMarshaller.getInstance().marshall(gCMMessage, jsonWriter);
        }
        if (directMessageConfiguration.getSMSMessage() != null) {
            SMSMessage sMSMessage = directMessageConfiguration.getSMSMessage();
            jsonWriter.name("SMSMessage");
            SMSMessageJsonMarshaller.getInstance().marshall(sMSMessage, jsonWriter);
        }
        if (directMessageConfiguration.getVoiceMessage() != null) {
            VoiceMessage voiceMessage = directMessageConfiguration.getVoiceMessage();
            jsonWriter.name("VoiceMessage");
            VoiceMessageJsonMarshaller.getInstance().marshall(voiceMessage, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DirectMessageConfigurationJsonMarshaller instance;

    public static DirectMessageConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectMessageConfigurationJsonMarshaller();
        return instance;
    }
}
