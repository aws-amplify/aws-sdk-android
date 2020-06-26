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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListIngestionsResult
 */
public class ListIngestionsResultJsonUnmarshaller implements
        Unmarshaller<ListIngestionsResult, JsonUnmarshallerContext> {

    public ListIngestionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListIngestionsResult listIngestionsResult = new ListIngestionsResult();

        listIngestionsResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ingestions")) {
                listIngestionsResult.setIngestions(new ListUnmarshaller<Ingestion>(
                        IngestionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listIngestionsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                listIngestionsResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                listIngestionsResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listIngestionsResult;
    }

    private static ListIngestionsResultJsonUnmarshaller instance;

    public static ListIngestionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListIngestionsResultJsonUnmarshaller();
        return instance;
    }
}
