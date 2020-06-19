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
 * JSON marshaller for POJO AvailSettings
 */
class AvailSettingsJsonMarshaller {

    public void marshall(AvailSettings availSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (availSettings.getScte35SpliceInsert() != null) {
            Scte35SpliceInsert scte35SpliceInsert = availSettings.getScte35SpliceInsert();
            jsonWriter.name("Scte35SpliceInsert");
            Scte35SpliceInsertJsonMarshaller.getInstance().marshall(scte35SpliceInsert, jsonWriter);
        }
        if (availSettings.getScte35TimeSignalApos() != null) {
            Scte35TimeSignalApos scte35TimeSignalApos = availSettings.getScte35TimeSignalApos();
            jsonWriter.name("Scte35TimeSignalApos");
            Scte35TimeSignalAposJsonMarshaller.getInstance().marshall(scte35TimeSignalApos,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AvailSettingsJsonMarshaller instance;

    public static AvailSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AvailSettingsJsonMarshaller();
        return instance;
    }
}
