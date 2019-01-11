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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MessageConfiguration
 */
class MessageConfigurationJsonMarshaller {

    public void marshall(MessageConfiguration messageConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (messageConfiguration.getADMMessage() != null) {
            Message aDMMessage = messageConfiguration.getADMMessage();
            jsonWriter.name("ADMMessage");
            MessageJsonMarshaller.getInstance().marshall(aDMMessage, jsonWriter);
        }
        if (messageConfiguration.getAPNSMessage() != null) {
            Message aPNSMessage = messageConfiguration.getAPNSMessage();
            jsonWriter.name("APNSMessage");
            MessageJsonMarshaller.getInstance().marshall(aPNSMessage, jsonWriter);
        }
        if (messageConfiguration.getBaiduMessage() != null) {
            Message baiduMessage = messageConfiguration.getBaiduMessage();
            jsonWriter.name("BaiduMessage");
            MessageJsonMarshaller.getInstance().marshall(baiduMessage, jsonWriter);
        }
        if (messageConfiguration.getDefaultMessage() != null) {
            Message defaultMessage = messageConfiguration.getDefaultMessage();
            jsonWriter.name("DefaultMessage");
            MessageJsonMarshaller.getInstance().marshall(defaultMessage, jsonWriter);
        }
        if (messageConfiguration.getEmailMessage() != null) {
            CampaignEmailMessage emailMessage = messageConfiguration.getEmailMessage();
            jsonWriter.name("EmailMessage");
            CampaignEmailMessageJsonMarshaller.getInstance().marshall(emailMessage, jsonWriter);
        }
        if (messageConfiguration.getGCMMessage() != null) {
            Message gCMMessage = messageConfiguration.getGCMMessage();
            jsonWriter.name("GCMMessage");
            MessageJsonMarshaller.getInstance().marshall(gCMMessage, jsonWriter);
        }
        if (messageConfiguration.getSMSMessage() != null) {
            CampaignSmsMessage sMSMessage = messageConfiguration.getSMSMessage();
            jsonWriter.name("SMSMessage");
            CampaignSmsMessageJsonMarshaller.getInstance().marshall(sMSMessage, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MessageConfigurationJsonMarshaller instance;

    public static MessageConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageConfigurationJsonMarshaller();
        return instance;
    }
}
