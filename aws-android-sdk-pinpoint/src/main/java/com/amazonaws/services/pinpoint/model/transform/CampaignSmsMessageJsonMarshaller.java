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
 * JSON marshaller for POJO CampaignSmsMessage
 */
class CampaignSmsMessageJsonMarshaller {

    public void marshall(CampaignSmsMessage campaignSmsMessage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (campaignSmsMessage.getBody() != null) {
            String body = campaignSmsMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (campaignSmsMessage.getMessageType() != null) {
            String messageType = campaignSmsMessage.getMessageType();
            jsonWriter.name("MessageType");
            jsonWriter.value(messageType);
        }
        if (campaignSmsMessage.getSenderId() != null) {
            String senderId = campaignSmsMessage.getSenderId();
            jsonWriter.name("SenderId");
            jsonWriter.value(senderId);
        }
        jsonWriter.endObject();
    }

    private static CampaignSmsMessageJsonMarshaller instance;

    public static CampaignSmsMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignSmsMessageJsonMarshaller();
        return instance;
    }
}
