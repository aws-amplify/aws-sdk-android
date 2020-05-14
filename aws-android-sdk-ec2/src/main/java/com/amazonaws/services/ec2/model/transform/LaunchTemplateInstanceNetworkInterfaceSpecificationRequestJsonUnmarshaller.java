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
 * LaunchTemplateInstanceNetworkInterfaceSpecificationRequest
 */
class LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonUnmarshaller
        implements
        Unmarshaller<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest, JsonUnmarshallerContext> {

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LaunchTemplateInstanceNetworkInterfaceSpecificationRequest launchTemplateInstanceNetworkInterfaceSpecificationRequest = new LaunchTemplateInstanceNetworkInterfaceSpecificationRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociatePublicIpAddress")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setAssociatePublicIpAddress(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setDeleteOnTermination(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setDescription(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeviceIndex")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setDeviceIndex(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Groups")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setGroups(new ListUnmarshaller<String>(StringJsonUnmarshaller
                                .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InterfaceType")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setInterfaceType(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Ipv6AddressCount")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setIpv6AddressCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Ipv6Addresses")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setIpv6Addresses(new ListUnmarshaller<InstanceIpv6AddressRequest>(
                                InstanceIpv6AddressRequestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PrivateIpAddresses")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setPrivateIpAddresses(new ListUnmarshaller<PrivateIpAddressSpecification>(
                                PrivateIpAddressSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecondaryPrivateIpAddressCount")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setSecondaryPrivateIpAddressCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                launchTemplateInstanceNetworkInterfaceSpecificationRequest
                        .setSubnetId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return launchTemplateInstanceNetworkInterfaceSpecificationRequest;
    }

    private static LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonUnmarshaller instance;

    public static LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceNetworkInterfaceSpecificationRequestJsonUnmarshaller();
        return instance;
    }
}
