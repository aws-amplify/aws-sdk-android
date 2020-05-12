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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetProperty
 */
class AssetPropertyJsonMarshaller {

    public void marshall(AssetProperty assetProperty, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetProperty.getId() != null) {
            String id = assetProperty.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (assetProperty.getName() != null) {
            String name = assetProperty.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (assetProperty.getAlias() != null) {
            String alias = assetProperty.getAlias();
            jsonWriter.name("alias");
            jsonWriter.value(alias);
        }
        if (assetProperty.getNotification() != null) {
            PropertyNotification notification = assetProperty.getNotification();
            jsonWriter.name("notification");
            PropertyNotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
        }
        if (assetProperty.getDataType() != null) {
            String dataType = assetProperty.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (assetProperty.getUnit() != null) {
            String unit = assetProperty.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        jsonWriter.endObject();
    }

    private static AssetPropertyJsonMarshaller instance;

    public static AssetPropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetPropertyJsonMarshaller();
        return instance;
    }
}
