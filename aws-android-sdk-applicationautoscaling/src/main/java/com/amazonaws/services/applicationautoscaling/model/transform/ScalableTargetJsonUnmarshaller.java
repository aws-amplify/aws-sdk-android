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

package com.amazonaws.services.applicationautoscaling.model.transform;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ScalableTarget
 */
class ScalableTargetJsonUnmarshaller implements
        Unmarshaller<ScalableTarget, JsonUnmarshallerContext> {

    public ScalableTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScalableTarget scalableTarget = new ScalableTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ServiceNamespace")) {
                scalableTarget.setServiceNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                scalableTarget.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScalableDimension")) {
                scalableTarget.setScalableDimension(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinCapacity")) {
                scalableTarget.setMinCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxCapacity")) {
                scalableTarget.setMaxCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleARN")) {
                scalableTarget.setRoleARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                scalableTarget.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SuspendedState")) {
                scalableTarget.setSuspendedState(SuspendedStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scalableTarget;
    }

    private static ScalableTargetJsonUnmarshaller instance;

    public static ScalableTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalableTargetJsonUnmarshaller();
        return instance;
    }
}
