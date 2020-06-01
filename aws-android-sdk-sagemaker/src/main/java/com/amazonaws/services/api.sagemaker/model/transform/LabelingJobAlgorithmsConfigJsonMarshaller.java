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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelingJobAlgorithmsConfig
 */
class LabelingJobAlgorithmsConfigJsonMarshaller {

    public void marshall(LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelingJobAlgorithmsConfig.getLabelingJobAlgorithmSpecificationArn() != null) {
            String labelingJobAlgorithmSpecificationArn = labelingJobAlgorithmsConfig
                    .getLabelingJobAlgorithmSpecificationArn();
            jsonWriter.name("LabelingJobAlgorithmSpecificationArn");
            jsonWriter.value(labelingJobAlgorithmSpecificationArn);
        }
        if (labelingJobAlgorithmsConfig.getInitialActiveLearningModelArn() != null) {
            String initialActiveLearningModelArn = labelingJobAlgorithmsConfig
                    .getInitialActiveLearningModelArn();
            jsonWriter.name("InitialActiveLearningModelArn");
            jsonWriter.value(initialActiveLearningModelArn);
        }
        if (labelingJobAlgorithmsConfig.getLabelingJobResourceConfig() != null) {
            LabelingJobResourceConfig labelingJobResourceConfig = labelingJobAlgorithmsConfig
                    .getLabelingJobResourceConfig();
            jsonWriter.name("LabelingJobResourceConfig");
            LabelingJobResourceConfigJsonMarshaller.getInstance().marshall(
                    labelingJobResourceConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LabelingJobAlgorithmsConfigJsonMarshaller instance;

    public static LabelingJobAlgorithmsConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobAlgorithmsConfigJsonMarshaller();
        return instance;
    }
}
