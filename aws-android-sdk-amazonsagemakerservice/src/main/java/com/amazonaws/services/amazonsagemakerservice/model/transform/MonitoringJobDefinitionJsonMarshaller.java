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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MonitoringJobDefinition
 */
class MonitoringJobDefinitionJsonMarshaller {

    public void marshall(MonitoringJobDefinition monitoringJobDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (monitoringJobDefinition.getBaselineConfig() != null) {
            MonitoringBaselineConfig baselineConfig = monitoringJobDefinition.getBaselineConfig();
            jsonWriter.name("BaselineConfig");
            MonitoringBaselineConfigJsonMarshaller.getInstance().marshall(baselineConfig,
                    jsonWriter);
        }
        if (monitoringJobDefinition.getMonitoringInputs() != null) {
            java.util.List<MonitoringInput> monitoringInputs = monitoringJobDefinition
                    .getMonitoringInputs();
            jsonWriter.name("MonitoringInputs");
            jsonWriter.beginArray();
            for (MonitoringInput monitoringInputsItem : monitoringInputs) {
                if (monitoringInputsItem != null) {
                    MonitoringInputJsonMarshaller.getInstance().marshall(monitoringInputsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (monitoringJobDefinition.getMonitoringOutputConfig() != null) {
            MonitoringOutputConfig monitoringOutputConfig = monitoringJobDefinition
                    .getMonitoringOutputConfig();
            jsonWriter.name("MonitoringOutputConfig");
            MonitoringOutputConfigJsonMarshaller.getInstance().marshall(monitoringOutputConfig,
                    jsonWriter);
        }
        if (monitoringJobDefinition.getMonitoringResources() != null) {
            MonitoringResources monitoringResources = monitoringJobDefinition
                    .getMonitoringResources();
            jsonWriter.name("MonitoringResources");
            MonitoringResourcesJsonMarshaller.getInstance().marshall(monitoringResources,
                    jsonWriter);
        }
        if (monitoringJobDefinition.getMonitoringAppSpecification() != null) {
            MonitoringAppSpecification monitoringAppSpecification = monitoringJobDefinition
                    .getMonitoringAppSpecification();
            jsonWriter.name("MonitoringAppSpecification");
            MonitoringAppSpecificationJsonMarshaller.getInstance().marshall(
                    monitoringAppSpecification, jsonWriter);
        }
        if (monitoringJobDefinition.getStoppingCondition() != null) {
            MonitoringStoppingCondition stoppingCondition = monitoringJobDefinition
                    .getStoppingCondition();
            jsonWriter.name("StoppingCondition");
            MonitoringStoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition,
                    jsonWriter);
        }
        if (monitoringJobDefinition.getEnvironment() != null) {
            java.util.Map<String, String> environment = monitoringJobDefinition.getEnvironment();
            jsonWriter.name("Environment");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> environmentEntry : environment.entrySet()) {
                String environmentValue = environmentEntry.getValue();
                if (environmentValue != null) {
                    jsonWriter.name(environmentEntry.getKey());
                    jsonWriter.value(environmentValue);
                }
            }
            jsonWriter.endObject();
        }
        if (monitoringJobDefinition.getNetworkConfig() != null) {
            NetworkConfig networkConfig = monitoringJobDefinition.getNetworkConfig();
            jsonWriter.name("NetworkConfig");
            NetworkConfigJsonMarshaller.getInstance().marshall(networkConfig, jsonWriter);
        }
        if (monitoringJobDefinition.getRoleArn() != null) {
            String roleArn = monitoringJobDefinition.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static MonitoringJobDefinitionJsonMarshaller instance;

    public static MonitoringJobDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringJobDefinitionJsonMarshaller();
        return instance;
    }
}
