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
 * JSON marshaller for POJO ProresSettings
 */
class ProresSettingsJsonMarshaller {

    public void marshall(ProresSettings proresSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (proresSettings.getCodecProfile() != null) {
            String codecProfile = proresSettings.getCodecProfile();
            jsonWriter.name("CodecProfile");
            jsonWriter.value(codecProfile);
        }
        if (proresSettings.getFramerateControl() != null) {
            String framerateControl = proresSettings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (proresSettings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = proresSettings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
        }
        if (proresSettings.getFramerateDenominator() != null) {
            Integer framerateDenominator = proresSettings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (proresSettings.getFramerateNumerator() != null) {
            Integer framerateNumerator = proresSettings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (proresSettings.getInterlaceMode() != null) {
            String interlaceMode = proresSettings.getInterlaceMode();
            jsonWriter.name("InterlaceMode");
            jsonWriter.value(interlaceMode);
        }
        if (proresSettings.getParControl() != null) {
            String parControl = proresSettings.getParControl();
            jsonWriter.name("ParControl");
            jsonWriter.value(parControl);
        }
        if (proresSettings.getParDenominator() != null) {
            Integer parDenominator = proresSettings.getParDenominator();
            jsonWriter.name("ParDenominator");
            jsonWriter.value(parDenominator);
        }
        if (proresSettings.getParNumerator() != null) {
            Integer parNumerator = proresSettings.getParNumerator();
            jsonWriter.name("ParNumerator");
            jsonWriter.value(parNumerator);
        }
        if (proresSettings.getSlowPal() != null) {
            String slowPal = proresSettings.getSlowPal();
            jsonWriter.name("SlowPal");
            jsonWriter.value(slowPal);
        }
        if (proresSettings.getTelecine() != null) {
            String telecine = proresSettings.getTelecine();
            jsonWriter.name("Telecine");
            jsonWriter.value(telecine);
        }
        jsonWriter.endObject();
    }

    private static ProresSettingsJsonMarshaller instance;

    public static ProresSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProresSettingsJsonMarshaller();
        return instance;
    }
}
