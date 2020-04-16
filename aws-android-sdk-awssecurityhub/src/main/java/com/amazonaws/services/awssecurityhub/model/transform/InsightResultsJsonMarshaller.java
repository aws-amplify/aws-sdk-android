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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InsightResults
 */
class InsightResultsJsonMarshaller {

    public void marshall(InsightResults insightResults, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (insightResults.getInsightArn() != null) {
            String insightArn = insightResults.getInsightArn();
            jsonWriter.name("InsightArn");
            jsonWriter.value(insightArn);
        }
        if (insightResults.getGroupByAttribute() != null) {
            String groupByAttribute = insightResults.getGroupByAttribute();
            jsonWriter.name("GroupByAttribute");
            jsonWriter.value(groupByAttribute);
        }
        if (insightResults.getResultValues() != null) {
            java.util.List<InsightResultValue> resultValues = insightResults.getResultValues();
            jsonWriter.name("ResultValues");
            jsonWriter.beginArray();
            for (InsightResultValue resultValuesItem : resultValues) {
                if (resultValuesItem != null) {
                    InsightResultValueJsonMarshaller.getInstance().marshall(resultValuesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InsightResultsJsonMarshaller instance;

    public static InsightResultsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InsightResultsJsonMarshaller();
        return instance;
    }
}
