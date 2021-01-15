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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListIdentityPoolsResult
 */
public class ListIdentityPoolsResultJsonUnmarshaller implements
        Unmarshaller<ListIdentityPoolsResult, JsonUnmarshallerContext> {

    public ListIdentityPoolsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListIdentityPoolsResult listIdentityPoolsResult = new ListIdentityPoolsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IdentityPools")) {
                listIdentityPoolsResult
                        .setIdentityPools(new ListUnmarshaller<IdentityPoolShortDescription>(
                                IdentityPoolShortDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listIdentityPoolsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listIdentityPoolsResult;
    }

    private static ListIdentityPoolsResultJsonUnmarshaller instance;

    public static ListIdentityPoolsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListIdentityPoolsResultJsonUnmarshaller();
        return instance;
    }
}
