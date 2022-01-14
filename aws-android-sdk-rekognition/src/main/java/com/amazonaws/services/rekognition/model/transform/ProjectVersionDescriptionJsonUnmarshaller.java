/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProjectVersionDescription
 */
class ProjectVersionDescriptionJsonUnmarshaller implements
        Unmarshaller<ProjectVersionDescription, JsonUnmarshallerContext> {

    public ProjectVersionDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectVersionDescription projectVersionDescription = new ProjectVersionDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProjectVersionArn")) {
                projectVersionDescription.setProjectVersionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTimestamp")) {
                projectVersionDescription.setCreationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinInferenceUnits")) {
                projectVersionDescription.setMinInferenceUnits(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                projectVersionDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                projectVersionDescription.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BillableTrainingTimeInSeconds")) {
                projectVersionDescription.setBillableTrainingTimeInSeconds(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingEndTimestamp")) {
                projectVersionDescription.setTrainingEndTimestamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                projectVersionDescription.setOutputConfig(OutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingDataResult")) {
                projectVersionDescription.setTrainingDataResult(TrainingDataResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TestingDataResult")) {
                projectVersionDescription.setTestingDataResult(TestingDataResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationResult")) {
                projectVersionDescription.setEvaluationResult(EvaluationResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestSummary")) {
                projectVersionDescription.setManifestSummary(GroundTruthManifestJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                projectVersionDescription.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectVersionDescription;
    }

    private static ProjectVersionDescriptionJsonUnmarshaller instance;

    public static ProjectVersionDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectVersionDescriptionJsonUnmarshaller();
        return instance;
    }
}
