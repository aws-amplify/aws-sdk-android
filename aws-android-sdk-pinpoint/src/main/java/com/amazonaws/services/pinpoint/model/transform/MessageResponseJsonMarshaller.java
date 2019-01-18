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
 * JSON marshaller for POJO MessageResponse
 */
class MessageResponseJsonMarshaller {

    public void marshall(MessageResponse messageResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (messageResponse.getApplicationId() != null) {
            String applicationId = messageResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (messageResponse.getEndpointResult() != null) {
            java.util.Map<String, EndpointMessageResult> endpointResult = messageResponse
                    .getEndpointResult();
            jsonWriter.name("EndpointResult");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EndpointMessageResult> endpointResultEntry : endpointResult
                    .entrySet()) {
                EndpointMessageResult endpointResultValue = endpointResultEntry.getValue();
                if (endpointResultValue != null) {
                    jsonWriter.name(endpointResultEntry.getKey());
                    EndpointMessageResultJsonMarshaller.getInstance().marshall(endpointResultValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (messageResponse.getRequestId() != null) {
            String requestId = messageResponse.getRequestId();
            jsonWriter.name("RequestId");
            jsonWriter.value(requestId);
        }
        if (messageResponse.getResult() != null) {
            java.util.Map<String, MessageResult> result = messageResponse.getResult();
            jsonWriter.name("Result");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MessageResult> resultEntry : result.entrySet()) {
                MessageResult resultValue = resultEntry.getValue();
                if (resultValue != null) {
                    jsonWriter.name(resultEntry.getKey());
                    MessageResultJsonMarshaller.getInstance().marshall(resultValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static MessageResponseJsonMarshaller instance;

    public static MessageResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageResponseJsonMarshaller();
        return instance;
    }
}
