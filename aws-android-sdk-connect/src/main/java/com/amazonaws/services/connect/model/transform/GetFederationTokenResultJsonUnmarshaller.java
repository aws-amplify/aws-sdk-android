/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetFederationTokenResult
 */
public class GetFederationTokenResultJsonUnmarshaller implements
        Unmarshaller<GetFederationTokenResult, JsonUnmarshallerContext> {

    public GetFederationTokenResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetFederationTokenResult getFederationTokenResult = new GetFederationTokenResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Credentials")) {
                getFederationTokenResult.setCredentials(CredentialsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getFederationTokenResult;
    }

    private static GetFederationTokenResultJsonUnmarshaller instance;

    public static GetFederationTokenResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFederationTokenResultJsonUnmarshaller();
        return instance;
    }
}
