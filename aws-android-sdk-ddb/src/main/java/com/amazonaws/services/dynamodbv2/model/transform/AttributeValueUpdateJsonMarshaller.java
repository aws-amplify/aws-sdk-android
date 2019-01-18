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
 * JSON marshaller for POJO AttributeValueUpdate
 */
class AttributeValueUpdateJsonMarshaller {

    public void marshall(AttributeValueUpdate attributeValueUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attributeValueUpdate.getValue() != null) {
            AttributeValue value = attributeValueUpdate.getValue();
            jsonWriter.name("Value");
            AttributeValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        if (attributeValueUpdate.getAction() != null) {
            String action = attributeValueUpdate.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        jsonWriter.endObject();
    }

    private static AttributeValueUpdateJsonMarshaller instance;

    public static AttributeValueUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeValueUpdateJsonMarshaller();
        return instance;
    }
}
