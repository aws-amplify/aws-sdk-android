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

package com.amazonaws.services.servicediscovery.model.transform;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListOperationsResult
 */
public class ListOperationsResultJsonUnmarshaller implements
        Unmarshaller<ListOperationsResult, JsonUnmarshallerContext> {

    public ListOperationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListOperationsResult listOperationsResult = new ListOperationsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Operations")) {
                listOperationsResult.setOperations(new ListUnmarshaller<OperationSummary>(
                        OperationSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listOperationsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listOperationsResult;
    }

    private static ListOperationsResultJsonUnmarshaller instance;

    public static ListOperationsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListOperationsResultJsonUnmarshaller();
        return instance;
    }
}
