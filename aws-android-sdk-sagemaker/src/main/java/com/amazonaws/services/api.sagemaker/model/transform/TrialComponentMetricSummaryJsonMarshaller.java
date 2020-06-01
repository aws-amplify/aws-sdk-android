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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrialComponentMetricSummary
 */
class TrialComponentMetricSummaryJsonMarshaller {

    public void marshall(TrialComponentMetricSummary trialComponentMetricSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trialComponentMetricSummary.getMetricName() != null) {
            String metricName = trialComponentMetricSummary.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (trialComponentMetricSummary.getSourceArn() != null) {
            String sourceArn = trialComponentMetricSummary.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (trialComponentMetricSummary.getTimeStamp() != null) {
            java.util.Date timeStamp = trialComponentMetricSummary.getTimeStamp();
            jsonWriter.name("TimeStamp");
            jsonWriter.value(timeStamp);
        }
        if (trialComponentMetricSummary.getMax() != null) {
            Double max = trialComponentMetricSummary.getMax();
            jsonWriter.name("Max");
            jsonWriter.value(max);
        }
        if (trialComponentMetricSummary.getMin() != null) {
            Double min = trialComponentMetricSummary.getMin();
            jsonWriter.name("Min");
            jsonWriter.value(min);
        }
        if (trialComponentMetricSummary.getLast() != null) {
            Double last = trialComponentMetricSummary.getLast();
            jsonWriter.name("Last");
            jsonWriter.value(last);
        }
        if (trialComponentMetricSummary.getCount() != null) {
            Integer count = trialComponentMetricSummary.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (trialComponentMetricSummary.getAvg() != null) {
            Double avg = trialComponentMetricSummary.getAvg();
            jsonWriter.name("Avg");
            jsonWriter.value(avg);
        }
        if (trialComponentMetricSummary.getStdDev() != null) {
            Double stdDev = trialComponentMetricSummary.getStdDev();
            jsonWriter.name("StdDev");
            jsonWriter.value(stdDev);
        }
        jsonWriter.endObject();
    }

    private static TrialComponentMetricSummaryJsonMarshaller instance;

    public static TrialComponentMetricSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentMetricSummaryJsonMarshaller();
        return instance;
    }
}
