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
 * JSON unmarshaller for POJO ScheduledInstancesNetworkInterface
 */
class ScheduledInstancesNetworkInterfaceJsonUnmarshaller implements
        Unmarshaller<ScheduledInstancesNetworkInterface, JsonUnmarshallerContext> {

    public ScheduledInstancesNetworkInterface unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScheduledInstancesNetworkInterface scheduledInstancesNetworkInterface = new ScheduledInstancesNetworkInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociatePublicIpAddress")) {
                scheduledInstancesNetworkInterface
                        .setAssociatePublicIpAddress(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                scheduledInstancesNetworkInterface.setDeleteOnTermination(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                scheduledInstancesNetworkInterface.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceIndex")) {
                scheduledInstancesNetworkInterface.setDeviceIndex(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Groups")) {
                scheduledInstancesNetworkInterface.setGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ipv6AddressCount")) {
                scheduledInstancesNetworkInterface.setIpv6AddressCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ipv6Addresses")) {
                scheduledInstancesNetworkInterface
                        .setIpv6Addresses(new ListUnmarshaller<ScheduledInstancesIpv6Address>(
                                ScheduledInstancesIpv6AddressJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                scheduledInstancesNetworkInterface.setNetworkInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddress")) {
                scheduledInstancesNetworkInterface.setPrivateIpAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateIpAddressConfigs")) {
                scheduledInstancesNetworkInterface
                        .setPrivateIpAddressConfigs(new ListUnmarshaller<ScheduledInstancesPrivateIpAddressConfig>(
                                ScheduledInstancesPrivateIpAddressConfigJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SecondaryPrivateIpAddressCount")) {
                scheduledInstancesNetworkInterface
                        .setSecondaryPrivateIpAddressCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                scheduledInstancesNetworkInterface.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduledInstancesNetworkInterface;
    }

    private static ScheduledInstancesNetworkInterfaceJsonUnmarshaller instance;

    public static ScheduledInstancesNetworkInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesNetworkInterfaceJsonUnmarshaller();
        return instance;
    }
}
