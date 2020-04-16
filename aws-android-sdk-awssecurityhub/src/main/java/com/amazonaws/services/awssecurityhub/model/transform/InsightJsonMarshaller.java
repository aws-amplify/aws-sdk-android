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
 * JSON marshaller for POJO Insight
 */
class InsightJsonMarshaller {

    public void marshall(Insight insight, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (insight.getInsightArn() != null) {
            String insightArn = insight.getInsightArn();
            jsonWriter.name("InsightArn");
            jsonWriter.value(insightArn);
        }
        if (insight.getName() != null) {
            String name = insight.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (insight.getFilters() != null) {
            AwsSecurityFindingFilters filters = insight.getFilters();
            jsonWriter.name("Filters");
            AwsSecurityFindingFiltersJsonMarshaller.getInstance().marshall(filters, jsonWriter);
        }
        if (insight.getGroupByAttribute() != null) {
            String groupByAttribute = insight.getGroupByAttribute();
            jsonWriter.name("GroupByAttribute");
            jsonWriter.value(groupByAttribute);
        }
        jsonWriter.endObject();
    }

    private static InsightJsonMarshaller instance;

    public static InsightJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InsightJsonMarshaller();
        return instance;
    }
}
