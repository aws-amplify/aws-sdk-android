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
 * JSON marshaller for POJO OutputSettings
 */
class OutputSettingsJsonMarshaller {

    public void marshall(OutputSettings outputSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputSettings.getArchiveOutputSettings() != null) {
            ArchiveOutputSettings archiveOutputSettings = outputSettings.getArchiveOutputSettings();
            jsonWriter.name("ArchiveOutputSettings");
            ArchiveOutputSettingsJsonMarshaller.getInstance().marshall(archiveOutputSettings,
                    jsonWriter);
        }
        if (outputSettings.getFrameCaptureOutputSettings() != null) {
            FrameCaptureOutputSettings frameCaptureOutputSettings = outputSettings
                    .getFrameCaptureOutputSettings();
            jsonWriter.name("FrameCaptureOutputSettings");
            FrameCaptureOutputSettingsJsonMarshaller.getInstance().marshall(
                    frameCaptureOutputSettings, jsonWriter);
        }
        if (outputSettings.getHlsOutputSettings() != null) {
            HlsOutputSettings hlsOutputSettings = outputSettings.getHlsOutputSettings();
            jsonWriter.name("HlsOutputSettings");
            HlsOutputSettingsJsonMarshaller.getInstance().marshall(hlsOutputSettings, jsonWriter);
        }
        if (outputSettings.getMediaPackageOutputSettings() != null) {
            MediaPackageOutputSettings mediaPackageOutputSettings = outputSettings
                    .getMediaPackageOutputSettings();
            jsonWriter.name("MediaPackageOutputSettings");
            MediaPackageOutputSettingsJsonMarshaller.getInstance().marshall(
                    mediaPackageOutputSettings, jsonWriter);
        }
        if (outputSettings.getMsSmoothOutputSettings() != null) {
            MsSmoothOutputSettings msSmoothOutputSettings = outputSettings
                    .getMsSmoothOutputSettings();
            jsonWriter.name("MsSmoothOutputSettings");
            MsSmoothOutputSettingsJsonMarshaller.getInstance().marshall(msSmoothOutputSettings,
                    jsonWriter);
        }
        if (outputSettings.getMultiplexOutputSettings() != null) {
            MultiplexOutputSettings multiplexOutputSettings = outputSettings
                    .getMultiplexOutputSettings();
            jsonWriter.name("MultiplexOutputSettings");
            MultiplexOutputSettingsJsonMarshaller.getInstance().marshall(multiplexOutputSettings,
                    jsonWriter);
        }
        if (outputSettings.getRtmpOutputSettings() != null) {
            RtmpOutputSettings rtmpOutputSettings = outputSettings.getRtmpOutputSettings();
            jsonWriter.name("RtmpOutputSettings");
            RtmpOutputSettingsJsonMarshaller.getInstance().marshall(rtmpOutputSettings, jsonWriter);
        }
        if (outputSettings.getUdpOutputSettings() != null) {
            UdpOutputSettings udpOutputSettings = outputSettings.getUdpOutputSettings();
            jsonWriter.name("UdpOutputSettings");
            UdpOutputSettingsJsonMarshaller.getInstance().marshall(udpOutputSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static OutputSettingsJsonMarshaller instance;

    public static OutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputSettingsJsonMarshaller();
        return instance;
    }
}
