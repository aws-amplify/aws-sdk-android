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
 * StAX unmarshaller for model S3Grant
 */
class S3GrantStaxUnmarshaller implements Unmarshaller<S3Grant, StaxUnmarshallerContext> {

    public S3Grant unmarshall(StaxUnmarshallerContext context) throws Exception {
        S3Grant s3Grant = new S3Grant();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Grantee", targetDepth)) {
                    s3Grant.setGrantee(S3GranteeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Permission", targetDepth)) {
                    s3Grant.setPermission(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return s3Grant;
    }

    private static S3GrantStaxUnmarshaller instance;
    public static S3GrantStaxUnmarshaller getInstance() {
        if (instance == null) instance = new S3GrantStaxUnmarshaller();
        return instance;
    }
}
