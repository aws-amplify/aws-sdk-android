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
 * JSON marshaller for POJO DocumentAttributeValue
 */
class DocumentAttributeValueJsonMarshaller {

    public void marshall(DocumentAttributeValue documentAttributeValue, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentAttributeValue.getStringValue() != null) {
            String stringValue = documentAttributeValue.getStringValue();
            jsonWriter.name("StringValue");
            jsonWriter.value(stringValue);
        }
        if (documentAttributeValue.getStringListValue() != null) {
            java.util.List<String> stringListValue = documentAttributeValue.getStringListValue();
            jsonWriter.name("StringListValue");
            jsonWriter.beginArray();
            for (String stringListValueItem : stringListValue) {
                if (stringListValueItem != null) {
                    jsonWriter.value(stringListValueItem);
                }
            }
            jsonWriter.endArray();
        }
        if (documentAttributeValue.getLongValue() != null) {
            Long longValue = documentAttributeValue.getLongValue();
            jsonWriter.name("LongValue");
            jsonWriter.value(longValue);
        }
        if (documentAttributeValue.getDateValue() != null) {
            java.util.Date dateValue = documentAttributeValue.getDateValue();
            jsonWriter.name("DateValue");
            jsonWriter.value(dateValue);
        }
        jsonWriter.endObject();
    }

    private static DocumentAttributeValueJsonMarshaller instance;

    public static DocumentAttributeValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentAttributeValueJsonMarshaller();
        return instance;
    }
}
