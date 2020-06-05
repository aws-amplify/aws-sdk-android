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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceTargetDefinition
 */
class ResourceTargetDefinitionJsonMarshaller {

    public void marshall(ResourceTargetDefinition resourceTargetDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceTargetDefinition.getAttribute() != null) {
            String attribute = resourceTargetDefinition.getAttribute();
            jsonWriter.name("Attribute");
            jsonWriter.value(attribute);
        }
        if (resourceTargetDefinition.getName() != null) {
            String name = resourceTargetDefinition.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (resourceTargetDefinition.getRequiresRecreation() != null) {
            String requiresRecreation = resourceTargetDefinition.getRequiresRecreation();
            jsonWriter.name("RequiresRecreation");
            jsonWriter.value(requiresRecreation);
        }
        jsonWriter.endObject();
    }

    private static ResourceTargetDefinitionJsonMarshaller instance;

    public static ResourceTargetDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTargetDefinitionJsonMarshaller();
        return instance;
    }
}
