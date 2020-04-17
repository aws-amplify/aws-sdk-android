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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ModelVersionDetail
 */
class ModelVersionDetailJsonUnmarshaller implements
        Unmarshaller<ModelVersionDetail, JsonUnmarshallerContext> {

    public ModelVersionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ModelVersionDetail modelVersionDetail = new ModelVersionDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("modelId")) {
                modelVersionDetail.setModelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelType")) {
                modelVersionDetail.setModelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelVersionNumber")) {
                modelVersionDetail.setModelVersionNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                modelVersionDetail.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                modelVersionDetail.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("trainingDataSource")) {
                modelVersionDetail.setTrainingDataSource(TrainingDataSourceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelVariables")) {
                modelVersionDetail.setModelVariables(new ListUnmarshaller<ModelVariable>(
                        ModelVariableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("labelSchema")) {
                modelVersionDetail.setLabelSchema(LabelSchemaJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("validationMetrics")) {
                modelVersionDetail.setValidationMetrics(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("trainingMetrics")) {
                modelVersionDetail.setTrainingMetrics(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                modelVersionDetail.setLastUpdatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdTime")) {
                modelVersionDetail.setCreatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return modelVersionDetail;
    }

    private static ModelVersionDetailJsonUnmarshaller instance;

    public static ModelVersionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelVersionDetailJsonUnmarshaller();
        return instance;
    }
}
