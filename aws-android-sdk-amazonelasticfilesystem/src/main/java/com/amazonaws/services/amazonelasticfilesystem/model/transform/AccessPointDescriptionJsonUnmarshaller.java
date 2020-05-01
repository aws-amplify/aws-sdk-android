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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AccessPointDescription
 */
class AccessPointDescriptionJsonUnmarshaller implements
        Unmarshaller<AccessPointDescription, JsonUnmarshallerContext> {

    public AccessPointDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AccessPointDescription accessPointDescription = new AccessPointDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientToken")) {
                accessPointDescription.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                accessPointDescription.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                accessPointDescription.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AccessPointId")) {
                accessPointDescription.setAccessPointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccessPointArn")) {
                accessPointDescription.setAccessPointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                accessPointDescription.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PosixUser")) {
                accessPointDescription.setPosixUser(PosixUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDirectory")) {
                accessPointDescription.setRootDirectory(RootDirectoryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                accessPointDescription.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LifeCycleState")) {
                accessPointDescription.setLifeCycleState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return accessPointDescription;
    }

    private static AccessPointDescriptionJsonUnmarshaller instance;

    public static AccessPointDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessPointDescriptionJsonUnmarshaller();
        return instance;
    }
}
