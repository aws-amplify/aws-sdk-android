/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RoutingCriteria
 */
class RoutingCriteriaJsonMarshaller {

    public void marshall(RoutingCriteria routingCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (routingCriteria.getSteps() != null) {
            java.util.List<Step> steps = routingCriteria.getSteps();
            jsonWriter.name("Steps");
            jsonWriter.beginArray();
            for (Step stepsItem : steps) {
                if (stepsItem != null) {
                    StepJsonMarshaller.getInstance().marshall(stepsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routingCriteria.getActivationTimestamp() != null) {
            java.util.Date activationTimestamp = routingCriteria.getActivationTimestamp();
            jsonWriter.name("ActivationTimestamp");
            jsonWriter.value(activationTimestamp);
        }
        if (routingCriteria.getIndex() != null) {
            Integer index = routingCriteria.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        jsonWriter.endObject();
    }

    private static RoutingCriteriaJsonMarshaller instance;

    public static RoutingCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoutingCriteriaJsonMarshaller();
        return instance;
    }
}
