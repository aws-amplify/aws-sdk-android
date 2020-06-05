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

package com.amazonaws.services.cloudfront.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model DefaultCacheBehavior
 */
class DefaultCacheBehaviorStaxUnmarshaller implements
        Unmarshaller<DefaultCacheBehavior, StaxUnmarshallerContext> {

    public DefaultCacheBehavior unmarshall(StaxUnmarshallerContext context) throws Exception {
        DefaultCacheBehavior defaultCacheBehavior = new DefaultCacheBehavior();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("TargetOriginId", targetDepth)) {
                    defaultCacheBehavior.setTargetOriginId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ForwardedValues", targetDepth)) {
                    defaultCacheBehavior.setForwardedValues(ForwardedValuesStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TrustedSigners", targetDepth)) {
                    defaultCacheBehavior.setTrustedSigners(TrustedSignersStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ViewerProtocolPolicy", targetDepth)) {
                    defaultCacheBehavior.setViewerProtocolPolicy(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MinTTL", targetDepth)) {
                    defaultCacheBehavior.setMinTTL(LongStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AllowedMethods", targetDepth)) {
                    defaultCacheBehavior.setAllowedMethods(AllowedMethodsStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SmoothStreaming", targetDepth)) {
                    defaultCacheBehavior.setSmoothStreaming(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultTTL", targetDepth)) {
                    defaultCacheBehavior.setDefaultTTL(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxTTL", targetDepth)) {
                    defaultCacheBehavior.setMaxTTL(LongStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Compress", targetDepth)) {
                    defaultCacheBehavior.setCompress(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("LambdaFunctionAssociations", targetDepth)) {
                    defaultCacheBehavior
                            .setLambdaFunctionAssociations(LambdaFunctionAssociationsStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("FieldLevelEncryptionId", targetDepth)) {
                    defaultCacheBehavior.setFieldLevelEncryptionId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return defaultCacheBehavior;
    }

    private static DefaultCacheBehaviorStaxUnmarshaller instance;

    public static DefaultCacheBehaviorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DefaultCacheBehaviorStaxUnmarshaller();
        return instance;
    }
}
