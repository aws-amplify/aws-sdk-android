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
 * JSON marshaller for POJO ScheduleActionStartSettings
 */
class ScheduleActionStartSettingsJsonMarshaller {

    public void marshall(ScheduleActionStartSettings scheduleActionStartSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduleActionStartSettings.getFixedModeScheduleActionStartSettings() != null) {
            FixedModeScheduleActionStartSettings fixedModeScheduleActionStartSettings = scheduleActionStartSettings
                    .getFixedModeScheduleActionStartSettings();
            jsonWriter.name("FixedModeScheduleActionStartSettings");
            FixedModeScheduleActionStartSettingsJsonMarshaller.getInstance().marshall(
                    fixedModeScheduleActionStartSettings, jsonWriter);
        }
        if (scheduleActionStartSettings.getFollowModeScheduleActionStartSettings() != null) {
            FollowModeScheduleActionStartSettings followModeScheduleActionStartSettings = scheduleActionStartSettings
                    .getFollowModeScheduleActionStartSettings();
            jsonWriter.name("FollowModeScheduleActionStartSettings");
            FollowModeScheduleActionStartSettingsJsonMarshaller.getInstance().marshall(
                    followModeScheduleActionStartSettings, jsonWriter);
        }
        if (scheduleActionStartSettings.getImmediateModeScheduleActionStartSettings() != null) {
            ImmediateModeScheduleActionStartSettings immediateModeScheduleActionStartSettings = scheduleActionStartSettings
                    .getImmediateModeScheduleActionStartSettings();
            jsonWriter.name("ImmediateModeScheduleActionStartSettings");
            ImmediateModeScheduleActionStartSettingsJsonMarshaller.getInstance().marshall(
                    immediateModeScheduleActionStartSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ScheduleActionStartSettingsJsonMarshaller instance;

    public static ScheduleActionStartSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActionStartSettingsJsonMarshaller();
        return instance;
    }
}
