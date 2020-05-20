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
 * JSON unmarshaller for POJO DeploymentTarget
 */
class DeploymentTargetJsonUnmarshaller implements
        Unmarshaller<DeploymentTarget, JsonUnmarshallerContext> {

    public DeploymentTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DeploymentTarget deploymentTarget = new DeploymentTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentTargetType")) {
                deploymentTarget.setDeploymentTargetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceTarget")) {
                deploymentTarget.setInstanceTarget(InstanceTargetJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lambdaTarget")) {
                deploymentTarget.setLambdaTarget(LambdaTargetJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ecsTarget")) {
                deploymentTarget.setEcsTarget(ECSTargetJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cloudFormationTarget")) {
                deploymentTarget.setCloudFormationTarget(CloudFormationTargetJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deploymentTarget;
    }

    private static DeploymentTargetJsonUnmarshaller instance;

    public static DeploymentTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentTargetJsonUnmarshaller();
        return instance;
    }
}
