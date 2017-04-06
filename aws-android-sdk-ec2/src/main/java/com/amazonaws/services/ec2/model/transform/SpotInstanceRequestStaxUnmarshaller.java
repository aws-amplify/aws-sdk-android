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
 * Spot Instance Request StAX Unmarshaller
 */
public class SpotInstanceRequestStaxUnmarshaller implements Unmarshaller<SpotInstanceRequest, StaxUnmarshallerContext> {

    public SpotInstanceRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        SpotInstanceRequest spotInstanceRequest = new SpotInstanceRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return spotInstanceRequest;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("spotInstanceRequestId", targetDepth)) {
                    spotInstanceRequest.setSpotInstanceRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("spotPrice", targetDepth)) {
                    spotInstanceRequest.setSpotPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("type", targetDepth)) {
                    spotInstanceRequest.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("state", targetDepth)) {
                    spotInstanceRequest.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("fault", targetDepth)) {
                    spotInstanceRequest.setFault(SpotInstanceStateFaultStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("status", targetDepth)) {
                    spotInstanceRequest.setStatus(SpotInstanceStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("validFrom", targetDepth)) {
                    spotInstanceRequest.setValidFrom(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("validUntil", targetDepth)) {
                    spotInstanceRequest.setValidUntil(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("launchGroup", targetDepth)) {
                    spotInstanceRequest.setLaunchGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("availabilityZoneGroup", targetDepth)) {
                    spotInstanceRequest.setAvailabilityZoneGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("launchSpecification", targetDepth)) {
                    spotInstanceRequest.setLaunchSpecification(LaunchSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    spotInstanceRequest.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("createTime", targetDepth)) {
                    spotInstanceRequest.setCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("productDescription", targetDepth)) {
                    spotInstanceRequest.setProductDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("blockDurationMinutes", targetDepth)) {
                    spotInstanceRequest.setBlockDurationMinutes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("actualBlockHourlyPrice", targetDepth)) {
                    spotInstanceRequest.setActualBlockHourlyPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("tagSet/item", targetDepth)) {
                    spotInstanceRequest.getTags().add(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("launchedAvailabilityZone", targetDepth)) {
                    spotInstanceRequest.setLaunchedAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return spotInstanceRequest;
                }
            }
        }
    }

    private static SpotInstanceRequestStaxUnmarshaller instance;
    public static SpotInstanceRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new SpotInstanceRequestStaxUnmarshaller();
        return instance;
    }
}
    