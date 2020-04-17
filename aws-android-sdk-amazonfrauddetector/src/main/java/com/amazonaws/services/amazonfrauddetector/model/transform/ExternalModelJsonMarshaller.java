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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExternalModel
 */
class ExternalModelJsonMarshaller {

    public void marshall(ExternalModel externalModel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (externalModel.getModelEndpoint() != null) {
            String modelEndpoint = externalModel.getModelEndpoint();
            jsonWriter.name("modelEndpoint");
            jsonWriter.value(modelEndpoint);
        }
        if (externalModel.getModelSource() != null) {
            String modelSource = externalModel.getModelSource();
            jsonWriter.name("modelSource");
            jsonWriter.value(modelSource);
        }
        if (externalModel.getRole() != null) {
            Role role = externalModel.getRole();
            jsonWriter.name("role");
            RoleJsonMarshaller.getInstance().marshall(role, jsonWriter);
        }
        if (externalModel.getInputConfiguration() != null) {
            ModelInputConfiguration inputConfiguration = externalModel.getInputConfiguration();
            jsonWriter.name("inputConfiguration");
            ModelInputConfigurationJsonMarshaller.getInstance().marshall(inputConfiguration,
                    jsonWriter);
        }
        if (externalModel.getOutputConfiguration() != null) {
            ModelOutputConfiguration outputConfiguration = externalModel.getOutputConfiguration();
            jsonWriter.name("outputConfiguration");
            ModelOutputConfigurationJsonMarshaller.getInstance().marshall(outputConfiguration,
                    jsonWriter);
        }
        if (externalModel.getModelEndpointStatus() != null) {
            String modelEndpointStatus = externalModel.getModelEndpointStatus();
            jsonWriter.name("modelEndpointStatus");
            jsonWriter.value(modelEndpointStatus);
        }
        if (externalModel.getLastUpdatedTime() != null) {
            String lastUpdatedTime = externalModel.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (externalModel.getCreatedTime() != null) {
            String createdTime = externalModel.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static ExternalModelJsonMarshaller instance;

    public static ExternalModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExternalModelJsonMarshaller();
        return instance;
    }
}
