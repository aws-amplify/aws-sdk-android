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
 * StAX unmarshaller for response ListObjectVersionsResult
 */
public class ListObjectVersionsResultStaxUnmarshaller implements
        Unmarshaller<ListObjectVersionsResult, StaxUnmarshallerContext> {

    public ListObjectVersionsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListObjectVersionsResult listObjectVersionsResult = new ListObjectVersionsResult();

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
                    listObjectVersionsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("KeyMarker", targetDepth)) {
                    listObjectVersionsResult.setKeyMarker(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VersionIdMarker", targetDepth)) {
                    listObjectVersionsResult.setVersionIdMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextKeyMarker", targetDepth)) {
                    listObjectVersionsResult.setNextKeyMarker(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextVersionIdMarker", targetDepth)) {
                    listObjectVersionsResult.setNextVersionIdMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Versions/member", targetDepth)) {
                    listObjectVersionsResult.withVersions(ObjectVersionStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeleteMarkers/member", targetDepth)) {
                    listObjectVersionsResult.withDeleteMarkers(DeleteMarkerEntryStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Name", targetDepth)) {
                    listObjectVersionsResult.setName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    listObjectVersionsResult.setPrefix(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    listObjectVersionsResult.setDelimiter(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxKeys", targetDepth)) {
                    listObjectVersionsResult.setMaxKeys(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CommonPrefixes/member", targetDepth)) {
                    listObjectVersionsResult.withCommonPrefixes(CommonPrefixStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EncodingType", targetDepth)) {
                    listObjectVersionsResult.setEncodingType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return listObjectVersionsResult;
    }

    private static ListObjectVersionsResultStaxUnmarshaller instance;

    public static ListObjectVersionsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListObjectVersionsResultStaxUnmarshaller();
        return instance;
    }
}
