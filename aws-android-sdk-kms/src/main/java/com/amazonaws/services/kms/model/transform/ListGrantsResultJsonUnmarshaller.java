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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListGrantsResult
 */
public class ListGrantsResultJsonUnmarshaller implements
        Unmarshaller<ListGrantsResult, JsonUnmarshallerContext> {

    public ListGrantsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListGrantsResult listGrantsResult = new ListGrantsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Grants")) {
                listGrantsResult.setGrants(new ListUnmarshaller<GrantListEntry>(
                        GrantListEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextMarker")) {
                listGrantsResult.setNextMarker(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Truncated")) {
                listGrantsResult.setTruncated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listGrantsResult;
    }

    private static ListGrantsResultJsonUnmarshaller instance;

    public static ListGrantsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListGrantsResultJsonUnmarshaller();
        return instance;
    }
}
