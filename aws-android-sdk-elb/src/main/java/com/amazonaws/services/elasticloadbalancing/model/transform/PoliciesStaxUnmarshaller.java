/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model Policies
 */
class PoliciesStaxUnmarshaller implements Unmarshaller<Policies, StaxUnmarshallerContext> {

    public Policies unmarshall(StaxUnmarshallerContext context) throws Exception {
        Policies policies = new Policies();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("AppCookieStickinessPolicies/member", targetDepth)) {
                    policies.withAppCookieStickinessPolicies(AppCookieStickinessPolicyStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LBCookieStickinessPolicies/member", targetDepth)) {
                    policies.withLBCookieStickinessPolicies(LBCookieStickinessPolicyStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OtherPolicies/member", targetDepth)) {
                    policies.withOtherPolicies(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return policies;
    }

    private static PoliciesStaxUnmarshaller instance;

    public static PoliciesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PoliciesStaxUnmarshaller();
        return instance;
    }
}
