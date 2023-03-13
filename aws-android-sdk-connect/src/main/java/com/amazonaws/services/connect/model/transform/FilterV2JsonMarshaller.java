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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FilterV2
 */
class FilterV2JsonMarshaller {

    public void marshall(FilterV2 filterV2, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (filterV2.getFilterKey() != null) {
            String filterKey = filterV2.getFilterKey();
            jsonWriter.name("FilterKey");
            jsonWriter.value(filterKey);
        }
        if (filterV2.getFilterValues() != null) {
            java.util.List<String> filterValues = filterV2.getFilterValues();
            jsonWriter.name("FilterValues");
            jsonWriter.beginArray();
            for (String filterValuesItem : filterValues) {
                if (filterValuesItem != null) {
                    jsonWriter.value(filterValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FilterV2JsonMarshaller instance;

    public static FilterV2JsonMarshaller getInstance() {
        if (instance == null)
            instance = new FilterV2JsonMarshaller();
        return instance;
    }
}
