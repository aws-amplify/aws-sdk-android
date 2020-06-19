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
 * JSON marshaller for POJO MsSmoothOutputSettings
 */
class MsSmoothOutputSettingsJsonMarshaller {

    public void marshall(MsSmoothOutputSettings msSmoothOutputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (msSmoothOutputSettings.getH265PackagingType() != null) {
            String h265PackagingType = msSmoothOutputSettings.getH265PackagingType();
            jsonWriter.name("H265PackagingType");
            jsonWriter.value(h265PackagingType);
        }
        if (msSmoothOutputSettings.getNameModifier() != null) {
            String nameModifier = msSmoothOutputSettings.getNameModifier();
            jsonWriter.name("NameModifier");
            jsonWriter.value(nameModifier);
        }
        jsonWriter.endObject();
    }

    private static MsSmoothOutputSettingsJsonMarshaller instance;

    public static MsSmoothOutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MsSmoothOutputSettingsJsonMarshaller();
        return instance;
    }
}
