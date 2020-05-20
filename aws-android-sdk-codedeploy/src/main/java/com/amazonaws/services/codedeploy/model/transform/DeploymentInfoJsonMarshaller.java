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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeploymentInfo
 */
class DeploymentInfoJsonMarshaller {

    public void marshall(DeploymentInfo deploymentInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deploymentInfo.getApplicationName() != null) {
            String applicationName = deploymentInfo.getApplicationName();
            jsonWriter.name("applicationName");
            jsonWriter.value(applicationName);
        }
        if (deploymentInfo.getDeploymentGroupName() != null) {
            String deploymentGroupName = deploymentInfo.getDeploymentGroupName();
            jsonWriter.name("deploymentGroupName");
            jsonWriter.value(deploymentGroupName);
        }
        if (deploymentInfo.getDeploymentConfigName() != null) {
            String deploymentConfigName = deploymentInfo.getDeploymentConfigName();
            jsonWriter.name("deploymentConfigName");
            jsonWriter.value(deploymentConfigName);
        }
        if (deploymentInfo.getDeploymentId() != null) {
            String deploymentId = deploymentInfo.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (deploymentInfo.getPreviousRevision() != null) {
            RevisionLocation previousRevision = deploymentInfo.getPreviousRevision();
            jsonWriter.name("previousRevision");
            RevisionLocationJsonMarshaller.getInstance().marshall(previousRevision, jsonWriter);
        }
        if (deploymentInfo.getRevision() != null) {
            RevisionLocation revision = deploymentInfo.getRevision();
            jsonWriter.name("revision");
            RevisionLocationJsonMarshaller.getInstance().marshall(revision, jsonWriter);
        }
        if (deploymentInfo.getStatus() != null) {
            String status = deploymentInfo.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (deploymentInfo.getErrorInformation() != null) {
            ErrorInformation errorInformation = deploymentInfo.getErrorInformation();
            jsonWriter.name("errorInformation");
            ErrorInformationJsonMarshaller.getInstance().marshall(errorInformation, jsonWriter);
        }
        if (deploymentInfo.getCreateTime() != null) {
            java.util.Date createTime = deploymentInfo.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (deploymentInfo.getStartTime() != null) {
            java.util.Date startTime = deploymentInfo.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (deploymentInfo.getCompleteTime() != null) {
            java.util.Date completeTime = deploymentInfo.getCompleteTime();
            jsonWriter.name("completeTime");
            jsonWriter.value(completeTime);
        }
        if (deploymentInfo.getDeploymentOverview() != null) {
            DeploymentOverview deploymentOverview = deploymentInfo.getDeploymentOverview();
            jsonWriter.name("deploymentOverview");
            DeploymentOverviewJsonMarshaller.getInstance().marshall(deploymentOverview, jsonWriter);
        }
        if (deploymentInfo.getDescription() != null) {
            String description = deploymentInfo.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (deploymentInfo.getCreator() != null) {
            String creator = deploymentInfo.getCreator();
            jsonWriter.name("creator");
            jsonWriter.value(creator);
        }
        if (deploymentInfo.getIgnoreApplicationStopFailures() != null) {
            Boolean ignoreApplicationStopFailures = deploymentInfo
                    .getIgnoreApplicationStopFailures();
            jsonWriter.name("ignoreApplicationStopFailures");
            jsonWriter.value(ignoreApplicationStopFailures);
        }
        if (deploymentInfo.getAutoRollbackConfiguration() != null) {
            AutoRollbackConfiguration autoRollbackConfiguration = deploymentInfo
                    .getAutoRollbackConfiguration();
            jsonWriter.name("autoRollbackConfiguration");
            AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(
                    autoRollbackConfiguration, jsonWriter);
        }
        if (deploymentInfo.getUpdateOutdatedInstancesOnly() != null) {
            Boolean updateOutdatedInstancesOnly = deploymentInfo.getUpdateOutdatedInstancesOnly();
            jsonWriter.name("updateOutdatedInstancesOnly");
            jsonWriter.value(updateOutdatedInstancesOnly);
        }
        if (deploymentInfo.getRollbackInfo() != null) {
            RollbackInfo rollbackInfo = deploymentInfo.getRollbackInfo();
            jsonWriter.name("rollbackInfo");
            RollbackInfoJsonMarshaller.getInstance().marshall(rollbackInfo, jsonWriter);
        }
        if (deploymentInfo.getDeploymentStyle() != null) {
            DeploymentStyle deploymentStyle = deploymentInfo.getDeploymentStyle();
            jsonWriter.name("deploymentStyle");
            DeploymentStyleJsonMarshaller.getInstance().marshall(deploymentStyle, jsonWriter);
        }
        if (deploymentInfo.getTargetInstances() != null) {
            TargetInstances targetInstances = deploymentInfo.getTargetInstances();
            jsonWriter.name("targetInstances");
            TargetInstancesJsonMarshaller.getInstance().marshall(targetInstances, jsonWriter);
        }
        if (deploymentInfo.getInstanceTerminationWaitTimeStarted() != null) {
            Boolean instanceTerminationWaitTimeStarted = deploymentInfo
                    .getInstanceTerminationWaitTimeStarted();
            jsonWriter.name("instanceTerminationWaitTimeStarted");
            jsonWriter.value(instanceTerminationWaitTimeStarted);
        }
        if (deploymentInfo.getBlueGreenDeploymentConfiguration() != null) {
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration = deploymentInfo
                    .getBlueGreenDeploymentConfiguration();
            jsonWriter.name("blueGreenDeploymentConfiguration");
            BlueGreenDeploymentConfigurationJsonMarshaller.getInstance().marshall(
                    blueGreenDeploymentConfiguration, jsonWriter);
        }
        if (deploymentInfo.getLoadBalancerInfo() != null) {
            LoadBalancerInfo loadBalancerInfo = deploymentInfo.getLoadBalancerInfo();
            jsonWriter.name("loadBalancerInfo");
            LoadBalancerInfoJsonMarshaller.getInstance().marshall(loadBalancerInfo, jsonWriter);
        }
        if (deploymentInfo.getAdditionalDeploymentStatusInfo() != null) {
            String additionalDeploymentStatusInfo = deploymentInfo
                    .getAdditionalDeploymentStatusInfo();
            jsonWriter.name("additionalDeploymentStatusInfo");
            jsonWriter.value(additionalDeploymentStatusInfo);
        }
        if (deploymentInfo.getFileExistsBehavior() != null) {
            String fileExistsBehavior = deploymentInfo.getFileExistsBehavior();
            jsonWriter.name("fileExistsBehavior");
            jsonWriter.value(fileExistsBehavior);
        }
        if (deploymentInfo.getDeploymentStatusMessages() != null) {
            java.util.List<String> deploymentStatusMessages = deploymentInfo
                    .getDeploymentStatusMessages();
            jsonWriter.name("deploymentStatusMessages");
            jsonWriter.beginArray();
            for (String deploymentStatusMessagesItem : deploymentStatusMessages) {
                if (deploymentStatusMessagesItem != null) {
                    jsonWriter.value(deploymentStatusMessagesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (deploymentInfo.getComputePlatform() != null) {
            String computePlatform = deploymentInfo.getComputePlatform();
            jsonWriter.name("computePlatform");
            jsonWriter.value(computePlatform);
        }
        if (deploymentInfo.getExternalId() != null) {
            String externalId = deploymentInfo.getExternalId();
            jsonWriter.name("externalId");
            jsonWriter.value(externalId);
        }
        jsonWriter.endObject();
    }

    private static DeploymentInfoJsonMarshaller instance;

    public static DeploymentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentInfoJsonMarshaller();
        return instance;
    }
}
