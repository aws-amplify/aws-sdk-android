/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.services.s3.model.QueueConfiguration;
import com.amazonaws.services.s3.model.TopicConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import org.xmlpull.v1.XmlPullParser;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

/**
 * Base class for unmarshalling into subclasses of {@link NotificationConfiguration}. Current only
 * {@link QueueConfiguration} and {@link TopicConfiguration} extend this class.
 *
 * @param <T>
 *            Concrete type of {@link NotificationConfiguration}
 */
abstract class NotificationConfigurationStaxUnmarshaller<T extends NotificationConfiguration> implements
        Unmarshaller<Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {

    /**
     * Id (aka configuration name) isn't modeled on the actual {@link NotificationConfiguration}
     * class but as the key name in the map of configurations in
     * {@link BucketNotificationConfiguration}
     */
    @Override
    public Entry<String, NotificationConfiguration> unmarshall(StaxUnmarshallerContext context) throws Exception {
        final int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        final T topicConfig = createConfiguration();
        String id = null;

        while (true) {
            final int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) {
                break;
            } else if (xmlEvent == XmlPullParser.START_TAG) {
                if (handleXmlEvent(topicConfig, context, targetDepth)) {
                    // Do nothing, subclass has handled it
                } else if (context.testExpression("Id", targetDepth)) {
                    id = StringStaxUnmarshaller.getInstance().unmarshall(context);
                } else if (context.testExpression("Event", targetDepth)) {
                    topicConfig.addEvent(StringStaxUnmarshaller.getInstance().unmarshall(context));
                } else if (context.testExpression("Filter", targetDepth)) {
                    topicConfig.setFilter(FilterStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return new SimpleEntry<String, NotificationConfiguration>(id, topicConfig);
                }
            }
        }

        return null;
    }

    /**
     * Factory method to create the appropriate subclass of {@link NotificationConfiguration}
     */
    protected abstract T createConfiguration();

    /**
     * Callback to allow subclass first shot at handling an XML event. Only attribute and start
     * element events are forwarded to subclasses
     *
     * @param config
     *            {@link NotificationConfiguration} object we are unmarshalling into
     * @param context
     *            Context of XML unmarshalling
     * @param targetDepth
     *            expected depth for this level of unmarshalling
     * @return True if event has been handled and super class should move on to the next event,
     *         false otherwise
     * @throws Exception
     */
    protected abstract boolean handleXmlEvent(T config, StaxUnmarshallerContext context, int targetDepth)
            throws Exception;
}