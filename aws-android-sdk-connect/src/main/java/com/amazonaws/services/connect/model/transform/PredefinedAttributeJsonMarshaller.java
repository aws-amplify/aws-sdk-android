/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PredefinedAttribute
 */
class PredefinedAttributeJsonMarshaller {

    public void marshall(PredefinedAttribute predefinedAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (predefinedAttribute.getName() != null) {
            String name = predefinedAttribute.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (predefinedAttribute.getValues() != null) {
            PredefinedAttributeValues values = predefinedAttribute.getValues();
            jsonWriter.name("Values");
            PredefinedAttributeValuesJsonMarshaller.getInstance().marshall(values, jsonWriter);
        }
        if (predefinedAttribute.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = predefinedAttribute.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (predefinedAttribute.getLastModifiedRegion() != null) {
            String lastModifiedRegion = predefinedAttribute.getLastModifiedRegion();
            jsonWriter.name("LastModifiedRegion");
            jsonWriter.value(lastModifiedRegion);
        }
        jsonWriter.endObject();
    }

    private static PredefinedAttributeJsonMarshaller instance;

    public static PredefinedAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredefinedAttributeJsonMarshaller();
        return instance;
    }
}
