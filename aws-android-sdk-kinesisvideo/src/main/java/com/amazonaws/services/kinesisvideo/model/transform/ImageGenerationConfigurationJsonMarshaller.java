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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageGenerationConfiguration
 */
class ImageGenerationConfigurationJsonMarshaller {

    public void marshall(ImageGenerationConfiguration imageGenerationConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageGenerationConfiguration.getStatus() != null) {
            String status = imageGenerationConfiguration.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (imageGenerationConfiguration.getImageSelectorType() != null) {
            String imageSelectorType = imageGenerationConfiguration.getImageSelectorType();
            jsonWriter.name("ImageSelectorType");
            jsonWriter.value(imageSelectorType);
        }
        if (imageGenerationConfiguration.getDestinationConfig() != null) {
            ImageGenerationDestinationConfig destinationConfig = imageGenerationConfiguration
                    .getDestinationConfig();
            jsonWriter.name("DestinationConfig");
            ImageGenerationDestinationConfigJsonMarshaller.getInstance().marshall(
                    destinationConfig, jsonWriter);
        }
        if (imageGenerationConfiguration.getSamplingInterval() != null) {
            Integer samplingInterval = imageGenerationConfiguration.getSamplingInterval();
            jsonWriter.name("SamplingInterval");
            jsonWriter.value(samplingInterval);
        }
        if (imageGenerationConfiguration.getFormat() != null) {
            String format = imageGenerationConfiguration.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (imageGenerationConfiguration.getFormatConfig() != null) {
            java.util.Map<String, String> formatConfig = imageGenerationConfiguration
                    .getFormatConfig();
            jsonWriter.name("FormatConfig");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> formatConfigEntry : formatConfig.entrySet()) {
                String formatConfigValue = formatConfigEntry.getValue();
                if (formatConfigValue != null) {
                    jsonWriter.name(formatConfigEntry.getKey());
                    jsonWriter.value(formatConfigValue);
                }
            }
            jsonWriter.endObject();
        }
        if (imageGenerationConfiguration.getWidthPixels() != null) {
            Integer widthPixels = imageGenerationConfiguration.getWidthPixels();
            jsonWriter.name("WidthPixels");
            jsonWriter.value(widthPixels);
        }
        if (imageGenerationConfiguration.getHeightPixels() != null) {
            Integer heightPixels = imageGenerationConfiguration.getHeightPixels();
            jsonWriter.name("HeightPixels");
            jsonWriter.value(heightPixels);
        }
        jsonWriter.endObject();
    }

    private static ImageGenerationConfigurationJsonMarshaller instance;

    public static ImageGenerationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageGenerationConfigurationJsonMarshaller();
        return instance;
    }
}
