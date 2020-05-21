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
 * StAX unmarshaller for response ListMultipartUploadsResult
 */
public class ListMultipartUploadsResultStaxUnmarshaller implements
        Unmarshaller<ListMultipartUploadsResult, StaxUnmarshallerContext> {

    public ListMultipartUploadsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListMultipartUploadsResult listMultipartUploadsResult = new ListMultipartUploadsResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Bucket", targetDepth)) {
                    listMultipartUploadsResult.setBucket(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("KeyMarker", targetDepth)) {
                    listMultipartUploadsResult.setKeyMarker(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("UploadIdMarker", targetDepth)) {
                    listMultipartUploadsResult.setUploadIdMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextKeyMarker", targetDepth)) {
                    listMultipartUploadsResult.setNextKeyMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    listMultipartUploadsResult.setPrefix(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    listMultipartUploadsResult.setDelimiter(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextUploadIdMarker", targetDepth)) {
                    listMultipartUploadsResult.setNextUploadIdMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxUploads", targetDepth)) {
                    listMultipartUploadsResult.setMaxUploads(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    listMultipartUploadsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Uploads/member", targetDepth)) {
                    listMultipartUploadsResult.withUploads(MultipartUploadStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CommonPrefixes/member", targetDepth)) {
                    listMultipartUploadsResult.withCommonPrefixes(CommonPrefixStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EncodingType", targetDepth)) {
                    listMultipartUploadsResult.setEncodingType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return listMultipartUploadsResult;
    }

    private static ListMultipartUploadsResultStaxUnmarshaller instance;

    public static ListMultipartUploadsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListMultipartUploadsResultStaxUnmarshaller();
        return instance;
    }
}
