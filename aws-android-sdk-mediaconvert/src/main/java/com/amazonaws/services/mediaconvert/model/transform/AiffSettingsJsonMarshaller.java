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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AiffSettings
 */
class AiffSettingsJsonMarshaller {

    public void marshall(AiffSettings aiffSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aiffSettings.getBitDepth() != null) {
            Integer bitDepth = aiffSettings.getBitDepth();
            jsonWriter.name("BitDepth");
            jsonWriter.value(bitDepth);
        }
        if (aiffSettings.getChannels() != null) {
            Integer channels = aiffSettings.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.value(channels);
        }
        if (aiffSettings.getSampleRate() != null) {
            Integer sampleRate = aiffSettings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        jsonWriter.endObject();
    }

    private static AiffSettingsJsonMarshaller instance;

    public static AiffSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AiffSettingsJsonMarshaller();
        return instance;
    }
}
