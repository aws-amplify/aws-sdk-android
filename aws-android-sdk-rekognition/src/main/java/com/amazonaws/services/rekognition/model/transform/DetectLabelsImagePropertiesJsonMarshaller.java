/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO DetectLabelsImageProperties
 */
class DetectLabelsImagePropertiesJsonMarshaller {

    public void marshall(DetectLabelsImageProperties detectLabelsImageProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectLabelsImageProperties.getQuality() != null) {
            DetectLabelsImageQuality quality = detectLabelsImageProperties.getQuality();
            jsonWriter.name("Quality");
            DetectLabelsImageQualityJsonMarshaller.getInstance().marshall(quality, jsonWriter);
        }
        if (detectLabelsImageProperties.getDominantColors() != null) {
            java.util.List<DominantColor> dominantColors = detectLabelsImageProperties
                    .getDominantColors();
            jsonWriter.name("DominantColors");
            jsonWriter.beginArray();
            for (DominantColor dominantColorsItem : dominantColors) {
                if (dominantColorsItem != null) {
                    DominantColorJsonMarshaller.getInstance().marshall(dominantColorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (detectLabelsImageProperties.getForeground() != null) {
            DetectLabelsImageForeground foreground = detectLabelsImageProperties.getForeground();
            jsonWriter.name("Foreground");
            DetectLabelsImageForegroundJsonMarshaller.getInstance()
                    .marshall(foreground, jsonWriter);
        }
        if (detectLabelsImageProperties.getBackground() != null) {
            DetectLabelsImageBackground background = detectLabelsImageProperties.getBackground();
            jsonWriter.name("Background");
            DetectLabelsImageBackgroundJsonMarshaller.getInstance()
                    .marshall(background, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DetectLabelsImagePropertiesJsonMarshaller instance;

    public static DetectLabelsImagePropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectLabelsImagePropertiesJsonMarshaller();
        return instance;
    }
}
