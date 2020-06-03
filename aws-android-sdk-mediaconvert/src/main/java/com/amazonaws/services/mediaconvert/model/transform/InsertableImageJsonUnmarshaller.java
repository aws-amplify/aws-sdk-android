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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InsertableImage
 */
class InsertableImageJsonUnmarshaller implements
        Unmarshaller<InsertableImage, JsonUnmarshallerContext> {

    public InsertableImage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InsertableImage insertableImage = new InsertableImage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Duration")) {
                insertableImage.setDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FadeIn")) {
                insertableImage.setFadeIn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FadeOut")) {
                insertableImage.setFadeOut(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Height")) {
                insertableImage.setHeight(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageInserterInput")) {
                insertableImage.setImageInserterInput(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageX")) {
                insertableImage.setImageX(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageY")) {
                insertableImage.setImageY(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Layer")) {
                insertableImage.setLayer(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Opacity")) {
                insertableImage.setOpacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                insertableImage.setStartTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Width")) {
                insertableImage.setWidth(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return insertableImage;
    }

    private static InsertableImageJsonUnmarshaller instance;

    public static InsertableImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsertableImageJsonUnmarshaller();
        return instance;
    }
}
