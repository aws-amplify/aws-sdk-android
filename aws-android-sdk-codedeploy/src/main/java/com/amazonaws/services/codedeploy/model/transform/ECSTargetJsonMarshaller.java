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
 * JSON marshaller for POJO ECSTarget
 */
class ECSTargetJsonMarshaller {

    public void marshall(ECSTarget eCSTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eCSTarget.getDeploymentId() != null) {
            String deploymentId = eCSTarget.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (eCSTarget.getTargetId() != null) {
            String targetId = eCSTarget.getTargetId();
            jsonWriter.name("targetId");
            jsonWriter.value(targetId);
        }
        if (eCSTarget.getTargetArn() != null) {
            String targetArn = eCSTarget.getTargetArn();
            jsonWriter.name("targetArn");
            jsonWriter.value(targetArn);
        }
        if (eCSTarget.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = eCSTarget.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (eCSTarget.getLifecycleEvents() != null) {
            java.util.List<LifecycleEvent> lifecycleEvents = eCSTarget.getLifecycleEvents();
            jsonWriter.name("lifecycleEvents");
            jsonWriter.beginArray();
            for (LifecycleEvent lifecycleEventsItem : lifecycleEvents) {
                if (lifecycleEventsItem != null) {
                    LifecycleEventJsonMarshaller.getInstance().marshall(lifecycleEventsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (eCSTarget.getStatus() != null) {
            String status = eCSTarget.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (eCSTarget.getTaskSetsInfo() != null) {
            java.util.List<ECSTaskSet> taskSetsInfo = eCSTarget.getTaskSetsInfo();
            jsonWriter.name("taskSetsInfo");
            jsonWriter.beginArray();
            for (ECSTaskSet taskSetsInfoItem : taskSetsInfo) {
                if (taskSetsInfoItem != null) {
                    ECSTaskSetJsonMarshaller.getInstance().marshall(taskSetsInfoItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ECSTargetJsonMarshaller instance;

    public static ECSTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ECSTargetJsonMarshaller();
        return instance;
    }
}
