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
 * JSON marshaller for POJO AacSettings
 */
class AacSettingsJsonMarshaller {

    public void marshall(AacSettings aacSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aacSettings.getBitrate() != null) {
            Double bitrate = aacSettings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (aacSettings.getCodingMode() != null) {
            String codingMode = aacSettings.getCodingMode();
            jsonWriter.name("CodingMode");
            jsonWriter.value(codingMode);
        }
        if (aacSettings.getInputType() != null) {
            String inputType = aacSettings.getInputType();
            jsonWriter.name("InputType");
            jsonWriter.value(inputType);
        }
        if (aacSettings.getProfile() != null) {
            String profile = aacSettings.getProfile();
            jsonWriter.name("Profile");
            jsonWriter.value(profile);
        }
        if (aacSettings.getRateControlMode() != null) {
            String rateControlMode = aacSettings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (aacSettings.getRawFormat() != null) {
            String rawFormat = aacSettings.getRawFormat();
            jsonWriter.name("RawFormat");
            jsonWriter.value(rawFormat);
        }
        if (aacSettings.getSampleRate() != null) {
            Double sampleRate = aacSettings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        if (aacSettings.getSpec() != null) {
            String spec = aacSettings.getSpec();
            jsonWriter.name("Spec");
            jsonWriter.value(spec);
        }
        if (aacSettings.getVbrQuality() != null) {
            String vbrQuality = aacSettings.getVbrQuality();
            jsonWriter.name("VbrQuality");
            jsonWriter.value(vbrQuality);
        }
        jsonWriter.endObject();
    }

    private static AacSettingsJsonMarshaller instance;

    public static AacSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AacSettingsJsonMarshaller();
        return instance;
    }
}
