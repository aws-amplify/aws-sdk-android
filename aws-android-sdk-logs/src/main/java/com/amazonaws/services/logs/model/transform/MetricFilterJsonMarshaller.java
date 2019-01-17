/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricFilter
 */
class MetricFilterJsonMarshaller {

    public void marshall(MetricFilter metricFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricFilter.getFilterName() != null) {
            String filterName = metricFilter.getFilterName();
            jsonWriter.name("filterName");
            jsonWriter.value(filterName);
        }
        if (metricFilter.getFilterPattern() != null) {
            String filterPattern = metricFilter.getFilterPattern();
            jsonWriter.name("filterPattern");
            jsonWriter.value(filterPattern);
        }
        if (metricFilter.getMetricTransformations() != null) {
            java.util.List<MetricTransformation> metricTransformations = metricFilter
                    .getMetricTransformations();
            jsonWriter.name("metricTransformations");
            jsonWriter.beginArray();
            for (MetricTransformation metricTransformationsItem : metricTransformations) {
                if (metricTransformationsItem != null) {
                    MetricTransformationJsonMarshaller.getInstance().marshall(
                            metricTransformationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (metricFilter.getCreationTime() != null) {
            Long creationTime = metricFilter.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (metricFilter.getLogGroupName() != null) {
            String logGroupName = metricFilter.getLogGroupName();
            jsonWriter.name("logGroupName");
            jsonWriter.value(logGroupName);
        }
        jsonWriter.endObject();
    }

    private static MetricFilterJsonMarshaller instance;

    public static MetricFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterJsonMarshaller();
        return instance;
    }
}
