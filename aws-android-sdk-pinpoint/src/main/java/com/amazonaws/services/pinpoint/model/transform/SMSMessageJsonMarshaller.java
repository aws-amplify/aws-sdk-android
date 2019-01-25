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
 * JSON marshaller for POJO SMSMessage
 */
class SMSMessageJsonMarshaller {

    public void marshall(SMSMessage sMSMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sMSMessage.getBody() != null) {
            String body = sMSMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (sMSMessage.getKeyword() != null) {
            String keyword = sMSMessage.getKeyword();
            jsonWriter.name("Keyword");
            jsonWriter.value(keyword);
        }
        if (sMSMessage.getMessageType() != null) {
            String messageType = sMSMessage.getMessageType();
            jsonWriter.name("MessageType");
            jsonWriter.value(messageType);
        }
        if (sMSMessage.getOriginationNumber() != null) {
            String originationNumber = sMSMessage.getOriginationNumber();
            jsonWriter.name("OriginationNumber");
            jsonWriter.value(originationNumber);
        }
        if (sMSMessage.getSenderId() != null) {
            String senderId = sMSMessage.getSenderId();
            jsonWriter.name("SenderId");
            jsonWriter.value(senderId);
        }
        if (sMSMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = sMSMessage
                    .getSubstitutions();
            jsonWriter.name("Substitutions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> substitutionsEntry : substitutions
                    .entrySet()) {
                java.util.List<String> substitutionsValue = substitutionsEntry.getValue();
                if (substitutionsValue != null) {
                    jsonWriter.name(substitutionsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String substitutionsValueItem : substitutionsValue) {
                        if (substitutionsValueItem != null) {
                            jsonWriter.value(substitutionsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static SMSMessageJsonMarshaller instance;

    public static SMSMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMSMessageJsonMarshaller();
        return instance;
    }
}
