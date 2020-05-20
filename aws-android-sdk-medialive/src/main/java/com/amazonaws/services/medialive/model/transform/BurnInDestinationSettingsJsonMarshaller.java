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
 * JSON marshaller for POJO BurnInDestinationSettings
 */
class BurnInDestinationSettingsJsonMarshaller {

    public void marshall(BurnInDestinationSettings burnInDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (burnInDestinationSettings.getAlignment() != null) {
            String alignment = burnInDestinationSettings.getAlignment();
            jsonWriter.name("Alignment");
            jsonWriter.value(alignment);
        }
        if (burnInDestinationSettings.getBackgroundColor() != null) {
            String backgroundColor = burnInDestinationSettings.getBackgroundColor();
            jsonWriter.name("BackgroundColor");
            jsonWriter.value(backgroundColor);
        }
        if (burnInDestinationSettings.getBackgroundOpacity() != null) {
            Integer backgroundOpacity = burnInDestinationSettings.getBackgroundOpacity();
            jsonWriter.name("BackgroundOpacity");
            jsonWriter.value(backgroundOpacity);
        }
        if (burnInDestinationSettings.getFont() != null) {
            InputLocation font = burnInDestinationSettings.getFont();
            jsonWriter.name("Font");
            InputLocationJsonMarshaller.getInstance().marshall(font, jsonWriter);
        }
        if (burnInDestinationSettings.getFontColor() != null) {
            String fontColor = burnInDestinationSettings.getFontColor();
            jsonWriter.name("FontColor");
            jsonWriter.value(fontColor);
        }
        if (burnInDestinationSettings.getFontOpacity() != null) {
            Integer fontOpacity = burnInDestinationSettings.getFontOpacity();
            jsonWriter.name("FontOpacity");
            jsonWriter.value(fontOpacity);
        }
        if (burnInDestinationSettings.getFontResolution() != null) {
            Integer fontResolution = burnInDestinationSettings.getFontResolution();
            jsonWriter.name("FontResolution");
            jsonWriter.value(fontResolution);
        }
        if (burnInDestinationSettings.getFontSize() != null) {
            String fontSize = burnInDestinationSettings.getFontSize();
            jsonWriter.name("FontSize");
            jsonWriter.value(fontSize);
        }
        if (burnInDestinationSettings.getOutlineColor() != null) {
            String outlineColor = burnInDestinationSettings.getOutlineColor();
            jsonWriter.name("OutlineColor");
            jsonWriter.value(outlineColor);
        }
        if (burnInDestinationSettings.getOutlineSize() != null) {
            Integer outlineSize = burnInDestinationSettings.getOutlineSize();
            jsonWriter.name("OutlineSize");
            jsonWriter.value(outlineSize);
        }
        if (burnInDestinationSettings.getShadowColor() != null) {
            String shadowColor = burnInDestinationSettings.getShadowColor();
            jsonWriter.name("ShadowColor");
            jsonWriter.value(shadowColor);
        }
        if (burnInDestinationSettings.getShadowOpacity() != null) {
            Integer shadowOpacity = burnInDestinationSettings.getShadowOpacity();
            jsonWriter.name("ShadowOpacity");
            jsonWriter.value(shadowOpacity);
        }
        if (burnInDestinationSettings.getShadowXOffset() != null) {
            Integer shadowXOffset = burnInDestinationSettings.getShadowXOffset();
            jsonWriter.name("ShadowXOffset");
            jsonWriter.value(shadowXOffset);
        }
        if (burnInDestinationSettings.getShadowYOffset() != null) {
            Integer shadowYOffset = burnInDestinationSettings.getShadowYOffset();
            jsonWriter.name("ShadowYOffset");
            jsonWriter.value(shadowYOffset);
        }
        if (burnInDestinationSettings.getTeletextGridControl() != null) {
            String teletextGridControl = burnInDestinationSettings.getTeletextGridControl();
            jsonWriter.name("TeletextGridControl");
            jsonWriter.value(teletextGridControl);
        }
        if (burnInDestinationSettings.getXPosition() != null) {
            Integer xPosition = burnInDestinationSettings.getXPosition();
            jsonWriter.name("XPosition");
            jsonWriter.value(xPosition);
        }
        if (burnInDestinationSettings.getYPosition() != null) {
            Integer yPosition = burnInDestinationSettings.getYPosition();
            jsonWriter.name("YPosition");
            jsonWriter.value(yPosition);
        }
        jsonWriter.endObject();
    }

    private static BurnInDestinationSettingsJsonMarshaller instance;

    public static BurnInDestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BurnInDestinationSettingsJsonMarshaller();
        return instance;
    }
}
