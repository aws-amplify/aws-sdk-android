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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NamedQuery
 */
class NamedQueryJsonUnmarshaller implements Unmarshaller<NamedQuery, JsonUnmarshallerContext> {

    public NamedQuery unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NamedQuery namedQuery = new NamedQuery();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                namedQuery.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                namedQuery.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Database")) {
                namedQuery.setDatabase(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QueryString")) {
                namedQuery.setQueryString(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NamedQueryId")) {
                namedQuery.setNamedQueryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkGroup")) {
                namedQuery.setWorkGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return namedQuery;
    }

    private static NamedQueryJsonUnmarshaller instance;

    public static NamedQueryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NamedQueryJsonUnmarshaller();
        return instance;
    }
}
