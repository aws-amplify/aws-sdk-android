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
 * JSON marshaller for POJO ModelVersion
 */
class ModelVersionJsonMarshaller {

    public void marshall(ModelVersion modelVersion, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelVersion.getModelId() != null) {
            String modelId = modelVersion.getModelId();
            jsonWriter.name("modelId");
            jsonWriter.value(modelId);
        }
        if (modelVersion.getModelType() != null) {
            String modelType = modelVersion.getModelType();
            jsonWriter.name("modelType");
            jsonWriter.value(modelType);
        }
        if (modelVersion.getModelVersionNumber() != null) {
            String modelVersionNumber = modelVersion.getModelVersionNumber();
            jsonWriter.name("modelVersionNumber");
            jsonWriter.value(modelVersionNumber);
        }
        jsonWriter.endObject();
    }

    private static ModelVersionJsonMarshaller instance;

    public static ModelVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelVersionJsonMarshaller();
        return instance;
    }
}
