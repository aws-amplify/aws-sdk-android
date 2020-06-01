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
 * JSON marshaller for POJO LabelingJobStoppingConditions
 */
class LabelingJobStoppingConditionsJsonMarshaller {

    public void marshall(LabelingJobStoppingConditions labelingJobStoppingConditions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelingJobStoppingConditions.getMaxHumanLabeledObjectCount() != null) {
            Integer maxHumanLabeledObjectCount = labelingJobStoppingConditions
                    .getMaxHumanLabeledObjectCount();
            jsonWriter.name("MaxHumanLabeledObjectCount");
            jsonWriter.value(maxHumanLabeledObjectCount);
        }
        if (labelingJobStoppingConditions.getMaxPercentageOfInputDatasetLabeled() != null) {
            Integer maxPercentageOfInputDatasetLabeled = labelingJobStoppingConditions
                    .getMaxPercentageOfInputDatasetLabeled();
            jsonWriter.name("MaxPercentageOfInputDatasetLabeled");
            jsonWriter.value(maxPercentageOfInputDatasetLabeled);
        }
        jsonWriter.endObject();
    }

    private static LabelingJobStoppingConditionsJsonMarshaller instance;

    public static LabelingJobStoppingConditionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobStoppingConditionsJsonMarshaller();
        return instance;
    }
}
