/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdapterVersionEvaluationMetric
 */
class AdapterVersionEvaluationMetricJsonMarshaller {

    public void marshall(AdapterVersionEvaluationMetric adapterVersionEvaluationMetric,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (adapterVersionEvaluationMetric.getBaseline() != null) {
            EvaluationMetric baseline = adapterVersionEvaluationMetric.getBaseline();
            jsonWriter.name("Baseline");
            EvaluationMetricJsonMarshaller.getInstance().marshall(baseline, jsonWriter);
        }
        if (adapterVersionEvaluationMetric.getAdapterVersion() != null) {
            EvaluationMetric adapterVersion = adapterVersionEvaluationMetric.getAdapterVersion();
            jsonWriter.name("AdapterVersion");
            EvaluationMetricJsonMarshaller.getInstance().marshall(adapterVersion, jsonWriter);
        }
        if (adapterVersionEvaluationMetric.getFeatureType() != null) {
            String featureType = adapterVersionEvaluationMetric.getFeatureType();
            jsonWriter.name("FeatureType");
            jsonWriter.value(featureType);
        }
        jsonWriter.endObject();
    }

    private static AdapterVersionEvaluationMetricJsonMarshaller instance;

    public static AdapterVersionEvaluationMetricJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdapterVersionEvaluationMetricJsonMarshaller();
        return instance;
    }
}
