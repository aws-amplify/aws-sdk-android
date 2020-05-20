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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListGitHubAccountTokenNamesResult
 */
public class ListGitHubAccountTokenNamesResultJsonUnmarshaller implements
        Unmarshaller<ListGitHubAccountTokenNamesResult, JsonUnmarshallerContext> {

    public ListGitHubAccountTokenNamesResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListGitHubAccountTokenNamesResult listGitHubAccountTokenNamesResult = new ListGitHubAccountTokenNamesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("tokenNameList")) {
                listGitHubAccountTokenNamesResult.setTokenNameList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listGitHubAccountTokenNamesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listGitHubAccountTokenNamesResult;
    }

    private static ListGitHubAccountTokenNamesResultJsonUnmarshaller instance;

    public static ListGitHubAccountTokenNamesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListGitHubAccountTokenNamesResultJsonUnmarshaller();
        return instance;
    }
}
