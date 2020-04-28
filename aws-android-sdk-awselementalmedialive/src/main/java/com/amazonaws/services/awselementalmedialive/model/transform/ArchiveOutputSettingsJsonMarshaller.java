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
 * JSON marshaller for POJO ArchiveOutputSettings
 */
class ArchiveOutputSettingsJsonMarshaller {

    public void marshall(ArchiveOutputSettings archiveOutputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (archiveOutputSettings.getContainerSettings() != null) {
            ArchiveContainerSettings containerSettings = archiveOutputSettings
                    .getContainerSettings();
            jsonWriter.name("ContainerSettings");
            ArchiveContainerSettingsJsonMarshaller.getInstance().marshall(containerSettings,
                    jsonWriter);
        }
        if (archiveOutputSettings.getExtension() != null) {
            String extension = archiveOutputSettings.getExtension();
            jsonWriter.name("Extension");
            jsonWriter.value(extension);
        }
        if (archiveOutputSettings.getNameModifier() != null) {
            String nameModifier = archiveOutputSettings.getNameModifier();
            jsonWriter.name("NameModifier");
            jsonWriter.value(nameModifier);
        }
        jsonWriter.endObject();
    }

    private static ArchiveOutputSettingsJsonMarshaller instance;

    public static ArchiveOutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ArchiveOutputSettingsJsonMarshaller();
        return instance;
    }
}
