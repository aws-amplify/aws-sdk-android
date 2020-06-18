/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Id3Insertion
 */
class Id3InsertionJsonUnmarshaller implements Unmarshaller<Id3Insertion, JsonUnmarshallerContext> {

    public Id3Insertion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Id3Insertion id3Insertion = new Id3Insertion();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id3")) {
                id3Insertion.setId3(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timecode")) {
                id3Insertion.setTimecode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return id3Insertion;
    }

    private static Id3InsertionJsonUnmarshaller instance;

    public static Id3InsertionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Id3InsertionJsonUnmarshaller();
        return instance;
    }
}
