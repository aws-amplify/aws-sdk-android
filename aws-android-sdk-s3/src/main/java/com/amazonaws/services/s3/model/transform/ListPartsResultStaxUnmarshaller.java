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
 * StAX unmarshaller for response ListPartsResult
 */
public class ListPartsResultStaxUnmarshaller implements
        Unmarshaller<ListPartsResult, StaxUnmarshallerContext> {

    public ListPartsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListPartsResult listPartsResult = new ListPartsResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("x-amz-abort-date", targetDepth)) {
                    listPartsResult.setAbortDate(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-abort-rule-id", targetDepth)) {
                    listPartsResult.setAbortRuleId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Bucket", targetDepth)) {
                    listPartsResult.setBucket(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Key", targetDepth)) {
                    listPartsResult
                            .setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UploadId", targetDepth)) {
                    listPartsResult.setUploadId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PartNumberMarker", targetDepth)) {
                    listPartsResult.setPartNumberMarker(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextPartNumberMarker", targetDepth)) {
                    listPartsResult.setNextPartNumberMarker(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxParts", targetDepth)) {
                    listPartsResult.setMaxParts(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    listPartsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Parts/member", targetDepth)) {
                    listPartsResult.withParts(PartStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Initiator", targetDepth)) {
                    listPartsResult.setInitiator(InitiatorStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Owner", targetDepth)) {
                    listPartsResult.setOwner(OwnerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StorageClass", targetDepth)) {
                    listPartsResult.setStorageClass(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-request-charged", targetDepth)) {
                    listPartsResult.setRequestCharged(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return listPartsResult;
    }

    private static ListPartsResultStaxUnmarshaller instance;

    public static ListPartsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPartsResultStaxUnmarshaller();
        return instance;
    }
}
