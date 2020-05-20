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
 * JSON unmarshaller for POJO InstanceTarget
 */
class InstanceTargetJsonUnmarshaller implements
        Unmarshaller<InstanceTarget, JsonUnmarshallerContext> {

    public InstanceTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceTarget instanceTarget = new InstanceTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deploymentId")) {
                instanceTarget.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetId")) {
                instanceTarget.setTargetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetArn")) {
                instanceTarget.setTargetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                instanceTarget.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                instanceTarget.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lifecycleEvents")) {
                instanceTarget.setLifecycleEvents(new ListUnmarshaller<LifecycleEvent>(
                        LifecycleEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("instanceLabel")) {
                instanceTarget.setInstanceLabel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceTarget;
    }

    private static InstanceTargetJsonUnmarshaller instance;

    public static InstanceTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTargetJsonUnmarshaller();
        return instance;
    }
}
