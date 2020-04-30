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
 * JSON marshaller for POJO Mp4Settings
 */
class Mp4SettingsJsonMarshaller {

    public void marshall(Mp4Settings mp4Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mp4Settings.getCslgAtom() != null) {
            String cslgAtom = mp4Settings.getCslgAtom();
            jsonWriter.name("CslgAtom");
            jsonWriter.value(cslgAtom);
        }
        if (mp4Settings.getCttsVersion() != null) {
            Integer cttsVersion = mp4Settings.getCttsVersion();
            jsonWriter.name("CttsVersion");
            jsonWriter.value(cttsVersion);
        }
        if (mp4Settings.getFreeSpaceBox() != null) {
            String freeSpaceBox = mp4Settings.getFreeSpaceBox();
            jsonWriter.name("FreeSpaceBox");
            jsonWriter.value(freeSpaceBox);
        }
        if (mp4Settings.getMoovPlacement() != null) {
            String moovPlacement = mp4Settings.getMoovPlacement();
            jsonWriter.name("MoovPlacement");
            jsonWriter.value(moovPlacement);
        }
        if (mp4Settings.getMp4MajorBrand() != null) {
            String mp4MajorBrand = mp4Settings.getMp4MajorBrand();
            jsonWriter.name("Mp4MajorBrand");
            jsonWriter.value(mp4MajorBrand);
        }
        jsonWriter.endObject();
    }

    private static Mp4SettingsJsonMarshaller instance;

    public static Mp4SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Mp4SettingsJsonMarshaller();
        return instance;
    }
}
