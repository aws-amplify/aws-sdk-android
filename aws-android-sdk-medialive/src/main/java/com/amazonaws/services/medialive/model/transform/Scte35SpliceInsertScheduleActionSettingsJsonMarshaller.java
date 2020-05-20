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
 * JSON marshaller for POJO Scte35SpliceInsertScheduleActionSettings
 */
class Scte35SpliceInsertScheduleActionSettingsJsonMarshaller {

    public void marshall(
            Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertScheduleActionSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scte35SpliceInsertScheduleActionSettings.getDuration() != null) {
            Long duration = scte35SpliceInsertScheduleActionSettings.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (scte35SpliceInsertScheduleActionSettings.getSpliceEventId() != null) {
            Long spliceEventId = scte35SpliceInsertScheduleActionSettings.getSpliceEventId();
            jsonWriter.name("SpliceEventId");
            jsonWriter.value(spliceEventId);
        }
        jsonWriter.endObject();
    }

    private static Scte35SpliceInsertScheduleActionSettingsJsonMarshaller instance;

    public static Scte35SpliceInsertScheduleActionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte35SpliceInsertScheduleActionSettingsJsonMarshaller();
        return instance;
    }
}
