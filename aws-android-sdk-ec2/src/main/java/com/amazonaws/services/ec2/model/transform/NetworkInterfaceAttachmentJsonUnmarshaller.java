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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkInterfaceAttachment
 */
class NetworkInterfaceAttachmentJsonUnmarshaller implements
        Unmarshaller<NetworkInterfaceAttachment, JsonUnmarshallerContext> {

    public NetworkInterfaceAttachment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkInterfaceAttachment networkInterfaceAttachment = new NetworkInterfaceAttachment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttachTime")) {
                networkInterfaceAttachment.setAttachTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttachmentId")) {
                networkInterfaceAttachment.setAttachmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                networkInterfaceAttachment.setDeleteOnTermination(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceIndex")) {
                networkInterfaceAttachment.setDeviceIndex(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                networkInterfaceAttachment.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceOwnerId")) {
                networkInterfaceAttachment.setInstanceOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                networkInterfaceAttachment.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkInterfaceAttachment;
    }

    private static NetworkInterfaceAttachmentJsonUnmarshaller instance;

    public static NetworkInterfaceAttachmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAttachmentJsonUnmarshaller();
        return instance;
    }
}
