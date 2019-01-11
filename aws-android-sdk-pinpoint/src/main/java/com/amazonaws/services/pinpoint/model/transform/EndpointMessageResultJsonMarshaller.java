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
 * JSON marshaller for POJO EndpointMessageResult
 */
class EndpointMessageResultJsonMarshaller {

    public void marshall(EndpointMessageResult endpointMessageResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointMessageResult.getAddress() != null) {
            String address = endpointMessageResult.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (endpointMessageResult.getDeliveryStatus() != null) {
            String deliveryStatus = endpointMessageResult.getDeliveryStatus();
            jsonWriter.name("DeliveryStatus");
            jsonWriter.value(deliveryStatus);
        }
        if (endpointMessageResult.getMessageId() != null) {
            String messageId = endpointMessageResult.getMessageId();
            jsonWriter.name("MessageId");
            jsonWriter.value(messageId);
        }
        if (endpointMessageResult.getStatusCode() != null) {
            Integer statusCode = endpointMessageResult.getStatusCode();
            jsonWriter.name("StatusCode");
            jsonWriter.value(statusCode);
        }
        if (endpointMessageResult.getStatusMessage() != null) {
            String statusMessage = endpointMessageResult.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (endpointMessageResult.getUpdatedToken() != null) {
            String updatedToken = endpointMessageResult.getUpdatedToken();
            jsonWriter.name("UpdatedToken");
            jsonWriter.value(updatedToken);
        }
        jsonWriter.endObject();
    }

    private static EndpointMessageResultJsonMarshaller instance;

    public static EndpointMessageResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointMessageResultJsonMarshaller();
        return instance;
    }
}
