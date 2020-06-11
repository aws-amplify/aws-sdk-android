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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ManagedScaling
 */
class ManagedScalingJsonMarshaller {

    public void marshall(ManagedScaling managedScaling, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (managedScaling.getStatus() != null) {
            String status = managedScaling.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (managedScaling.getTargetCapacity() != null) {
            Integer targetCapacity = managedScaling.getTargetCapacity();
            jsonWriter.name("targetCapacity");
            jsonWriter.value(targetCapacity);
        }
        if (managedScaling.getMinimumScalingStepSize() != null) {
            Integer minimumScalingStepSize = managedScaling.getMinimumScalingStepSize();
            jsonWriter.name("minimumScalingStepSize");
            jsonWriter.value(minimumScalingStepSize);
        }
        if (managedScaling.getMaximumScalingStepSize() != null) {
            Integer maximumScalingStepSize = managedScaling.getMaximumScalingStepSize();
            jsonWriter.name("maximumScalingStepSize");
            jsonWriter.value(maximumScalingStepSize);
        }
        jsonWriter.endObject();
    }

    private static ManagedScalingJsonMarshaller instance;

    public static ManagedScalingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ManagedScalingJsonMarshaller();
        return instance;
    }
}
