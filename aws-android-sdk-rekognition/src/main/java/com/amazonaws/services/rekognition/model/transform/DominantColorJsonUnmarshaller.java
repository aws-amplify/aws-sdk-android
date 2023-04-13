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
 * JSON unmarshaller for POJO DominantColor
 */
class DominantColorJsonUnmarshaller implements Unmarshaller<DominantColor, JsonUnmarshallerContext> {

    public DominantColor unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DominantColor dominantColor = new DominantColor();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Red")) {
                dominantColor.setRed(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Blue")) {
                dominantColor.setBlue(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Green")) {
                dominantColor.setGreen(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HexCode")) {
                dominantColor.setHexCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CSSColor")) {
                dominantColor.setCSSColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SimplifiedColor")) {
                dominantColor.setSimplifiedColor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PixelPercent")) {
                dominantColor.setPixelPercent(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dominantColor;
    }

    private static DominantColorJsonUnmarshaller instance;

    public static DominantColorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DominantColorJsonUnmarshaller();
        return instance;
    }
}
