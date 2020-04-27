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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HyperParameterTrainingJobSummary
 */
class HyperParameterTrainingJobSummaryJsonUnmarshaller implements
        Unmarshaller<HyperParameterTrainingJobSummary, JsonUnmarshallerContext> {

    public HyperParameterTrainingJobSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HyperParameterTrainingJobSummary hyperParameterTrainingJobSummary = new HyperParameterTrainingJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrainingJobDefinitionName")) {
                hyperParameterTrainingJobSummary
                        .setTrainingJobDefinitionName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TrainingJobName")) {
                hyperParameterTrainingJobSummary.setTrainingJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobArn")) {
                hyperParameterTrainingJobSummary.setTrainingJobArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TuningJobName")) {
                hyperParameterTrainingJobSummary.setTuningJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                hyperParameterTrainingJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingStartTime")) {
                hyperParameterTrainingJobSummary.setTrainingStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingEndTime")) {
                hyperParameterTrainingJobSummary.setTrainingEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobStatus")) {
                hyperParameterTrainingJobSummary.setTrainingJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TunedHyperParameters")) {
                hyperParameterTrainingJobSummary
                        .setTunedHyperParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                                .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                hyperParameterTrainingJobSummary.setFailureReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalHyperParameterTuningJobObjectiveMetric")) {
                hyperParameterTrainingJobSummary
                        .setFinalHyperParameterTuningJobObjectiveMetric(FinalHyperParameterTuningJobObjectiveMetricJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ObjectiveStatus")) {
                hyperParameterTrainingJobSummary.setObjectiveStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hyperParameterTrainingJobSummary;
    }

    private static HyperParameterTrainingJobSummaryJsonUnmarshaller instance;

    public static HyperParameterTrainingJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTrainingJobSummaryJsonUnmarshaller();
        return instance;
    }
}
