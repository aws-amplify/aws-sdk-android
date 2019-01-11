/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO FaceDetection
 */
class FaceDetectionJsonUnmarshaller implements Unmarshaller<FaceDetection, JsonUnmarshallerContext> {

    public FaceDetection unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceDetection faceDetection = new FaceDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Timestamp")) {
                faceDetection.setTimestamp(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Face")) {
                faceDetection.setFace(FaceDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceDetection;
    }

    private static FaceDetectionJsonUnmarshaller instance;

    public static FaceDetectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FaceDetectionJsonUnmarshaller();
        return instance;
    }
}
