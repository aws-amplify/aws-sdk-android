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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PutRequest
 */
class PutRequestJsonMarshaller {

    public void marshall(PutRequest putRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (putRequest.getItem() != null) {
            java.util.Map<String, AttributeValue> item = putRequest.getItem();
            jsonWriter.name("Item");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> itemEntry : item.entrySet()) {
                AttributeValue itemValue = itemEntry.getValue();
                if (itemValue != null) {
                    jsonWriter.name(itemEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(itemValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PutRequestJsonMarshaller instance;

    public static PutRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRequestJsonMarshaller();
        return instance;
    }
}
