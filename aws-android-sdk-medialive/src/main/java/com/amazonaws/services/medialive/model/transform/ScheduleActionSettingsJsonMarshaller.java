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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduleActionSettings
 */
class ScheduleActionSettingsJsonMarshaller {

    public void marshall(ScheduleActionSettings scheduleActionSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scheduleActionSettings.getHlsId3SegmentTaggingSettings() != null) {
            HlsId3SegmentTaggingScheduleActionSettings hlsId3SegmentTaggingSettings = scheduleActionSettings
                    .getHlsId3SegmentTaggingSettings();
            jsonWriter.name("HlsId3SegmentTaggingSettings");
            HlsId3SegmentTaggingScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    hlsId3SegmentTaggingSettings, jsonWriter);
        }
        if (scheduleActionSettings.getHlsTimedMetadataSettings() != null) {
            HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings = scheduleActionSettings
                    .getHlsTimedMetadataSettings();
            jsonWriter.name("HlsTimedMetadataSettings");
            HlsTimedMetadataScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    hlsTimedMetadataSettings, jsonWriter);
        }
        if (scheduleActionSettings.getInputPrepareSettings() != null) {
            InputPrepareScheduleActionSettings inputPrepareSettings = scheduleActionSettings
                    .getInputPrepareSettings();
            jsonWriter.name("InputPrepareSettings");
            InputPrepareScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    inputPrepareSettings, jsonWriter);
        }
        if (scheduleActionSettings.getInputSwitchSettings() != null) {
            InputSwitchScheduleActionSettings inputSwitchSettings = scheduleActionSettings
                    .getInputSwitchSettings();
            jsonWriter.name("InputSwitchSettings");
            InputSwitchScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    inputSwitchSettings, jsonWriter);
        }
        if (scheduleActionSettings.getPauseStateSettings() != null) {
            PauseStateScheduleActionSettings pauseStateSettings = scheduleActionSettings
                    .getPauseStateSettings();
            jsonWriter.name("PauseStateSettings");
            PauseStateScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    pauseStateSettings, jsonWriter);
        }
        if (scheduleActionSettings.getScte35ReturnToNetworkSettings() != null) {
            Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings = scheduleActionSettings
                    .getScte35ReturnToNetworkSettings();
            jsonWriter.name("Scte35ReturnToNetworkSettings");
            Scte35ReturnToNetworkScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    scte35ReturnToNetworkSettings, jsonWriter);
        }
        if (scheduleActionSettings.getScte35SpliceInsertSettings() != null) {
            Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings = scheduleActionSettings
                    .getScte35SpliceInsertSettings();
            jsonWriter.name("Scte35SpliceInsertSettings");
            Scte35SpliceInsertScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    scte35SpliceInsertSettings, jsonWriter);
        }
        if (scheduleActionSettings.getScte35TimeSignalSettings() != null) {
            Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings = scheduleActionSettings
                    .getScte35TimeSignalSettings();
            jsonWriter.name("Scte35TimeSignalSettings");
            Scte35TimeSignalScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    scte35TimeSignalSettings, jsonWriter);
        }
        if (scheduleActionSettings.getStaticImageActivateSettings() != null) {
            StaticImageActivateScheduleActionSettings staticImageActivateSettings = scheduleActionSettings
                    .getStaticImageActivateSettings();
            jsonWriter.name("StaticImageActivateSettings");
            StaticImageActivateScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    staticImageActivateSettings, jsonWriter);
        }
        if (scheduleActionSettings.getStaticImageDeactivateSettings() != null) {
            StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings = scheduleActionSettings
                    .getStaticImageDeactivateSettings();
            jsonWriter.name("StaticImageDeactivateSettings");
            StaticImageDeactivateScheduleActionSettingsJsonMarshaller.getInstance().marshall(
                    staticImageDeactivateSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ScheduleActionSettingsJsonMarshaller instance;

    public static ScheduleActionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActionSettingsJsonMarshaller();
        return instance;
    }
}
