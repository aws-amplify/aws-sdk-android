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
 * JSON marshaller for POJO Face
 */
class FaceJsonMarshaller {

    public void marshall(Face face, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (face.getFaceId() != null) {
            String faceId = face.getFaceId();
            jsonWriter.name("FaceId");
            jsonWriter.value(faceId);
        }
        if (face.getBoundingBox() != null) {
            BoundingBox boundingBox = face.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (face.getImageId() != null) {
            String imageId = face.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (face.getExternalImageId() != null) {
            String externalImageId = face.getExternalImageId();
            jsonWriter.name("ExternalImageId");
            jsonWriter.value(externalImageId);
        }
        if (face.getConfidence() != null) {
            Float confidence = face.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (face.getAssociationScore() != null) {
            Float associationScore = face.getAssociationScore();
            jsonWriter.name("AssociationScore");
            jsonWriter.value(associationScore);
        }
        jsonWriter.endObject();
    }

    private static FaceJsonMarshaller instance;

    public static FaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaceJsonMarshaller();
        return instance;
    }
}
