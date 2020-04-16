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
 * JSON unmarshaller for POJO HyperParameterTuningJobSummary
 */
class HyperParameterTuningJobSummaryJsonUnmarshaller implements
        Unmarshaller<HyperParameterTuningJobSummary, JsonUnmarshallerContext> {

    public HyperParameterTuningJobSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HyperParameterTuningJobSummary hyperParameterTuningJobSummary = new HyperParameterTuningJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HyperParameterTuningJobName")) {
                hyperParameterTuningJobSummary
                        .setHyperParameterTuningJobName(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HyperParameterTuningJobArn")) {
                hyperParameterTuningJobSummary.setHyperParameterTuningJobArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HyperParameterTuningJobStatus")) {
                hyperParameterTuningJobSummary
                        .setHyperParameterTuningJobStatus(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Strategy")) {
                hyperParameterTuningJobSummary.setStrategy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                hyperParameterTuningJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HyperParameterTuningEndTime")) {
                hyperParameterTuningJobSummary.setHyperParameterTuningEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                hyperParameterTuningJobSummary.setLastModifiedTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingJobStatusCounters")) {
                hyperParameterTuningJobSummary
                        .setTrainingJobStatusCounters(TrainingJobStatusCountersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ObjectiveStatusCounters")) {
                hyperParameterTuningJobSummary
                        .setObjectiveStatusCounters(ObjectiveStatusCountersJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ResourceLimits")) {
                hyperParameterTuningJobSummary.setResourceLimits(ResourceLimitsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hyperParameterTuningJobSummary;
    }

    private static HyperParameterTuningJobSummaryJsonUnmarshaller instance;

    public static HyperParameterTuningJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTuningJobSummaryJsonUnmarshaller();
        return instance;
    }
}
