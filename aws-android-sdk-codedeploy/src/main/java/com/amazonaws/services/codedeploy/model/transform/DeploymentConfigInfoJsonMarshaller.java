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
 * JSON marshaller for POJO DeploymentConfigInfo
 */
class DeploymentConfigInfoJsonMarshaller {

    public void marshall(DeploymentConfigInfo deploymentConfigInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentConfigInfo.getDeploymentConfigId() != null) {
            String deploymentConfigId = deploymentConfigInfo.getDeploymentConfigId();
            jsonWriter.name("deploymentConfigId");
            jsonWriter.value(deploymentConfigId);
        }
        if (deploymentConfigInfo.getDeploymentConfigName() != null) {
            String deploymentConfigName = deploymentConfigInfo.getDeploymentConfigName();
            jsonWriter.name("deploymentConfigName");
            jsonWriter.value(deploymentConfigName);
        }
        if (deploymentConfigInfo.getMinimumHealthyHosts() != null) {
            MinimumHealthyHosts minimumHealthyHosts = deploymentConfigInfo.getMinimumHealthyHosts();
            jsonWriter.name("minimumHealthyHosts");
            MinimumHealthyHostsJsonMarshaller.getInstance().marshall(minimumHealthyHosts,
                    jsonWriter);
        }
        if (deploymentConfigInfo.getCreateTime() != null) {
            java.util.Date createTime = deploymentConfigInfo.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (deploymentConfigInfo.getComputePlatform() != null) {
            String computePlatform = deploymentConfigInfo.getComputePlatform();
            jsonWriter.name("computePlatform");
            jsonWriter.value(computePlatform);
        }
        if (deploymentConfigInfo.getTrafficRoutingConfig() != null) {
            TrafficRoutingConfig trafficRoutingConfig = deploymentConfigInfo
                    .getTrafficRoutingConfig();
            jsonWriter.name("trafficRoutingConfig");
            TrafficRoutingConfigJsonMarshaller.getInstance().marshall(trafficRoutingConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DeploymentConfigInfoJsonMarshaller instance;

    public static DeploymentConfigInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentConfigInfoJsonMarshaller();
        return instance;
    }
}
