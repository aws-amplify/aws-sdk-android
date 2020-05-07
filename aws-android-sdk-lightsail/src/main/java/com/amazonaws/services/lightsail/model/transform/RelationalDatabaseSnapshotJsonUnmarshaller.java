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
 * JSON unmarshaller for POJO RelationalDatabaseSnapshot
 */
class RelationalDatabaseSnapshotJsonUnmarshaller implements
        Unmarshaller<RelationalDatabaseSnapshot, JsonUnmarshallerContext> {

    public RelationalDatabaseSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RelationalDatabaseSnapshot relationalDatabaseSnapshot = new RelationalDatabaseSnapshot();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                relationalDatabaseSnapshot.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                relationalDatabaseSnapshot.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                relationalDatabaseSnapshot.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                relationalDatabaseSnapshot.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                relationalDatabaseSnapshot.setLocation(ResourceLocationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                relationalDatabaseSnapshot.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                relationalDatabaseSnapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("engine")) {
                relationalDatabaseSnapshot.setEngine(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("engineVersion")) {
                relationalDatabaseSnapshot.setEngineVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sizeInGb")) {
                relationalDatabaseSnapshot.setSizeInGb(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                relationalDatabaseSnapshot.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromRelationalDatabaseName")) {
                relationalDatabaseSnapshot.setFromRelationalDatabaseName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromRelationalDatabaseArn")) {
                relationalDatabaseSnapshot.setFromRelationalDatabaseArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromRelationalDatabaseBundleId")) {
                relationalDatabaseSnapshot.setFromRelationalDatabaseBundleId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromRelationalDatabaseBlueprintId")) {
                relationalDatabaseSnapshot
                        .setFromRelationalDatabaseBlueprintId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return relationalDatabaseSnapshot;
    }

    private static RelationalDatabaseSnapshotJsonUnmarshaller instance;

    public static RelationalDatabaseSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseSnapshotJsonUnmarshaller();
        return instance;
    }
}
