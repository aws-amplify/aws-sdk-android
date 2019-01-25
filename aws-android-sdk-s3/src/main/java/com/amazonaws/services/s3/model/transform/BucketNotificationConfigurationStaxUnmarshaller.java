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

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.util.Map.Entry;

public class BucketNotificationConfigurationStaxUnmarshaller implements
        Unmarshaller<BucketNotificationConfiguration, InputStream> {

    private static BucketNotificationConfigurationStaxUnmarshaller instance = new BucketNotificationConfigurationStaxUnmarshaller();

    public static BucketNotificationConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    private static final XmlPullParserFactory xmlPullParserFactory;
    static {
        try {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        } catch (final XmlPullParserException xppe) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", xppe);
        }
    }

    private BucketNotificationConfigurationStaxUnmarshaller() {
    }

    @Override
    public BucketNotificationConfiguration unmarshall(InputStream inputStream) throws Exception {

        final XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        xpp.setInput(inputStream, null);

        final StaxUnmarshallerContext context = new StaxUnmarshallerContext(xpp,
                null);

        final int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        final BucketNotificationConfiguration config = new BucketNotificationConfiguration();

        while (true) {
            final int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) {
                break;
            } else if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("TopicConfiguration", targetDepth)) {
                    final Entry<String, NotificationConfiguration> entry = TopicConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context);
                    config.addConfiguration(entry.getKey(), entry.getValue());
                } else if (context.testExpression("QueueConfiguration", targetDepth)) {
                    final Entry<String, NotificationConfiguration> entry = QueueConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context);
                    config.addConfiguration(entry.getKey(), entry.getValue());
                } else if (context.testExpression("CloudFunctionConfiguration", targetDepth)) {
                    final Entry<String, NotificationConfiguration> entry = LambdaConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context);
                    config.addConfiguration(entry.getKey(), entry.getValue());
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return config;
                }
            }
        }

        return config;
    }

}