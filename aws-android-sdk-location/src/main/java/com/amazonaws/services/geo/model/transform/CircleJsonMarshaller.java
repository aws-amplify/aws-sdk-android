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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Circle
 */
class CircleJsonMarshaller {

    public void marshall(Circle circle, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (circle.getCenter() != null) {
            java.util.List<Double> center = circle.getCenter();
            jsonWriter.name("Center");
            jsonWriter.beginArray();
            for (Double centerItem : center) {
                if (centerItem != null) {
                    jsonWriter.value(centerItem);
                }
            }
            jsonWriter.endArray();
        }
        if (circle.getRadius() != null) {
            Double radius = circle.getRadius();
            jsonWriter.name("Radius");
            jsonWriter.value(radius);
        }
        jsonWriter.endObject();
    }

    private static CircleJsonMarshaller instance;

    public static CircleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CircleJsonMarshaller();
        return instance;
    }
}
