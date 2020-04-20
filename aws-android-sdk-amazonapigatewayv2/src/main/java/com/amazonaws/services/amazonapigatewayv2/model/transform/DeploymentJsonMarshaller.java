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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Deployment
 */
class DeploymentJsonMarshaller {

    public void marshall(Deployment deployment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deployment.getAutoDeployed() != null) {
            Boolean autoDeployed = deployment.getAutoDeployed();
            jsonWriter.name("AutoDeployed");
            jsonWriter.value(autoDeployed);
        }
        if (deployment.getCreatedDate() != null) {
            java.util.Date createdDate = deployment.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (deployment.getDeploymentId() != null) {
            String deploymentId = deployment.getDeploymentId();
            jsonWriter.name("DeploymentId");
            jsonWriter.value(deploymentId);
        }
        if (deployment.getDeploymentStatus() != null) {
            String deploymentStatus = deployment.getDeploymentStatus();
            jsonWriter.name("DeploymentStatus");
            jsonWriter.value(deploymentStatus);
        }
        if (deployment.getDeploymentStatusMessage() != null) {
            String deploymentStatusMessage = deployment.getDeploymentStatusMessage();
            jsonWriter.name("DeploymentStatusMessage");
            jsonWriter.value(deploymentStatusMessage);
        }
        if (deployment.getDescription() != null) {
            String description = deployment.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }
}
