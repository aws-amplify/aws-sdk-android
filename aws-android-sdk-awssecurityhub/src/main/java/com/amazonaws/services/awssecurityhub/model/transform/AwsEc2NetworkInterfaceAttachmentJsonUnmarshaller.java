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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsEc2NetworkInterfaceAttachment
 */
class AwsEc2NetworkInterfaceAttachmentJsonUnmarshaller implements
        Unmarshaller<AwsEc2NetworkInterfaceAttachment, JsonUnmarshallerContext> {

    public AwsEc2NetworkInterfaceAttachment unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsEc2NetworkInterfaceAttachment awsEc2NetworkInterfaceAttachment = new AwsEc2NetworkInterfaceAttachment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttachTime")) {
                awsEc2NetworkInterfaceAttachment.setAttachTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttachmentId")) {
                awsEc2NetworkInterfaceAttachment.setAttachmentId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                awsEc2NetworkInterfaceAttachment.setDeleteOnTermination(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceIndex")) {
                awsEc2NetworkInterfaceAttachment.setDeviceIndex(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                awsEc2NetworkInterfaceAttachment.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceOwnerId")) {
                awsEc2NetworkInterfaceAttachment.setInstanceOwnerId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                awsEc2NetworkInterfaceAttachment.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsEc2NetworkInterfaceAttachment;
    }

    private static AwsEc2NetworkInterfaceAttachmentJsonUnmarshaller instance;

    public static AwsEc2NetworkInterfaceAttachmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2NetworkInterfaceAttachmentJsonUnmarshaller();
        return instance;
    }
}
