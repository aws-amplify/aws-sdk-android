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
 * JSON unmarshaller for response DescribeHyperParameterTuningJobResult
 */
public class DescribeHyperParameterTuningJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeHyperParameterTuningJobResult, JsonUnmarshallerContext> {

    public DescribeHyperParameterTuningJobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeHyperParameterTuningJobResult describeHyperParameterTuningJobResult = new DescribeHyperParameterTuningJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HyperParameterTuningJobName")) {
                describeHyperParameterTuningJobResult
                        .setHyperParameterTuningJobName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HyperParameterTuningJobArn")) {
                describeHyperParameterTuningJobResult
                        .setHyperParameterTuningJobArn(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HyperParameterTuningJobConfig")) {
                describeHyperParameterTuningJobResult
                        .setHyperParameterTuningJobConfig(HyperParameterTuningJobConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TrainingJobDefinition")) {
                describeHyperParameterTuningJobResult
                        .setTrainingJobDefinition(HyperParameterTrainingJobDefinitionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TrainingJobDefinitions")) {
                describeHyperParameterTuningJobResult
                        .setTrainingJobDefinitions(new ListUnmarshaller<HyperParameterTrainingJobDefinition>(
                                HyperParameterTrainingJobDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HyperParameterTuningJobStatus")) {
                describeHyperParameterTuningJobResult
                        .setHyperParameterTuningJobStatus(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeHyperParameterTuningJobResult.setCreationTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HyperParameterTuningEndTime")) {
                describeHyperParameterTuningJobResult
                        .setHyperParameterTuningEndTime(DateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeHyperParameterTuningJobResult.setLastModifiedTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobStatusCounters")) {
                describeHyperParameterTuningJobResult
                        .setTrainingJobStatusCounters(TrainingJobStatusCountersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ObjectiveStatusCounters")) {
                describeHyperParameterTuningJobResult
                        .setObjectiveStatusCounters(ObjectiveStatusCountersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("BestTrainingJob")) {
                describeHyperParameterTuningJobResult
                        .setBestTrainingJob(HyperParameterTrainingJobSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("OverallBestTrainingJob")) {
                describeHyperParameterTuningJobResult
                        .setOverallBestTrainingJob(HyperParameterTrainingJobSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("WarmStartConfig")) {
                describeHyperParameterTuningJobResult
                        .setWarmStartConfig(HyperParameterTuningJobWarmStartConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeHyperParameterTuningJobResult.setFailureReason(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeHyperParameterTuningJobResult;
    }

    private static DescribeHyperParameterTuningJobResultJsonUnmarshaller instance;

    public static DescribeHyperParameterTuningJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHyperParameterTuningJobResultJsonUnmarshaller();
        return instance;
    }
}
