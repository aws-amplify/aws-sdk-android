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
 * JSON marshaller for POJO Property
 */
class PropertyJsonMarshaller {

    public void marshall(Property property, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (property.getId() != null) {
            String id = property.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (property.getName() != null) {
            String name = property.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (property.getAlias() != null) {
            String alias = property.getAlias();
            jsonWriter.name("alias");
            jsonWriter.value(alias);
        }
        if (property.getNotification() != null) {
            PropertyNotification notification = property.getNotification();
            jsonWriter.name("notification");
            PropertyNotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
        }
        if (property.getDataType() != null) {
            String dataType = property.getDataType();
            jsonWriter.name("dataType");
            jsonWriter.value(dataType);
        }
        if (property.getUnit() != null) {
            String unit = property.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        if (property.getType() != null) {
            PropertyType type = property.getType();
            jsonWriter.name("type");
            PropertyTypeJsonMarshaller.getInstance().marshall(type, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PropertyJsonMarshaller instance;

    public static PropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PropertyJsonMarshaller();
        return instance;
    }
}
