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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCustomDataIdentifierResult
 */
public class GetCustomDataIdentifierResultJsonUnmarshaller implements
        Unmarshaller<GetCustomDataIdentifierResult, JsonUnmarshallerContext> {

    public GetCustomDataIdentifierResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetCustomDataIdentifierResult getCustomDataIdentifierResult = new GetCustomDataIdentifierResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                getCustomDataIdentifierResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                getCustomDataIdentifierResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deleted")) {
                getCustomDataIdentifierResult.setDeleted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getCustomDataIdentifierResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("id")) {
                getCustomDataIdentifierResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ignoreWords")) {
                getCustomDataIdentifierResult.setIgnoreWords(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("keywords")) {
                getCustomDataIdentifierResult.setKeywords(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("maximumMatchDistance")) {
                getCustomDataIdentifierResult.setMaximumMatchDistance(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                getCustomDataIdentifierResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("regex")) {
                getCustomDataIdentifierResult.setRegex(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                getCustomDataIdentifierResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCustomDataIdentifierResult;
    }

    private static GetCustomDataIdentifierResultJsonUnmarshaller instance;

    public static GetCustomDataIdentifierResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCustomDataIdentifierResultJsonUnmarshaller();
        return instance;
    }
}
