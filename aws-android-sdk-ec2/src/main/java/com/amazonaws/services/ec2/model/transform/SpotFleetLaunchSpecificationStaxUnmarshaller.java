/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Spot Fleet Launch Specification StAX Unmarshaller
 */
public class SpotFleetLaunchSpecificationStaxUnmarshaller implements Unmarshaller<SpotFleetLaunchSpecification, StaxUnmarshallerContext> {

    public SpotFleetLaunchSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        SpotFleetLaunchSpecification spotFleetLaunchSpecification = new SpotFleetLaunchSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return spotFleetLaunchSpecification;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("imageId", targetDepth)) {
                    spotFleetLaunchSpecification.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("keyName", targetDepth)) {
                    spotFleetLaunchSpecification.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item", targetDepth)) {
                    spotFleetLaunchSpecification.getSecurityGroups().add(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("userData", targetDepth)) {
                    spotFleetLaunchSpecification.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("addressingType", targetDepth)) {
                    spotFleetLaunchSpecification.setAddressingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    spotFleetLaunchSpecification.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("placement", targetDepth)) {
                    spotFleetLaunchSpecification.setPlacement(SpotPlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("kernelId", targetDepth)) {
                    spotFleetLaunchSpecification.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ramdiskId", targetDepth)) {
                    spotFleetLaunchSpecification.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    spotFleetLaunchSpecification.getBlockDeviceMappings().add(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("monitoring", targetDepth)) {
                    spotFleetLaunchSpecification.setMonitoring(SpotFleetMonitoringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    spotFleetLaunchSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("networkInterfaceSet/item", targetDepth)) {
                    spotFleetLaunchSpecification.getNetworkInterfaces().add(InstanceNetworkInterfaceSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    spotFleetLaunchSpecification.setIamInstanceProfile(IamInstanceProfileSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ebsOptimized", targetDepth)) {
                    spotFleetLaunchSpecification.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("weightedCapacity", targetDepth)) {
                    spotFleetLaunchSpecification.setWeightedCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("spotPrice", targetDepth)) {
                    spotFleetLaunchSpecification.setSpotPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return spotFleetLaunchSpecification;
                }
            }
        }
    }

    private static SpotFleetLaunchSpecificationStaxUnmarshaller instance;
    public static SpotFleetLaunchSpecificationStaxUnmarshaller getInstance() {
        if (instance == null) instance = new SpotFleetLaunchSpecificationStaxUnmarshaller();
        return instance;
    }
}
    