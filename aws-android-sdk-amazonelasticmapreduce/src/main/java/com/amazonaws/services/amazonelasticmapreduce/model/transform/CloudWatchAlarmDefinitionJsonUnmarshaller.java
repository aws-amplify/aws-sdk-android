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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CloudWatchAlarmDefinition
 */
class CloudWatchAlarmDefinitionJsonUnmarshaller implements
        Unmarshaller<CloudWatchAlarmDefinition, JsonUnmarshallerContext> {

    public CloudWatchAlarmDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CloudWatchAlarmDefinition cloudWatchAlarmDefinition = new CloudWatchAlarmDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComparisonOperator")) {
                cloudWatchAlarmDefinition.setComparisonOperator(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationPeriods")) {
                cloudWatchAlarmDefinition.setEvaluationPeriods(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MetricName")) {
                cloudWatchAlarmDefinition.setMetricName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Namespace")) {
                cloudWatchAlarmDefinition.setNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Period")) {
                cloudWatchAlarmDefinition.setPeriod(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Statistic")) {
                cloudWatchAlarmDefinition.setStatistic(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Threshold")) {
                cloudWatchAlarmDefinition.setThreshold(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Unit")) {
                cloudWatchAlarmDefinition.setUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Dimensions")) {
                cloudWatchAlarmDefinition.setDimensions(new ListUnmarshaller<MetricDimension>(
                        MetricDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cloudWatchAlarmDefinition;
    }

    private static CloudWatchAlarmDefinitionJsonUnmarshaller instance;

    public static CloudWatchAlarmDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchAlarmDefinitionJsonUnmarshaller();
        return instance;
    }
}
