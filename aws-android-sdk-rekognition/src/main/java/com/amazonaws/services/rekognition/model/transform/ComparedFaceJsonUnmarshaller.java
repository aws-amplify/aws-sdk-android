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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ComparedFace
 */
class ComparedFaceJsonUnmarshaller implements Unmarshaller<ComparedFace, JsonUnmarshallerContext> {

    public ComparedFace unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ComparedFace comparedFace = new ComparedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BoundingBox")) {
                comparedFace.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Confidence")) {
                comparedFace.setConfidence(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Landmarks")) {
                comparedFace.setLandmarks(new ListUnmarshaller<Landmark>(LandmarkJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Pose")) {
                comparedFace.setPose(PoseJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Quality")) {
                comparedFace.setQuality(ImageQualityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return comparedFace;
    }

    private static ComparedFaceJsonUnmarshaller instance;

    public static ComparedFaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComparedFaceJsonUnmarshaller();
        return instance;
    }
}
