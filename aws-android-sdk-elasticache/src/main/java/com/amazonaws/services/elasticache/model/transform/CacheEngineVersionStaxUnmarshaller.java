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

package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model CacheEngineVersion
 */
class CacheEngineVersionStaxUnmarshaller implements
        Unmarshaller<CacheEngineVersion, StaxUnmarshallerContext> {

    public CacheEngineVersion unmarshall(StaxUnmarshallerContext context) throws Exception {
        CacheEngineVersion cacheEngineVersion = new CacheEngineVersion();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Engine", targetDepth)) {
                    cacheEngineVersion.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    cacheEngineVersion.setEngineVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheParameterGroupFamily", targetDepth)) {
                    cacheEngineVersion.setCacheParameterGroupFamily(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheEngineDescription", targetDepth)) {
                    cacheEngineVersion.setCacheEngineDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheEngineVersionDescription", targetDepth)) {
                    cacheEngineVersion.setCacheEngineVersionDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return cacheEngineVersion;
    }

    private static CacheEngineVersionStaxUnmarshaller instance;

    public static CacheEngineVersionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CacheEngineVersionStaxUnmarshaller();
        return instance;
    }
}
