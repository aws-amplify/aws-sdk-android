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
 * JSON marshaller for POJO CloudFormationTarget
 */
class CloudFormationTargetJsonMarshaller {

    public void marshall(CloudFormationTarget cloudFormationTarget, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cloudFormationTarget.getDeploymentId() != null) {
            String deploymentId = cloudFormationTarget.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (cloudFormationTarget.getTargetId() != null) {
            String targetId = cloudFormationTarget.getTargetId();
            jsonWriter.name("targetId");
            jsonWriter.value(targetId);
        }
        if (cloudFormationTarget.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = cloudFormationTarget.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (cloudFormationTarget.getLifecycleEvents() != null) {
            java.util.List<LifecycleEvent> lifecycleEvents = cloudFormationTarget
                    .getLifecycleEvents();
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
        if (cloudFormationTarget.getStatus() != null) {
            String status = cloudFormationTarget.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (cloudFormationTarget.getResourceType() != null) {
            String resourceType = cloudFormationTarget.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (cloudFormationTarget.getTargetVersionWeight() != null) {
            Double targetVersionWeight = cloudFormationTarget.getTargetVersionWeight();
            jsonWriter.name("targetVersionWeight");
            jsonWriter.value(targetVersionWeight);
        }
        jsonWriter.endObject();
    }

    private static CloudFormationTargetJsonMarshaller instance;

    public static CloudFormationTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFormationTargetJsonMarshaller();
        return instance;
    }
}
