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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TrialComponentMetricSummary
 */
class TrialComponentMetricSummaryJsonUnmarshaller implements
        Unmarshaller<TrialComponentMetricSummary, JsonUnmarshallerContext> {

    public TrialComponentMetricSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrialComponentMetricSummary trialComponentMetricSummary = new TrialComponentMetricSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MetricName")) {
                trialComponentMetricSummary.setMetricName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceArn")) {
                trialComponentMetricSummary.setSourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeStamp")) {
                trialComponentMetricSummary.setTimeStamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Max")) {
                trialComponentMetricSummary.setMax(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Min")) {
                trialComponentMetricSummary.setMin(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Last")) {
                trialComponentMetricSummary.setLast(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Count")) {
                trialComponentMetricSummary.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Avg")) {
                trialComponentMetricSummary.setAvg(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StdDev")) {
                trialComponentMetricSummary.setStdDev(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trialComponentMetricSummary;
    }

    private static TrialComponentMetricSummaryJsonUnmarshaller instance;

    public static TrialComponentMetricSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentMetricSummaryJsonUnmarshaller();
        return instance;
    }
}
