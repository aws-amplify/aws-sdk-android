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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model DBSubnetGroup
 */
class DBSubnetGroupStaxUnmarshaller implements Unmarshaller<DBSubnetGroup, StaxUnmarshallerContext> {

    public DBSubnetGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBSubnetGroup dBSubnetGroup = new DBSubnetGroup();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("DBSubnetGroupName", targetDepth)) {
                    dBSubnetGroup.setDBSubnetGroupName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSubnetGroupDescription", targetDepth)) {
                    dBSubnetGroup.setDBSubnetGroupDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    dBSubnetGroup
                            .setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SubnetGroupStatus", targetDepth)) {
                    dBSubnetGroup.setSubnetGroupStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Subnets", targetDepth)) {
                    dBSubnetGroup.withSubnets(SubnetStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBSubnetGroupArn", targetDepth)) {
                    dBSubnetGroup.setDBSubnetGroupArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBSubnetGroup;
    }

    private static DBSubnetGroupStaxUnmarshaller instance;

    public static DBSubnetGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBSubnetGroupStaxUnmarshaller();
        return instance;
    }
}
