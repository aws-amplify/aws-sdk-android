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
 * JSON marshaller for POJO Landmark
 */
class LandmarkJsonMarshaller {

    public void marshall(Landmark landmark, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (landmark.getType() != null) {
            String type = landmark.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (landmark.getX() != null) {
            Float x = landmark.getX();
            jsonWriter.name("X");
            jsonWriter.value(x);
        }
        if (landmark.getY() != null) {
            Float y = landmark.getY();
            jsonWriter.name("Y");
            jsonWriter.value(y);
        }
        jsonWriter.endObject();
    }

    private static LandmarkJsonMarshaller instance;

    public static LandmarkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LandmarkJsonMarshaller();
        return instance;
    }
}
