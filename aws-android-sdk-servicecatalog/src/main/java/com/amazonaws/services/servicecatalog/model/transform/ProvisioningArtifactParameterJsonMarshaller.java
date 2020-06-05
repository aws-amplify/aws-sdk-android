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
 * JSON marshaller for POJO ProvisioningArtifactParameter
 */
class ProvisioningArtifactParameterJsonMarshaller {

    public void marshall(ProvisioningArtifactParameter provisioningArtifactParameter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisioningArtifactParameter.getParameterKey() != null) {
            String parameterKey = provisioningArtifactParameter.getParameterKey();
            jsonWriter.name("ParameterKey");
            jsonWriter.value(parameterKey);
        }
        if (provisioningArtifactParameter.getDefaultValue() != null) {
            String defaultValue = provisioningArtifactParameter.getDefaultValue();
            jsonWriter.name("DefaultValue");
            jsonWriter.value(defaultValue);
        }
        if (provisioningArtifactParameter.getParameterType() != null) {
            String parameterType = provisioningArtifactParameter.getParameterType();
            jsonWriter.name("ParameterType");
            jsonWriter.value(parameterType);
        }
        if (provisioningArtifactParameter.getIsNoEcho() != null) {
            Boolean isNoEcho = provisioningArtifactParameter.getIsNoEcho();
            jsonWriter.name("IsNoEcho");
            jsonWriter.value(isNoEcho);
        }
        if (provisioningArtifactParameter.getDescription() != null) {
            String description = provisioningArtifactParameter.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (provisioningArtifactParameter.getParameterConstraints() != null) {
            ParameterConstraints parameterConstraints = provisioningArtifactParameter
                    .getParameterConstraints();
            jsonWriter.name("ParameterConstraints");
            ParameterConstraintsJsonMarshaller.getInstance().marshall(parameterConstraints,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningArtifactParameterJsonMarshaller instance;

    public static ProvisioningArtifactParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningArtifactParameterJsonMarshaller();
        return instance;
    }
}
