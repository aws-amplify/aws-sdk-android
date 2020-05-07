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
 * JSON unmarshaller for response StopDeploymentResult
 */
public class StopDeploymentResultJsonUnmarshaller implements
        Unmarshaller<StopDeploymentResult, JsonUnmarshallerContext> {

    public StopDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopDeploymentResult stopDeploymentResult = new StopDeploymentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                stopDeploymentResult.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnvironmentId")) {
                stopDeploymentResult.setEnvironmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentStrategyId")) {
                stopDeploymentResult.setDeploymentStrategyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationProfileId")) {
                stopDeploymentResult.setConfigurationProfileId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentNumber")) {
                stopDeploymentResult.setDeploymentNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationName")) {
                stopDeploymentResult.setConfigurationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationLocationUri")) {
                stopDeploymentResult.setConfigurationLocationUri(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationVersion")) {
                stopDeploymentResult.setConfigurationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                stopDeploymentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentDurationInMinutes")) {
                stopDeploymentResult.setDeploymentDurationInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthType")) {
                stopDeploymentResult.setGrowthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthFactor")) {
                stopDeploymentResult.setGrowthFactor(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalBakeTimeInMinutes")) {
                stopDeploymentResult.setFinalBakeTimeInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                stopDeploymentResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventLog")) {
                stopDeploymentResult.setEventLog(new ListUnmarshaller<DeploymentEvent>(
                        DeploymentEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PercentageComplete")) {
                stopDeploymentResult.setPercentageComplete(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedAt")) {
                stopDeploymentResult.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedAt")) {
                stopDeploymentResult.setCompletedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return stopDeploymentResult;
    }

    private static StopDeploymentResultJsonUnmarshaller instance;

    public static StopDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
