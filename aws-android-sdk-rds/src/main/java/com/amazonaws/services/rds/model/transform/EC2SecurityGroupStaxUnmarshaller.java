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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model EC2SecurityGroup
 */
class EC2SecurityGroupStaxUnmarshaller implements
        Unmarshaller<EC2SecurityGroup, StaxUnmarshallerContext> {

    public EC2SecurityGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        EC2SecurityGroup eC2SecurityGroup = new EC2SecurityGroup();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Status", targetDepth)) {
                    eC2SecurityGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EC2SecurityGroupName", targetDepth)) {
                    eC2SecurityGroup.setEC2SecurityGroupName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EC2SecurityGroupId", targetDepth)) {
                    eC2SecurityGroup.setEC2SecurityGroupId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EC2SecurityGroupOwnerId", targetDepth)) {
                    eC2SecurityGroup.setEC2SecurityGroupOwnerId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return eC2SecurityGroup;
    }

    private static EC2SecurityGroupStaxUnmarshaller instance;

    public static EC2SecurityGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2SecurityGroupStaxUnmarshaller();
        return instance;
    }
}
