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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SchemaAttributeType
 */
class SchemaAttributeTypeJsonMarshaller {

    public void marshall(SchemaAttributeType schemaAttributeType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (schemaAttributeType.getName() != null) {
            String name = schemaAttributeType.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (schemaAttributeType.getAttributeDataType() != null) {
            String attributeDataType = schemaAttributeType.getAttributeDataType();
            jsonWriter.name("AttributeDataType");
            jsonWriter.value(attributeDataType);
        }
        if (schemaAttributeType.getDeveloperOnlyAttribute() != null) {
            Boolean developerOnlyAttribute = schemaAttributeType.getDeveloperOnlyAttribute();
            jsonWriter.name("DeveloperOnlyAttribute");
            jsonWriter.value(developerOnlyAttribute);
        }
        if (schemaAttributeType.getMutable() != null) {
            Boolean mutable = schemaAttributeType.getMutable();
            jsonWriter.name("Mutable");
            jsonWriter.value(mutable);
        }
        if (schemaAttributeType.getRequired() != null) {
            Boolean required = schemaAttributeType.getRequired();
            jsonWriter.name("Required");
            jsonWriter.value(required);
        }
        if (schemaAttributeType.getNumberAttributeConstraints() != null) {
            NumberAttributeConstraintsType numberAttributeConstraints = schemaAttributeType
                    .getNumberAttributeConstraints();
            jsonWriter.name("NumberAttributeConstraints");
            NumberAttributeConstraintsTypeJsonMarshaller.getInstance().marshall(
                    numberAttributeConstraints, jsonWriter);
        }
        if (schemaAttributeType.getStringAttributeConstraints() != null) {
            StringAttributeConstraintsType stringAttributeConstraints = schemaAttributeType
                    .getStringAttributeConstraints();
            jsonWriter.name("StringAttributeConstraints");
            StringAttributeConstraintsTypeJsonMarshaller.getInstance().marshall(
                    stringAttributeConstraints, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SchemaAttributeTypeJsonMarshaller instance;

    public static SchemaAttributeTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SchemaAttributeTypeJsonMarshaller();
        return instance;
    }
}
