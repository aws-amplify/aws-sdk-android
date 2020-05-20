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
 * JSON marshaller for POJO LastDeploymentInfo
 */
class LastDeploymentInfoJsonMarshaller {

    public void marshall(LastDeploymentInfo lastDeploymentInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lastDeploymentInfo.getDeploymentId() != null) {
            String deploymentId = lastDeploymentInfo.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (lastDeploymentInfo.getStatus() != null) {
            String status = lastDeploymentInfo.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (lastDeploymentInfo.getEndTime() != null) {
            java.util.Date endTime = lastDeploymentInfo.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (lastDeploymentInfo.getCreateTime() != null) {
            java.util.Date createTime = lastDeploymentInfo.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        jsonWriter.endObject();
    }

    private static LastDeploymentInfoJsonMarshaller instance;

    public static LastDeploymentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LastDeploymentInfoJsonMarshaller();
        return instance;
    }
}
