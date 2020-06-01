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
 * JSON marshaller for POJO HyperParameterTuningJobConfig
 */
class HyperParameterTuningJobConfigJsonMarshaller {

    public void marshall(HyperParameterTuningJobConfig hyperParameterTuningJobConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterTuningJobConfig.getStrategy() != null) {
            String strategy = hyperParameterTuningJobConfig.getStrategy();
            jsonWriter.name("Strategy");
            jsonWriter.value(strategy);
        }
        if (hyperParameterTuningJobConfig.getHyperParameterTuningJobObjective() != null) {
            HyperParameterTuningJobObjective hyperParameterTuningJobObjective = hyperParameterTuningJobConfig
                    .getHyperParameterTuningJobObjective();
            jsonWriter.name("HyperParameterTuningJobObjective");
            HyperParameterTuningJobObjectiveJsonMarshaller.getInstance().marshall(
                    hyperParameterTuningJobObjective, jsonWriter);
        }
        if (hyperParameterTuningJobConfig.getResourceLimits() != null) {
            ResourceLimits resourceLimits = hyperParameterTuningJobConfig.getResourceLimits();
            jsonWriter.name("ResourceLimits");
            ResourceLimitsJsonMarshaller.getInstance().marshall(resourceLimits, jsonWriter);
        }
        if (hyperParameterTuningJobConfig.getParameterRanges() != null) {
            ParameterRanges parameterRanges = hyperParameterTuningJobConfig.getParameterRanges();
            jsonWriter.name("ParameterRanges");
            ParameterRangesJsonMarshaller.getInstance().marshall(parameterRanges, jsonWriter);
        }
        if (hyperParameterTuningJobConfig.getTrainingJobEarlyStoppingType() != null) {
            String trainingJobEarlyStoppingType = hyperParameterTuningJobConfig
                    .getTrainingJobEarlyStoppingType();
            jsonWriter.name("TrainingJobEarlyStoppingType");
            jsonWriter.value(trainingJobEarlyStoppingType);
        }
        if (hyperParameterTuningJobConfig.getTuningJobCompletionCriteria() != null) {
            TuningJobCompletionCriteria tuningJobCompletionCriteria = hyperParameterTuningJobConfig
                    .getTuningJobCompletionCriteria();
            jsonWriter.name("TuningJobCompletionCriteria");
            TuningJobCompletionCriteriaJsonMarshaller.getInstance().marshall(
                    tuningJobCompletionCriteria, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HyperParameterTuningJobConfigJsonMarshaller instance;

    public static HyperParameterTuningJobConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTuningJobConfigJsonMarshaller();
        return instance;
    }
}
