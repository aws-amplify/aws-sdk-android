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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListTemplateAliasesResult
 */
public class ListTemplateAliasesResultJsonUnmarshaller implements
        Unmarshaller<ListTemplateAliasesResult, JsonUnmarshallerContext> {

    public ListTemplateAliasesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListTemplateAliasesResult listTemplateAliasesResult = new ListTemplateAliasesResult();

        listTemplateAliasesResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TemplateAliasList")) {
                listTemplateAliasesResult.setTemplateAliasList(new ListUnmarshaller<TemplateAlias>(
                        TemplateAliasJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                listTemplateAliasesResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                listTemplateAliasesResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listTemplateAliasesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listTemplateAliasesResult;
    }

    private static ListTemplateAliasesResultJsonUnmarshaller instance;

    public static ListTemplateAliasesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListTemplateAliasesResultJsonUnmarshaller();
        return instance;
    }
}
