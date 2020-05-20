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
 * JSON marshaller for POJO Ac3Settings
 */
class Ac3SettingsJsonMarshaller {

    public void marshall(Ac3Settings ac3Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ac3Settings.getBitrate() != null) {
            Double bitrate = ac3Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (ac3Settings.getBitstreamMode() != null) {
            String bitstreamMode = ac3Settings.getBitstreamMode();
            jsonWriter.name("BitstreamMode");
            jsonWriter.value(bitstreamMode);
        }
        if (ac3Settings.getCodingMode() != null) {
            String codingMode = ac3Settings.getCodingMode();
            jsonWriter.name("CodingMode");
            jsonWriter.value(codingMode);
        }
        if (ac3Settings.getDialnorm() != null) {
            Integer dialnorm = ac3Settings.getDialnorm();
            jsonWriter.name("Dialnorm");
            jsonWriter.value(dialnorm);
        }
        if (ac3Settings.getDrcProfile() != null) {
            String drcProfile = ac3Settings.getDrcProfile();
            jsonWriter.name("DrcProfile");
            jsonWriter.value(drcProfile);
        }
        if (ac3Settings.getLfeFilter() != null) {
            String lfeFilter = ac3Settings.getLfeFilter();
            jsonWriter.name("LfeFilter");
            jsonWriter.value(lfeFilter);
        }
        if (ac3Settings.getMetadataControl() != null) {
            String metadataControl = ac3Settings.getMetadataControl();
            jsonWriter.name("MetadataControl");
            jsonWriter.value(metadataControl);
        }
        jsonWriter.endObject();
    }

    private static Ac3SettingsJsonMarshaller instance;

    public static Ac3SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ac3SettingsJsonMarshaller();
        return instance;
    }
}
