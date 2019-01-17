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

package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Landmark Type
 */
public enum LandmarkType {

    EyeLeft("eyeLeft"),
    EyeRight("eyeRight"),
    Nose("nose"),
    MouthLeft("mouthLeft"),
    MouthRight("mouthRight"),
    LeftEyeBrowLeft("leftEyeBrowLeft"),
    LeftEyeBrowRight("leftEyeBrowRight"),
    LeftEyeBrowUp("leftEyeBrowUp"),
    RightEyeBrowLeft("rightEyeBrowLeft"),
    RightEyeBrowRight("rightEyeBrowRight"),
    RightEyeBrowUp("rightEyeBrowUp"),
    LeftEyeLeft("leftEyeLeft"),
    LeftEyeRight("leftEyeRight"),
    LeftEyeUp("leftEyeUp"),
    LeftEyeDown("leftEyeDown"),
    RightEyeLeft("rightEyeLeft"),
    RightEyeRight("rightEyeRight"),
    RightEyeUp("rightEyeUp"),
    RightEyeDown("rightEyeDown"),
    NoseLeft("noseLeft"),
    NoseRight("noseRight"),
    MouthUp("mouthUp"),
    MouthDown("mouthDown"),
    LeftPupil("leftPupil"),
    RightPupil("rightPupil");

    private String value;

    private LandmarkType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LandmarkType> enumMap;
    static {
        enumMap = new HashMap<String, LandmarkType>();
        enumMap.put("eyeLeft", EyeLeft);
        enumMap.put("eyeRight", EyeRight);
        enumMap.put("nose", Nose);
        enumMap.put("mouthLeft", MouthLeft);
        enumMap.put("mouthRight", MouthRight);
        enumMap.put("leftEyeBrowLeft", LeftEyeBrowLeft);
        enumMap.put("leftEyeBrowRight", LeftEyeBrowRight);
        enumMap.put("leftEyeBrowUp", LeftEyeBrowUp);
        enumMap.put("rightEyeBrowLeft", RightEyeBrowLeft);
        enumMap.put("rightEyeBrowRight", RightEyeBrowRight);
        enumMap.put("rightEyeBrowUp", RightEyeBrowUp);
        enumMap.put("leftEyeLeft", LeftEyeLeft);
        enumMap.put("leftEyeRight", LeftEyeRight);
        enumMap.put("leftEyeUp", LeftEyeUp);
        enumMap.put("leftEyeDown", LeftEyeDown);
        enumMap.put("rightEyeLeft", RightEyeLeft);
        enumMap.put("rightEyeRight", RightEyeRight);
        enumMap.put("rightEyeUp", RightEyeUp);
        enumMap.put("rightEyeDown", RightEyeDown);
        enumMap.put("noseLeft", NoseLeft);
        enumMap.put("noseRight", NoseRight);
        enumMap.put("mouthUp", MouthUp);
        enumMap.put("mouthDown", MouthDown);
        enumMap.put("leftPupil", LeftPupil);
        enumMap.put("rightPupil", RightPupil);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LandmarkType corresponding to the value
     */
    public static LandmarkType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
