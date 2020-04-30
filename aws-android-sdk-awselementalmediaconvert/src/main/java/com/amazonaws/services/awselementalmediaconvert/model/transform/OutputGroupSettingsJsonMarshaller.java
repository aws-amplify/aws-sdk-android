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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputGroupSettings
 */
class OutputGroupSettingsJsonMarshaller {

    public void marshall(OutputGroupSettings outputGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outputGroupSettings.getCmafGroupSettings() != null) {
            CmafGroupSettings cmafGroupSettings = outputGroupSettings.getCmafGroupSettings();
            jsonWriter.name("CmafGroupSettings");
            CmafGroupSettingsJsonMarshaller.getInstance().marshall(cmafGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getDashIsoGroupSettings() != null) {
            DashIsoGroupSettings dashIsoGroupSettings = outputGroupSettings
                    .getDashIsoGroupSettings();
            jsonWriter.name("DashIsoGroupSettings");
            DashIsoGroupSettingsJsonMarshaller.getInstance().marshall(dashIsoGroupSettings,
                    jsonWriter);
        }
        if (outputGroupSettings.getFileGroupSettings() != null) {
            FileGroupSettings fileGroupSettings = outputGroupSettings.getFileGroupSettings();
            jsonWriter.name("FileGroupSettings");
            FileGroupSettingsJsonMarshaller.getInstance().marshall(fileGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getHlsGroupSettings() != null) {
            HlsGroupSettings hlsGroupSettings = outputGroupSettings.getHlsGroupSettings();
            jsonWriter.name("HlsGroupSettings");
            HlsGroupSettingsJsonMarshaller.getInstance().marshall(hlsGroupSettings, jsonWriter);
        }
        if (outputGroupSettings.getMsSmoothGroupSettings() != null) {
            MsSmoothGroupSettings msSmoothGroupSettings = outputGroupSettings
                    .getMsSmoothGroupSettings();
            jsonWriter.name("MsSmoothGroupSettings");
            MsSmoothGroupSettingsJsonMarshaller.getInstance().marshall(msSmoothGroupSettings,
                    jsonWriter);
        }
        if (outputGroupSettings.getType() != null) {
            String type = outputGroupSettings.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
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
