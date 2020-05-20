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
package com.amazonaws.services.application-autoscaling.model.transform;

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScalableTarget
 */
class ScalableTargetJsonMarshaller {

    public void marshall(ScalableTarget scalableTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scalableTarget.getServiceNamespace() != null) {
            String serviceNamespace = scalableTarget.getServiceNamespace();
            jsonWriter.name("ServiceNamespace");
            jsonWriter.value(serviceNamespace);
        }
        if (scalableTarget.getResourceId() != null) {
            String resourceId = scalableTarget.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (scalableTarget.getScalableDimension() != null) {
            String scalableDimension = scalableTarget.getScalableDimension();
            jsonWriter.name("ScalableDimension");
            jsonWriter.value(scalableDimension);
        }
        if (scalableTarget.getMinCapacity() != null) {
            Integer minCapacity = scalableTarget.getMinCapacity();
            jsonWriter.name("MinCapacity");
            jsonWriter.value(minCapacity);
        }
        if (scalableTarget.getMaxCapacity() != null) {
            Integer maxCapacity = scalableTarget.getMaxCapacity();
            jsonWriter.name("MaxCapacity");
            jsonWriter.value(maxCapacity);
        }
        if (scalableTarget.getRoleARN() != null) {
            String roleARN = scalableTarget.getRoleARN();
            jsonWriter.name("RoleARN");
            jsonWriter.value(roleARN);
        }
        if (scalableTarget.getCreationTime() != null) {
            java.util.Date creationTime = scalableTarget.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (scalableTarget.getSuspendedState() != null) {
            SuspendedState suspendedState = scalableTarget.getSuspendedState();
            jsonWriter.name("SuspendedState");
            SuspendedStateJsonMarshaller.getInstance().marshall(suspendedState, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ScalableTargetJsonMarshaller instance;
    public static ScalableTargetJsonMarshaller getInstance() {
        if (instance == null) instance = new ScalableTargetJsonMarshaller();
        return instance;
    }
}
