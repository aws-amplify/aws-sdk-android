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
 * JSON unmarshaller for POJO CelebrityDetail
 */
class CelebrityDetailJsonUnmarshaller implements
        Unmarshaller<CelebrityDetail, JsonUnmarshallerContext> {

    public CelebrityDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CelebrityDetail celebrityDetail = new CelebrityDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Urls")) {
                celebrityDetail.setUrls(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                celebrityDetail.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                celebrityDetail.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Confidence")) {
                celebrityDetail.setConfidence(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BoundingBox")) {
                celebrityDetail.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Face")) {
                celebrityDetail.setFace(FaceDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return celebrityDetail;
    }

    private static CelebrityDetailJsonUnmarshaller instance;

    public static CelebrityDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CelebrityDetailJsonUnmarshaller();
        return instance;
    }
}
