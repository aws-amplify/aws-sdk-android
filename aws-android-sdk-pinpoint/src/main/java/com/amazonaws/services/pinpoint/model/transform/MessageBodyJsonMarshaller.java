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
 * JSON marshaller for POJO MessageBody
 */
class MessageBodyJsonMarshaller {

    public void marshall(MessageBody messageBody, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (messageBody.getMessage() != null) {
            String message = messageBody.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (messageBody.getRequestID() != null) {
            String requestID = messageBody.getRequestID();
            jsonWriter.name("RequestID");
            jsonWriter.value(requestID);
        }
        jsonWriter.endObject();
    }

    private static MessageBodyJsonMarshaller instance;

    public static MessageBodyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageBodyJsonMarshaller();
        return instance;
    }
}
