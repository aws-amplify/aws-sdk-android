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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VideoMetadata
 */
class VideoMetadataJsonUnmarshaller implements Unmarshaller<VideoMetadata, JsonUnmarshallerContext> {

    public VideoMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VideoMetadata videoMetadata = new VideoMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Codec")) {
                videoMetadata.setCodec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DurationMillis")) {
                videoMetadata.setDurationMillis(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Format")) {
                videoMetadata.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FrameRate")) {
                videoMetadata.setFrameRate(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FrameHeight")) {
                videoMetadata.setFrameHeight(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FrameWidth")) {
                videoMetadata.setFrameWidth(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Rotation")) {
                videoMetadata.setRotation(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return videoMetadata;
    }

    private static VideoMetadataJsonUnmarshaller instance;

    public static VideoMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoMetadataJsonUnmarshaller();
        return instance;
    }
}
