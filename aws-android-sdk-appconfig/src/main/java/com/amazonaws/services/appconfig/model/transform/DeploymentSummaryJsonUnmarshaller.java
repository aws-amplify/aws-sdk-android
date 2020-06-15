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
 * JSON unmarshaller for POJO DeploymentSummary
 */
class DeploymentSummaryJsonUnmarshaller implements
        Unmarshaller<DeploymentSummary, JsonUnmarshallerContext> {

    public DeploymentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeploymentSummary deploymentSummary = new DeploymentSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeploymentNumber")) {
                deploymentSummary.setDeploymentNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationName")) {
                deploymentSummary.setConfigurationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConfigurationVersion")) {
                deploymentSummary.setConfigurationVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentDurationInMinutes")) {
                deploymentSummary.setDeploymentDurationInMinutes(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthType")) {
                deploymentSummary.setGrowthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GrowthFactor")) {
                deploymentSummary.setGrowthFactor(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FinalBakeTimeInMinutes")) {
                deploymentSummary.setFinalBakeTimeInMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                deploymentSummary.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PercentageComplete")) {
                deploymentSummary.setPercentageComplete(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedAt")) {
                deploymentSummary.setStartedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedAt")) {
                deploymentSummary.setCompletedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deploymentSummary;
    }

    private static DeploymentSummaryJsonUnmarshaller instance;

    public static DeploymentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentSummaryJsonUnmarshaller();
        return instance;
    }
}
