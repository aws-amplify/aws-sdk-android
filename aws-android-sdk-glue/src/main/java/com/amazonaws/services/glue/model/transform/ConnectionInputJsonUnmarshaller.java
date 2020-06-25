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
 * JSON unmarshaller for POJO ConnectionInput
 */
class ConnectionInputJsonUnmarshaller implements
        Unmarshaller<ConnectionInput, JsonUnmarshallerContext> {

    public ConnectionInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ConnectionInput connectionInput = new ConnectionInput();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                connectionInput.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                connectionInput.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionType")) {
                connectionInput.setConnectionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MatchCriteria")) {
                connectionInput.setMatchCriteria(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConnectionProperties")) {
                connectionInput.setConnectionProperties(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PhysicalConnectionRequirements")) {
                connectionInput
                        .setPhysicalConnectionRequirements(PhysicalConnectionRequirementsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return connectionInput;
    }

    private static ConnectionInputJsonUnmarshaller instance;

    public static ConnectionInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionInputJsonUnmarshaller();
        return instance;
    }
}
