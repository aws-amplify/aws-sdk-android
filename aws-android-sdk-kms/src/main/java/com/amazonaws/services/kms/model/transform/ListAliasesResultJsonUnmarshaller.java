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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListAliasesResult
 */
public class ListAliasesResultJsonUnmarshaller implements
        Unmarshaller<ListAliasesResult, JsonUnmarshallerContext> {

    public ListAliasesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListAliasesResult listAliasesResult = new ListAliasesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Aliases")) {
                listAliasesResult.setAliases(new ListUnmarshaller<AliasListEntry>(
                        AliasListEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextMarker")) {
                listAliasesResult.setNextMarker(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Truncated")) {
                listAliasesResult.setTruncated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listAliasesResult;
    }

    private static ListAliasesResultJsonUnmarshaller instance;

    public static ListAliasesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListAliasesResultJsonUnmarshaller();
        return instance;
    }
}
