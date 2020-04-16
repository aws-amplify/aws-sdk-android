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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ColorCorrector
 */
class ColorCorrectorJsonUnmarshaller implements
        Unmarshaller<ColorCorrector, JsonUnmarshallerContext> {

    public ColorCorrector unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ColorCorrector colorCorrector = new ColorCorrector();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Brightness")) {
                colorCorrector.setBrightness(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColorSpaceConversion")) {
                colorCorrector.setColorSpaceConversion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Contrast")) {
                colorCorrector.setContrast(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hdr10Metadata")) {
                colorCorrector.setHdr10Metadata(Hdr10MetadataJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hue")) {
                colorCorrector.setHue(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Saturation")) {
                colorCorrector.setSaturation(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return colorCorrector;
    }

    private static ColorCorrectorJsonUnmarshaller instance;

    public static ColorCorrectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColorCorrectorJsonUnmarshaller();
        return instance;
    }
}
