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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AudioQualityMetricsInfo
 */
class AudioQualityMetricsInfoJsonMarshaller {

    public void marshall(AudioQualityMetricsInfo audioQualityMetricsInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (audioQualityMetricsInfo.getQualityScore() != null) {
            Float qualityScore = audioQualityMetricsInfo.getQualityScore();
            jsonWriter.name("QualityScore");
            jsonWriter.value(qualityScore);
        }
        if (audioQualityMetricsInfo.getPotentialQualityIssues() != null) {
            java.util.List<String> potentialQualityIssues = audioQualityMetricsInfo
                    .getPotentialQualityIssues();
            jsonWriter.name("PotentialQualityIssues");
            jsonWriter.beginArray();
            for (String potentialQualityIssuesItem : potentialQualityIssues) {
                if (potentialQualityIssuesItem != null) {
                    jsonWriter.value(potentialQualityIssuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AudioQualityMetricsInfoJsonMarshaller instance;

    public static AudioQualityMetricsInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioQualityMetricsInfoJsonMarshaller();
        return instance;
    }
}
