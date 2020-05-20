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
 * JSON marshaller for POJO InstanceSummary
 */
class InstanceSummaryJsonMarshaller {

    public void marshall(InstanceSummary instanceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceSummary.getDeploymentId() != null) {
            String deploymentId = instanceSummary.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (instanceSummary.getInstanceId() != null) {
            String instanceId = instanceSummary.getInstanceId();
            jsonWriter.name("instanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceSummary.getStatus() != null) {
            String status = instanceSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (instanceSummary.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = instanceSummary.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (instanceSummary.getLifecycleEvents() != null) {
            java.util.List<LifecycleEvent> lifecycleEvents = instanceSummary.getLifecycleEvents();
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
        if (instanceSummary.getInstanceType() != null) {
            String instanceType = instanceSummary.getInstanceType();
            jsonWriter.name("instanceType");
            jsonWriter.value(instanceType);
        }
        jsonWriter.endObject();
    }

    private static InstanceSummaryJsonMarshaller instance;

    public static InstanceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSummaryJsonMarshaller();
        return instance;
    }
}
