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
 * JSON marshaller for POJO DescribeActivationsFilter
 */
class DescribeActivationsFilterJsonMarshaller {

    public void marshall(DescribeActivationsFilter describeActivationsFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (describeActivationsFilter.getFilterKey() != null) {
            String filterKey = describeActivationsFilter.getFilterKey();
            jsonWriter.name("FilterKey");
            jsonWriter.value(filterKey);
        }
        if (describeActivationsFilter.getFilterValues() != null) {
            java.util.List<String> filterValues = describeActivationsFilter.getFilterValues();
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

    private static DescribeActivationsFilterJsonMarshaller instance;
    public static DescribeActivationsFilterJsonMarshaller getInstance() {
        if (instance == null) instance = new DescribeActivationsFilterJsonMarshaller();
        return instance;
    }
}
