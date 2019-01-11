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
 * JSON unmarshaller for POJO PersonDetail
 */
class PersonDetailJsonUnmarshaller implements Unmarshaller<PersonDetail, JsonUnmarshallerContext> {

    public PersonDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PersonDetail personDetail = new PersonDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Index")) {
                personDetail.setIndex(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BoundingBox")) {
                personDetail.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Face")) {
                personDetail.setFace(FaceDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return personDetail;
    }

    private static PersonDetailJsonUnmarshaller instance;

    public static PersonDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PersonDetailJsonUnmarshaller();
        return instance;
    }
}
