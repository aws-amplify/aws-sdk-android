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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Variant
 */
class VariantJsonMarshaller {

    public void marshall(Variant variant, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (variant.getStringValue() != null) {
            String stringValue = variant.getStringValue();
            jsonWriter.name("stringValue");
            jsonWriter.value(stringValue);
        }
        if (variant.getIntegerValue() != null) {
            Integer integerValue = variant.getIntegerValue();
            jsonWriter.name("integerValue");
            jsonWriter.value(integerValue);
        }
        if (variant.getDoubleValue() != null) {
            Double doubleValue = variant.getDoubleValue();
            jsonWriter.name("doubleValue");
            jsonWriter.value(doubleValue);
        }
        if (variant.getBooleanValue() != null) {
            Boolean booleanValue = variant.getBooleanValue();
            jsonWriter.name("booleanValue");
            jsonWriter.value(booleanValue);
        }
        jsonWriter.endObject();
    }

    private static VariantJsonMarshaller instance;

    public static VariantJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VariantJsonMarshaller();
        return instance;
    }
}
