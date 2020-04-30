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
 * JSON marshaller for POJO DvbSubDestinationSettings
 */
class DvbSubDestinationSettingsJsonMarshaller {

    public void marshall(DvbSubDestinationSettings dvbSubDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dvbSubDestinationSettings.getAlignment() != null) {
            String alignment = dvbSubDestinationSettings.getAlignment();
            jsonWriter.name("Alignment");
            jsonWriter.value(alignment);
        }
        if (dvbSubDestinationSettings.getBackgroundColor() != null) {
            String backgroundColor = dvbSubDestinationSettings.getBackgroundColor();
            jsonWriter.name("BackgroundColor");
            jsonWriter.value(backgroundColor);
        }
        if (dvbSubDestinationSettings.getBackgroundOpacity() != null) {
            Integer backgroundOpacity = dvbSubDestinationSettings.getBackgroundOpacity();
            jsonWriter.name("BackgroundOpacity");
            jsonWriter.value(backgroundOpacity);
        }
        if (dvbSubDestinationSettings.getFontColor() != null) {
            String fontColor = dvbSubDestinationSettings.getFontColor();
            jsonWriter.name("FontColor");
            jsonWriter.value(fontColor);
        }
        if (dvbSubDestinationSettings.getFontOpacity() != null) {
            Integer fontOpacity = dvbSubDestinationSettings.getFontOpacity();
            jsonWriter.name("FontOpacity");
            jsonWriter.value(fontOpacity);
        }
        if (dvbSubDestinationSettings.getFontResolution() != null) {
            Integer fontResolution = dvbSubDestinationSettings.getFontResolution();
            jsonWriter.name("FontResolution");
            jsonWriter.value(fontResolution);
        }
        if (dvbSubDestinationSettings.getFontScript() != null) {
            String fontScript = dvbSubDestinationSettings.getFontScript();
            jsonWriter.name("FontScript");
            jsonWriter.value(fontScript);
        }
        if (dvbSubDestinationSettings.getFontSize() != null) {
            Integer fontSize = dvbSubDestinationSettings.getFontSize();
            jsonWriter.name("FontSize");
            jsonWriter.value(fontSize);
        }
        if (dvbSubDestinationSettings.getOutlineColor() != null) {
            String outlineColor = dvbSubDestinationSettings.getOutlineColor();
            jsonWriter.name("OutlineColor");
            jsonWriter.value(outlineColor);
        }
        if (dvbSubDestinationSettings.getOutlineSize() != null) {
            Integer outlineSize = dvbSubDestinationSettings.getOutlineSize();
            jsonWriter.name("OutlineSize");
            jsonWriter.value(outlineSize);
        }
        if (dvbSubDestinationSettings.getShadowColor() != null) {
            String shadowColor = dvbSubDestinationSettings.getShadowColor();
            jsonWriter.name("ShadowColor");
            jsonWriter.value(shadowColor);
        }
        if (dvbSubDestinationSettings.getShadowOpacity() != null) {
            Integer shadowOpacity = dvbSubDestinationSettings.getShadowOpacity();
            jsonWriter.name("ShadowOpacity");
            jsonWriter.value(shadowOpacity);
        }
        if (dvbSubDestinationSettings.getShadowXOffset() != null) {
            Integer shadowXOffset = dvbSubDestinationSettings.getShadowXOffset();
            jsonWriter.name("ShadowXOffset");
            jsonWriter.value(shadowXOffset);
        }
        if (dvbSubDestinationSettings.getShadowYOffset() != null) {
            Integer shadowYOffset = dvbSubDestinationSettings.getShadowYOffset();
            jsonWriter.name("ShadowYOffset");
            jsonWriter.value(shadowYOffset);
        }
        if (dvbSubDestinationSettings.getSubtitlingType() != null) {
            String subtitlingType = dvbSubDestinationSettings.getSubtitlingType();
            jsonWriter.name("SubtitlingType");
            jsonWriter.value(subtitlingType);
        }
        if (dvbSubDestinationSettings.getTeletextSpacing() != null) {
            String teletextSpacing = dvbSubDestinationSettings.getTeletextSpacing();
            jsonWriter.name("TeletextSpacing");
            jsonWriter.value(teletextSpacing);
        }
        if (dvbSubDestinationSettings.getXPosition() != null) {
            Integer xPosition = dvbSubDestinationSettings.getXPosition();
            jsonWriter.name("XPosition");
            jsonWriter.value(xPosition);
        }
        if (dvbSubDestinationSettings.getYPosition() != null) {
            Integer yPosition = dvbSubDestinationSettings.getYPosition();
            jsonWriter.name("YPosition");
            jsonWriter.value(yPosition);
        }
        jsonWriter.endObject();
    }

    private static DvbSubDestinationSettingsJsonMarshaller instance;

    public static DvbSubDestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DvbSubDestinationSettingsJsonMarshaller();
        return instance;
    }
}
