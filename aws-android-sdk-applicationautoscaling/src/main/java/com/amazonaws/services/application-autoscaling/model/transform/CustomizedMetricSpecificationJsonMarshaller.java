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
package com.amazonaws.services.application-autoscaling.model.transform;

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomizedMetricSpecification
 */
class CustomizedMetricSpecificationJsonMarshaller {

    public void marshall(CustomizedMetricSpecification customizedMetricSpecification, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customizedMetricSpecification.getMetricName() != null) {
            String metricName = customizedMetricSpecification.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (customizedMetricSpecification.getNamespace() != null) {
            String namespace = customizedMetricSpecification.getNamespace();
            jsonWriter.name("Namespace");
            jsonWriter.value(namespace);
        }
        if (customizedMetricSpecification.getDimensions() != null) {
            java.util.List<MetricDimension> dimensions = customizedMetricSpecification.getDimensions();
            jsonWriter.name("Dimensions");
            jsonWriter.beginArray();
            for (MetricDimension dimensionsItem : dimensions) {
                if (dimensionsItem != null) {
            MetricDimensionJsonMarshaller.getInstance().marshall(dimensionsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (customizedMetricSpecification.getStatistic() != null) {
            String statistic = customizedMetricSpecification.getStatistic();
            jsonWriter.name("Statistic");
            jsonWriter.value(statistic);
        }
        if (customizedMetricSpecification.getUnit() != null) {
            String unit = customizedMetricSpecification.getUnit();
            jsonWriter.name("Unit");
            jsonWriter.value(unit);
        }
        jsonWriter.endObject();
    }

    private static CustomizedMetricSpecificationJsonMarshaller instance;
    public static CustomizedMetricSpecificationJsonMarshaller getInstance() {
        if (instance == null) instance = new CustomizedMetricSpecificationJsonMarshaller();
        return instance;
    }
}
