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

package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListRecordsResult
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class ListRecordsResultJsonUnmarshaller implements
        Unmarshaller<ListRecordsResult, JsonUnmarshallerContext> {

    public ListRecordsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListRecordsResult listRecordsResult = new ListRecordsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Records")) {
                listRecordsResult.setRecords(new ListUnmarshaller<Record>(RecordJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listRecordsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Count")) {
                listRecordsResult.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatasetSyncCount")) {
                listRecordsResult.setDatasetSyncCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                listRecordsResult.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MergedDatasetNames")) {
                listRecordsResult.setMergedDatasetNames(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DatasetExists")) {
                listRecordsResult.setDatasetExists(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatasetDeletedAfterRequestedSyncCount")) {
                listRecordsResult.setDatasetDeletedAfterRequestedSyncCount(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SyncSessionToken")) {
                listRecordsResult.setSyncSessionToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listRecordsResult;
    }

    private static ListRecordsResultJsonUnmarshaller instance;

    public static ListRecordsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRecordsResultJsonUnmarshaller();
        return instance;
    }
}
