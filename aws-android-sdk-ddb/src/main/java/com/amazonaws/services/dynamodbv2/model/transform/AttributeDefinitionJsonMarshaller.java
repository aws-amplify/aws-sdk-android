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
 * JSON marshaller for POJO AttributeDefinition
 */
class AttributeDefinitionJsonMarshaller {

    public void marshall(AttributeDefinition attributeDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attributeDefinition.getAttributeName() != null) {
            String attributeName = attributeDefinition.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        if (attributeDefinition.getAttributeType() != null) {
            String attributeType = attributeDefinition.getAttributeType();
            jsonWriter.name("AttributeType");
            jsonWriter.value(attributeType);
        }
        jsonWriter.endObject();
    }

    private static AttributeDefinitionJsonMarshaller instance;

    public static AttributeDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeDefinitionJsonMarshaller();
        return instance;
    }
}
