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
 * JSON marshaller for POJO SendUsersMessageResponse
 */
class SendUsersMessageResponseJsonMarshaller {

    public void marshall(SendUsersMessageResponse sendUsersMessageResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sendUsersMessageResponse.getApplicationId() != null) {
            String applicationId = sendUsersMessageResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (sendUsersMessageResponse.getRequestId() != null) {
            String requestId = sendUsersMessageResponse.getRequestId();
            jsonWriter.name("RequestId");
            jsonWriter.value(requestId);
        }
        if (sendUsersMessageResponse.getResult() != null) {
            java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result = sendUsersMessageResponse
                    .getResult();
            jsonWriter.name("Result");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.Map<String, EndpointMessageResult>> resultEntry : result
                    .entrySet()) {
                java.util.Map<String, EndpointMessageResult> resultValue = resultEntry.getValue();
                if (resultValue != null) {
                    jsonWriter.name(resultEntry.getKey());
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<String, EndpointMessageResult> resultValueEntry : resultValue
                            .entrySet()) {
                        EndpointMessageResult resultValueValue = resultValueEntry.getValue();
                        if (resultValueValue != null) {
                            jsonWriter.name(resultValueEntry.getKey());
                            EndpointMessageResultJsonMarshaller.getInstance().marshall(
                                    resultValueValue, jsonWriter);
                        }
                    }
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static SendUsersMessageResponseJsonMarshaller instance;

    public static SendUsersMessageResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SendUsersMessageResponseJsonMarshaller();
        return instance;
    }
}
