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
 * JSON unmarshaller for response GetDeploymentResult
 */
public class GetDeploymentResultJsonUnmarshaller implements
        Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> {

    public GetDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDeploymentResult getDeploymentResult = new GetDeploymentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                getDeploymentResult.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnvironmentId")) {
                getDeploymentResult.setEnvironmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentStrategyId")) {
                getDeploymentResult.setDeploymentStrategyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationProfileId")) {
                getDeploymentResult.setConfigurationProfileId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentNumber")) {
                getDeploymentResult.setDeploymentNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationName")) {
                getDeploymentResult.setConfigurationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationLocationUri")) {
                getDeploymentResult.setConfigurationLocationUri(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationVersion")) {
                getDeploymentResult.setConfigurationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getDeploymentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentDurationInMinutes")) {
                getDeploymentResult.setDeploymentDurationInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthType")) {
                getDeploymentResult.setGrowthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthFactor")) {
                getDeploymentResult.setGrowthFactor(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalBakeTimeInMinutes")) {
                getDeploymentResult.setFinalBakeTimeInMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                getDeploymentResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventLog")) {
                getDeploymentResult.setEventLog(new ListUnmarshaller<DeploymentEvent>(
                        DeploymentEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PercentageComplete")) {
                getDeploymentResult.setPercentageComplete(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedAt")) {
                getDeploymentResult.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedAt")) {
                getDeploymentResult.setCompletedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDeploymentResult;
    }

    private static GetDeploymentResultJsonUnmarshaller instance;

    public static GetDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
