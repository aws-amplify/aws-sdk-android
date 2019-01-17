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
 * JSON marshaller for POJO CelebrityDetail
 */
class CelebrityDetailJsonMarshaller {

    public void marshall(CelebrityDetail celebrityDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (celebrityDetail.getUrls() != null) {
            java.util.List<String> urls = celebrityDetail.getUrls();
            jsonWriter.name("Urls");
            jsonWriter.beginArray();
            for (String urlsItem : urls) {
                if (urlsItem != null) {
                    jsonWriter.value(urlsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (celebrityDetail.getName() != null) {
            String name = celebrityDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (celebrityDetail.getId() != null) {
            String id = celebrityDetail.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (celebrityDetail.getConfidence() != null) {
            Float confidence = celebrityDetail.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (celebrityDetail.getBoundingBox() != null) {
            BoundingBox boundingBox = celebrityDetail.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (celebrityDetail.getFace() != null) {
            FaceDetail face = celebrityDetail.getFace();
            jsonWriter.name("Face");
            FaceDetailJsonMarshaller.getInstance().marshall(face, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CelebrityDetailJsonMarshaller instance;

    public static CelebrityDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CelebrityDetailJsonMarshaller();
        return instance;
    }
}
