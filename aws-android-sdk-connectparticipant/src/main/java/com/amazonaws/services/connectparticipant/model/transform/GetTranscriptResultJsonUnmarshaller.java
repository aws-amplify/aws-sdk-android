/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetTranscriptResult
 */
public class GetTranscriptResultJsonUnmarshaller implements
        Unmarshaller<GetTranscriptResult, JsonUnmarshallerContext> {

    public GetTranscriptResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTranscriptResult getTranscriptResult = new GetTranscriptResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InitialContactId")) {
                getTranscriptResult.setInitialContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Transcript")) {
                getTranscriptResult.setTranscript(new ListUnmarshaller<Item>(ItemJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getTranscriptResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getTranscriptResult;
    }

    private static GetTranscriptResultJsonUnmarshaller instance;

    public static GetTranscriptResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTranscriptResultJsonUnmarshaller();
        return instance;
    }
}
