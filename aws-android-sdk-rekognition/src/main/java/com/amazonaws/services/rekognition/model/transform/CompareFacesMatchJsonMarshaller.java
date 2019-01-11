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
 * JSON marshaller for POJO CompareFacesMatch
 */
class CompareFacesMatchJsonMarshaller {

    public void marshall(CompareFacesMatch compareFacesMatch, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (compareFacesMatch.getSimilarity() != null) {
            Float similarity = compareFacesMatch.getSimilarity();
            jsonWriter.name("Similarity");
            jsonWriter.value(similarity);
        }
        if (compareFacesMatch.getFace() != null) {
            ComparedFace face = compareFacesMatch.getFace();
            jsonWriter.name("Face");
            ComparedFaceJsonMarshaller.getInstance().marshall(face, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CompareFacesMatchJsonMarshaller instance;

    public static CompareFacesMatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CompareFacesMatchJsonMarshaller();
        return instance;
    }
}
