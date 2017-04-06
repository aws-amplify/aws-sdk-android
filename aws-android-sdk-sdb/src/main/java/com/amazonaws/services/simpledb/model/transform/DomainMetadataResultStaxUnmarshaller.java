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

package com.amazonaws.services.simpledb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Domain Metadata Result StAX Unmarshaller
 */
public class DomainMetadataResultStaxUnmarshaller implements Unmarshaller<DomainMetadataResult, StaxUnmarshallerContext> {

    public DomainMetadataResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DomainMetadataResult domainMetadataResult = new DomainMetadataResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return domainMetadataResult;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("ItemCount", targetDepth)) {
                    domainMetadataResult.setItemCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ItemNamesSizeBytes", targetDepth)) {
                    domainMetadataResult.setItemNamesSizeBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeNameCount", targetDepth)) {
                    domainMetadataResult.setAttributeNameCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeNamesSizeBytes", targetDepth)) {
                    domainMetadataResult.setAttributeNamesSizeBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeValueCount", targetDepth)) {
                    domainMetadataResult.setAttributeValueCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AttributeValuesSizeBytes", targetDepth)) {
                    domainMetadataResult.setAttributeValuesSizeBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    domainMetadataResult.setTimestamp(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return domainMetadataResult;
                }
            }
        }
    }

    private static DomainMetadataResultStaxUnmarshaller instance;
    public static DomainMetadataResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DomainMetadataResultStaxUnmarshaller();
        return instance;
    }
}
    