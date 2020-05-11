/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdditionalResultAttribute
 */
class AdditionalResultAttributeJsonMarshaller {

    public void marshall(AdditionalResultAttribute additionalResultAttribute,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (additionalResultAttribute.getKey() != null) {
            String key = additionalResultAttribute.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (additionalResultAttribute.getValueType() != null) {
            String valueType = additionalResultAttribute.getValueType();
            jsonWriter.name("ValueType");
            jsonWriter.value(valueType);
        }
        if (additionalResultAttribute.getValue() != null) {
            AdditionalResultAttributeValue value = additionalResultAttribute.getValue();
            jsonWriter.name("Value");
            AdditionalResultAttributeValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AdditionalResultAttributeJsonMarshaller instance;

    public static AdditionalResultAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdditionalResultAttributeJsonMarshaller();
        return instance;
    }
}
