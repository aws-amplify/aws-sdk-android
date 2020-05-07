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
 * JSON unmarshaller for response StartDeploymentResult
 */
public class StartDeploymentResultJsonUnmarshaller implements
        Unmarshaller<StartDeploymentResult, JsonUnmarshallerContext> {

    public StartDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartDeploymentResult startDeploymentResult = new StartDeploymentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                startDeploymentResult.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnvironmentId")) {
                startDeploymentResult.setEnvironmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentStrategyId")) {
                startDeploymentResult.setDeploymentStrategyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationProfileId")) {
                startDeploymentResult.setConfigurationProfileId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentNumber")) {
                startDeploymentResult.setDeploymentNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationName")) {
                startDeploymentResult.setConfigurationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationLocationUri")) {
                startDeploymentResult.setConfigurationLocationUri(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationVersion")) {
                startDeploymentResult.setConfigurationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                startDeploymentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentDurationInMinutes")) {
                startDeploymentResult.setDeploymentDurationInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthType")) {
                startDeploymentResult.setGrowthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthFactor")) {
                startDeploymentResult.setGrowthFactor(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalBakeTimeInMinutes")) {
                startDeploymentResult.setFinalBakeTimeInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                startDeploymentResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventLog")) {
                startDeploymentResult.setEventLog(new ListUnmarshaller<DeploymentEvent>(
                        DeploymentEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PercentageComplete")) {
                startDeploymentResult.setPercentageComplete(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedAt")) {
                startDeploymentResult.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedAt")) {
                startDeploymentResult.setCompletedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startDeploymentResult;
    }

    private static StartDeploymentResultJsonUnmarshaller instance;

    public static StartDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
