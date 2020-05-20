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
 * JSON marshaller for POJO DeploymentStyle
 */
class DeploymentStyleJsonMarshaller {

    public void marshall(DeploymentStyle deploymentStyle, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentStyle.getDeploymentType() != null) {
            String deploymentType = deploymentStyle.getDeploymentType();
            jsonWriter.name("deploymentType");
            jsonWriter.value(deploymentType);
        }
        if (deploymentStyle.getDeploymentOption() != null) {
            String deploymentOption = deploymentStyle.getDeploymentOption();
            jsonWriter.name("deploymentOption");
            jsonWriter.value(deploymentOption);
        }
        jsonWriter.endObject();
    }

    private static DeploymentStyleJsonMarshaller instance;

    public static DeploymentStyleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentStyleJsonMarshaller();
        return instance;
    }
}
