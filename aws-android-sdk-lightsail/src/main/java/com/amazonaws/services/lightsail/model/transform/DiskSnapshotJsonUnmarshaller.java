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
 * JSON unmarshaller for POJO DiskSnapshot
 */
class DiskSnapshotJsonUnmarshaller implements Unmarshaller<DiskSnapshot, JsonUnmarshallerContext> {

    public DiskSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DiskSnapshot diskSnapshot = new DiskSnapshot();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                diskSnapshot.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                diskSnapshot.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                diskSnapshot.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                diskSnapshot.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                diskSnapshot.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                diskSnapshot.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                diskSnapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sizeInGb")) {
                diskSnapshot.setSizeInGb(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                diskSnapshot.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("progress")) {
                diskSnapshot.setProgress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromDiskName")) {
                diskSnapshot.setFromDiskName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromDiskArn")) {
                diskSnapshot.setFromDiskArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromInstanceName")) {
                diskSnapshot.setFromInstanceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fromInstanceArn")) {
                diskSnapshot.setFromInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isFromAutoSnapshot")) {
                diskSnapshot.setIsFromAutoSnapshot(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return diskSnapshot;
    }

    private static DiskSnapshotJsonUnmarshaller instance;

    public static DiskSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DiskSnapshotJsonUnmarshaller();
        return instance;
    }
}
