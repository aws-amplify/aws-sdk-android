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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Relevance
 */
class RelevanceJsonMarshaller {

    public void marshall(Relevance relevance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relevance.getFreshness() != null) {
            Boolean freshness = relevance.getFreshness();
            jsonWriter.name("Freshness");
            jsonWriter.value(freshness);
        }
        if (relevance.getImportance() != null) {
            Integer importance = relevance.getImportance();
            jsonWriter.name("Importance");
            jsonWriter.value(importance);
        }
        if (relevance.getDuration() != null) {
            String duration = relevance.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (relevance.getRankOrder() != null) {
            String rankOrder = relevance.getRankOrder();
            jsonWriter.name("RankOrder");
            jsonWriter.value(rankOrder);
        }
        if (relevance.getValueImportanceMap() != null) {
            java.util.Map<String, Integer> valueImportanceMap = relevance.getValueImportanceMap();
            jsonWriter.name("ValueImportanceMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> valueImportanceMapEntry : valueImportanceMap
                    .entrySet()) {
                Integer valueImportanceMapValue = valueImportanceMapEntry.getValue();
                if (valueImportanceMapValue != null) {
                    jsonWriter.name(valueImportanceMapEntry.getKey());
                    jsonWriter.value(valueImportanceMapValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static RelevanceJsonMarshaller instance;

    public static RelevanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelevanceJsonMarshaller();
        return instance;
    }
}
