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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ScheduleActionSettings
 */
class ScheduleActionSettingsJsonUnmarshaller implements
        Unmarshaller<ScheduleActionSettings, JsonUnmarshallerContext> {

    public ScheduleActionSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScheduleActionSettings scheduleActionSettings = new ScheduleActionSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HlsId3SegmentTaggingSettings")) {
                scheduleActionSettings
                        .setHlsId3SegmentTaggingSettings(HlsId3SegmentTaggingScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HlsTimedMetadataSettings")) {
                scheduleActionSettings
                        .setHlsTimedMetadataSettings(HlsTimedMetadataScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("InputSwitchSettings")) {
                scheduleActionSettings
                        .setInputSwitchSettings(InputSwitchScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("PauseStateSettings")) {
                scheduleActionSettings
                        .setPauseStateSettings(PauseStateScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Scte35ReturnToNetworkSettings")) {
                scheduleActionSettings
                        .setScte35ReturnToNetworkSettings(Scte35ReturnToNetworkScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Scte35SpliceInsertSettings")) {
                scheduleActionSettings
                        .setScte35SpliceInsertSettings(Scte35SpliceInsertScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Scte35TimeSignalSettings")) {
                scheduleActionSettings
                        .setScte35TimeSignalSettings(Scte35TimeSignalScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("StaticImageActivateSettings")) {
                scheduleActionSettings
                        .setStaticImageActivateSettings(StaticImageActivateScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("StaticImageDeactivateSettings")) {
                scheduleActionSettings
                        .setStaticImageDeactivateSettings(StaticImageDeactivateScheduleActionSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduleActionSettings;
    }

    private static ScheduleActionSettingsJsonUnmarshaller instance;

    public static ScheduleActionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActionSettingsJsonUnmarshaller();
        return instance;
    }
}
