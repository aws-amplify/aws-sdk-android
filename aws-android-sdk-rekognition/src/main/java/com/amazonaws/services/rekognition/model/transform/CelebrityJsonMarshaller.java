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
 * JSON marshaller for POJO Celebrity
 */
class CelebrityJsonMarshaller {

    public void marshall(Celebrity celebrity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (celebrity.getUrls() != null) {
            java.util.List<String> urls = celebrity.getUrls();
            jsonWriter.name("Urls");
            jsonWriter.beginArray();
            for (String urlsItem : urls) {
                if (urlsItem != null) {
                    jsonWriter.value(urlsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (celebrity.getName() != null) {
            String name = celebrity.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (celebrity.getId() != null) {
            String id = celebrity.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (celebrity.getFace() != null) {
            ComparedFace face = celebrity.getFace();
            jsonWriter.name("Face");
            ComparedFaceJsonMarshaller.getInstance().marshall(face, jsonWriter);
        }
        if (celebrity.getMatchConfidence() != null) {
            Float matchConfidence = celebrity.getMatchConfidence();
            jsonWriter.name("MatchConfidence");
            jsonWriter.value(matchConfidence);
        }
        jsonWriter.endObject();
    }

    private static CelebrityJsonMarshaller instance;

    public static CelebrityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CelebrityJsonMarshaller();
        return instance;
    }
}
