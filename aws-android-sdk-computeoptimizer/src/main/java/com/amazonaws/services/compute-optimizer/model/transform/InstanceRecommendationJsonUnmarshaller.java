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
 * JSON unmarshaller for POJO InstanceRecommendation
 */
class InstanceRecommendationJsonUnmarshaller implements Unmarshaller<InstanceRecommendation, JsonUnmarshallerContext> {

    public InstanceRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceRecommendation instanceRecommendation = new InstanceRecommendation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("instanceArn")) {
                instanceRecommendation.setInstanceArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("accountId")) {
                instanceRecommendation.setAccountId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("instanceName")) {
                instanceRecommendation.setInstanceName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("currentInstanceType")) {
                instanceRecommendation.setCurrentInstanceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("finding")) {
                instanceRecommendation.setFinding(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("utilizationMetrics")) {
                instanceRecommendation.setUtilizationMetrics(new ListUnmarshaller<UtilizationMetric>(UtilizationMetricJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("lookBackPeriodInDays")) {
                instanceRecommendation.setLookBackPeriodInDays(DoubleJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("recommendationOptions")) {
                instanceRecommendation.setRecommendationOptions(new ListUnmarshaller<InstanceRecommendationOption>(InstanceRecommendationOptionJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("recommendationSources")) {
                instanceRecommendation.setRecommendationSources(new ListUnmarshaller<RecommendationSource>(RecommendationSourceJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("lastRefreshTimestamp")) {
                instanceRecommendation.setLastRefreshTimestamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceRecommendation;
    }

    private static InstanceRecommendationJsonUnmarshaller instance;
    public static InstanceRecommendationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceRecommendationJsonUnmarshaller();
        return instance;
    }
}
