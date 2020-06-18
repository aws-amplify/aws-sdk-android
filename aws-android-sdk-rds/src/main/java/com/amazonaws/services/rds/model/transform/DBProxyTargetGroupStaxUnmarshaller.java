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
 * StAX unmarshaller for model DBProxyTargetGroup
 */
class DBProxyTargetGroupStaxUnmarshaller implements
        Unmarshaller<DBProxyTargetGroup, StaxUnmarshallerContext> {

    public DBProxyTargetGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBProxyTargetGroup dBProxyTargetGroup = new DBProxyTargetGroup();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("DBProxyName", targetDepth)) {
                    dBProxyTargetGroup.setDBProxyName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetGroupName", targetDepth)) {
                    dBProxyTargetGroup.setTargetGroupName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetGroupArn", targetDepth)) {
                    dBProxyTargetGroup.setTargetGroupArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsDefault", targetDepth)) {
                    dBProxyTargetGroup.setIsDefault(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    dBProxyTargetGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ConnectionPoolConfig", targetDepth)) {
                    dBProxyTargetGroup
                            .setConnectionPoolConfig(ConnectionPoolConfigurationInfoStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    dBProxyTargetGroup.setCreatedDate(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("UpdatedDate", targetDepth)) {
                    dBProxyTargetGroup.setUpdatedDate(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBProxyTargetGroup;
    }

    private static DBProxyTargetGroupStaxUnmarshaller instance;

    public static DBProxyTargetGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyTargetGroupStaxUnmarshaller();
        return instance;
    }
}
