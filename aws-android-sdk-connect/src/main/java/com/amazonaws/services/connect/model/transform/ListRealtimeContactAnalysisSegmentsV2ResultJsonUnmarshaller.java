/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response ListRealtimeContactAnalysisSegmentsV2Result
 */
public class ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller implements
        Unmarshaller<ListRealtimeContactAnalysisSegmentsV2Result, JsonUnmarshallerContext> {

    public ListRealtimeContactAnalysisSegmentsV2Result unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListRealtimeContactAnalysisSegmentsV2Result listRealtimeContactAnalysisSegmentsV2Result = new ListRealtimeContactAnalysisSegmentsV2Result();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Channel")) {
                listRealtimeContactAnalysisSegmentsV2Result.setChannel(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                listRealtimeContactAnalysisSegmentsV2Result.setStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Segments")) {
                listRealtimeContactAnalysisSegmentsV2Result
                        .setSegments(new ListUnmarshaller<RealtimeContactAnalysisSegment>(
                                RealtimeContactAnalysisSegmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listRealtimeContactAnalysisSegmentsV2Result.setNextToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listRealtimeContactAnalysisSegmentsV2Result;
    }

    private static ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller instance;

    public static ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller();
        return instance;
    }
}
