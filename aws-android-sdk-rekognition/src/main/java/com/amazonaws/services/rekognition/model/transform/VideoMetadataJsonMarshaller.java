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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VideoMetadata
 */
class VideoMetadataJsonMarshaller {

    public void marshall(VideoMetadata videoMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (videoMetadata.getCodec() != null) {
            String codec = videoMetadata.getCodec();
            jsonWriter.name("Codec");
            jsonWriter.value(codec);
        }
        if (videoMetadata.getDurationMillis() != null) {
            Long durationMillis = videoMetadata.getDurationMillis();
            jsonWriter.name("DurationMillis");
            jsonWriter.value(durationMillis);
        }
        if (videoMetadata.getFormat() != null) {
            String format = videoMetadata.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (videoMetadata.getFrameRate() != null) {
            Float frameRate = videoMetadata.getFrameRate();
            jsonWriter.name("FrameRate");
            jsonWriter.value(frameRate);
        }
        if (videoMetadata.getFrameHeight() != null) {
            Long frameHeight = videoMetadata.getFrameHeight();
            jsonWriter.name("FrameHeight");
            jsonWriter.value(frameHeight);
        }
        if (videoMetadata.getFrameWidth() != null) {
            Long frameWidth = videoMetadata.getFrameWidth();
            jsonWriter.name("FrameWidth");
            jsonWriter.value(frameWidth);
        }
        if (videoMetadata.getRotation() != null) {
            Integer rotation = videoMetadata.getRotation();
            jsonWriter.name("Rotation");
            jsonWriter.value(rotation);
        }
        jsonWriter.endObject();
    }

    private static VideoMetadataJsonMarshaller instance;

    public static VideoMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoMetadataJsonMarshaller();
        return instance;
    }
}
