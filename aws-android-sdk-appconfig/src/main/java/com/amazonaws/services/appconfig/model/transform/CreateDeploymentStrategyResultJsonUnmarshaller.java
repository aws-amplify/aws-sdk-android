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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateDeploymentStrategyResult
 */
public class CreateDeploymentStrategyResultJsonUnmarshaller implements
        Unmarshaller<CreateDeploymentStrategyResult, JsonUnmarshallerContext> {

    public CreateDeploymentStrategyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateDeploymentStrategyResult createDeploymentStrategyResult = new CreateDeploymentStrategyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                createDeploymentStrategyResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                createDeploymentStrategyResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                createDeploymentStrategyResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentDurationInMinutes")) {
                createDeploymentStrategyResult
                        .setDeploymentDurationInMinutes(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("GrowthType")) {
                createDeploymentStrategyResult.setGrowthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthFactor")) {
                createDeploymentStrategyResult.setGrowthFactor(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalBakeTimeInMinutes")) {
                createDeploymentStrategyResult.setFinalBakeTimeInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicateTo")) {
                createDeploymentStrategyResult.setReplicateTo(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDeploymentStrategyResult;
    }

    private static CreateDeploymentStrategyResultJsonUnmarshaller instance;

    public static CreateDeploymentStrategyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDeploymentStrategyResultJsonUnmarshaller();
        return instance;
    }
}
