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
 * JSON unmarshaller for POJO Service
 */
class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Service service = new Service();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("serviceArn")) {
                service.setServiceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serviceName")) {
                service.setServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clusterArn")) {
                service.setClusterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loadBalancers")) {
                service.setLoadBalancers(new ListUnmarshaller<LoadBalancer>(
                        LoadBalancerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("serviceRegistries")) {
                service.setServiceRegistries(new ListUnmarshaller<ServiceRegistry>(
                        ServiceRegistryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                service.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("desiredCount")) {
                service.setDesiredCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("runningCount")) {
                service.setRunningCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pendingCount")) {
                service.setPendingCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("launchType")) {
                service.setLaunchType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("capacityProviderStrategy")) {
                service.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(
                        CapacityProviderStrategyItemJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("platformVersion")) {
                service.setPlatformVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskDefinition")) {
                service.setTaskDefinition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentConfiguration")) {
                service.setDeploymentConfiguration(DeploymentConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("taskSets")) {
                service.setTaskSets(new ListUnmarshaller<TaskSet>(TaskSetJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("deployments")) {
                service.setDeployments(new ListUnmarshaller<Deployment>(DeploymentJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("roleArn")) {
                service.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("events")) {
                service.setEvents(new ListUnmarshaller<ServiceEvent>(ServiceEventJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdAt")) {
                service.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("placementConstraints")) {
                service.setPlacementConstraints(new ListUnmarshaller<PlacementConstraint>(
                        PlacementConstraintJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("placementStrategy")) {
                service.setPlacementStrategy(new ListUnmarshaller<PlacementStrategy>(
                        PlacementStrategyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("networkConfiguration")) {
                service.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("healthCheckGracePeriodSeconds")) {
                service.setHealthCheckGracePeriodSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("schedulingStrategy")) {
                service.setSchedulingStrategy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentController")) {
                service.setDeploymentController(DeploymentControllerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                service.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdBy")) {
                service.setCreatedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("enableECSManagedTags")) {
                service.setEnableECSManagedTags(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("propagateTags")) {
                service.setPropagateTags(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
