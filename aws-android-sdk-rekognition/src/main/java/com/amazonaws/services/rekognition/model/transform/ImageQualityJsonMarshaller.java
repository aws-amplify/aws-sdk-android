/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageQuality
 */
class ImageQualityJsonMarshaller {

    public void marshall(ImageQuality imageQuality, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageQuality.getBrightness() != null) {
            Float brightness = imageQuality.getBrightness();
            jsonWriter.name("Brightness");
            jsonWriter.value(brightness);
        }
        if (imageQuality.getSharpness() != null) {
            Float sharpness = imageQuality.getSharpness();
            jsonWriter.name("Sharpness");
            jsonWriter.value(sharpness);
        }
        jsonWriter.endObject();
    }

    private static ImageQualityJsonMarshaller instance;

    public static ImageQualityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageQualityJsonMarshaller();
        return instance;
    }
}
