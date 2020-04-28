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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VideoDescription
 */
class VideoDescriptionJsonMarshaller {

    public void marshall(VideoDescription videoDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (videoDescription.getCodecSettings() != null) {
            VideoCodecSettings codecSettings = videoDescription.getCodecSettings();
            jsonWriter.name("CodecSettings");
            VideoCodecSettingsJsonMarshaller.getInstance().marshall(codecSettings, jsonWriter);
        }
        if (videoDescription.getHeight() != null) {
            Integer height = videoDescription.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (videoDescription.getName() != null) {
            String name = videoDescription.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (videoDescription.getRespondToAfd() != null) {
            String respondToAfd = videoDescription.getRespondToAfd();
            jsonWriter.name("RespondToAfd");
            jsonWriter.value(respondToAfd);
        }
        if (videoDescription.getScalingBehavior() != null) {
            String scalingBehavior = videoDescription.getScalingBehavior();
            jsonWriter.name("ScalingBehavior");
            jsonWriter.value(scalingBehavior);
        }
        if (videoDescription.getSharpness() != null) {
            Integer sharpness = videoDescription.getSharpness();
            jsonWriter.name("Sharpness");
            jsonWriter.value(sharpness);
        }
        if (videoDescription.getWidth() != null) {
            Integer width = videoDescription.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        jsonWriter.endObject();
    }

    private static VideoDescriptionJsonMarshaller instance;

    public static VideoDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoDescriptionJsonMarshaller();
        return instance;
    }
}
