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
 * JSON marshaller for POJO InsertableImage
 */
class InsertableImageJsonMarshaller {

    public void marshall(InsertableImage insertableImage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (insertableImage.getDuration() != null) {
            Integer duration = insertableImage.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (insertableImage.getFadeIn() != null) {
            Integer fadeIn = insertableImage.getFadeIn();
            jsonWriter.name("FadeIn");
            jsonWriter.value(fadeIn);
        }
        if (insertableImage.getFadeOut() != null) {
            Integer fadeOut = insertableImage.getFadeOut();
            jsonWriter.name("FadeOut");
            jsonWriter.value(fadeOut);
        }
        if (insertableImage.getHeight() != null) {
            Integer height = insertableImage.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (insertableImage.getImageInserterInput() != null) {
            String imageInserterInput = insertableImage.getImageInserterInput();
            jsonWriter.name("ImageInserterInput");
            jsonWriter.value(imageInserterInput);
        }
        if (insertableImage.getImageX() != null) {
            Integer imageX = insertableImage.getImageX();
            jsonWriter.name("ImageX");
            jsonWriter.value(imageX);
        }
        if (insertableImage.getImageY() != null) {
            Integer imageY = insertableImage.getImageY();
            jsonWriter.name("ImageY");
            jsonWriter.value(imageY);
        }
        if (insertableImage.getLayer() != null) {
            Integer layer = insertableImage.getLayer();
            jsonWriter.name("Layer");
            jsonWriter.value(layer);
        }
        if (insertableImage.getOpacity() != null) {
            Integer opacity = insertableImage.getOpacity();
            jsonWriter.name("Opacity");
            jsonWriter.value(opacity);
        }
        if (insertableImage.getStartTime() != null) {
            String startTime = insertableImage.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (insertableImage.getWidth() != null) {
            Integer width = insertableImage.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        jsonWriter.endObject();
    }

    private static InsertableImageJsonMarshaller instance;

    public static InsertableImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InsertableImageJsonMarshaller();
        return instance;
    }
}
