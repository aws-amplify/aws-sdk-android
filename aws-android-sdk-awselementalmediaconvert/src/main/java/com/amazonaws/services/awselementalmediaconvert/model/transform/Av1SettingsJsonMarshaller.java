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
 * JSON marshaller for POJO Av1Settings
 */
class Av1SettingsJsonMarshaller {

    public void marshall(Av1Settings av1Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (av1Settings.getAdaptiveQuantization() != null) {
            String adaptiveQuantization = av1Settings.getAdaptiveQuantization();
            jsonWriter.name("AdaptiveQuantization");
            jsonWriter.value(adaptiveQuantization);
        }
        if (av1Settings.getFramerateControl() != null) {
            String framerateControl = av1Settings.getFramerateControl();
            jsonWriter.name("FramerateControl");
            jsonWriter.value(framerateControl);
        }
        if (av1Settings.getFramerateConversionAlgorithm() != null) {
            String framerateConversionAlgorithm = av1Settings.getFramerateConversionAlgorithm();
            jsonWriter.name("FramerateConversionAlgorithm");
            jsonWriter.value(framerateConversionAlgorithm);
        }
        if (av1Settings.getFramerateDenominator() != null) {
            Integer framerateDenominator = av1Settings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (av1Settings.getFramerateNumerator() != null) {
            Integer framerateNumerator = av1Settings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (av1Settings.getGopSize() != null) {
            Double gopSize = av1Settings.getGopSize();
            jsonWriter.name("GopSize");
            jsonWriter.value(gopSize);
        }
        if (av1Settings.getMaxBitrate() != null) {
            Integer maxBitrate = av1Settings.getMaxBitrate();
            jsonWriter.name("MaxBitrate");
            jsonWriter.value(maxBitrate);
        }
        if (av1Settings.getNumberBFramesBetweenReferenceFrames() != null) {
            Integer numberBFramesBetweenReferenceFrames = av1Settings
                    .getNumberBFramesBetweenReferenceFrames();
            jsonWriter.name("NumberBFramesBetweenReferenceFrames");
            jsonWriter.value(numberBFramesBetweenReferenceFrames);
        }
        if (av1Settings.getQvbrSettings() != null) {
            Av1QvbrSettings qvbrSettings = av1Settings.getQvbrSettings();
            jsonWriter.name("QvbrSettings");
            Av1QvbrSettingsJsonMarshaller.getInstance().marshall(qvbrSettings, jsonWriter);
        }
        if (av1Settings.getRateControlMode() != null) {
            String rateControlMode = av1Settings.getRateControlMode();
            jsonWriter.name("RateControlMode");
            jsonWriter.value(rateControlMode);
        }
        if (av1Settings.getSlices() != null) {
            Integer slices = av1Settings.getSlices();
            jsonWriter.name("Slices");
            jsonWriter.value(slices);
        }
        if (av1Settings.getSpatialAdaptiveQuantization() != null) {
            String spatialAdaptiveQuantization = av1Settings.getSpatialAdaptiveQuantization();
            jsonWriter.name("SpatialAdaptiveQuantization");
            jsonWriter.value(spatialAdaptiveQuantization);
        }
        jsonWriter.endObject();
    }

    private static Av1SettingsJsonMarshaller instance;

    public static Av1SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Av1SettingsJsonMarshaller();
        return instance;
    }
}
