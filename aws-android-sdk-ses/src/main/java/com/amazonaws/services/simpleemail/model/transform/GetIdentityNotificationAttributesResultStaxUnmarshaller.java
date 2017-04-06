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
 * StAX unmarshaller for response GetIdentityNotificationAttributesResult
 */
public class GetIdentityNotificationAttributesResultStaxUnmarshaller implements
        Unmarshaller<GetIdentityNotificationAttributesResult, StaxUnmarshallerContext> {

    private static class NotificationAttributesMapEntryUnmarshaller
            implements
            Unmarshaller<Map.Entry<String, IdentityNotificationAttributes>, StaxUnmarshallerContext> {
        @Override
        public Entry<String, IdentityNotificationAttributes> unmarshall(
                StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, IdentityNotificationAttributes> entry = new MapEntry<String, IdentityNotificationAttributes>();

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
                        entry.setValue(IdentityNotificationAttributesStaxUnmarshaller.getInstance()
                                .unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent == XmlPullParser.END_TAG) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static NotificationAttributesMapEntryUnmarshaller instance;

        public static NotificationAttributesMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new NotificationAttributesMapEntryUnmarshaller();
            return instance;
        }

    }

    public GetIdentityNotificationAttributesResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        GetIdentityNotificationAttributesResult getIdentityNotificationAttributesResult = new GetIdentityNotificationAttributesResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("NotificationAttributes/entry", targetDepth)) {
                    Entry<String, IdentityNotificationAttributes> entry = NotificationAttributesMapEntryUnmarshaller
                            .getInstance().unmarshall(context);
                    getIdentityNotificationAttributesResult.addNotificationAttributesEntry(
                            entry.getKey(), entry.getValue());
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return getIdentityNotificationAttributesResult;
    }

    private static GetIdentityNotificationAttributesResultStaxUnmarshaller instance;

    public static GetIdentityNotificationAttributesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityNotificationAttributesResultStaxUnmarshaller();
        return instance;
    }
}
