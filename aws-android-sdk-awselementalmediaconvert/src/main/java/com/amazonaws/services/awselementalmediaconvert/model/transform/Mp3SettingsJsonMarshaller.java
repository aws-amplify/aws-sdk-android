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
 * JSON marshaller for POJO Mp3Settings
 */
class Mp3SettingsJsonMarshaller {

    public void marshall(Mp3Settings mp3Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mp3Settings.getBitrate() != null) {
            Integer bitrate = mp3Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (mp3Settings.getChannels() != null) {
            Integer channels = mp3Settings.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.value(channels);
        }
        if (mp3Settings.getRateControlMode() != null) {
            String rateControlMode = mp3Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (mp3Settings.getSampleRate() != null) {
            Integer sampleRate = mp3Settings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        if (mp3Settings.getVbrQuality() != null) {
            Integer vbrQuality = mp3Settings.getVbrQuality();
            jsonWriter.name("VbrQuality");
            jsonWriter.value(vbrQuality);
        }
        jsonWriter.endObject();
    }

    private static Mp3SettingsJsonMarshaller instance;

    public static Mp3SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Mp3SettingsJsonMarshaller();
        return instance;
    }
}
