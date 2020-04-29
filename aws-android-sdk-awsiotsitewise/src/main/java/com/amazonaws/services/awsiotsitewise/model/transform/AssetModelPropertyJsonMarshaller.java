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
 * JSON marshaller for POJO AssetModelProperty
 */
class AssetModelPropertyJsonMarshaller {

    public void marshall(AssetModelProperty assetModelProperty, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetModelProperty.getId() != null) {
            String id = assetModelProperty.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (assetModelProperty.getName() != null) {
            String name = assetModelProperty.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (assetModelProperty.getDataType() != null) {
            String dataType = assetModelProperty.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (assetModelProperty.getUnit() != null) {
            String unit = assetModelProperty.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        if (assetModelProperty.getType() != null) {
            PropertyType type = assetModelProperty.getType();
            jsonWriter.name("type");
            PropertyTypeJsonMarshaller.getInstance().marshall(type, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AssetModelPropertyJsonMarshaller instance;

    public static AssetModelPropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetModelPropertyJsonMarshaller();
        return instance;
    }
}
