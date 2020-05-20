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
 * JSON marshaller for POJO RollbackInfo
 */
class RollbackInfoJsonMarshaller {

    public void marshall(RollbackInfo rollbackInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rollbackInfo.getRollbackDeploymentId() != null) {
            String rollbackDeploymentId = rollbackInfo.getRollbackDeploymentId();
            jsonWriter.name("rollbackDeploymentId");
            jsonWriter.value(rollbackDeploymentId);
        }
        if (rollbackInfo.getRollbackTriggeringDeploymentId() != null) {
            String rollbackTriggeringDeploymentId = rollbackInfo
                    .getRollbackTriggeringDeploymentId();
            jsonWriter.name("rollbackTriggeringDeploymentId");
            jsonWriter.value(rollbackTriggeringDeploymentId);
        }
        if (rollbackInfo.getRollbackMessage() != null) {
            String rollbackMessage = rollbackInfo.getRollbackMessage();
            jsonWriter.name("rollbackMessage");
            jsonWriter.value(rollbackMessage);
        }
        jsonWriter.endObject();
    }

    private static RollbackInfoJsonMarshaller instance;

    public static RollbackInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RollbackInfoJsonMarshaller();
        return instance;
    }
}
