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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OpsAggregator
 */
class OpsAggregatorJsonMarshaller {

    public void marshall(OpsAggregator opsAggregator, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opsAggregator.getAggregatorType() != null) {
            String aggregatorType = opsAggregator.getAggregatorType();
            jsonWriter.name("AggregatorType");
            jsonWriter.value(aggregatorType);
        }
        if (opsAggregator.getTypeName() != null) {
            String typeName = opsAggregator.getTypeName();
            jsonWriter.name("TypeName");
            jsonWriter.value(typeName);
        }
        if (opsAggregator.getAttributeName() != null) {
            String attributeName = opsAggregator.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        if (opsAggregator.getValues() != null) {
            java.util.Map<String, String> values = opsAggregator.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> valuesEntry : values.entrySet()) {
                String valuesValue = valuesEntry.getValue();
                if (valuesValue != null) {
                    jsonWriter.name(valuesEntry.getKey());
            jsonWriter.value(valuesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (opsAggregator.getFilters() != null) {
            java.util.List<OpsFilter> filters = opsAggregator.getFilters();
            jsonWriter.name("Filters");
            jsonWriter.beginArray();
            for (OpsFilter filtersItem : filters) {
                if (filtersItem != null) {
            OpsFilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (opsAggregator.getAggregators() != null) {
            java.util.List<OpsAggregator> aggregators = opsAggregator.getAggregators();
            jsonWriter.name("Aggregators");
            jsonWriter.beginArray();
            for (OpsAggregator aggregatorsItem : aggregators) {
                if (aggregatorsItem != null) {
            OpsAggregatorJsonMarshaller.getInstance().marshall(aggregatorsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OpsAggregatorJsonMarshaller instance;
    public static OpsAggregatorJsonMarshaller getInstance() {
        if (instance == null) instance = new OpsAggregatorJsonMarshaller();
        return instance;
    }
}
