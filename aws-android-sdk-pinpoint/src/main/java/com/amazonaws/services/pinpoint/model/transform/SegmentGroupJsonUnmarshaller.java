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
 * JSON unmarshaller for POJO SegmentGroup
 */
class SegmentGroupJsonUnmarshaller implements Unmarshaller<SegmentGroup, JsonUnmarshallerContext> {

    public SegmentGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentGroup segmentGroup = new SegmentGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Dimensions")) {
                segmentGroup.setDimensions(new ListUnmarshaller<SegmentDimensions>(
                        SegmentDimensionsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceSegments")) {
                segmentGroup.setSourceSegments(new ListUnmarshaller<SegmentReference>(
                        SegmentReferenceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceType")) {
                segmentGroup.setSourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                segmentGroup.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentGroup;
    }

    private static SegmentGroupJsonUnmarshaller instance;

    public static SegmentGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentGroupJsonUnmarshaller();
        return instance;
    }
}
