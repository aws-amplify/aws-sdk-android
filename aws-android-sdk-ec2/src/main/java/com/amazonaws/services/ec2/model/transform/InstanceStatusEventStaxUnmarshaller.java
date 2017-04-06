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
 * Instance Status Event StAX Unmarshaller
 */
public class InstanceStatusEventStaxUnmarshaller implements Unmarshaller<InstanceStatusEvent, StaxUnmarshallerContext> {

    public InstanceStatusEvent unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceStatusEvent instanceStatusEvent = new InstanceStatusEvent();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return instanceStatusEvent;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("code", targetDepth)) {
                    instanceStatusEvent.setCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("description", targetDepth)) {
                    instanceStatusEvent.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("notBefore", targetDepth)) {
                    instanceStatusEvent.setNotBefore(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("notAfter", targetDepth)) {
                    instanceStatusEvent.setNotAfter(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceStatusEvent;
                }
            }
        }
    }

    private static InstanceStatusEventStaxUnmarshaller instance;
    public static InstanceStatusEventStaxUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceStatusEventStaxUnmarshaller();
        return instance;
    }
}
    