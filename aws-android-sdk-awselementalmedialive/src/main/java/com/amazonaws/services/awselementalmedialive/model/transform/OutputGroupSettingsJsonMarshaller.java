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
 * JSON marshaller for POJO OutputGroupSettings
 */
class OutputGroupSettingsJsonMarshaller {

    public void marshall(OutputGroupSettings outputGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outputGroupSettings.getArchiveGroupSettings() != null) {
            ArchiveGroupSettings archiveGroupSettings = outputGroupSettings
                    .getArchiveGroupSettings();
            jsonWriter.name("ArchiveGroupSettings");
            ArchiveGroupSettingsJsonMarshaller.getInstance().marshall(archiveGroupSettings,
                    jsonWriter);
        }
        if (outputGroupSettings.getFrameCaptureGroupSettings() != null) {
            FrameCaptureGroupSettings frameCaptureGroupSettings = outputGroupSettings
                    .getFrameCaptureGroupSettings();
            jsonWriter.name("FrameCaptureGroupSettings");
            FrameCaptureGroupSettingsJsonMarshaller.getInstance().marshall(
                    frameCaptureGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getHlsGroupSettings() != null) {
            HlsGroupSettings hlsGroupSettings = outputGroupSettings.getHlsGroupSettings();
            jsonWriter.name("HlsGroupSettings");
            HlsGroupSettingsJsonMarshaller.getInstance().marshall(hlsGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getMediaPackageGroupSettings() != null) {
            MediaPackageGroupSettings mediaPackageGroupSettings = outputGroupSettings
                    .getMediaPackageGroupSettings();
            jsonWriter.name("MediaPackageGroupSettings");
            MediaPackageGroupSettingsJsonMarshaller.getInstance().marshall(
                    mediaPackageGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getMsSmoothGroupSettings() != null) {
            MsSmoothGroupSettings msSmoothGroupSettings = outputGroupSettings
                    .getMsSmoothGroupSettings();
            jsonWriter.name("MsSmoothGroupSettings");
            MsSmoothGroupSettingsJsonMarshaller.getInstance().marshall(msSmoothGroupSettings,
                    jsonWriter);
        }
        if (outputGroupSettings.getMultiplexGroupSettings() != null) {
            MultiplexGroupSettings multiplexGroupSettings = outputGroupSettings
                    .getMultiplexGroupSettings();
            jsonWriter.name("MultiplexGroupSettings");
            MultiplexGroupSettingsJsonMarshaller.getInstance().marshall(multiplexGroupSettings,
                    jsonWriter);
        }
        if (outputGroupSettings.getRtmpGroupSettings() != null) {
            RtmpGroupSettings rtmpGroupSettings = outputGroupSettings.getRtmpGroupSettings();
            jsonWriter.name("RtmpGroupSettings");
            RtmpGroupSettingsJsonMarshaller.getInstance().marshall(rtmpGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getUdpGroupSettings() != null) {
            UdpGroupSettings udpGroupSettings = outputGroupSettings.getUdpGroupSettings();
            jsonWriter.name("UdpGroupSettings");
            UdpGroupSettingsJsonMarshaller.getInstance().marshall(udpGroupSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static OutputGroupSettingsJsonMarshaller instance;

    public static OutputGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputGroupSettingsJsonMarshaller();
        return instance;
    }
}
