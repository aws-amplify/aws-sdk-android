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
 * StAX unmarshaller for model InstanceProfile
 */
class InstanceProfileStaxUnmarshaller implements
        Unmarshaller<InstanceProfile, StaxUnmarshallerContext> {

    public InstanceProfile unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceProfile instanceProfile = new InstanceProfile();

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
                    instanceProfile.setPath(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceProfileName", targetDepth)) {
                    instanceProfile.setInstanceProfileName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceProfileId", targetDepth)) {
                    instanceProfile.setInstanceProfileId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Arn", targetDepth)) {
                    instanceProfile
                            .setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    instanceProfile.setCreateDate(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Roles/member", targetDepth)) {
                    instanceProfile.withRoles(RoleStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return instanceProfile;
    }

    private static InstanceProfileStaxUnmarshaller instance;

    public static InstanceProfileStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceProfileStaxUnmarshaller();
        return instance;
    }
}
