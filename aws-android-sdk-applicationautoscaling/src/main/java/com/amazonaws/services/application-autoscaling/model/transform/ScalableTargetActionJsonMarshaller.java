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
 * JSON marshaller for POJO ScalableTargetAction
 */
class ScalableTargetActionJsonMarshaller {

    public void marshall(ScalableTargetAction scalableTargetAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scalableTargetAction.getMinCapacity() != null) {
            Integer minCapacity = scalableTargetAction.getMinCapacity();
            jsonWriter.name("MinCapacity");
            jsonWriter.value(minCapacity);
        }
        if (scalableTargetAction.getMaxCapacity() != null) {
            Integer maxCapacity = scalableTargetAction.getMaxCapacity();
            jsonWriter.name("MaxCapacity");
            jsonWriter.value(maxCapacity);
        }
        jsonWriter.endObject();
    }

    private static ScalableTargetActionJsonMarshaller instance;
    public static ScalableTargetActionJsonMarshaller getInstance() {
        if (instance == null) instance = new ScalableTargetActionJsonMarshaller();
        return instance;
    }
}
