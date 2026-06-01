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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CallAnalyticsSkippedFeature
 */
class CallAnalyticsSkippedFeatureJsonMarshaller {

    public void marshall(CallAnalyticsSkippedFeature callAnalyticsSkippedFeature,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (callAnalyticsSkippedFeature.getFeature() != null) {
            String feature = callAnalyticsSkippedFeature.getFeature();
            jsonWriter.name("Feature");
            jsonWriter.value(feature);
        }
        if (callAnalyticsSkippedFeature.getReasonCode() != null) {
            String reasonCode = callAnalyticsSkippedFeature.getReasonCode();
            jsonWriter.name("ReasonCode");
            jsonWriter.value(reasonCode);
        }
        if (callAnalyticsSkippedFeature.getMessage() != null) {
            String message = callAnalyticsSkippedFeature.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static CallAnalyticsSkippedFeatureJsonMarshaller instance;

    public static CallAnalyticsSkippedFeatureJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsSkippedFeatureJsonMarshaller();
        return instance;
    }
}
