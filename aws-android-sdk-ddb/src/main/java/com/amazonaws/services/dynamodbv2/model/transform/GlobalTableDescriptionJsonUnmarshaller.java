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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO GlobalTableDescription
 */
class GlobalTableDescriptionJsonUnmarshaller implements
        Unmarshaller<GlobalTableDescription, JsonUnmarshallerContext> {

    public GlobalTableDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GlobalTableDescription globalTableDescription = new GlobalTableDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReplicationGroup")) {
                globalTableDescription
                        .setReplicationGroup(new ListUnmarshaller<ReplicaDescription>(
                                ReplicaDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("GlobalTableArn")) {
                globalTableDescription.setGlobalTableArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDateTime")) {
                globalTableDescription.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlobalTableStatus")) {
                globalTableDescription.setGlobalTableStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlobalTableName")) {
                globalTableDescription.setGlobalTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return globalTableDescription;
    }

    private static GlobalTableDescriptionJsonUnmarshaller instance;

    public static GlobalTableDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GlobalTableDescriptionJsonUnmarshaller();
        return instance;
    }
}
