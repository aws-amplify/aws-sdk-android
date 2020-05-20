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
 * JSON marshaller for POJO InstanceTarget
 */
class InstanceTargetJsonMarshaller {

    public void marshall(InstanceTarget instanceTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceTarget.getDeploymentId() != null) {
            String deploymentId = instanceTarget.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (instanceTarget.getTargetId() != null) {
            String targetId = instanceTarget.getTargetId();
            jsonWriter.name("targetId");
            jsonWriter.value(targetId);
        }
        if (instanceTarget.getTargetArn() != null) {
            String targetArn = instanceTarget.getTargetArn();
            jsonWriter.name("targetArn");
            jsonWriter.value(targetArn);
        }
        if (instanceTarget.getStatus() != null) {
            String status = instanceTarget.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (instanceTarget.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = instanceTarget.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (instanceTarget.getLifecycleEvents() != null) {
            java.util.List<LifecycleEvent> lifecycleEvents = instanceTarget.getLifecycleEvents();
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
        if (instanceTarget.getInstanceLabel() != null) {
            String instanceLabel = instanceTarget.getInstanceLabel();
            jsonWriter.name("instanceLabel");
            jsonWriter.value(instanceLabel);
        }
        jsonWriter.endObject();
    }

    private static InstanceTargetJsonMarshaller instance;

    public static InstanceTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTargetJsonMarshaller();
        return instance;
    }
}
