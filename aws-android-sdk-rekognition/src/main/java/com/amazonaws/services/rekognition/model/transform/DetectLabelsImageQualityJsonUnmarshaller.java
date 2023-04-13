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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DetectLabelsImageQuality
 */
class DetectLabelsImageQualityJsonUnmarshaller implements
        Unmarshaller<DetectLabelsImageQuality, JsonUnmarshallerContext> {

    public DetectLabelsImageQuality unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectLabelsImageQuality detectLabelsImageQuality = new DetectLabelsImageQuality();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Brightness")) {
                detectLabelsImageQuality.setBrightness(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sharpness")) {
                detectLabelsImageQuality.setSharpness(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Contrast")) {
                detectLabelsImageQuality.setContrast(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsImageQuality;
    }

    private static DetectLabelsImageQualityJsonUnmarshaller instance;

    public static DetectLabelsImageQualityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectLabelsImageQualityJsonUnmarshaller();
        return instance;
    }
}
