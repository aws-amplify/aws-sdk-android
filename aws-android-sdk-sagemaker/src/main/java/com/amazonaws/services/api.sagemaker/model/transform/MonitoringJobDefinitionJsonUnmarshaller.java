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
 * JSON unmarshaller for POJO MonitoringJobDefinition
 */
class MonitoringJobDefinitionJsonUnmarshaller implements
        Unmarshaller<MonitoringJobDefinition, JsonUnmarshallerContext> {

    public MonitoringJobDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MonitoringJobDefinition monitoringJobDefinition = new MonitoringJobDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BaselineConfig")) {
                monitoringJobDefinition.setBaselineConfig(MonitoringBaselineConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringInputs")) {
                monitoringJobDefinition.setMonitoringInputs(new ListUnmarshaller<MonitoringInput>(
                        MonitoringInputJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MonitoringOutputConfig")) {
                monitoringJobDefinition
                        .setMonitoringOutputConfig(MonitoringOutputConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MonitoringResources")) {
                monitoringJobDefinition.setMonitoringResources(MonitoringResourcesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MonitoringAppSpecification")) {
                monitoringJobDefinition
                        .setMonitoringAppSpecification(MonitoringAppSpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                monitoringJobDefinition
                        .setStoppingCondition(MonitoringStoppingConditionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Environment")) {
                monitoringJobDefinition.setEnvironment(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkConfig")) {
                monitoringJobDefinition.setNetworkConfig(NetworkConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                monitoringJobDefinition.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return monitoringJobDefinition;
    }

    private static MonitoringJobDefinitionJsonUnmarshaller instance;

    public static MonitoringJobDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringJobDefinitionJsonUnmarshaller();
        return instance;
    }
}
