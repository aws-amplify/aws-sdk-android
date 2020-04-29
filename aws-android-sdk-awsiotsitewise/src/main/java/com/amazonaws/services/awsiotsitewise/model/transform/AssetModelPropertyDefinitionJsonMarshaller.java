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
 * JSON marshaller for POJO AssetModelPropertyDefinition
 */
class AssetModelPropertyDefinitionJsonMarshaller {

    public void marshall(AssetModelPropertyDefinition assetModelPropertyDefinition,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetModelPropertyDefinition.getName() != null) {
            String name = assetModelPropertyDefinition.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (assetModelPropertyDefinition.getDataType() != null) {
            String dataType = assetModelPropertyDefinition.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (assetModelPropertyDefinition.getUnit() != null) {
            String unit = assetModelPropertyDefinition.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        if (assetModelPropertyDefinition.getType() != null) {
            PropertyType type = assetModelPropertyDefinition.getType();
            jsonWriter.name("type");
            PropertyTypeJsonMarshaller.getInstance().marshall(type, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AssetModelPropertyDefinitionJsonMarshaller instance;

    public static AssetModelPropertyDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetModelPropertyDefinitionJsonMarshaller();
        return instance;
    }
}
