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
 * JSON unmarshaller for POJO RelationalDatabaseEndpoint
 */
class RelationalDatabaseEndpointJsonUnmarshaller implements
        Unmarshaller<RelationalDatabaseEndpoint, JsonUnmarshallerContext> {

    public RelationalDatabaseEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RelationalDatabaseEndpoint relationalDatabaseEndpoint = new RelationalDatabaseEndpoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("port")) {
                relationalDatabaseEndpoint.setPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("address")) {
                relationalDatabaseEndpoint.setAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return relationalDatabaseEndpoint;
    }

    private static RelationalDatabaseEndpointJsonUnmarshaller instance;

    public static RelationalDatabaseEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseEndpointJsonUnmarshaller();
        return instance;
    }
}
