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
 * JSON marshaller for POJO Vp8Settings
 */
class Vp8SettingsJsonMarshaller {

    public void marshall(Vp8Settings vp8Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vp8Settings.getBitrate() != null) {
            Integer bitrate = vp8Settings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (vp8Settings.getFramerateControl() != null) {
            String framerateControl = vp8Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (vp8Settings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = vp8Settings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
        }
        if (vp8Settings.getFramerateDenominator() != null) {
            Integer framerateDenominator = vp8Settings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (vp8Settings.getFramerateNumerator() != null) {
            Integer framerateNumerator = vp8Settings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (vp8Settings.getGopSize() != null) {
            Double gopSize = vp8Settings.getGopSize();
            jsonWriter.name("GopSize");
            jsonWriter.value(gopSize);
        }
        if (vp8Settings.getHrdBufferSize() != null) {
            Integer hrdBufferSize = vp8Settings.getHrdBufferSize();
            jsonWriter.name("HrdBufferSize");
            jsonWriter.value(hrdBufferSize);
        }
        if (vp8Settings.getMaxBitrate() != null) {
            Integer maxBitrate = vp8Settings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (vp8Settings.getParControl() != null) {
            String parControl = vp8Settings.getParControl();
            jsonWriter.name("ParControl");
            jsonWriter.value(parControl);
        }
        if (vp8Settings.getParDenominator() != null) {
            Integer parDenominator = vp8Settings.getParDenominator();
            jsonWriter.name("ParDenominator");
            jsonWriter.value(parDenominator);
        }
        if (vp8Settings.getParNumerator() != null) {
            Integer parNumerator = vp8Settings.getParNumerator();
            jsonWriter.name("ParNumerator");
            jsonWriter.value(parNumerator);
        }
        if (vp8Settings.getQualityTuningLevel() != null) {
            String qualityTuningLevel = vp8Settings.getQualityTuningLevel();
            jsonWriter.name("QualityTuningLevel");
            jsonWriter.value(qualityTuningLevel);
        }
        if (vp8Settings.getRateControlMode() != null) {
            String rateControlMode = vp8Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        jsonWriter.endObject();
    }

    private static Vp8SettingsJsonMarshaller instance;

    public static Vp8SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Vp8SettingsJsonMarshaller();
        return instance;
    }
}
