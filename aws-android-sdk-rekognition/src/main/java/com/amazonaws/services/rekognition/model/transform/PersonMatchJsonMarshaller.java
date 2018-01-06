/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO PersonMatch
 */
class PersonMatchJsonMarshaller {

    public void marshall(PersonMatch personMatch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (personMatch.getTimestamp() != null) {
            Long timestamp = personMatch.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        if (personMatch.getPerson() != null) {
            PersonDetail person = personMatch.getPerson();
            jsonWriter.name("Person");
            PersonDetailJsonMarshaller.getInstance().marshall(person, jsonWriter);
        }
        if (personMatch.getFaceMatches() != null) {
            java.util.List<FaceMatch> faceMatches = personMatch.getFaceMatches();
            jsonWriter.name("FaceMatches");
            jsonWriter.beginArray();
            for (FaceMatch faceMatchesItem : faceMatches) {
                if (faceMatchesItem != null) {
                    FaceMatchJsonMarshaller.getInstance().marshall(faceMatchesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PersonMatchJsonMarshaller instance;

    public static PersonMatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PersonMatchJsonMarshaller();
        return instance;
    }
}
