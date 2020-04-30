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
 * JSON marshaller for POJO Preset
 */
class PresetJsonMarshaller {

    public void marshall(Preset preset, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (preset.getArn() != null) {
            String arn = preset.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (preset.getCategory() != null) {
            String category = preset.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (preset.getCreatedAt() != null) {
            java.util.Date createdAt = preset.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (preset.getDescription() != null) {
            String description = preset.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (preset.getLastUpdated() != null) {
            java.util.Date lastUpdated = preset.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (preset.getName() != null) {
            String name = preset.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (preset.getSettings() != null) {
            PresetSettings settings = preset.getSettings();
            jsonWriter.name("Settings");
            PresetSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        if (preset.getType() != null) {
            String type = preset.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static PresetJsonMarshaller instance;

    public static PresetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PresetJsonMarshaller();
        return instance;
    }
}
