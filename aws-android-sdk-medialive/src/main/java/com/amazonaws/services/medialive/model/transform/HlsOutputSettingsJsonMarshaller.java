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
 * JSON marshaller for POJO HlsOutputSettings
 */
class HlsOutputSettingsJsonMarshaller {

    public void marshall(HlsOutputSettings hlsOutputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsOutputSettings.getH265PackagingType() != null) {
            String h265PackagingType = hlsOutputSettings.getH265PackagingType();
            jsonWriter.name("H265PackagingType");
            jsonWriter.value(h265PackagingType);
        }
        if (hlsOutputSettings.getHlsSettings() != null) {
            HlsSettings hlsSettings = hlsOutputSettings.getHlsSettings();
            jsonWriter.name("HlsSettings");
            HlsSettingsJsonMarshaller.getInstance().marshall(hlsSettings, jsonWriter);
        }
        if (hlsOutputSettings.getNameModifier() != null) {
            String nameModifier = hlsOutputSettings.getNameModifier();
            jsonWriter.name("NameModifier");
            jsonWriter.value(nameModifier);
        }
        if (hlsOutputSettings.getSegmentModifier() != null) {
            String segmentModifier = hlsOutputSettings.getSegmentModifier();
            jsonWriter.name("SegmentModifier");
            jsonWriter.value(segmentModifier);
        }
        jsonWriter.endObject();
    }

    private static HlsOutputSettingsJsonMarshaller instance;

    public static HlsOutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsOutputSettingsJsonMarshaller();
        return instance;
    }
}
