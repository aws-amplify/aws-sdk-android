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
 * JSON unmarshaller for POJO SqlServerParameters
 */
class SqlServerParametersJsonUnmarshaller implements
        Unmarshaller<SqlServerParameters, JsonUnmarshallerContext> {

    public SqlServerParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SqlServerParameters sqlServerParameters = new SqlServerParameters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Host")) {
                sqlServerParameters.setHost(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Port")) {
                sqlServerParameters.setPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Database")) {
                sqlServerParameters.setDatabase(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sqlServerParameters;
    }

    private static SqlServerParametersJsonUnmarshaller instance;

    public static SqlServerParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SqlServerParametersJsonUnmarshaller();
        return instance;
    }
}
