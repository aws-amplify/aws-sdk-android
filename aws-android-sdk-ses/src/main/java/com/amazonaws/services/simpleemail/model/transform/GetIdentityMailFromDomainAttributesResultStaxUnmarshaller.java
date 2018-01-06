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

package com.amazonaws.services.simpleemail.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response GetIdentityMailFromDomainAttributesResult
 */
public class GetIdentityMailFromDomainAttributesResultStaxUnmarshaller implements
        Unmarshaller<GetIdentityMailFromDomainAttributesResult, StaxUnmarshallerContext> {

    private static class MailFromDomainAttributesMapEntryUnmarshaller
            implements
            Unmarshaller<Map.Entry<String, IdentityMailFromDomainAttributes>, StaxUnmarshallerContext> {
        @Override
        public Entry<String, IdentityMailFromDomainAttributes> unmarshall(
                StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, IdentityMailFromDomainAttributes> entry = new MapEntry<String, IdentityMailFromDomainAttributes>();

            while (true) {
                int xmlEvent = context.nextEvent();
                if (xmlEvent == XmlPullParser.END_DOCUMENT)
                    return entry;

                if (xmlEvent == XmlPullParser.START_TAG) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(IdentityMailFromDomainAttributesStaxUnmarshaller
                                .getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent == XmlPullParser.END_TAG) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static MailFromDomainAttributesMapEntryUnmarshaller instance;

        public static MailFromDomainAttributesMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new MailFromDomainAttributesMapEntryUnmarshaller();
            return instance;
        }

    }

    public GetIdentityMailFromDomainAttributesResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        GetIdentityMailFromDomainAttributesResult getIdentityMailFromDomainAttributesResult = new GetIdentityMailFromDomainAttributesResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("MailFromDomainAttributes/entry", targetDepth)) {
                    Entry<String, IdentityMailFromDomainAttributes> entry = MailFromDomainAttributesMapEntryUnmarshaller
                            .getInstance().unmarshall(context);
                    getIdentityMailFromDomainAttributesResult.addMailFromDomainAttributesEntry(
                            entry.getKey(), entry.getValue());
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return getIdentityMailFromDomainAttributesResult;
    }

    private static GetIdentityMailFromDomainAttributesResultStaxUnmarshaller instance;

    public static GetIdentityMailFromDomainAttributesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityMailFromDomainAttributesResultStaxUnmarshaller();
        return instance;
    }
}
