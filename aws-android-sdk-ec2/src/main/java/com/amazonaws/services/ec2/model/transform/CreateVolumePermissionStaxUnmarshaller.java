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
 * Create Volume Permission StAX Unmarshaller
 */
public class CreateVolumePermissionStaxUnmarshaller implements Unmarshaller<CreateVolumePermission, StaxUnmarshallerContext> {

    public CreateVolumePermission unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateVolumePermission createVolumePermission = new CreateVolumePermission();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return createVolumePermission;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("userId", targetDepth)) {
                    createVolumePermission.setUserId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("group", targetDepth)) {
                    createVolumePermission.setGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createVolumePermission;
                }
            }
        }
    }

    private static CreateVolumePermissionStaxUnmarshaller instance;
    public static CreateVolumePermissionStaxUnmarshaller getInstance() {
        if (instance == null) instance = new CreateVolumePermissionStaxUnmarshaller();
        return instance;
    }
}
    