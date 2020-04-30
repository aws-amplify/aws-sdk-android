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
 * JSON marshaller for POJO ContainerSettings
 */
class ContainerSettingsJsonMarshaller {

    public void marshall(ContainerSettings containerSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerSettings.getCmfcSettings() != null) {
            CmfcSettings cmfcSettings = containerSettings.getCmfcSettings();
            jsonWriter.name("CmfcSettings");
            CmfcSettingsJsonMarshaller.getInstance().marshall(cmfcSettings, jsonWriter);
        }
        if (containerSettings.getContainer() != null) {
            String container = containerSettings.getContainer();
            jsonWriter.name("Container");
            jsonWriter.value(container);
        }
        if (containerSettings.getF4vSettings() != null) {
            F4vSettings f4vSettings = containerSettings.getF4vSettings();
            jsonWriter.name("F4vSettings");
            F4vSettingsJsonMarshaller.getInstance().marshall(f4vSettings, jsonWriter);
        }
        if (containerSettings.getM2tsSettings() != null) {
            M2tsSettings m2tsSettings = containerSettings.getM2tsSettings();
            jsonWriter.name("M2tsSettings");
            M2tsSettingsJsonMarshaller.getInstance().marshall(m2tsSettings, jsonWriter);
        }
        if (containerSettings.getM3u8Settings() != null) {
            M3u8Settings m3u8Settings = containerSettings.getM3u8Settings();
            jsonWriter.name("M3u8Settings");
            M3u8SettingsJsonMarshaller.getInstance().marshall(m3u8Settings, jsonWriter);
        }
        if (containerSettings.getMovSettings() != null) {
            MovSettings movSettings = containerSettings.getMovSettings();
            jsonWriter.name("MovSettings");
            MovSettingsJsonMarshaller.getInstance().marshall(movSettings, jsonWriter);
        }
        if (containerSettings.getMp4Settings() != null) {
            Mp4Settings mp4Settings = containerSettings.getMp4Settings();
            jsonWriter.name("Mp4Settings");
            Mp4SettingsJsonMarshaller.getInstance().marshall(mp4Settings, jsonWriter);
        }
        if (containerSettings.getMpdSettings() != null) {
            MpdSettings mpdSettings = containerSettings.getMpdSettings();
            jsonWriter.name("MpdSettings");
            MpdSettingsJsonMarshaller.getInstance().marshall(mpdSettings, jsonWriter);
        }
        if (containerSettings.getMxfSettings() != null) {
            MxfSettings mxfSettings = containerSettings.getMxfSettings();
            jsonWriter.name("MxfSettings");
            MxfSettingsJsonMarshaller.getInstance().marshall(mxfSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ContainerSettingsJsonMarshaller instance;

    public static ContainerSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerSettingsJsonMarshaller();
        return instance;
    }
}
