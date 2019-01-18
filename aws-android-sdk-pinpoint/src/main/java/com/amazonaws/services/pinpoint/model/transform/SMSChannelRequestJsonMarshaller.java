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
 * JSON marshaller for POJO SMSChannelRequest
 */
class SMSChannelRequestJsonMarshaller {

    public void marshall(SMSChannelRequest sMSChannelRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sMSChannelRequest.getEnabled() != null) {
            Boolean enabled = sMSChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (sMSChannelRequest.getSenderId() != null) {
            String senderId = sMSChannelRequest.getSenderId();
            jsonWriter.name("SenderId");
            jsonWriter.value(senderId);
        }
        if (sMSChannelRequest.getShortCode() != null) {
            String shortCode = sMSChannelRequest.getShortCode();
            jsonWriter.name("ShortCode");
            jsonWriter.value(shortCode);
        }
        jsonWriter.endObject();
    }

    private static SMSChannelRequestJsonMarshaller instance;

    public static SMSChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMSChannelRequestJsonMarshaller();
        return instance;
    }
}
