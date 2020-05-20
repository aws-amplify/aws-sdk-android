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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DeploymentInfo
 */
class DeploymentInfoJsonUnmarshaller implements
        Unmarshaller<DeploymentInfo, JsonUnmarshallerContext> {

    public DeploymentInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeploymentInfo deploymentInfo = new DeploymentInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("applicationName")) {
                deploymentInfo.setApplicationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentGroupName")) {
                deploymentInfo.setDeploymentGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentConfigName")) {
                deploymentInfo.setDeploymentConfigName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentId")) {
                deploymentInfo.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("previousRevision")) {
                deploymentInfo.setPreviousRevision(RevisionLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("revision")) {
                deploymentInfo.setRevision(RevisionLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                deploymentInfo.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorInformation")) {
                deploymentInfo.setErrorInformation(ErrorInformationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createTime")) {
                deploymentInfo.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                deploymentInfo.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("completeTime")) {
                deploymentInfo.setCompleteTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentOverview")) {
                deploymentInfo.setDeploymentOverview(DeploymentOverviewJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                deploymentInfo.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creator")) {
                deploymentInfo.setCreator(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ignoreApplicationStopFailures")) {
                deploymentInfo.setIgnoreApplicationStopFailures(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoRollbackConfiguration")) {
                deploymentInfo
                        .setAutoRollbackConfiguration(AutoRollbackConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("updateOutdatedInstancesOnly")) {
                deploymentInfo.setUpdateOutdatedInstancesOnly(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("rollbackInfo")) {
                deploymentInfo.setRollbackInfo(RollbackInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentStyle")) {
                deploymentInfo.setDeploymentStyle(DeploymentStyleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetInstances")) {
                deploymentInfo.setTargetInstances(TargetInstancesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceTerminationWaitTimeStarted")) {
                deploymentInfo.setInstanceTerminationWaitTimeStarted(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("blueGreenDeploymentConfiguration")) {
                deploymentInfo
                        .setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("loadBalancerInfo")) {
                deploymentInfo.setLoadBalancerInfo(LoadBalancerInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("additionalDeploymentStatusInfo")) {
                deploymentInfo.setAdditionalDeploymentStatusInfo(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("fileExistsBehavior")) {
                deploymentInfo.setFileExistsBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentStatusMessages")) {
                deploymentInfo.setDeploymentStatusMessages(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("computePlatform")) {
                deploymentInfo.setComputePlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("externalId")) {
                deploymentInfo.setExternalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deploymentInfo;
    }

    private static DeploymentInfoJsonUnmarshaller instance;

    public static DeploymentInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentInfoJsonUnmarshaller();
        return instance;
    }
}
