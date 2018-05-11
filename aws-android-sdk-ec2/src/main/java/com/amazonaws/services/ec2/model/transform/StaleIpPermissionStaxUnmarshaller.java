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
 * Stale Ip Permission StAX Unmarshaller
 */
public class StaleIpPermissionStaxUnmarshaller implements Unmarshaller<StaleIpPermission, StaxUnmarshallerContext> {

    public StaleIpPermission unmarshall(StaxUnmarshallerContext context) throws Exception {
        StaleIpPermission staleIpPermission = new StaleIpPermission();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return staleIpPermission;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("fromPort", targetDepth)) {
                    staleIpPermission.setFromPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ipProtocol", targetDepth)) {
                    staleIpPermission.setIpProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ipRanges/item", targetDepth)) {
                    staleIpPermission.getIpRanges().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("prefixListIds/item", targetDepth)) {
                    staleIpPermission.getPrefixListIds().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("toPort", targetDepth)) {
                    staleIpPermission.setToPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("groups/item", targetDepth)) {
                    staleIpPermission.getUserIdGroupPairs().add(UserIdGroupPairStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return staleIpPermission;
                }
            }
        }
    }

    private static StaleIpPermissionStaxUnmarshaller instance;
    public static StaleIpPermissionStaxUnmarshaller getInstance() {
        if (instance == null) instance = new StaleIpPermissionStaxUnmarshaller();
        return instance;
    }
}
    