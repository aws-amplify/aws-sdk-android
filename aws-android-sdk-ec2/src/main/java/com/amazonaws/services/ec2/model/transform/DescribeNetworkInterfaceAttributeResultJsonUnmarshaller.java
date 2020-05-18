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
 * JSON unmarshaller for response DescribeNetworkInterfaceAttributeResult
 */
public class DescribeNetworkInterfaceAttributeResultJsonUnmarshaller implements
        Unmarshaller<DescribeNetworkInterfaceAttributeResult, JsonUnmarshallerContext> {

    public DescribeNetworkInterfaceAttributeResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttributeResult = new DescribeNetworkInterfaceAttributeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attachment")) {
                describeNetworkInterfaceAttributeResult
                        .setAttachment(NetworkInterfaceAttachmentJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                describeNetworkInterfaceAttributeResult
                        .setDescription(AttributeValueJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Groups")) {
                describeNetworkInterfaceAttributeResult
                        .setGroups(new ListUnmarshaller<GroupIdentifier>(
                                GroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                describeNetworkInterfaceAttributeResult
                        .setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SourceDestCheck")) {
                describeNetworkInterfaceAttributeResult
                        .setSourceDestCheck(AttributeBooleanValueJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeNetworkInterfaceAttributeResult;
    }

    private static DescribeNetworkInterfaceAttributeResultJsonUnmarshaller instance;

    public static DescribeNetworkInterfaceAttributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNetworkInterfaceAttributeResultJsonUnmarshaller();
        return instance;
    }
}
