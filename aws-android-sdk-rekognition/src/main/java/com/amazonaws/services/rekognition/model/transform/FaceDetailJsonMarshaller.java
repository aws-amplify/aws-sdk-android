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
 * JSON marshaller for POJO FaceDetail
 */
class FaceDetailJsonMarshaller {

    public void marshall(FaceDetail faceDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (faceDetail.getBoundingBox() != null) {
            BoundingBox boundingBox = faceDetail.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (faceDetail.getAgeRange() != null) {
            AgeRange ageRange = faceDetail.getAgeRange();
            jsonWriter.name("AgeRange");
            AgeRangeJsonMarshaller.getInstance().marshall(ageRange, jsonWriter);
        }
        if (faceDetail.getSmile() != null) {
            Smile smile = faceDetail.getSmile();
            jsonWriter.name("Smile");
            SmileJsonMarshaller.getInstance().marshall(smile, jsonWriter);
        }
        if (faceDetail.getEyeglasses() != null) {
            Eyeglasses eyeglasses = faceDetail.getEyeglasses();
            jsonWriter.name("Eyeglasses");
            EyeglassesJsonMarshaller.getInstance().marshall(eyeglasses, jsonWriter);
        }
        if (faceDetail.getSunglasses() != null) {
            Sunglasses sunglasses = faceDetail.getSunglasses();
            jsonWriter.name("Sunglasses");
            SunglassesJsonMarshaller.getInstance().marshall(sunglasses, jsonWriter);
        }
        if (faceDetail.getGender() != null) {
            Gender gender = faceDetail.getGender();
            jsonWriter.name("Gender");
            GenderJsonMarshaller.getInstance().marshall(gender, jsonWriter);
        }
        if (faceDetail.getBeard() != null) {
            Beard beard = faceDetail.getBeard();
            jsonWriter.name("Beard");
            BeardJsonMarshaller.getInstance().marshall(beard, jsonWriter);
        }
        if (faceDetail.getMustache() != null) {
            Mustache mustache = faceDetail.getMustache();
            jsonWriter.name("Mustache");
            MustacheJsonMarshaller.getInstance().marshall(mustache, jsonWriter);
        }
        if (faceDetail.getEyesOpen() != null) {
            EyeOpen eyesOpen = faceDetail.getEyesOpen();
            jsonWriter.name("EyesOpen");
            EyeOpenJsonMarshaller.getInstance().marshall(eyesOpen, jsonWriter);
        }
        if (faceDetail.getMouthOpen() != null) {
            MouthOpen mouthOpen = faceDetail.getMouthOpen();
            jsonWriter.name("MouthOpen");
            MouthOpenJsonMarshaller.getInstance().marshall(mouthOpen, jsonWriter);
        }
        if (faceDetail.getEmotions() != null) {
            java.util.List<Emotion> emotions = faceDetail.getEmotions();
            jsonWriter.name("Emotions");
            jsonWriter.beginArray();
            for (Emotion emotionsItem : emotions) {
                if (emotionsItem != null) {
                    EmotionJsonMarshaller.getInstance().marshall(emotionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (faceDetail.getLandmarks() != null) {
            java.util.List<Landmark> landmarks = faceDetail.getLandmarks();
            jsonWriter.name("Landmarks");
            jsonWriter.beginArray();
            for (Landmark landmarksItem : landmarks) {
                if (landmarksItem != null) {
                    LandmarkJsonMarshaller.getInstance().marshall(landmarksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (faceDetail.getPose() != null) {
            Pose pose = faceDetail.getPose();
            jsonWriter.name("Pose");
            PoseJsonMarshaller.getInstance().marshall(pose, jsonWriter);
        }
        if (faceDetail.getQuality() != null) {
            ImageQuality quality = faceDetail.getQuality();
            jsonWriter.name("Quality");
            ImageQualityJsonMarshaller.getInstance().marshall(quality, jsonWriter);
        }
        if (faceDetail.getConfidence() != null) {
            Float confidence = faceDetail.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static FaceDetailJsonMarshaller instance;

    public static FaceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaceDetailJsonMarshaller();
        return instance;
    }
}
