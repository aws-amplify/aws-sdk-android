/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BehaviorCriteria
 */
class BehaviorCriteriaJsonMarshaller {

    public void marshall(BehaviorCriteria behaviorCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (behaviorCriteria.getComparisonOperator() != null) {
            String comparisonOperator = behaviorCriteria.getComparisonOperator();
            jsonWriter.name("comparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        if (behaviorCriteria.getValue() != null) {
            MetricValue value = behaviorCriteria.getValue();
            jsonWriter.name("value");
            MetricValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        if (behaviorCriteria.getDurationSeconds() != null) {
            Integer durationSeconds = behaviorCriteria.getDurationSeconds();
            jsonWriter.name("durationSeconds");
            jsonWriter.value(durationSeconds);
        }
        jsonWriter.endObject();
    }

    private static BehaviorCriteriaJsonMarshaller instance;

    public static BehaviorCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BehaviorCriteriaJsonMarshaller();
        return instance;
    }
}
