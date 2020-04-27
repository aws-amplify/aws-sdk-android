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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListProcessingJobsResult
 */
public class ListProcessingJobsResultJsonUnmarshaller implements
        Unmarshaller<ListProcessingJobsResult, JsonUnmarshallerContext> {

    public ListProcessingJobsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListProcessingJobsResult listProcessingJobsResult = new ListProcessingJobsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProcessingJobSummaries")) {
                listProcessingJobsResult
                        .setProcessingJobSummaries(new ListUnmarshaller<ProcessingJobSummary>(
                                ProcessingJobSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listProcessingJobsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listProcessingJobsResult;
    }

    private static ListProcessingJobsResultJsonUnmarshaller instance;

    public static ListProcessingJobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListProcessingJobsResultJsonUnmarshaller();
        return instance;
    }
}
