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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DimensionValuesWithAttributes
 */
class DimensionValuesWithAttributesJsonMarshaller {

    public void marshall(DimensionValuesWithAttributes dimensionValuesWithAttributes,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dimensionValuesWithAttributes.getValue() != null) {
            String value = dimensionValuesWithAttributes.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (dimensionValuesWithAttributes.getAttributes() != null) {
            java.util.Map<String, String> attributes = dimensionValuesWithAttributes
                    .getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DimensionValuesWithAttributesJsonMarshaller instance;

    public static DimensionValuesWithAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DimensionValuesWithAttributesJsonMarshaller();
        return instance;
    }
}
