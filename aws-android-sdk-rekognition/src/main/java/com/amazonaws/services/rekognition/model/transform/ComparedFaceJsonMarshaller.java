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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComparedFace
 */
class ComparedFaceJsonMarshaller {

    public void marshall(ComparedFace comparedFace, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (comparedFace.getBoundingBox() != null) {
            BoundingBox boundingBox = comparedFace.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (comparedFace.getConfidence() != null) {
            Float confidence = comparedFace.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (comparedFace.getLandmarks() != null) {
            java.util.List<Landmark> landmarks = comparedFace.getLandmarks();
            jsonWriter.name("Landmarks");
            jsonWriter.beginArray();
            for (Landmark landmarksItem : landmarks) {
                if (landmarksItem != null) {
                    LandmarkJsonMarshaller.getInstance().marshall(landmarksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (comparedFace.getPose() != null) {
            Pose pose = comparedFace.getPose();
            jsonWriter.name("Pose");
            PoseJsonMarshaller.getInstance().marshall(pose, jsonWriter);
        }
        if (comparedFace.getQuality() != null) {
            ImageQuality quality = comparedFace.getQuality();
            jsonWriter.name("Quality");
            ImageQualityJsonMarshaller.getInstance().marshall(quality, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ComparedFaceJsonMarshaller instance;

    public static ComparedFaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComparedFaceJsonMarshaller();
        return instance;
    }
}
