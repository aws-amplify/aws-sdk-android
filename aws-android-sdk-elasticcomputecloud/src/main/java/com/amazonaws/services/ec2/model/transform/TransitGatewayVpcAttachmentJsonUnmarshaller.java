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
 * JSON unmarshaller for POJO TransitGatewayVpcAttachment
 */
class TransitGatewayVpcAttachmentJsonUnmarshaller implements
        Unmarshaller<TransitGatewayVpcAttachment, JsonUnmarshallerContext> {

    public TransitGatewayVpcAttachment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitGatewayVpcAttachment transitGatewayVpcAttachment = new TransitGatewayVpcAttachment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransitGatewayAttachmentId")) {
                transitGatewayVpcAttachment.setTransitGatewayAttachmentId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransitGatewayId")) {
                transitGatewayVpcAttachment.setTransitGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                transitGatewayVpcAttachment.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcOwnerId")) {
                transitGatewayVpcAttachment.setVpcOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                transitGatewayVpcAttachment.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                transitGatewayVpcAttachment.setSubnetIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                transitGatewayVpcAttachment.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Options")) {
                transitGatewayVpcAttachment
                        .setOptions(TransitGatewayVpcAttachmentOptionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                transitGatewayVpcAttachment.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitGatewayVpcAttachment;
    }

    private static TransitGatewayVpcAttachmentJsonUnmarshaller instance;

    public static TransitGatewayVpcAttachmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayVpcAttachmentJsonUnmarshaller();
        return instance;
    }
}
