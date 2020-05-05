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
 * JSON unmarshaller for POJO InstanceNetworkInterface
 */
class InstanceNetworkInterfaceJsonUnmarshaller implements
        Unmarshaller<InstanceNetworkInterface, JsonUnmarshallerContext> {

    public InstanceNetworkInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceNetworkInterface instanceNetworkInterface = new InstanceNetworkInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Association")) {
                instanceNetworkInterface
                        .setAssociation(InstanceNetworkInterfaceAssociationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Attachment")) {
                instanceNetworkInterface
                        .setAttachment(InstanceNetworkInterfaceAttachmentJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                instanceNetworkInterface.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Groups")) {
                instanceNetworkInterface.setGroups(new ListUnmarshaller<GroupIdentifier>(
                        GroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ipv6Addresses")) {
                instanceNetworkInterface
                        .setIpv6Addresses(new ListUnmarshaller<InstanceIpv6Address>(
                                InstanceIpv6AddressJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MacAddress")) {
                instanceNetworkInterface.setMacAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                instanceNetworkInterface.setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                instanceNetworkInterface.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateDnsName")) {
                instanceNetworkInterface.setPrivateDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                instanceNetworkInterface.setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddresses")) {
                instanceNetworkInterface
                        .setPrivateIpAddresses(new ListUnmarshaller<InstancePrivateIpAddress>(
                                InstancePrivateIpAddressJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceDestCheck")) {
                instanceNetworkInterface.setSourceDestCheck(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                instanceNetworkInterface.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                instanceNetworkInterface.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                instanceNetworkInterface.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InterfaceType")) {
                instanceNetworkInterface.setInterfaceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceNetworkInterface;
    }

    private static InstanceNetworkInterfaceJsonUnmarshaller instance;

    public static InstanceNetworkInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkInterfaceJsonUnmarshaller();
        return instance;
    }
}
