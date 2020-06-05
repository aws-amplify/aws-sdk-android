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
 * JSON marshaller for POJO ProvisioningArtifactProperties
 */
class ProvisioningArtifactPropertiesJsonMarshaller {

    public void marshall(ProvisioningArtifactProperties provisioningArtifactProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisioningArtifactProperties.getName() != null) {
            String name = provisioningArtifactProperties.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (provisioningArtifactProperties.getDescription() != null) {
            String description = provisioningArtifactProperties.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (provisioningArtifactProperties.getInfo() != null) {
            java.util.Map<String, String> info = provisioningArtifactProperties.getInfo();
            jsonWriter.name("Info");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> infoEntry : info.entrySet()) {
                String infoValue = infoEntry.getValue();
                if (infoValue != null) {
                    jsonWriter.name(infoEntry.getKey());
                    jsonWriter.value(infoValue);
                }
            }
            jsonWriter.endObject();
        }
        if (provisioningArtifactProperties.getType() != null) {
            String type = provisioningArtifactProperties.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (provisioningArtifactProperties.getDisableTemplateValidation() != null) {
            Boolean disableTemplateValidation = provisioningArtifactProperties
                    .getDisableTemplateValidation();
            jsonWriter.name("DisableTemplateValidation");
            jsonWriter.value(disableTemplateValidation);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningArtifactPropertiesJsonMarshaller instance;

    public static ProvisioningArtifactPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningArtifactPropertiesJsonMarshaller();
        return instance;
    }
}
