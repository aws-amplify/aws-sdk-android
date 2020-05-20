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
 * JSON marshaller for POJO OutputDestination
 */
class OutputDestinationJsonMarshaller {

    public void marshall(OutputDestination outputDestination, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outputDestination.getId() != null) {
            String id = outputDestination.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (outputDestination.getMediaPackageSettings() != null) {
            java.util.List<MediaPackageOutputDestinationSettings> mediaPackageSettings = outputDestination
                    .getMediaPackageSettings();
            jsonWriter.name("MediaPackageSettings");
            jsonWriter.beginArray();
            for (MediaPackageOutputDestinationSettings mediaPackageSettingsItem : mediaPackageSettings) {
                if (mediaPackageSettingsItem != null) {
                    MediaPackageOutputDestinationSettingsJsonMarshaller.getInstance().marshall(
                            mediaPackageSettingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (outputDestination.getMultiplexSettings() != null) {
            MultiplexProgramChannelDestinationSettings multiplexSettings = outputDestination
                    .getMultiplexSettings();
            jsonWriter.name("MultiplexSettings");
            MultiplexProgramChannelDestinationSettingsJsonMarshaller.getInstance().marshall(
                    multiplexSettings, jsonWriter);
        }
        if (outputDestination.getSettings() != null) {
            java.util.List<OutputDestinationSettings> settings = outputDestination.getSettings();
            jsonWriter.name("Settings");
            jsonWriter.beginArray();
            for (OutputDestinationSettings settingsItem : settings) {
                if (settingsItem != null) {
                    OutputDestinationSettingsJsonMarshaller.getInstance().marshall(settingsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OutputDestinationJsonMarshaller instance;

    public static OutputDestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputDestinationJsonMarshaller();
        return instance;
    }
}
