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
 * JSON unmarshaller for POJO Disk
 */
class DiskJsonUnmarshaller implements Unmarshaller<Disk, JsonUnmarshallerContext> {

    public Disk unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Disk disk = new Disk();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                disk.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                disk.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                disk.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                disk.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                disk.setLocation(ResourceLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                disk.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                disk.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("addOns")) {
                disk.setAddOns(new ListUnmarshaller<AddOn>(AddOnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sizeInGb")) {
                disk.setSizeInGb(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isSystemDisk")) {
                disk.setIsSystemDisk(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("iops")) {
                disk.setIops(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("path")) {
                disk.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                disk.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attachedTo")) {
                disk.setAttachedTo(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isAttached")) {
                disk.setIsAttached(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("attachmentState")) {
                disk.setAttachmentState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gbInUse")) {
                disk.setGbInUse(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return disk;
    }

    private static DiskJsonUnmarshaller instance;

    public static DiskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DiskJsonUnmarshaller();
        return instance;
    }
}
