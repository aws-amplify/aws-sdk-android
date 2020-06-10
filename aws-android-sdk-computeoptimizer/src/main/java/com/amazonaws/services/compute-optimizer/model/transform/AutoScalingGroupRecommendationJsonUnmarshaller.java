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
 * JSON unmarshaller for POJO AutoScalingGroupRecommendation
 */
class AutoScalingGroupRecommendationJsonUnmarshaller implements Unmarshaller<AutoScalingGroupRecommendation, JsonUnmarshallerContext> {

    public AutoScalingGroupRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutoScalingGroupRecommendation autoScalingGroupRecommendation = new AutoScalingGroupRecommendation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("accountId")) {
                autoScalingGroupRecommendation.setAccountId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("autoScalingGroupArn")) {
                autoScalingGroupRecommendation.setAutoScalingGroupArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("autoScalingGroupName")) {
                autoScalingGroupRecommendation.setAutoScalingGroupName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("finding")) {
                autoScalingGroupRecommendation.setFinding(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("utilizationMetrics")) {
                autoScalingGroupRecommendation.setUtilizationMetrics(new ListUnmarshaller<UtilizationMetric>(UtilizationMetricJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("lookBackPeriodInDays")) {
                autoScalingGroupRecommendation.setLookBackPeriodInDays(DoubleJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("currentConfiguration")) {
                autoScalingGroupRecommendation.setCurrentConfiguration(AutoScalingGroupConfigurationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("recommendationOptions")) {
                autoScalingGroupRecommendation.setRecommendationOptions(new ListUnmarshaller<AutoScalingGroupRecommendationOption>(AutoScalingGroupRecommendationOptionJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("lastRefreshTimestamp")) {
                autoScalingGroupRecommendation.setLastRefreshTimestamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return autoScalingGroupRecommendation;
    }

    private static AutoScalingGroupRecommendationJsonUnmarshaller instance;
    public static AutoScalingGroupRecommendationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new AutoScalingGroupRecommendationJsonUnmarshaller();
        return instance;
    }
}
