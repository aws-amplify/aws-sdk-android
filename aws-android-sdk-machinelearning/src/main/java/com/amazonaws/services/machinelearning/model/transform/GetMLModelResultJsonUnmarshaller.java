/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model.transform;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetMLModelResult
 */
public class GetMLModelResultJsonUnmarshaller implements
        Unmarshaller<GetMLModelResult, JsonUnmarshallerContext> {

    public GetMLModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMLModelResult getMLModelResult = new GetMLModelResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MLModelId")) {
                getMLModelResult.setMLModelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingDataSourceId")) {
                getMLModelResult.setTrainingDataSourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedByIamUser")) {
                getMLModelResult.setCreatedByIamUser(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                getMLModelResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedAt")) {
                getMLModelResult.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getMLModelResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getMLModelResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeInBytes")) {
                getMLModelResult.setSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointInfo")) {
                getMLModelResult.setEndpointInfo(RealtimeEndpointInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingParameters")) {
                getMLModelResult.setTrainingParameters(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputDataLocationS3")) {
                getMLModelResult.setInputDataLocationS3(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MLModelType")) {
                getMLModelResult.setMLModelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScoreThreshold")) {
                getMLModelResult.setScoreThreshold(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScoreThresholdLastUpdatedAt")) {
                getMLModelResult.setScoreThresholdLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogUri")) {
                getMLModelResult.setLogUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                getMLModelResult.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ComputeTime")) {
                getMLModelResult.setComputeTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinishedAt")) {
                getMLModelResult.setFinishedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedAt")) {
                getMLModelResult.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Recipe")) {
                getMLModelResult.setRecipe(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schema")) {
                getMLModelResult.setSchema(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMLModelResult;
    }

    private static GetMLModelResultJsonUnmarshaller instance;

    public static GetMLModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMLModelResultJsonUnmarshaller();
        return instance;
    }
}
