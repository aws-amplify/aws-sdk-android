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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response FilterLogEventsResult
 */
public class FilterLogEventsResultJsonUnmarshaller implements
        Unmarshaller<FilterLogEventsResult, JsonUnmarshallerContext> {

    public FilterLogEventsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilterLogEventsResult filterLogEventsResult = new FilterLogEventsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("events")) {
                filterLogEventsResult.setEvents(new ListUnmarshaller<FilteredLogEvent>(
                        FilteredLogEventJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("searchedLogStreams")) {
                filterLogEventsResult
                        .setSearchedLogStreams(new ListUnmarshaller<SearchedLogStream>(
                                SearchedLogStreamJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                filterLogEventsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return filterLogEventsResult;
    }

    private static FilterLogEventsResultJsonUnmarshaller instance;

    public static FilterLogEventsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilterLogEventsResultJsonUnmarshaller();
        return instance;
    }
}
