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
 * JSON unmarshaller for POJO WriteSegmentRequest
 */
class WriteSegmentRequestJsonUnmarshaller implements
        Unmarshaller<WriteSegmentRequest, JsonUnmarshallerContext> {

    public WriteSegmentRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        WriteSegmentRequest writeSegmentRequest = new WriteSegmentRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Dimensions")) {
                writeSegmentRequest.setDimensions(SegmentDimensionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                writeSegmentRequest.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentGroups")) {
                writeSegmentRequest.setSegmentGroups(SegmentGroupListJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return writeSegmentRequest;
    }

    private static WriteSegmentRequestJsonUnmarshaller instance;

    public static WriteSegmentRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WriteSegmentRequestJsonUnmarshaller();
        return instance;
    }
}
