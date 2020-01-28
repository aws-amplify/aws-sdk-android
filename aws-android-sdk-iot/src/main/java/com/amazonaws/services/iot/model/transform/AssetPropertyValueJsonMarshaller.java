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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetPropertyValue
 */
class AssetPropertyValueJsonMarshaller {

    public void marshall(AssetPropertyValue assetPropertyValue, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetPropertyValue.getValue() != null) {
            AssetPropertyVariant value = assetPropertyValue.getValue();
            jsonWriter.name("value");
            AssetPropertyVariantJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        if (assetPropertyValue.getTimestamp() != null) {
            AssetPropertyTimestamp timestamp = assetPropertyValue.getTimestamp();
            jsonWriter.name("timestamp");
            AssetPropertyTimestampJsonMarshaller.getInstance().marshall(timestamp, jsonWriter);
        }
        if (assetPropertyValue.getQuality() != null) {
            String quality = assetPropertyValue.getQuality();
            jsonWriter.name("quality");
            jsonWriter.value(quality);
        }
        jsonWriter.endObject();
    }

    private static AssetPropertyValueJsonMarshaller instance;

    public static AssetPropertyValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetPropertyValueJsonMarshaller();
        return instance;
    }
}
