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
 * JSON unmarshaller for POJO
 * LaunchTemplateInstanceNetworkInterfaceSpecification
 */
class LaunchTemplateInstanceNetworkInterfaceSpecificationJsonUnmarshaller implements
        Unmarshaller<LaunchTemplateInstanceNetworkInterfaceSpecification, JsonUnmarshallerContext> {

    public LaunchTemplateInstanceNetworkInterfaceSpecification unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LaunchTemplateInstanceNetworkInterfaceSpecification launchTemplateInstanceNetworkInterfaceSpecification = new LaunchTemplateInstanceNetworkInterfaceSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociatePublicIpAddress")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setAssociatePublicIpAddress(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setDeleteOnTermination(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setDescription(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeviceIndex")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setDeviceIndex(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Groups")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setGroups(new ListUnmarshaller<String>(StringJsonUnmarshaller
                                .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InterfaceType")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setInterfaceType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Ipv6AddressCount")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setIpv6AddressCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Ipv6Addresses")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setIpv6Addresses(new ListUnmarshaller<InstanceIpv6Address>(
                                InstanceIpv6AddressJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PrivateIpAddresses")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setPrivateIpAddresses(new ListUnmarshaller<PrivateIpAddressSpecification>(
                                PrivateIpAddressSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecondaryPrivateIpAddressCount")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setSecondaryPrivateIpAddressCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                launchTemplateInstanceNetworkInterfaceSpecification
                        .setSubnetId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return launchTemplateInstanceNetworkInterfaceSpecification;
    }

    private static LaunchTemplateInstanceNetworkInterfaceSpecificationJsonUnmarshaller instance;

    public static LaunchTemplateInstanceNetworkInterfaceSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceNetworkInterfaceSpecificationJsonUnmarshaller();
        return instance;
    }
}
