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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SegmentDimensions
 */
class SegmentDimensionsJsonMarshaller {

    public void marshall(SegmentDimensions segmentDimensions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (segmentDimensions.getAttributes() != null) {
            java.util.Map<String, AttributeDimension> attributes = segmentDimensions
                    .getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeDimension> attributesEntry : attributes
                    .entrySet()) {
                AttributeDimension attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    AttributeDimensionJsonMarshaller.getInstance().marshall(attributesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (segmentDimensions.getBehavior() != null) {
            SegmentBehaviors behavior = segmentDimensions.getBehavior();
            jsonWriter.name("Behavior");
            SegmentBehaviorsJsonMarshaller.getInstance().marshall(behavior, jsonWriter);
        }
        if (segmentDimensions.getDemographic() != null) {
            SegmentDemographics demographic = segmentDimensions.getDemographic();
            jsonWriter.name("Demographic");
            SegmentDemographicsJsonMarshaller.getInstance().marshall(demographic, jsonWriter);
        }
        if (segmentDimensions.getLocation() != null) {
            SegmentLocation location = segmentDimensions.getLocation();
            jsonWriter.name("Location");
            SegmentLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (segmentDimensions.getMetrics() != null) {
            java.util.Map<String, MetricDimension> metrics = segmentDimensions.getMetrics();
            jsonWriter.name("Metrics");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, MetricDimension> metricsEntry : metrics.entrySet()) {
                MetricDimension metricsValue = metricsEntry.getValue();
                if (metricsValue != null) {
                    jsonWriter.name(metricsEntry.getKey());
                    MetricDimensionJsonMarshaller.getInstance().marshall(metricsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (segmentDimensions.getUserAttributes() != null) {
            java.util.Map<String, AttributeDimension> userAttributes = segmentDimensions
                    .getUserAttributes();
            jsonWriter.name("UserAttributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeDimension> userAttributesEntry : userAttributes
                    .entrySet()) {
                AttributeDimension userAttributesValue = userAttributesEntry.getValue();
                if (userAttributesValue != null) {
                    jsonWriter.name(userAttributesEntry.getKey());
                    AttributeDimensionJsonMarshaller.getInstance().marshall(userAttributesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static SegmentDimensionsJsonMarshaller instance;

    public static SegmentDimensionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDimensionsJsonMarshaller();
        return instance;
    }
}
