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
 * Instance Attribute StAX Unmarshaller
 */
public class InstanceAttributeStaxUnmarshaller implements Unmarshaller<InstanceAttribute, StaxUnmarshallerContext> {

    public InstanceAttribute unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceAttribute instanceAttribute = new InstanceAttribute();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return instanceAttribute;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("instanceId", targetDepth)) {
                    instanceAttribute.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceType/value", targetDepth)) {
                    instanceAttribute.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("kernel/value", targetDepth)) {
                    instanceAttribute.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ramdisk/value", targetDepth)) {
                    instanceAttribute.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("userData/value", targetDepth)) {
                    instanceAttribute.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("disableApiTermination/value", targetDepth)) {
                    instanceAttribute.setDisableApiTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceInitiatedShutdownBehavior/value", targetDepth)) {
                    instanceAttribute.setInstanceInitiatedShutdownBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("rootDeviceName/value", targetDepth)) {
                    instanceAttribute.setRootDeviceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    instanceAttribute.getBlockDeviceMappings().add(InstanceBlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("productCodes/item", targetDepth)) {
                    instanceAttribute.getProductCodes().add(ProductCodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ebsOptimized/value", targetDepth)) {
                    instanceAttribute.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("sriovNetSupport/value", targetDepth)) {
                    instanceAttribute.setSriovNetSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("sourceDestCheck/value", targetDepth)) {
                    instanceAttribute.setSourceDestCheck(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groupSet/item", targetDepth)) {
                    instanceAttribute.getGroups().add(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceAttribute;
                }
            }
        }
    }

    private static InstanceAttributeStaxUnmarshaller instance;
    public static InstanceAttributeStaxUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceAttributeStaxUnmarshaller();
        return instance;
    }
}
    