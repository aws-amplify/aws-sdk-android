/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetPropertyVariant
 */
class AssetPropertyVariantJsonMarshaller {

    public void marshall(AssetPropertyVariant assetPropertyVariant, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetPropertyVariant.getStringValue() != null) {
            String stringValue = assetPropertyVariant.getStringValue();
            jsonWriter.name("stringValue");
            jsonWriter.value(stringValue);
        }
        if (assetPropertyVariant.getIntegerValue() != null) {
            String integerValue = assetPropertyVariant.getIntegerValue();
            jsonWriter.name("integerValue");
            jsonWriter.value(integerValue);
        }
        if (assetPropertyVariant.getDoubleValue() != null) {
            String doubleValue = assetPropertyVariant.getDoubleValue();
            jsonWriter.name("doubleValue");
            jsonWriter.value(doubleValue);
        }
        if (assetPropertyVariant.getBooleanValue() != null) {
            String booleanValue = assetPropertyVariant.getBooleanValue();
            jsonWriter.name("booleanValue");
            jsonWriter.value(booleanValue);
        }
        jsonWriter.endObject();
    }

    private static AssetPropertyVariantJsonMarshaller instance;

    public static AssetPropertyVariantJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetPropertyVariantJsonMarshaller();
        return instance;
    }
}
