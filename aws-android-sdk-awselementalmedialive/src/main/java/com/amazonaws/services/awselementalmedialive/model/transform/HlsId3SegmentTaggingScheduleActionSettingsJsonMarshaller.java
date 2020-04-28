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
 * JSON marshaller for POJO HlsId3SegmentTaggingScheduleActionSettings
 */
class HlsId3SegmentTaggingScheduleActionSettingsJsonMarshaller {

    public void marshall(
            HlsId3SegmentTaggingScheduleActionSettings hlsId3SegmentTaggingScheduleActionSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsId3SegmentTaggingScheduleActionSettings.getTag() != null) {
            String tag = hlsId3SegmentTaggingScheduleActionSettings.getTag();
            jsonWriter.name("Tag");
            jsonWriter.value(tag);
        }
        jsonWriter.endObject();
    }

    private static HlsId3SegmentTaggingScheduleActionSettingsJsonMarshaller instance;

    public static HlsId3SegmentTaggingScheduleActionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsId3SegmentTaggingScheduleActionSettingsJsonMarshaller();
        return instance;
    }
}
