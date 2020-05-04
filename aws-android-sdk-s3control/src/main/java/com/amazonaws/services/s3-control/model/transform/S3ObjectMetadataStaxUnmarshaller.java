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
package com.amazonaws.services.s3-control.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * StAX unmarshaller for model S3ObjectMetadata
 */
class S3ObjectMetadataStaxUnmarshaller implements Unmarshaller<S3ObjectMetadata, StaxUnmarshallerContext> {

    private static class UserMetadataMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {
        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry
                = new MapEntry<String, String>();

            while (true) {
                int xmlEvent = context.nextEvent();
                if (xmlEvent == XmlPullParser.END_DOCUMENT) return entry;

                if (xmlEvent == XmlPullParser.START_TAG) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent == XmlPullParser.END_TAG) {
                    if (context.getCurrentDepth() < originalDepth) return entry;
                }
            }
        }

        private static UserMetadataMapEntryUnmarshaller instance;
        public static UserMetadataMapEntryUnmarshaller getInstance() {
            if (instance == null) instance = new UserMetadataMapEntryUnmarshaller();
            return instance;
        }

    }

    public S3ObjectMetadata unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3ObjectMetadata s3ObjectMetadata = new S3ObjectMetadata();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("CacheControl", targetDepth)) {
                    s3ObjectMetadata.setCacheControl(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ContentDisposition", targetDepth)) {
                    s3ObjectMetadata.setContentDisposition(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ContentEncoding", targetDepth)) {
                    s3ObjectMetadata.setContentEncoding(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ContentLanguage", targetDepth)) {
                    s3ObjectMetadata.setContentLanguage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UserMetadata/entry", targetDepth)) {
                    Entry<String, String> entry = UserMetadataMapEntryUnmarshaller.getInstance().unmarshall(context);
                    s3ObjectMetadata.addUserMetadataEntry(entry.getKey(), entry.getValue());
                    continue;
                }
                if (context.testExpression("ContentLength", targetDepth)) {
                    s3ObjectMetadata.setContentLength(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ContentMD5", targetDepth)) {
                    s3ObjectMetadata.setContentMD5(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ContentType", targetDepth)) {
                    s3ObjectMetadata.setContentType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HttpExpiresDate", targetDepth)) {
                    s3ObjectMetadata.setHttpExpiresDate(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequesterCharged", targetDepth)) {
                    s3ObjectMetadata.setRequesterCharged(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SSEAlgorithm", targetDepth)) {
                    s3ObjectMetadata.setSSEAlgorithm(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return s3ObjectMetadata;
    }

    private static S3ObjectMetadataStaxUnmarshaller instance;
    public static S3ObjectMetadataStaxUnmarshaller getInstance() {
        if (instance == null) instance = new S3ObjectMetadataStaxUnmarshaller();
        return instance;
    }
}
