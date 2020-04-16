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
 * JSON marshaller for POJO ColorCorrector
 */
class ColorCorrectorJsonMarshaller {

    public void marshall(ColorCorrector colorCorrector, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (colorCorrector.getBrightness() != null) {
            Integer brightness = colorCorrector.getBrightness();
            jsonWriter.name("Brightness");
            jsonWriter.value(brightness);
        }
        if (colorCorrector.getColorSpaceConversion() != null) {
            String colorSpaceConversion = colorCorrector.getColorSpaceConversion();
            jsonWriter.name("ColorSpaceConversion");
            jsonWriter.value(colorSpaceConversion);
        }
        if (colorCorrector.getContrast() != null) {
            Integer contrast = colorCorrector.getContrast();
            jsonWriter.name("Contrast");
            jsonWriter.value(contrast);
        }
        if (colorCorrector.getHdr10Metadata() != null) {
            Hdr10Metadata hdr10Metadata = colorCorrector.getHdr10Metadata();
            jsonWriter.name("Hdr10Metadata");
            Hdr10MetadataJsonMarshaller.getInstance().marshall(hdr10Metadata, jsonWriter);
        }
        if (colorCorrector.getHue() != null) {
            Integer hue = colorCorrector.getHue();
            jsonWriter.name("Hue");
            jsonWriter.value(hue);
        }
        if (colorCorrector.getSaturation() != null) {
            Integer saturation = colorCorrector.getSaturation();
            jsonWriter.name("Saturation");
            jsonWriter.value(saturation);
        }
        jsonWriter.endObject();
    }

    private static ColorCorrectorJsonMarshaller instance;

    public static ColorCorrectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColorCorrectorJsonMarshaller();
        return instance;
    }
}
