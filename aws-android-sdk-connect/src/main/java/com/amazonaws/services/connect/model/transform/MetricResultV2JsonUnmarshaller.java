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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MetricResultV2
 */
class MetricResultV2JsonUnmarshaller implements
        Unmarshaller<MetricResultV2, JsonUnmarshallerContext> {

    public MetricResultV2 unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MetricResultV2 metricResultV2 = new MetricResultV2();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Dimensions")) {
                metricResultV2.setDimensions(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Collections")) {
                metricResultV2.setCollections(new ListUnmarshaller<MetricDataV2>(
                        MetricDataV2JsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return metricResultV2;
    }

    private static MetricResultV2JsonUnmarshaller instance;

    public static MetricResultV2JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricResultV2JsonUnmarshaller();
        return instance;
    }
}
