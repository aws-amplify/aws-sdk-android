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

import com.amazonaws.services.s3.model.S3KeyFilter;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

import org.xmlpull.v1.XmlPullParser;

class S3KeyFilterStaxUnmarshaller implements Unmarshaller<S3KeyFilter, StaxUnmarshallerContext> {

    private static S3KeyFilterStaxUnmarshaller instance = new S3KeyFilterStaxUnmarshaller();

    public static S3KeyFilterStaxUnmarshaller getInstance() {
        return instance;
    }

    private S3KeyFilterStaxUnmarshaller() {
    }

    @Override
    public S3KeyFilter unmarshall(StaxUnmarshallerContext context) throws Exception {
        final int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        final S3KeyFilter filter = new S3KeyFilter();

        while (true) {
            final int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) {
                break;
            } else if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("FilterRule", targetDepth)) {
                    filter.addFilterRule(FilterRuleStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return filter;
                }
            }
        }

        return filter;
    }

}