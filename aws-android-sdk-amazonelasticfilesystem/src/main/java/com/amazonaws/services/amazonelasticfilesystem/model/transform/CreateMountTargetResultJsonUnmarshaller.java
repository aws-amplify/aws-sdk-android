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
 * JSON unmarshaller for response CreateMountTargetResult
 */
public class CreateMountTargetResultJsonUnmarshaller implements
        Unmarshaller<CreateMountTargetResult, JsonUnmarshallerContext> {

    public CreateMountTargetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateMountTargetResult createMountTargetResult = new CreateMountTargetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OwnerId")) {
                createMountTargetResult.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MountTargetId")) {
                createMountTargetResult.setMountTargetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                createMountTargetResult.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                createMountTargetResult.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LifeCycleState")) {
                createMountTargetResult.setLifeCycleState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpAddress")) {
                createMountTargetResult.setIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                createMountTargetResult.setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZoneId")) {
                createMountTargetResult.setAvailabilityZoneId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZoneName")) {
                createMountTargetResult.setAvailabilityZoneName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createMountTargetResult;
    }

    private static CreateMountTargetResultJsonUnmarshaller instance;

    public static CreateMountTargetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateMountTargetResultJsonUnmarshaller();
        return instance;
    }
}
