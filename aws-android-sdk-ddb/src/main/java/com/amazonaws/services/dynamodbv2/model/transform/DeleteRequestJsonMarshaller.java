/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeleteRequest
 */
class DeleteRequestJsonMarshaller {

    public void marshall(DeleteRequest deleteRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deleteRequest.getKey() != null) {
            java.util.Map<String, AttributeValue> key = deleteRequest.getKey();
            jsonWriter.name("Key");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> keyEntry : key.entrySet()) {
                AttributeValue keyValue = keyEntry.getValue();
                if (keyValue != null) {
                    jsonWriter.name(keyEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(keyValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DeleteRequestJsonMarshaller instance;

    public static DeleteRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteRequestJsonMarshaller();
        return instance;
    }
}
