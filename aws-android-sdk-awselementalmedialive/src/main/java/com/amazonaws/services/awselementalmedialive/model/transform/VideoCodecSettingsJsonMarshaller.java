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
 * JSON marshaller for POJO VideoCodecSettings
 */
class VideoCodecSettingsJsonMarshaller {

    public void marshall(VideoCodecSettings videoCodecSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (videoCodecSettings.getFrameCaptureSettings() != null) {
            FrameCaptureSettings frameCaptureSettings = videoCodecSettings
                    .getFrameCaptureSettings();
            jsonWriter.name("FrameCaptureSettings");
            FrameCaptureSettingsJsonMarshaller.getInstance().marshall(frameCaptureSettings,
                    jsonWriter);
        }
        if (videoCodecSettings.getH264Settings() != null) {
            H264Settings h264Settings = videoCodecSettings.getH264Settings();
            jsonWriter.name("H264Settings");
            H264SettingsJsonMarshaller.getInstance().marshall(h264Settings, jsonWriter);
        }
        if (videoCodecSettings.getH265Settings() != null) {
            H265Settings h265Settings = videoCodecSettings.getH265Settings();
            jsonWriter.name("H265Settings");
            H265SettingsJsonMarshaller.getInstance().marshall(h265Settings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VideoCodecSettingsJsonMarshaller instance;

    public static VideoCodecSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VideoCodecSettingsJsonMarshaller();
        return instance;
    }
}
