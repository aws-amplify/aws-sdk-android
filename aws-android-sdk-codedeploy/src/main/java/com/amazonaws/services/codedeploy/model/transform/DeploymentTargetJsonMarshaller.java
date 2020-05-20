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
 * JSON marshaller for POJO DeploymentTarget
 */
class DeploymentTargetJsonMarshaller {

    public void marshall(DeploymentTarget deploymentTarget, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentTarget.getDeploymentTargetType() != null) {
            String deploymentTargetType = deploymentTarget.getDeploymentTargetType();
            jsonWriter.name("deploymentTargetType");
            jsonWriter.value(deploymentTargetType);
        }
        if (deploymentTarget.getInstanceTarget() != null) {
            InstanceTarget instanceTarget = deploymentTarget.getInstanceTarget();
            jsonWriter.name("instanceTarget");
            InstanceTargetJsonMarshaller.getInstance().marshall(instanceTarget, jsonWriter);
        }
        if (deploymentTarget.getLambdaTarget() != null) {
            LambdaTarget lambdaTarget = deploymentTarget.getLambdaTarget();
            jsonWriter.name("lambdaTarget");
            LambdaTargetJsonMarshaller.getInstance().marshall(lambdaTarget, jsonWriter);
        }
        if (deploymentTarget.getEcsTarget() != null) {
            ECSTarget ecsTarget = deploymentTarget.getEcsTarget();
            jsonWriter.name("ecsTarget");
            ECSTargetJsonMarshaller.getInstance().marshall(ecsTarget, jsonWriter);
        }
        if (deploymentTarget.getCloudFormationTarget() != null) {
            CloudFormationTarget cloudFormationTarget = deploymentTarget.getCloudFormationTarget();
            jsonWriter.name("cloudFormationTarget");
            CloudFormationTargetJsonMarshaller.getInstance().marshall(cloudFormationTarget,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DeploymentTargetJsonMarshaller instance;

    public static DeploymentTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentTargetJsonMarshaller();
        return instance;
    }
}
