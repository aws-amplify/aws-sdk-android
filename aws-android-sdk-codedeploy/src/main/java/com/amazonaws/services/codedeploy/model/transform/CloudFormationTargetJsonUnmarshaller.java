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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CloudFormationTarget
 */
class CloudFormationTargetJsonUnmarshaller implements
        Unmarshaller<CloudFormationTarget, JsonUnmarshallerContext> {

    public CloudFormationTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CloudFormationTarget cloudFormationTarget = new CloudFormationTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentId")) {
                cloudFormationTarget.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetId")) {
                cloudFormationTarget.setTargetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                cloudFormationTarget.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lifecycleEvents")) {
                cloudFormationTarget.setLifecycleEvents(new ListUnmarshaller<LifecycleEvent>(
                        LifecycleEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                cloudFormationTarget.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                cloudFormationTarget.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetVersionWeight")) {
                cloudFormationTarget.setTargetVersionWeight(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cloudFormationTarget;
    }

    private static CloudFormationTargetJsonUnmarshaller instance;

    public static CloudFormationTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudFormationTargetJsonUnmarshaller();
        return instance;
    }
}
