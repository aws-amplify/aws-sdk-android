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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PropertyType
 */
class PropertyTypeJsonMarshaller {

    public void marshall(PropertyType propertyType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (propertyType.getAttribute() != null) {
            Attribute attribute = propertyType.getAttribute();
            jsonWriter.name("attribute");
            AttributeJsonMarshaller.getInstance().marshall(attribute, jsonWriter);
        }
        if (propertyType.getMeasurement() != null) {
            Measurement measurement = propertyType.getMeasurement();
            jsonWriter.name("measurement");
            MeasurementJsonMarshaller.getInstance().marshall(measurement, jsonWriter);
        }
        if (propertyType.getTransform() != null) {
            Transform transform = propertyType.getTransform();
            jsonWriter.name("transform");
            TransformJsonMarshaller.getInstance().marshall(transform, jsonWriter);
        }
        if (propertyType.getMetric() != null) {
            Metric metric = propertyType.getMetric();
            jsonWriter.name("metric");
            MetricJsonMarshaller.getInstance().marshall(metric, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PropertyTypeJsonMarshaller instance;

    public static PropertyTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PropertyTypeJsonMarshaller();
        return instance;
    }
}
