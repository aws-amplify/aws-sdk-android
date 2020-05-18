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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Deployment
 */
class DeploymentJsonUnmarshaller implements Unmarshaller<Deployment, JsonUnmarshallerContext> {

    public Deployment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Deployment deployment = new Deployment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                deployment.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                deployment.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskDefinition")) {
                deployment.setTaskDefinition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("desiredCount")) {
                deployment.setDesiredCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pendingCount")) {
                deployment.setPendingCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("runningCount")) {
                deployment.setRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                deployment.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updatedAt")) {
                deployment.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("capacityProviderStrategy")) {
                deployment
                        .setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(
                                CapacityProviderStrategyItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("launchType")) {
                deployment.setLaunchType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platformVersion")) {
                deployment.setPlatformVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networkConfiguration")) {
                deployment.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deployment;
    }

    private static DeploymentJsonUnmarshaller instance;

    public static DeploymentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonUnmarshaller();
        return instance;
    }
}
