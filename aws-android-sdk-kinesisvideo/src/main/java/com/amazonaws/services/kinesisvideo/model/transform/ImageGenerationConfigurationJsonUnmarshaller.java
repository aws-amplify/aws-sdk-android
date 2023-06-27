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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImageGenerationConfiguration
 */
class ImageGenerationConfigurationJsonUnmarshaller implements
        Unmarshaller<ImageGenerationConfiguration, JsonUnmarshallerContext> {

    public ImageGenerationConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageGenerationConfiguration imageGenerationConfiguration = new ImageGenerationConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Status")) {
                imageGenerationConfiguration.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageSelectorType")) {
                imageGenerationConfiguration.setImageSelectorType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationConfig")) {
                imageGenerationConfiguration
                        .setDestinationConfig(ImageGenerationDestinationConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SamplingInterval")) {
                imageGenerationConfiguration.setSamplingInterval(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Format")) {
                imageGenerationConfiguration.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FormatConfig")) {
                imageGenerationConfiguration.setFormatConfig(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WidthPixels")) {
                imageGenerationConfiguration.setWidthPixels(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HeightPixels")) {
                imageGenerationConfiguration.setHeightPixels(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageGenerationConfiguration;
    }

    private static ImageGenerationConfigurationJsonUnmarshaller instance;

    public static ImageGenerationConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageGenerationConfigurationJsonUnmarshaller();
        return instance;
    }
}
