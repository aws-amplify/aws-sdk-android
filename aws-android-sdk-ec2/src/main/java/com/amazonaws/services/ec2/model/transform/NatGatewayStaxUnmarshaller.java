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
 * Nat Gateway StAX Unmarshaller
 */
public class NatGatewayStaxUnmarshaller implements Unmarshaller<NatGateway, StaxUnmarshallerContext> {

    public NatGateway unmarshall(StaxUnmarshallerContext context) throws Exception {
        NatGateway natGateway = new NatGateway();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return natGateway;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("vpcId", targetDepth)) {
                    natGateway.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    natGateway.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("natGatewayId", targetDepth)) {
                    natGateway.setNatGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("createTime", targetDepth)) {
                    natGateway.setCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("deleteTime", targetDepth)) {
                    natGateway.setDeleteTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("natGatewayAddressSet/item", targetDepth)) {
                    natGateway.getNatGatewayAddresses().add(NatGatewayAddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("state", targetDepth)) {
                    natGateway.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    natGateway.setFailureCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("failureMessage", targetDepth)) {
                    natGateway.setFailureMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("provisionedBandwidth", targetDepth)) {
                    natGateway.setProvisionedBandwidth(ProvisionedBandwidthStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return natGateway;
                }
            }
        }
    }

    private static NatGatewayStaxUnmarshaller instance;
    public static NatGatewayStaxUnmarshaller getInstance() {
        if (instance == null) instance = new NatGatewayStaxUnmarshaller();
        return instance;
    }
}
    