/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FieldValueUnion
 */
class FieldValueUnionJsonMarshaller {

    public void marshall(FieldValueUnion fieldValueUnion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fieldValueUnion.getBooleanValue() != null) {
            Boolean booleanValue = fieldValueUnion.getBooleanValue();
            jsonWriter.name("BooleanValue");
            jsonWriter.value(booleanValue);
        }
        if (fieldValueUnion.getDoubleValue() != null) {
            Double doubleValue = fieldValueUnion.getDoubleValue();
            jsonWriter.name("DoubleValue");
            jsonWriter.value(doubleValue);
        }
        if (fieldValueUnion.getEmptyValue() != null) {
            EmptyFieldValue emptyValue = fieldValueUnion.getEmptyValue();
            jsonWriter.name("EmptyValue");
            EmptyFieldValueJsonMarshaller.getInstance().marshall(emptyValue, jsonWriter);
        }
        if (fieldValueUnion.getStringValue() != null) {
            String stringValue = fieldValueUnion.getStringValue();
            jsonWriter.name("StringValue");
            jsonWriter.value(stringValue);
        }
        jsonWriter.endObject();
    }

    private static FieldValueUnionJsonMarshaller instance;

    public static FieldValueUnionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FieldValueUnionJsonMarshaller();
        return instance;
    }
}
