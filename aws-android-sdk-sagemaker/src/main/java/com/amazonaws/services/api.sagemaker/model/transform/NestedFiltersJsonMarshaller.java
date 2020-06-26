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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NestedFilters
 */
class NestedFiltersJsonMarshaller {

    public void marshall(NestedFilters nestedFilters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (nestedFilters.getNestedPropertyName() != null) {
            String nestedPropertyName = nestedFilters.getNestedPropertyName();
            jsonWriter.name("NestedPropertyName");
            jsonWriter.value(nestedPropertyName);
        }
        if (nestedFilters.getFilters() != null) {
            java.util.List<Filter> filters = nestedFilters.getFilters();
            jsonWriter.name("Filters");
            jsonWriter.beginArray();
            for (Filter filtersItem : filters) {
                if (filtersItem != null) {
                    FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NestedFiltersJsonMarshaller instance;

    public static NestedFiltersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NestedFiltersJsonMarshaller();
        return instance;
    }
}
