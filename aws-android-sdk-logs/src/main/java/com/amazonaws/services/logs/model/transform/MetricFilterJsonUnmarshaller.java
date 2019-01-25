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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MetricFilter
 */
class MetricFilterJsonUnmarshaller implements Unmarshaller<MetricFilter, JsonUnmarshallerContext> {

    public MetricFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MetricFilter metricFilter = new MetricFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("filterName")) {
                metricFilter.setFilterName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("filterPattern")) {
                metricFilter.setFilterPattern(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricTransformations")) {
                metricFilter.setMetricTransformations(new ListUnmarshaller<MetricTransformation>(
                        MetricTransformationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("creationTime")) {
                metricFilter.setCreationTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("logGroupName")) {
                metricFilter.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return metricFilter;
    }

    private static MetricFilterJsonUnmarshaller instance;

    public static MetricFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterJsonUnmarshaller();
        return instance;
    }
}
