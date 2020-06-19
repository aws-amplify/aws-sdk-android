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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StaticImageActivateScheduleActionSettings
 */
class StaticImageActivateScheduleActionSettingsJsonMarshaller {

    public void marshall(
            StaticImageActivateScheduleActionSettings staticImageActivateScheduleActionSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (staticImageActivateScheduleActionSettings.getDuration() != null) {
            Integer duration = staticImageActivateScheduleActionSettings.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (staticImageActivateScheduleActionSettings.getFadeIn() != null) {
            Integer fadeIn = staticImageActivateScheduleActionSettings.getFadeIn();
            jsonWriter.name("FadeIn");
            jsonWriter.value(fadeIn);
        }
        if (staticImageActivateScheduleActionSettings.getFadeOut() != null) {
            Integer fadeOut = staticImageActivateScheduleActionSettings.getFadeOut();
            jsonWriter.name("FadeOut");
            jsonWriter.value(fadeOut);
        }
        if (staticImageActivateScheduleActionSettings.getHeight() != null) {
            Integer height = staticImageActivateScheduleActionSettings.getHeight();
            jsonWriter.name("Height");
            jsonWriter.value(height);
        }
        if (staticImageActivateScheduleActionSettings.getImage() != null) {
            InputLocation image = staticImageActivateScheduleActionSettings.getImage();
            jsonWriter.name("Image");
            InputLocationJsonMarshaller.getInstance().marshall(image, jsonWriter);
        }
        if (staticImageActivateScheduleActionSettings.getImageX() != null) {
            Integer imageX = staticImageActivateScheduleActionSettings.getImageX();
            jsonWriter.name("ImageX");
            jsonWriter.value(imageX);
        }
        if (staticImageActivateScheduleActionSettings.getImageY() != null) {
            Integer imageY = staticImageActivateScheduleActionSettings.getImageY();
            jsonWriter.name("ImageY");
            jsonWriter.value(imageY);
        }
        if (staticImageActivateScheduleActionSettings.getLayer() != null) {
            Integer layer = staticImageActivateScheduleActionSettings.getLayer();
            jsonWriter.name("Layer");
            jsonWriter.value(layer);
        }
        if (staticImageActivateScheduleActionSettings.getOpacity() != null) {
            Integer opacity = staticImageActivateScheduleActionSettings.getOpacity();
            jsonWriter.name("Opacity");
            jsonWriter.value(opacity);
        }
        if (staticImageActivateScheduleActionSettings.getWidth() != null) {
            Integer width = staticImageActivateScheduleActionSettings.getWidth();
            jsonWriter.name("Width");
            jsonWriter.value(width);
        }
        jsonWriter.endObject();
    }

    private static StaticImageActivateScheduleActionSettingsJsonMarshaller instance;

    public static StaticImageActivateScheduleActionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StaticImageActivateScheduleActionSettingsJsonMarshaller();
        return instance;
    }
}
