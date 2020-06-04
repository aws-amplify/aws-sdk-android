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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetRelationalDatabasesResult
 */
public class GetRelationalDatabasesResultJsonUnmarshaller implements
        Unmarshaller<GetRelationalDatabasesResult, JsonUnmarshallerContext> {

    public GetRelationalDatabasesResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetRelationalDatabasesResult getRelationalDatabasesResult = new GetRelationalDatabasesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("relationalDatabases")) {
                getRelationalDatabasesResult
                        .setRelationalDatabases(new ListUnmarshaller<RelationalDatabase>(
                                RelationalDatabaseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextPageToken")) {
                getRelationalDatabasesResult.setNextPageToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getRelationalDatabasesResult;
    }

    private static GetRelationalDatabasesResultJsonUnmarshaller instance;

    public static GetRelationalDatabasesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRelationalDatabasesResultJsonUnmarshaller();
        return instance;
    }
}
