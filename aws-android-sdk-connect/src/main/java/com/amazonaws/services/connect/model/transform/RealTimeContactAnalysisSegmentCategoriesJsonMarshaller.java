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
 * JSON marshaller for POJO RealTimeContactAnalysisSegmentCategories
 */
class RealTimeContactAnalysisSegmentCategoriesJsonMarshaller {

    public void marshall(
            RealTimeContactAnalysisSegmentCategories realTimeContactAnalysisSegmentCategories,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisSegmentCategories.getMatchedDetails() != null) {
            java.util.Map<String, RealTimeContactAnalysisCategoryDetails> matchedDetails = realTimeContactAnalysisSegmentCategories
                    .getMatchedDetails();
            jsonWriter.name("MatchedDetails");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, RealTimeContactAnalysisCategoryDetails> matchedDetailsEntry : matchedDetails
                    .entrySet()) {
                RealTimeContactAnalysisCategoryDetails matchedDetailsValue = matchedDetailsEntry
                        .getValue();
                if (matchedDetailsValue != null) {
                    jsonWriter.name(matchedDetailsEntry.getKey());
                    RealTimeContactAnalysisCategoryDetailsJsonMarshaller.getInstance().marshall(
                            matchedDetailsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisSegmentCategoriesJsonMarshaller instance;

    public static RealTimeContactAnalysisSegmentCategoriesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisSegmentCategoriesJsonMarshaller();
        return instance;
    }
}
