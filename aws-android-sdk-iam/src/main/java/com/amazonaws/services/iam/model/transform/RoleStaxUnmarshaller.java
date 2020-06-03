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

package com.amazonaws.services.iam.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model Role
 */
class RoleStaxUnmarshaller implements Unmarshaller<Role, StaxUnmarshallerContext> {

    public Role unmarshall(StaxUnmarshallerContext context) throws Exception {
        Role role = new Role();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Path", targetDepth)) {
                    role.setPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RoleName", targetDepth)) {
                    role.setRoleName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RoleId", targetDepth)) {
                    role.setRoleId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Arn", targetDepth)) {
                    role.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    role.setCreateDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AssumeRolePolicyDocument", targetDepth)) {
                    role.setAssumeRolePolicyDocument(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    role.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxSessionDuration", targetDepth)) {
                    role.setMaxSessionDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PermissionsBoundary", targetDepth)) {
                    role.setPermissionsBoundary(AttachedPermissionsBoundaryStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Tags/member", targetDepth)) {
                    role.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RoleLastUsed", targetDepth)) {
                    role.setRoleLastUsed(RoleLastUsedStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return role;
    }

    private static RoleStaxUnmarshaller instance;

    public static RoleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RoleStaxUnmarshaller();
        return instance;
    }
}
