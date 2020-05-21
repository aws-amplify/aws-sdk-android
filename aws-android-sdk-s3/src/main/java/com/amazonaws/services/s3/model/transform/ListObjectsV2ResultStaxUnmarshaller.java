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

package com.amazonaws.services.s3.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response ListObjectsV2Result
 */
public class ListObjectsV2ResultStaxUnmarshaller implements
        Unmarshaller<ListObjectsV2Result, StaxUnmarshallerContext> {

    public ListObjectsV2Result unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListObjectsV2Result listObjectsV2Result = new ListObjectsV2Result();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("IsTruncated", targetDepth)) {
                    listObjectsV2Result.setIsTruncated(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Contents/member", targetDepth)) {
                    listObjectsV2Result.withContents(ObjectStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Name", targetDepth)) {
                    listObjectsV2Result.setName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    listObjectsV2Result.setPrefix(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    listObjectsV2Result.setDelimiter(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxKeys", targetDepth)) {
                    listObjectsV2Result.setMaxKeys(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CommonPrefixes/member", targetDepth)) {
                    listObjectsV2Result.withCommonPrefixes(CommonPrefixStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EncodingType", targetDepth)) {
                    listObjectsV2Result.setEncodingType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("KeyCount", targetDepth)) {
                    listObjectsV2Result.setKeyCount(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ContinuationToken", targetDepth)) {
                    listObjectsV2Result.setContinuationToken(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextContinuationToken", targetDepth)) {
                    listObjectsV2Result.setNextContinuationToken(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StartAfter", targetDepth)) {
                    listObjectsV2Result.setStartAfter(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return listObjectsV2Result;
    }

    private static ListObjectsV2ResultStaxUnmarshaller instance;

    public static ListObjectsV2ResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListObjectsV2ResultStaxUnmarshaller();
        return instance;
    }
}
