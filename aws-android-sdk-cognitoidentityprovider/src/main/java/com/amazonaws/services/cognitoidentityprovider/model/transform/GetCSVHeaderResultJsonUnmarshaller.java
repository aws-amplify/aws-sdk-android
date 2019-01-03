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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCSVHeaderResult
 */
public class GetCSVHeaderResultJsonUnmarshaller implements
        Unmarshaller<GetCSVHeaderResult, JsonUnmarshallerContext> {

    public GetCSVHeaderResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCSVHeaderResult getCSVHeaderResult = new GetCSVHeaderResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserPoolId")) {
                getCSVHeaderResult.setUserPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CSVHeader")) {
                getCSVHeaderResult.setCSVHeader(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCSVHeaderResult;
    }

    private static GetCSVHeaderResultJsonUnmarshaller instance;

    public static GetCSVHeaderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCSVHeaderResultJsonUnmarshaller();
        return instance;
    }
}
