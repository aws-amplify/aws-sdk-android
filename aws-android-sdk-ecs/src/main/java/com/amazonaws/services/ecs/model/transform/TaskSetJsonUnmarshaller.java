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
 * JSON unmarshaller for POJO TaskSet
 */
class TaskSetJsonUnmarshaller implements Unmarshaller<TaskSet, JsonUnmarshallerContext> {

    public TaskSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TaskSet taskSet = new TaskSet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                taskSet.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskSetArn")) {
                taskSet.setTaskSetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serviceArn")) {
                taskSet.setServiceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clusterArn")) {
                taskSet.setClusterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startedBy")) {
                taskSet.setStartedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("externalId")) {
                taskSet.setExternalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                taskSet.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskDefinition")) {
                taskSet.setTaskDefinition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("computedDesiredCount")) {
                taskSet.setComputedDesiredCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pendingCount")) {
                taskSet.setPendingCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("runningCount")) {
                taskSet.setRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                taskSet.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updatedAt")) {
                taskSet.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("launchType")) {
                taskSet.setLaunchType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("capacityProviderStrategy")) {
                taskSet.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(
                        CapacityProviderStrategyItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("platformVersion")) {
                taskSet.setPlatformVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("networkConfiguration")) {
                taskSet.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loadBalancers")) {
                taskSet.setLoadBalancers(new ListUnmarshaller<LoadBalancer>(
                        LoadBalancerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("serviceRegistries")) {
                taskSet.setServiceRegistries(new ListUnmarshaller<ServiceRegistry>(
                        ServiceRegistryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("scale")) {
                taskSet.setScale(ScaleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stabilityStatus")) {
                taskSet.setStabilityStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stabilityStatusAt")) {
                taskSet.setStabilityStatusAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                taskSet.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return taskSet;
    }

    private static TaskSetJsonUnmarshaller instance;

    public static TaskSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskSetJsonUnmarshaller();
        return instance;
    }
}
