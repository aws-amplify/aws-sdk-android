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
 * StAX unmarshaller for model DBProxy
 */
class DBProxyStaxUnmarshaller implements Unmarshaller<DBProxy, StaxUnmarshallerContext> {

    public DBProxy unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBProxy dBProxy = new DBProxy();

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
                    dBProxy.setDBProxyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBProxyArn", targetDepth)) {
                    dBProxy.setDBProxyArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    dBProxy.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineFamily", targetDepth)) {
                    dBProxy.setEngineFamily(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcSecurityGroupIds/member", targetDepth)) {
                    dBProxy.withVpcSecurityGroupIds(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcSubnetIds/member", targetDepth)) {
                    dBProxy.withVpcSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Auth/member", targetDepth)) {
                    dBProxy.withAuth(UserAuthConfigInfoStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    dBProxy.setRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    dBProxy.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequireTLS", targetDepth)) {
                    dBProxy.setRequireTLS(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IdleClientTimeout", targetDepth)) {
                    dBProxy.setIdleClientTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DebugLogging", targetDepth)) {
                    dBProxy.setDebugLogging(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    dBProxy.setCreatedDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UpdatedDate", targetDepth)) {
                    dBProxy.setUpdatedDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBProxy;
    }

    private static DBProxyStaxUnmarshaller instance;

    public static DBProxyStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyStaxUnmarshaller();
        return instance;
    }
}
