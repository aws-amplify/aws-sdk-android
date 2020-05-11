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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListDataSourceSyncJobsResult
 */
public class ListDataSourceSyncJobsResultJsonUnmarshaller implements
        Unmarshaller<ListDataSourceSyncJobsResult, JsonUnmarshallerContext> {

    public ListDataSourceSyncJobsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListDataSourceSyncJobsResult listDataSourceSyncJobsResult = new ListDataSourceSyncJobsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("History")) {
                listDataSourceSyncJobsResult.setHistory(new ListUnmarshaller<DataSourceSyncJob>(
                        DataSourceSyncJobJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listDataSourceSyncJobsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listDataSourceSyncJobsResult;
    }

    private static ListDataSourceSyncJobsResultJsonUnmarshaller instance;

    public static ListDataSourceSyncJobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListDataSourceSyncJobsResultJsonUnmarshaller();
        return instance;
    }
}
