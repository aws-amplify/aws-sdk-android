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
 * JSON marshaller for POJO CallAnalyticsJobDetails
 */
class CallAnalyticsJobDetailsJsonMarshaller {

    public void marshall(CallAnalyticsJobDetails callAnalyticsJobDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (callAnalyticsJobDetails.getSkipped() != null) {
            java.util.List<CallAnalyticsSkippedFeature> skipped = callAnalyticsJobDetails
                    .getSkipped();
            jsonWriter.name("Skipped");
            jsonWriter.beginArray();
            for (CallAnalyticsSkippedFeature skippedItem : skipped) {
                if (skippedItem != null) {
                    CallAnalyticsSkippedFeatureJsonMarshaller.getInstance().marshall(skippedItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CallAnalyticsJobDetailsJsonMarshaller instance;

    public static CallAnalyticsJobDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobDetailsJsonMarshaller();
        return instance;
    }
}
