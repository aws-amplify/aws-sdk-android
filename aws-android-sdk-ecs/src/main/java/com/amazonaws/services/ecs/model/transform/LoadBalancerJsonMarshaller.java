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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoadBalancer
 */
class LoadBalancerJsonMarshaller {

    public void marshall(LoadBalancer loadBalancer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancer.getTargetGroupArn() != null) {
            String targetGroupArn = loadBalancer.getTargetGroupArn();
            jsonWriter.name("targetGroupArn");
            jsonWriter.value(targetGroupArn);
        }
        if (loadBalancer.getLoadBalancerName() != null) {
            String loadBalancerName = loadBalancer.getLoadBalancerName();
            jsonWriter.name("loadBalancerName");
            jsonWriter.value(loadBalancerName);
        }
        if (loadBalancer.getContainerName() != null) {
            String containerName = loadBalancer.getContainerName();
            jsonWriter.name("containerName");
            jsonWriter.value(containerName);
        }
        if (loadBalancer.getContainerPort() != null) {
            Integer containerPort = loadBalancer.getContainerPort();
            jsonWriter.name("containerPort");
            jsonWriter.value(containerPort);
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerJsonMarshaller instance;

    public static LoadBalancerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerJsonMarshaller();
        return instance;
    }
}
