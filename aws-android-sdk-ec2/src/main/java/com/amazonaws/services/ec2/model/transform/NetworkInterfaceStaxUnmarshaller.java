/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Network Interface StAX Unmarshaller
 */
public class NetworkInterfaceStaxUnmarshaller implements Unmarshaller<NetworkInterface, StaxUnmarshallerContext> {

    public NetworkInterface unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInterface networkInterface = new NetworkInterface();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return networkInterface;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    networkInterface.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    networkInterface.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    networkInterface.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    networkInterface.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("description", targetDepth)) {
                    networkInterface.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ownerId", targetDepth)) {
                    networkInterface.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("requesterId", targetDepth)) {
                    networkInterface.setRequesterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("requesterManaged", targetDepth)) {
                    networkInterface.setRequesterManaged(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("status", targetDepth)) {
                    networkInterface.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("macAddress", targetDepth)) {
                    networkInterface.setMacAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateIpAddress", targetDepth)) {
                    networkInterface.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateDnsName", targetDepth)) {
                    networkInterface.setPrivateDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("sourceDestCheck", targetDepth)) {
                    networkInterface.setSourceDestCheck(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item", targetDepth)) {
                    networkInterface.getGroups().add(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("attachment", targetDepth)) {
                    networkInterface.setAttachment(NetworkInterfaceAttachmentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("association", targetDepth)) {
                    networkInterface.setAssociation(NetworkInterfaceAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkInterface.getTagSet().add(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("privateIpAddressesSet/item", targetDepth)) {
                    networkInterface.getPrivateIpAddresses().add(NetworkInterfacePrivateIpAddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("interfaceType", targetDepth)) {
                    networkInterface.setInterfaceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInterface;
                }
            }
        }
    }

    private static NetworkInterfaceStaxUnmarshaller instance;
    public static NetworkInterfaceStaxUnmarshaller getInstance() {
        if (instance == null) instance = new NetworkInterfaceStaxUnmarshaller();
        return instance;
    }
}
    