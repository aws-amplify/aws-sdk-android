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
 * JSON marshaller for POJO DashIsoEncryptionSettings
 */
class DashIsoEncryptionSettingsJsonMarshaller {

    public void marshall(DashIsoEncryptionSettings dashIsoEncryptionSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dashIsoEncryptionSettings.getPlaybackDeviceCompatibility() != null) {
            String playbackDeviceCompatibility = dashIsoEncryptionSettings
                    .getPlaybackDeviceCompatibility();
            jsonWriter.name("PlaybackDeviceCompatibility");
            jsonWriter.value(playbackDeviceCompatibility);
        }
        if (dashIsoEncryptionSettings.getSpekeKeyProvider() != null) {
            SpekeKeyProvider spekeKeyProvider = dashIsoEncryptionSettings.getSpekeKeyProvider();
            jsonWriter.name("SpekeKeyProvider");
            SpekeKeyProviderJsonMarshaller.getInstance().marshall(spekeKeyProvider, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DashIsoEncryptionSettingsJsonMarshaller instance;

    public static DashIsoEncryptionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashIsoEncryptionSettingsJsonMarshaller();
        return instance;
    }
}
