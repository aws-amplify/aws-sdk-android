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
 * JSON marshaller for POJO H265ColorSpaceSettings
 */
class H265ColorSpaceSettingsJsonMarshaller {

    public void marshall(H265ColorSpaceSettings h265ColorSpaceSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (h265ColorSpaceSettings.getColorSpacePassthroughSettings() != null) {
            ColorSpacePassthroughSettings colorSpacePassthroughSettings = h265ColorSpaceSettings
                    .getColorSpacePassthroughSettings();
            jsonWriter.name("ColorSpacePassthroughSettings");
            ColorSpacePassthroughSettingsJsonMarshaller.getInstance().marshall(
                    colorSpacePassthroughSettings, jsonWriter);
        }
        if (h265ColorSpaceSettings.getHdr10Settings() != null) {
            Hdr10Settings hdr10Settings = h265ColorSpaceSettings.getHdr10Settings();
            jsonWriter.name("Hdr10Settings");
            Hdr10SettingsJsonMarshaller.getInstance().marshall(hdr10Settings, jsonWriter);
        }
        if (h265ColorSpaceSettings.getRec601Settings() != null) {
            Rec601Settings rec601Settings = h265ColorSpaceSettings.getRec601Settings();
            jsonWriter.name("Rec601Settings");
            Rec601SettingsJsonMarshaller.getInstance().marshall(rec601Settings, jsonWriter);
        }
        if (h265ColorSpaceSettings.getRec709Settings() != null) {
            Rec709Settings rec709Settings = h265ColorSpaceSettings.getRec709Settings();
            jsonWriter.name("Rec709Settings");
            Rec709SettingsJsonMarshaller.getInstance().marshall(rec709Settings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static H265ColorSpaceSettingsJsonMarshaller instance;

    public static H265ColorSpaceSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new H265ColorSpaceSettingsJsonMarshaller();
        return instance;
    }
}
