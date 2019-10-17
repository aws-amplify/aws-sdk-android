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
 * JSON marshaller for POJO WriteSegmentRequest
 */
class WriteSegmentRequestJsonMarshaller {

    public void marshall(WriteSegmentRequest writeSegmentRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (writeSegmentRequest.getDimensions() != null) {
            SegmentDimensions dimensions = writeSegmentRequest.getDimensions();
            jsonWriter.name("Dimensions");
            SegmentDimensionsJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (writeSegmentRequest.getName() != null) {
            String name = writeSegmentRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (writeSegmentRequest.getSegmentGroups() != null) {
            SegmentGroupList segmentGroups = writeSegmentRequest.getSegmentGroups();
            jsonWriter.name("SegmentGroups");
            SegmentGroupListJsonMarshaller.getInstance().marshall(segmentGroups, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WriteSegmentRequestJsonMarshaller instance;

    public static WriteSegmentRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteSegmentRequestJsonMarshaller();
        return instance;
    }
}
