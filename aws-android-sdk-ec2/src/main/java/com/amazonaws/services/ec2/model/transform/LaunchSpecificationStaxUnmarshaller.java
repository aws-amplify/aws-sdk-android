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
 * Launch Specification StAX Unmarshaller
 */
public class LaunchSpecificationStaxUnmarshaller implements Unmarshaller<LaunchSpecification, StaxUnmarshallerContext> {

    public LaunchSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchSpecification launchSpecification = new LaunchSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return launchSpecification;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("imageId", targetDepth)) {
                    launchSpecification.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("keyName", targetDepth)) {
                    launchSpecification.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item", targetDepth)) {
                    launchSpecification.getAllSecurityGroups().add(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item/groupName", targetDepth)) {
                    launchSpecification.getSecurityGroups().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("userData", targetDepth)) {
                    launchSpecification.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("addressingType", targetDepth)) {
                    launchSpecification.setAddressingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    launchSpecification.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("placement", targetDepth)) {
                    launchSpecification.setPlacement(SpotPlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("kernelId", targetDepth)) {
                    launchSpecification.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ramdiskId", targetDepth)) {
                    launchSpecification.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    launchSpecification.getBlockDeviceMappings().add(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("monitoring/enabled", targetDepth)) {
                    launchSpecification.setMonitoringEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    launchSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("networkInterfaceSet/item", targetDepth)) {
                    launchSpecification.getNetworkInterfaces().add(InstanceNetworkInterfaceSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    launchSpecification.setIamInstanceProfile(IamInstanceProfileSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ebsOptimized", targetDepth)) {
                    launchSpecification.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchSpecification;
                }
            }
        }
    }

    private static LaunchSpecificationStaxUnmarshaller instance;
    public static LaunchSpecificationStaxUnmarshaller getInstance() {
        if (instance == null) instance = new LaunchSpecificationStaxUnmarshaller();
        return instance;
    }
}
    