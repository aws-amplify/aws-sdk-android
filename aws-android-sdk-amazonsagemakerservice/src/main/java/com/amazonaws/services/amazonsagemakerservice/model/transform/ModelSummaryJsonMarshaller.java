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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelSummary
 */
class ModelSummaryJsonMarshaller {

    public void marshall(ModelSummary modelSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelSummary.getModelName() != null) {
            String modelName = modelSummary.getModelName();
            jsonWriter.name("ModelName");
            jsonWriter.value(modelName);
        }
        if (modelSummary.getModelArn() != null) {
            String modelArn = modelSummary.getModelArn();
            jsonWriter.name("ModelArn");
            jsonWriter.value(modelArn);
        }
        if (modelSummary.getCreationTime() != null) {
            java.util.Date creationTime = modelSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static ModelSummaryJsonMarshaller instance;

    public static ModelSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelSummaryJsonMarshaller();
        return instance;
    }
}
