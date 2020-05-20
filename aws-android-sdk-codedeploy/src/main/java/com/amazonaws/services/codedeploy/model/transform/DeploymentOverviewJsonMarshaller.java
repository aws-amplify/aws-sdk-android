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
 * JSON marshaller for POJO DeploymentOverview
 */
class DeploymentOverviewJsonMarshaller {

    public void marshall(DeploymentOverview deploymentOverview, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentOverview.getPending() != null) {
            Long pending = deploymentOverview.getPending();
            jsonWriter.name("Pending");
            jsonWriter.value(pending);
        }
        if (deploymentOverview.getInProgress() != null) {
            Long inProgress = deploymentOverview.getInProgress();
            jsonWriter.name("InProgress");
            jsonWriter.value(inProgress);
        }
        if (deploymentOverview.getSucceeded() != null) {
            Long succeeded = deploymentOverview.getSucceeded();
            jsonWriter.name("Succeeded");
            jsonWriter.value(succeeded);
        }
        if (deploymentOverview.getFailed() != null) {
            Long failed = deploymentOverview.getFailed();
            jsonWriter.name("Failed");
            jsonWriter.value(failed);
        }
        if (deploymentOverview.getSkipped() != null) {
            Long skipped = deploymentOverview.getSkipped();
            jsonWriter.name("Skipped");
            jsonWriter.value(skipped);
        }
        if (deploymentOverview.getReady() != null) {
            Long ready = deploymentOverview.getReady();
            jsonWriter.name("Ready");
            jsonWriter.value(ready);
        }
        jsonWriter.endObject();
    }

    private static DeploymentOverviewJsonMarshaller instance;

    public static DeploymentOverviewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentOverviewJsonMarshaller();
        return instance;
    }
}
