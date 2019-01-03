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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response PostTextResult
 */
public class PostTextResultJsonUnmarshaller implements
        Unmarshaller<PostTextResult, JsonUnmarshallerContext> {

    public PostTextResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostTextResult postTextResult = new PostTextResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("intentName")) {
                postTextResult.setIntentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slots")) {
                postTextResult.setSlots(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sessionAttributes")) {
                postTextResult.setSessionAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("message")) {
                postTextResult.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("messageFormat")) {
                postTextResult.setMessageFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dialogState")) {
                postTextResult.setDialogState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slotToElicit")) {
                postTextResult.setSlotToElicit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("responseCard")) {
                postTextResult.setResponseCard(ResponseCardJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return postTextResult;
    }

    private static PostTextResultJsonUnmarshaller instance;

    public static PostTextResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostTextResultJsonUnmarshaller();
        return instance;
    }
}
