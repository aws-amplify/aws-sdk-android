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
 * JSON marshaller for POJO SegmentGroup
 */
class SegmentGroupJsonMarshaller {

    public void marshall(SegmentGroup segmentGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (segmentGroup.getDimensions() != null) {
            java.util.List<SegmentDimensions> dimensions = segmentGroup.getDimensions();
            jsonWriter.name("Dimensions");
            jsonWriter.beginArray();
            for (SegmentDimensions dimensionsItem : dimensions) {
                if (dimensionsItem != null) {
                    SegmentDimensionsJsonMarshaller.getInstance().marshall(dimensionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (segmentGroup.getSourceSegments() != null) {
            java.util.List<SegmentReference> sourceSegments = segmentGroup.getSourceSegments();
            jsonWriter.name("SourceSegments");
            jsonWriter.beginArray();
            for (SegmentReference sourceSegmentsItem : sourceSegments) {
                if (sourceSegmentsItem != null) {
                    SegmentReferenceJsonMarshaller.getInstance().marshall(sourceSegmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (segmentGroup.getSourceType() != null) {
            String sourceType = segmentGroup.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (segmentGroup.getType() != null) {
            String type = segmentGroup.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static SegmentGroupJsonMarshaller instance;

    public static SegmentGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentGroupJsonMarshaller();
        return instance;
    }
}
