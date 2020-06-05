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
 * JSON unmarshaller for response GetRecommendationsResult
 */
public class GetRecommendationsResultJsonUnmarshaller implements Unmarshaller<GetRecommendationsResult, JsonUnmarshallerContext> {

    public GetRecommendationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecommendationsResult getRecommendationsResult = new GetRecommendationsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("itemList")) {
                getRecommendationsResult.setItemList(new ListUnmarshaller<PredictedItem>(PredictedItemJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRecommendationsResult;
    }

    private static GetRecommendationsResultJsonUnmarshaller instance;
    public static GetRecommendationsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetRecommendationsResultJsonUnmarshaller();
        return instance;
    }
}
