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
 * JSON marshaller for POJO Scte35TimeSignalScheduleActionSettings
 */
class Scte35TimeSignalScheduleActionSettingsJsonMarshaller {

    public void marshall(
            Scte35TimeSignalScheduleActionSettings scte35TimeSignalScheduleActionSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scte35TimeSignalScheduleActionSettings.getScte35Descriptors() != null) {
            java.util.List<Scte35Descriptor> scte35Descriptors = scte35TimeSignalScheduleActionSettings
                    .getScte35Descriptors();
            jsonWriter.name("Scte35Descriptors");
            jsonWriter.beginArray();
            for (Scte35Descriptor scte35DescriptorsItem : scte35Descriptors) {
                if (scte35DescriptorsItem != null) {
                    Scte35DescriptorJsonMarshaller.getInstance().marshall(scte35DescriptorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static Scte35TimeSignalScheduleActionSettingsJsonMarshaller instance;

    public static Scte35TimeSignalScheduleActionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte35TimeSignalScheduleActionSettingsJsonMarshaller();
        return instance;
    }
}
