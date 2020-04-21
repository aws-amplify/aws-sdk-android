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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonUnmarshaller implements
        Unmarshaller<NetworkInterface, JsonUnmarshallerContext> {

    public NetworkInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkInterface networkInterface = new NetworkInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv6Addresses")) {
                networkInterface.setIpv6Addresses(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                networkInterface.setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateDnsName")) {
                networkInterface.setPrivateDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                networkInterface.setPrivateIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddresses")) {
                networkInterface
                        .setPrivateIpAddresses(new ListUnmarshaller<PrivateIpAddressDetails>(
                                PrivateIpAddressDetailsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PublicDnsName")) {
                networkInterface.setPublicDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PublicIp")) {
                networkInterface.setPublicIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                networkInterface.setSecurityGroups(new ListUnmarshaller<SecurityGroup>(
                        SecurityGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                networkInterface.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                networkInterface.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkInterface;
    }

    private static NetworkInterfaceJsonUnmarshaller instance;

    public static NetworkInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceJsonUnmarshaller();
        return instance;
    }
}
