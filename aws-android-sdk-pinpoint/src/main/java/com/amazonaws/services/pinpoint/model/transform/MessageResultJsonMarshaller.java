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
 * JSON marshaller for POJO MessageResult
 */
class MessageResultJsonMarshaller {

    public void marshall(MessageResult messageResult, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (messageResult.getDeliveryStatus() != null) {
            String deliveryStatus = messageResult.getDeliveryStatus();
            jsonWriter.name("DeliveryStatus");
            jsonWriter.value(deliveryStatus);
        }
        if (messageResult.getMessageId() != null) {
            String messageId = messageResult.getMessageId();
            jsonWriter.name("MessageId");
            jsonWriter.value(messageId);
        }
        if (messageResult.getStatusCode() != null) {
            Integer statusCode = messageResult.getStatusCode();
            jsonWriter.name("StatusCode");
            jsonWriter.value(statusCode);
        }
        if (messageResult.getStatusMessage() != null) {
            String statusMessage = messageResult.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (messageResult.getUpdatedToken() != null) {
            String updatedToken = messageResult.getUpdatedToken();
            jsonWriter.name("UpdatedToken");
            jsonWriter.value(updatedToken);
        }
        jsonWriter.endObject();
    }

    private static MessageResultJsonMarshaller instance;

    public static MessageResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageResultJsonMarshaller();
        return instance;
    }
}
