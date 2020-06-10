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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO InstanceRecommendationOption
 */
class InstanceRecommendationOptionJsonUnmarshaller implements Unmarshaller<InstanceRecommendationOption, JsonUnmarshallerContext> {

    public InstanceRecommendationOption unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceRecommendationOption instanceRecommendationOption = new InstanceRecommendationOption();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("instanceType")) {
                instanceRecommendationOption.setInstanceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("projectedUtilizationMetrics")) {
                instanceRecommendationOption.setProjectedUtilizationMetrics(new ListUnmarshaller<UtilizationMetric>(UtilizationMetricJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("performanceRisk")) {
                instanceRecommendationOption.setPerformanceRisk(DoubleJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("rank")) {
                instanceRecommendationOption.setRank(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceRecommendationOption;
    }

    private static InstanceRecommendationOptionJsonUnmarshaller instance;
    public static InstanceRecommendationOptionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceRecommendationOptionJsonUnmarshaller();
        return instance;
    }
}
