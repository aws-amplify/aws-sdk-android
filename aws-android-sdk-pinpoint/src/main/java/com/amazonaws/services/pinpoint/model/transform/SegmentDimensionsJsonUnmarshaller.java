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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SegmentDimensions
 */
class SegmentDimensionsJsonUnmarshaller implements
        Unmarshaller<SegmentDimensions, JsonUnmarshallerContext> {

    public SegmentDimensions unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentDimensions segmentDimensions = new SegmentDimensions();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attributes")) {
                segmentDimensions.setAttributes(new MapUnmarshaller<AttributeDimension>(
                        AttributeDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Behavior")) {
                segmentDimensions.setBehavior(SegmentBehaviorsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Demographic")) {
                segmentDimensions.setDemographic(SegmentDemographicsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Location")) {
                segmentDimensions.setLocation(SegmentLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                segmentDimensions.setMetrics(new MapUnmarshaller<MetricDimension>(
                        MetricDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserAttributes")) {
                segmentDimensions.setUserAttributes(new MapUnmarshaller<AttributeDimension>(
                        AttributeDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentDimensions;
    }

    private static SegmentDimensionsJsonUnmarshaller instance;

    public static SegmentDimensionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDimensionsJsonUnmarshaller();
        return instance;
    }
}
