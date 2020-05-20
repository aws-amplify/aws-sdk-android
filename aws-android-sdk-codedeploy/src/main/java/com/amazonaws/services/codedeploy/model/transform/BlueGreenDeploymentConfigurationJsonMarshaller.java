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
 * JSON marshaller for POJO BlueGreenDeploymentConfiguration
 */
class BlueGreenDeploymentConfigurationJsonMarshaller {

    public void marshall(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blueGreenDeploymentConfiguration.getTerminateBlueInstancesOnDeploymentSuccess() != null) {
            BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess = blueGreenDeploymentConfiguration
                    .getTerminateBlueInstancesOnDeploymentSuccess();
            jsonWriter.name("terminateBlueInstancesOnDeploymentSuccess");
            BlueInstanceTerminationOptionJsonMarshaller.getInstance().marshall(
                    terminateBlueInstancesOnDeploymentSuccess, jsonWriter);
        }
        if (blueGreenDeploymentConfiguration.getDeploymentReadyOption() != null) {
            DeploymentReadyOption deploymentReadyOption = blueGreenDeploymentConfiguration
                    .getDeploymentReadyOption();
            jsonWriter.name("deploymentReadyOption");
            DeploymentReadyOptionJsonMarshaller.getInstance().marshall(deploymentReadyOption,
                    jsonWriter);
        }
        if (blueGreenDeploymentConfiguration.getGreenFleetProvisioningOption() != null) {
            GreenFleetProvisioningOption greenFleetProvisioningOption = blueGreenDeploymentConfiguration
                    .getGreenFleetProvisioningOption();
            jsonWriter.name("greenFleetProvisioningOption");
            GreenFleetProvisioningOptionJsonMarshaller.getInstance().marshall(
                    greenFleetProvisioningOption, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BlueGreenDeploymentConfigurationJsonMarshaller instance;

    public static BlueGreenDeploymentConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlueGreenDeploymentConfigurationJsonMarshaller();
        return instance;
    }
}
