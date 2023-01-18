/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response SearchQueuesResult
 */
public class SearchQueuesResultJsonUnmarshaller implements
        Unmarshaller<SearchQueuesResult, JsonUnmarshallerContext> {

    public SearchQueuesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchQueuesResult searchQueuesResult = new SearchQueuesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Queues")) {
                searchQueuesResult.setQueues(new ListUnmarshaller<Queue>(QueueJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                searchQueuesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApproximateTotalCount")) {
                searchQueuesResult.setApproximateTotalCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return searchQueuesResult;
    }

    private static SearchQueuesResultJsonUnmarshaller instance;

    public static SearchQueuesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchQueuesResultJsonUnmarshaller();
        return instance;
    }
}
