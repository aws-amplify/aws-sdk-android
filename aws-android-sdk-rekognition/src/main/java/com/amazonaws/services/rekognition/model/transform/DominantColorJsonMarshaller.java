/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DominantColor
 */
class DominantColorJsonMarshaller {

    public void marshall(DominantColor dominantColor, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dominantColor.getRed() != null) {
            Integer red = dominantColor.getRed();
            jsonWriter.name("Red");
            jsonWriter.value(red);
        }
        if (dominantColor.getBlue() != null) {
            Integer blue = dominantColor.getBlue();
            jsonWriter.name("Blue");
            jsonWriter.value(blue);
        }
        if (dominantColor.getGreen() != null) {
            Integer green = dominantColor.getGreen();
            jsonWriter.name("Green");
            jsonWriter.value(green);
        }
        if (dominantColor.getHexCode() != null) {
            String hexCode = dominantColor.getHexCode();
            jsonWriter.name("HexCode");
            jsonWriter.value(hexCode);
        }
        if (dominantColor.getCSSColor() != null) {
            String cSSColor = dominantColor.getCSSColor();
            jsonWriter.name("CSSColor");
            jsonWriter.value(cSSColor);
        }
        if (dominantColor.getSimplifiedColor() != null) {
            String simplifiedColor = dominantColor.getSimplifiedColor();
            jsonWriter.name("SimplifiedColor");
            jsonWriter.value(simplifiedColor);
        }
        if (dominantColor.getPixelPercent() != null) {
            Float pixelPercent = dominantColor.getPixelPercent();
            jsonWriter.name("PixelPercent");
            jsonWriter.value(pixelPercent);
        }
        jsonWriter.endObject();
    }

    private static DominantColorJsonMarshaller instance;

    public static DominantColorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DominantColorJsonMarshaller();
        return instance;
    }
}
