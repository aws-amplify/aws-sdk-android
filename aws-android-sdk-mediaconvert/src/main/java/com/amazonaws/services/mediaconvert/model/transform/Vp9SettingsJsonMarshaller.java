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
 * JSON marshaller for POJO Vp9Settings
 */
class Vp9SettingsJsonMarshaller {

    public void marshall(Vp9Settings vp9Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vp9Settings.getBitrate() != null) {
            Integer bitrate = vp9Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (vp9Settings.getFramerateControl() != null) {
            String framerateControl = vp9Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (vp9Settings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = vp9Settings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
        }
        if (vp9Settings.getFramerateDenominator() != null) {
            Integer framerateDenominator = vp9Settings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (vp9Settings.getFramerateNumerator() != null) {
            Integer framerateNumerator = vp9Settings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (vp9Settings.getGopSize() != null) {
            Double gopSize = vp9Settings.getGopSize();
            jsonWriter.name("GopSize");
            jsonWriter.value(gopSize);
        }
        if (vp9Settings.getHrdBufferSize() != null) {
            Integer hrdBufferSize = vp9Settings.getHrdBufferSize();
            jsonWriter.name("HrdBufferSize");
            jsonWriter.value(hrdBufferSize);
        }
        if (vp9Settings.getMaxBitrate() != null) {
            Integer maxBitrate = vp9Settings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (vp9Settings.getParControl() != null) {
            String parControl = vp9Settings.getParControl();
            jsonWriter.name("ParControl");
            jsonWriter.value(parControl);
        }
        if (vp9Settings.getParDenominator() != null) {
            Integer parDenominator = vp9Settings.getParDenominator();
            jsonWriter.name("ParDenominator");
            jsonWriter.value(parDenominator);
        }
        if (vp9Settings.getParNumerator() != null) {
            Integer parNumerator = vp9Settings.getParNumerator();
            jsonWriter.name("ParNumerator");
            jsonWriter.value(parNumerator);
        }
        if (vp9Settings.getQualityTuningLevel() != null) {
            String qualityTuningLevel = vp9Settings.getQualityTuningLevel();
            jsonWriter.name("QualityTuningLevel");
            jsonWriter.value(qualityTuningLevel);
        }
        if (vp9Settings.getRateControlMode() != null) {
            String rateControlMode = vp9Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        jsonWriter.endObject();
    }

    private static Vp9SettingsJsonMarshaller instance;

    public static Vp9SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Vp9SettingsJsonMarshaller();
        return instance;
    }
}
