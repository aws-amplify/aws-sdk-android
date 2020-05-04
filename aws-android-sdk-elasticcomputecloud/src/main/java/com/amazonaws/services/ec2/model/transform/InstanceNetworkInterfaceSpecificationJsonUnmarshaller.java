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
 * JSON unmarshaller for POJO InstanceNetworkInterfaceSpecification
 */
class InstanceNetworkInterfaceSpecificationJsonUnmarshaller implements
        Unmarshaller<InstanceNetworkInterfaceSpecification, JsonUnmarshallerContext> {

    public InstanceNetworkInterfaceSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceNetworkInterfaceSpecification instanceNetworkInterfaceSpecification = new InstanceNetworkInterfaceSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociatePublicIpAddress")) {
                instanceNetworkInterfaceSpecification
                        .setAssociatePublicIpAddress(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                instanceNetworkInterfaceSpecification
                        .setDeleteOnTermination(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                instanceNetworkInterfaceSpecification.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceIndex")) {
                instanceNetworkInterfaceSpecification.setDeviceIndex(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Groups")) {
                instanceNetworkInterfaceSpecification.setGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ipv6AddressCount")) {
                instanceNetworkInterfaceSpecification.setIpv6AddressCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ipv6Addresses")) {
                instanceNetworkInterfaceSpecification
                        .setIpv6Addresses(new ListUnmarshaller<InstanceIpv6Address>(
                                InstanceIpv6AddressJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                instanceNetworkInterfaceSpecification.setNetworkInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                instanceNetworkInterfaceSpecification.setPrivateIpAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddresses")) {
                instanceNetworkInterfaceSpecification
                        .setPrivateIpAddresses(new ListUnmarshaller<PrivateIpAddressSpecification>(
                                PrivateIpAddressSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecondaryPrivateIpAddressCount")) {
                instanceNetworkInterfaceSpecification
                        .setSecondaryPrivateIpAddressCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                instanceNetworkInterfaceSpecification.setSubnetId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InterfaceType")) {
                instanceNetworkInterfaceSpecification.setInterfaceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceNetworkInterfaceSpecification;
    }

    private static InstanceNetworkInterfaceSpecificationJsonUnmarshaller instance;

    public static InstanceNetworkInterfaceSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkInterfaceSpecificationJsonUnmarshaller();
        return instance;
    }
}
