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
 * JSON unmarshaller for POJO DeploymentGroupInfo
 */
class DeploymentGroupInfoJsonUnmarshaller implements
        Unmarshaller<DeploymentGroupInfo, JsonUnmarshallerContext> {

    public DeploymentGroupInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeploymentGroupInfo deploymentGroupInfo = new DeploymentGroupInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("applicationName")) {
                deploymentGroupInfo.setApplicationName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentGroupId")) {
                deploymentGroupInfo.setDeploymentGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentGroupName")) {
                deploymentGroupInfo.setDeploymentGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentConfigName")) {
                deploymentGroupInfo.setDeploymentConfigName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ec2TagFilters")) {
                deploymentGroupInfo.setEc2TagFilters(new ListUnmarshaller<EC2TagFilter>(
                        EC2TagFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("onPremisesInstanceTagFilters")) {
                deploymentGroupInfo
                        .setOnPremisesInstanceTagFilters(new ListUnmarshaller<TagFilter>(
                                TagFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("autoScalingGroups")) {
                deploymentGroupInfo.setAutoScalingGroups(new ListUnmarshaller<AutoScalingGroup>(
                        AutoScalingGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("serviceRoleArn")) {
                deploymentGroupInfo.setServiceRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetRevision")) {
                deploymentGroupInfo.setTargetRevision(RevisionLocationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("triggerConfigurations")) {
                deploymentGroupInfo.setTriggerConfigurations(new ListUnmarshaller<TriggerConfig>(
                        TriggerConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("alarmConfiguration")) {
                deploymentGroupInfo.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoRollbackConfiguration")) {
                deploymentGroupInfo
                        .setAutoRollbackConfiguration(AutoRollbackConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("deploymentStyle")) {
                deploymentGroupInfo.setDeploymentStyle(DeploymentStyleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("blueGreenDeploymentConfiguration")) {
                deploymentGroupInfo
                        .setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("loadBalancerInfo")) {
                deploymentGroupInfo.setLoadBalancerInfo(LoadBalancerInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastSuccessfulDeployment")) {
                deploymentGroupInfo.setLastSuccessfulDeployment(LastDeploymentInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastAttemptedDeployment")) {
                deploymentGroupInfo.setLastAttemptedDeployment(LastDeploymentInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ec2TagSet")) {
                deploymentGroupInfo.setEc2TagSet(EC2TagSetJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("onPremisesTagSet")) {
                deploymentGroupInfo.setOnPremisesTagSet(OnPremisesTagSetJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("computePlatform")) {
                deploymentGroupInfo.setComputePlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ecsServices")) {
                deploymentGroupInfo.setEcsServices(new ListUnmarshaller<ECSService>(
                        ECSServiceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deploymentGroupInfo;
    }

    private static DeploymentGroupInfoJsonUnmarshaller instance;

    public static DeploymentGroupInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentGroupInfoJsonUnmarshaller();
        return instance;
    }
}
