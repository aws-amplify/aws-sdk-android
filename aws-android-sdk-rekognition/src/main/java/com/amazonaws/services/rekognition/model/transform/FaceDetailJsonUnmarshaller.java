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
 * JSON unmarshaller for POJO FaceDetail
 */
class FaceDetailJsonUnmarshaller implements Unmarshaller<FaceDetail, JsonUnmarshallerContext> {

    public FaceDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceDetail faceDetail = new FaceDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BoundingBox")) {
                faceDetail.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AgeRange")) {
                faceDetail.setAgeRange(AgeRangeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Smile")) {
                faceDetail.setSmile(SmileJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Eyeglasses")) {
                faceDetail.setEyeglasses(EyeglassesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sunglasses")) {
                faceDetail.setSunglasses(SunglassesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Gender")) {
                faceDetail.setGender(GenderJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Beard")) {
                faceDetail.setBeard(BeardJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mustache")) {
                faceDetail.setMustache(MustacheJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EyesOpen")) {
                faceDetail.setEyesOpen(EyeOpenJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MouthOpen")) {
                faceDetail.setMouthOpen(MouthOpenJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Emotions")) {
                faceDetail.setEmotions(new ListUnmarshaller<Emotion>(EmotionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Landmarks")) {
                faceDetail.setLandmarks(new ListUnmarshaller<Landmark>(LandmarkJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Pose")) {
                faceDetail.setPose(PoseJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Quality")) {
                faceDetail.setQuality(ImageQualityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Confidence")) {
                faceDetail.setConfidence(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceDetail;
    }

    private static FaceDetailJsonUnmarshaller instance;

    public static FaceDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FaceDetailJsonUnmarshaller();
        return instance;
    }
}
