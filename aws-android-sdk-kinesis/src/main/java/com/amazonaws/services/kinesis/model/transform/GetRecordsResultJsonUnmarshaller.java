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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetRecordsResult
 */
public class GetRecordsResultJsonUnmarshaller implements
        Unmarshaller<GetRecordsResult, JsonUnmarshallerContext> {

    public GetRecordsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecordsResult getRecordsResult = new GetRecordsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Records")) {
                getRecordsResult.setRecords(new ListUnmarshaller<Record>(RecordJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextShardIterator")) {
                getRecordsResult.setNextShardIterator(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MillisBehindLatest")) {
                getRecordsResult.setMillisBehindLatest(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRecordsResult;
    }

    private static GetRecordsResultJsonUnmarshaller instance;

    public static GetRecordsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRecordsResultJsonUnmarshaller();
        return instance;
    }
}
