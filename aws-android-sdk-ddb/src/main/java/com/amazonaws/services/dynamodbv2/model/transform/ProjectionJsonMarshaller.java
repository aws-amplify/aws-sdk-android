/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Projection
 */
class ProjectionJsonMarshaller {

    public void marshall(Projection projection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projection.getProjectionType() != null) {
            String projectionType = projection.getProjectionType();
            jsonWriter.name("ProjectionType");
            jsonWriter.value(projectionType);
        }
        if (projection.getNonKeyAttributes() != null) {
            java.util.List<String> nonKeyAttributes = projection.getNonKeyAttributes();
            jsonWriter.name("NonKeyAttributes");
            jsonWriter.beginArray();
            for (String nonKeyAttributesItem : nonKeyAttributes) {
                if (nonKeyAttributesItem != null) {
                    jsonWriter.value(nonKeyAttributesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProjectionJsonMarshaller instance;

    public static ProjectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectionJsonMarshaller();
        return instance;
    }
}
