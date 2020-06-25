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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JsonClassifier
 */
class JsonClassifierJsonUnmarshaller implements
        Unmarshaller<JsonClassifier, JsonUnmarshallerContext> {

    public JsonClassifier unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JsonClassifier jsonClassifier = new JsonClassifier();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                jsonClassifier.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                jsonClassifier.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdated")) {
                jsonClassifier.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                jsonClassifier.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JsonPath")) {
                jsonClassifier.setJsonPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jsonClassifier;
    }

    private static JsonClassifierJsonUnmarshaller instance;

    public static JsonClassifierJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JsonClassifierJsonUnmarshaller();
        return instance;
    }
}
