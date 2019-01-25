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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttributesResource
 */
class AttributesResourceJsonMarshaller {

    public void marshall(AttributesResource attributesResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attributesResource.getApplicationId() != null) {
            String applicationId = attributesResource.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (attributesResource.getAttributeType() != null) {
            String attributeType = attributesResource.getAttributeType();
            jsonWriter.name("AttributeType");
            jsonWriter.value(attributeType);
        }
        if (attributesResource.getAttributes() != null) {
            java.util.List<String> attributes = attributesResource.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (String attributesItem : attributes) {
                if (attributesItem != null) {
                    jsonWriter.value(attributesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AttributesResourceJsonMarshaller instance;

    public static AttributesResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributesResourceJsonMarshaller();
        return instance;
    }
}
