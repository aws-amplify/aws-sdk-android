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
 * JSON marshaller for POJO BurninDestinationSettings
 */
class BurninDestinationSettingsJsonMarshaller {

    public void marshall(BurninDestinationSettings burninDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (burninDestinationSettings.getAlignment() != null) {
            String alignment = burninDestinationSettings.getAlignment();
            jsonWriter.name("Alignment");
            jsonWriter.value(alignment);
        }
        if (burninDestinationSettings.getBackgroundColor() != null) {
            String backgroundColor = burninDestinationSettings.getBackgroundColor();
            jsonWriter.name("BackgroundColor");
            jsonWriter.value(backgroundColor);
        }
        if (burninDestinationSettings.getBackgroundOpacity() != null) {
            Integer backgroundOpacity = burninDestinationSettings.getBackgroundOpacity();
            jsonWriter.name("BackgroundOpacity");
            jsonWriter.value(backgroundOpacity);
        }
        if (burninDestinationSettings.getFontColor() != null) {
            String fontColor = burninDestinationSettings.getFontColor();
            jsonWriter.name("FontColor");
            jsonWriter.value(fontColor);
        }
        if (burninDestinationSettings.getFontOpacity() != null) {
            Integer fontOpacity = burninDestinationSettings.getFontOpacity();
            jsonWriter.name("FontOpacity");
            jsonWriter.value(fontOpacity);
        }
        if (burninDestinationSettings.getFontResolution() != null) {
            Integer fontResolution = burninDestinationSettings.getFontResolution();
            jsonWriter.name("FontResolution");
            jsonWriter.value(fontResolution);
        }
        if (burninDestinationSettings.getFontScript() != null) {
            String fontScript = burninDestinationSettings.getFontScript();
            jsonWriter.name("FontScript");
            jsonWriter.value(fontScript);
        }
        if (burninDestinationSettings.getFontSize() != null) {
            Integer fontSize = burninDestinationSettings.getFontSize();
            jsonWriter.name("FontSize");
            jsonWriter.value(fontSize);
        }
        if (burninDestinationSettings.getOutlineColor() != null) {
            String outlineColor = burninDestinationSettings.getOutlineColor();
            jsonWriter.name("OutlineColor");
            jsonWriter.value(outlineColor);
        }
        if (burninDestinationSettings.getOutlineSize() != null) {
            Integer outlineSize = burninDestinationSettings.getOutlineSize();
            jsonWriter.name("OutlineSize");
            jsonWriter.value(outlineSize);
        }
        if (burninDestinationSettings.getShadowColor() != null) {
            String shadowColor = burninDestinationSettings.getShadowColor();
            jsonWriter.name("ShadowColor");
            jsonWriter.value(shadowColor);
        }
        if (burninDestinationSettings.getShadowOpacity() != null) {
            Integer shadowOpacity = burninDestinationSettings.getShadowOpacity();
            jsonWriter.name("ShadowOpacity");
            jsonWriter.value(shadowOpacity);
        }
        if (burninDestinationSettings.getShadowXOffset() != null) {
            Integer shadowXOffset = burninDestinationSettings.getShadowXOffset();
            jsonWriter.name("ShadowXOffset");
            jsonWriter.value(shadowXOffset);
        }
        if (burninDestinationSettings.getShadowYOffset() != null) {
            Integer shadowYOffset = burninDestinationSettings.getShadowYOffset();
            jsonWriter.name("ShadowYOffset");
            jsonWriter.value(shadowYOffset);
        }
        if (burninDestinationSettings.getTeletextSpacing() != null) {
            String teletextSpacing = burninDestinationSettings.getTeletextSpacing();
            jsonWriter.name("TeletextSpacing");
            jsonWriter.value(teletextSpacing);
        }
        if (burninDestinationSettings.getXPosition() != null) {
            Integer xPosition = burninDestinationSettings.getXPosition();
            jsonWriter.name("XPosition");
            jsonWriter.value(xPosition);
        }
        if (burninDestinationSettings.getYPosition() != null) {
            Integer yPosition = burninDestinationSettings.getYPosition();
            jsonWriter.name("YPosition");
            jsonWriter.value(yPosition);
        }
        jsonWriter.endObject();
    }

    private static BurninDestinationSettingsJsonMarshaller instance;

    public static BurninDestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BurninDestinationSettingsJsonMarshaller();
        return instance;
    }
}
