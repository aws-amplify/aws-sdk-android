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
 * JSON unmarshaller for POJO InstanceSnapshot
 */
class InstanceSnapshotJsonUnmarshaller implements
        Unmarshaller<InstanceSnapshot, JsonUnmarshallerContext> {

    public InstanceSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceSnapshot instanceSnapshot = new InstanceSnapshot();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                instanceSnapshot.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                instanceSnapshot.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                instanceSnapshot.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                instanceSnapshot.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                instanceSnapshot.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                instanceSnapshot.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                instanceSnapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("state")) {
                instanceSnapshot.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("progress")) {
                instanceSnapshot.setProgress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromAttachedDisks")) {
                instanceSnapshot.setFromAttachedDisks(new ListUnmarshaller<Disk>(
                        DiskJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("fromInstanceName")) {
                instanceSnapshot.setFromInstanceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromInstanceArn")) {
                instanceSnapshot.setFromInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromBlueprintId")) {
                instanceSnapshot.setFromBlueprintId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromBundleId")) {
                instanceSnapshot.setFromBundleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isFromAutoSnapshot")) {
                instanceSnapshot.setIsFromAutoSnapshot(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sizeInGb")) {
                instanceSnapshot.setSizeInGb(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceSnapshot;
    }

    private static InstanceSnapshotJsonUnmarshaller instance;

    public static InstanceSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceSnapshotJsonUnmarshaller();
        return instance;
    }
}
