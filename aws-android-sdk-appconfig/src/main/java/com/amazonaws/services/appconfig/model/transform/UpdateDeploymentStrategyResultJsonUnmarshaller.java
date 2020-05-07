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
 * JSON unmarshaller for response UpdateDeploymentStrategyResult
 */
public class UpdateDeploymentStrategyResultJsonUnmarshaller implements
        Unmarshaller<UpdateDeploymentStrategyResult, JsonUnmarshallerContext> {

    public UpdateDeploymentStrategyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateDeploymentStrategyResult updateDeploymentStrategyResult = new UpdateDeploymentStrategyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                updateDeploymentStrategyResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateDeploymentStrategyResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateDeploymentStrategyResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentDurationInMinutes")) {
                updateDeploymentStrategyResult
                        .setDeploymentDurationInMinutes(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("GrowthType")) {
                updateDeploymentStrategyResult.setGrowthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthFactor")) {
                updateDeploymentStrategyResult.setGrowthFactor(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalBakeTimeInMinutes")) {
                updateDeploymentStrategyResult.setFinalBakeTimeInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicateTo")) {
                updateDeploymentStrategyResult.setReplicateTo(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateDeploymentStrategyResult;
    }

    private static UpdateDeploymentStrategyResultJsonUnmarshaller instance;

    public static UpdateDeploymentStrategyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDeploymentStrategyResultJsonUnmarshaller();
        return instance;
    }
}
