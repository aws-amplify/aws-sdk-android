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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AssetPropertyVariant
 */
class AssetPropertyVariantJsonUnmarshaller implements
        Unmarshaller<AssetPropertyVariant, JsonUnmarshallerContext> {

    public AssetPropertyVariant unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssetPropertyVariant assetPropertyVariant = new AssetPropertyVariant();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("stringValue")) {
                assetPropertyVariant.setStringValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("integerValue")) {
                assetPropertyVariant.setIntegerValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("doubleValue")) {
                assetPropertyVariant.setDoubleValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("booleanValue")) {
                assetPropertyVariant.setBooleanValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return assetPropertyVariant;
    }

    private static AssetPropertyVariantJsonUnmarshaller instance;

    public static AssetPropertyVariantJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetPropertyVariantJsonUnmarshaller();
        return instance;
    }
}
