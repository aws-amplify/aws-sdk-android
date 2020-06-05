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
package com.amazonaws.services.personalize-runtime.model.transform;

import com.amazonaws.services.personalize-runtime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO PredictedItem
 */
class PredictedItemJsonUnmarshaller implements Unmarshaller<PredictedItem, JsonUnmarshallerContext> {

    public PredictedItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PredictedItem predictedItem = new PredictedItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("itemId")) {
                predictedItem.setItemId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("score")) {
                predictedItem.setScore(DoubleJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return predictedItem;
    }

    private static PredictedItemJsonUnmarshaller instance;
    public static PredictedItemJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PredictedItemJsonUnmarshaller();
        return instance;
    }
}
