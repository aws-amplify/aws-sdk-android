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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AutoMLCandidate
 */
class AutoMLCandidateJsonUnmarshaller implements
        Unmarshaller<AutoMLCandidate, JsonUnmarshallerContext> {

    public AutoMLCandidate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutoMLCandidate autoMLCandidate = new AutoMLCandidate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CandidateName")) {
                autoMLCandidate.setCandidateName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalAutoMLJobObjectiveMetric")) {
                autoMLCandidate
                        .setFinalAutoMLJobObjectiveMetric(FinalAutoMLJobObjectiveMetricJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ObjectiveStatus")) {
                autoMLCandidate.setObjectiveStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CandidateSteps")) {
                autoMLCandidate.setCandidateSteps(new ListUnmarshaller<AutoMLCandidateStep>(
                        AutoMLCandidateStepJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CandidateStatus")) {
                autoMLCandidate.setCandidateStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InferenceContainers")) {
                autoMLCandidate
                        .setInferenceContainers(new ListUnmarshaller<AutoMLContainerDefinition>(
                                AutoMLContainerDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                autoMLCandidate.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                autoMLCandidate.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                autoMLCandidate.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                autoMLCandidate.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return autoMLCandidate;
    }

    private static AutoMLCandidateJsonUnmarshaller instance;

    public static AutoMLCandidateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLCandidateJsonUnmarshaller();
        return instance;
    }
}
