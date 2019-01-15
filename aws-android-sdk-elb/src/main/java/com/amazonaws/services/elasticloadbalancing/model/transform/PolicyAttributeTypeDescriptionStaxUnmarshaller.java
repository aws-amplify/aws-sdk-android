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
 * StAX unmarshaller for model PolicyAttributeTypeDescription
 */
class PolicyAttributeTypeDescriptionStaxUnmarshaller implements
        Unmarshaller<PolicyAttributeTypeDescription, StaxUnmarshallerContext> {

    public PolicyAttributeTypeDescription unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        PolicyAttributeTypeDescription policyAttributeTypeDescription = new PolicyAttributeTypeDescription();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("AttributeName", targetDepth)) {
                    policyAttributeTypeDescription.setAttributeName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeType", targetDepth)) {
                    policyAttributeTypeDescription.setAttributeType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    policyAttributeTypeDescription.setDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultValue", targetDepth)) {
                    policyAttributeTypeDescription.setDefaultValue(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Cardinality", targetDepth)) {
                    policyAttributeTypeDescription.setCardinality(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return policyAttributeTypeDescription;
    }

    private static PolicyAttributeTypeDescriptionStaxUnmarshaller instance;

    public static PolicyAttributeTypeDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyAttributeTypeDescriptionStaxUnmarshaller();
        return instance;
    }
}
