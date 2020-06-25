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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Connection
 */
class ConnectionJsonUnmarshaller implements Unmarshaller<Connection, JsonUnmarshallerContext> {

    public Connection unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Connection connection = new Connection();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                connection.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                connection.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionType")) {
                connection.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MatchCriteria")) {
                connection.setMatchCriteria(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConnectionProperties")) {
                connection.setConnectionProperties(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PhysicalConnectionRequirements")) {
                connection
                        .setPhysicalConnectionRequirements(PhysicalConnectionRequirementsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                connection.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                connection.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedBy")) {
                connection.setLastUpdatedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return connection;
    }

    private static ConnectionJsonUnmarshaller instance;

    public static ConnectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionJsonUnmarshaller();
        return instance;
    }
}
