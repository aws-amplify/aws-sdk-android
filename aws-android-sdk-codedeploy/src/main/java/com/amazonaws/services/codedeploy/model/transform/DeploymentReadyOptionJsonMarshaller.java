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
 * JSON marshaller for POJO DeploymentReadyOption
 */
class DeploymentReadyOptionJsonMarshaller {

    public void marshall(DeploymentReadyOption deploymentReadyOption, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentReadyOption.getActionOnTimeout() != null) {
            String actionOnTimeout = deploymentReadyOption.getActionOnTimeout();
            jsonWriter.name("actionOnTimeout");
            jsonWriter.value(actionOnTimeout);
        }
        if (deploymentReadyOption.getWaitTimeInMinutes() != null) {
            Integer waitTimeInMinutes = deploymentReadyOption.getWaitTimeInMinutes();
            jsonWriter.name("waitTimeInMinutes");
            jsonWriter.value(waitTimeInMinutes);
        }
        jsonWriter.endObject();
    }

    private static DeploymentReadyOptionJsonMarshaller instance;

    public static DeploymentReadyOptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentReadyOptionJsonMarshaller();
        return instance;
    }
}
