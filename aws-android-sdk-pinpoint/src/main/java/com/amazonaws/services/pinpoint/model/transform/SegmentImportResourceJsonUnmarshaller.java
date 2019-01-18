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
 * JSON unmarshaller for POJO SegmentImportResource
 */
class SegmentImportResourceJsonUnmarshaller implements
        Unmarshaller<SegmentImportResource, JsonUnmarshallerContext> {

    public SegmentImportResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentImportResource segmentImportResource = new SegmentImportResource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChannelCounts")) {
                segmentImportResource.setChannelCounts(new MapUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ExternalId")) {
                segmentImportResource.setExternalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Format")) {
                segmentImportResource.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                segmentImportResource.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Url")) {
                segmentImportResource.setS3Url(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Size")) {
                segmentImportResource.setSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentImportResource;
    }

    private static SegmentImportResourceJsonUnmarshaller instance;

    public static SegmentImportResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentImportResourceJsonUnmarshaller();
        return instance;
    }
}
