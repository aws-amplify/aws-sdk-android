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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UtteranceData
 */
class UtteranceDataJsonUnmarshaller implements Unmarshaller<UtteranceData, JsonUnmarshallerContext> {

    public UtteranceData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UtteranceData utteranceData = new UtteranceData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("utteranceString")) {
                utteranceData.setUtteranceString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("count")) {
                utteranceData.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("distinctUsers")) {
                utteranceData.setDistinctUsers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("firstUtteredDate")) {
                utteranceData.setFirstUtteredDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUtteredDate")) {
                utteranceData.setLastUtteredDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return utteranceData;
    }

    private static UtteranceDataJsonUnmarshaller instance;

    public static UtteranceDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UtteranceDataJsonUnmarshaller();
        return instance;
    }
}
