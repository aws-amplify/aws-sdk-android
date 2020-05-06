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
package com.amazonaws.services.codestar-connections.model.transform;

import com.amazonaws.services.codestar-connections.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response ListConnectionsResult
 */
public class ListConnectionsResultJsonUnmarshaller implements Unmarshaller<ListConnectionsResult, JsonUnmarshallerContext> {

    public ListConnectionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListConnectionsResult listConnectionsResult = new ListConnectionsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Connections")) {
                listConnectionsResult.setConnections(new ListUnmarshaller<Connection>(ConnectionJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("NextToken")) {
                listConnectionsResult.setNextToken(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listConnectionsResult;
    }

    private static ListConnectionsResultJsonUnmarshaller instance;
    public static ListConnectionsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ListConnectionsResultJsonUnmarshaller();
        return instance;
    }
}
