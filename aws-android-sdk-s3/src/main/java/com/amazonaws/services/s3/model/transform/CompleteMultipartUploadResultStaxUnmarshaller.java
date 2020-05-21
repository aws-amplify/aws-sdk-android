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
 * StAX unmarshaller for response CompleteMultipartUploadResult
 */
public class CompleteMultipartUploadResultStaxUnmarshaller implements
        Unmarshaller<CompleteMultipartUploadResult, StaxUnmarshallerContext> {

    public CompleteMultipartUploadResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        CompleteMultipartUploadResult completeMultipartUploadResult = new CompleteMultipartUploadResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Location", targetDepth)) {
                    completeMultipartUploadResult.setLocation(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Bucket", targetDepth)) {
                    completeMultipartUploadResult.setBucket(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Key", targetDepth)) {
                    completeMultipartUploadResult.setKey(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-expiration", targetDepth)) {
                    completeMultipartUploadResult.setExpiration(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ETag", targetDepth)) {
                    completeMultipartUploadResult.setETag(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption", targetDepth)) {
                    completeMultipartUploadResult.setServerSideEncryption(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-version-id", targetDepth)) {
                    completeMultipartUploadResult.setVersionId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-aws-kms-key-id",
                        targetDepth)) {
                    completeMultipartUploadResult.setSSEKMSKeyId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-request-charged", targetDepth)) {
                    completeMultipartUploadResult.setRequestCharged(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return completeMultipartUploadResult;
    }

    private static CompleteMultipartUploadResultStaxUnmarshaller instance;

    public static CompleteMultipartUploadResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CompleteMultipartUploadResultStaxUnmarshaller();
        return instance;
    }
}
