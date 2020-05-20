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
 * JSON marshaller for POJO LambdaTarget
 */
class LambdaTargetJsonMarshaller {

    public void marshall(LambdaTarget lambdaTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lambdaTarget.getDeploymentId() != null) {
            String deploymentId = lambdaTarget.getDeploymentId();
            jsonWriter.name("deploymentId");
            jsonWriter.value(deploymentId);
        }
        if (lambdaTarget.getTargetId() != null) {
            String targetId = lambdaTarget.getTargetId();
            jsonWriter.name("targetId");
            jsonWriter.value(targetId);
        }
        if (lambdaTarget.getTargetArn() != null) {
            String targetArn = lambdaTarget.getTargetArn();
            jsonWriter.name("targetArn");
            jsonWriter.value(targetArn);
        }
        if (lambdaTarget.getStatus() != null) {
            String status = lambdaTarget.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (lambdaTarget.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = lambdaTarget.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (lambdaTarget.getLifecycleEvents() != null) {
            java.util.List<LifecycleEvent> lifecycleEvents = lambdaTarget.getLifecycleEvents();
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
        if (lambdaTarget.getLambdaFunctionInfo() != null) {
            LambdaFunctionInfo lambdaFunctionInfo = lambdaTarget.getLambdaFunctionInfo();
            jsonWriter.name("lambdaFunctionInfo");
            LambdaFunctionInfoJsonMarshaller.getInstance().marshall(lambdaFunctionInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LambdaTargetJsonMarshaller instance;

    public static LambdaTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaTargetJsonMarshaller();
        return instance;
    }
}
