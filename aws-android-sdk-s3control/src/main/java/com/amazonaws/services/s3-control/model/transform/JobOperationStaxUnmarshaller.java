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
 * StAX unmarshaller for model JobOperation
 */
class JobOperationStaxUnmarshaller implements Unmarshaller<JobOperation, StaxUnmarshallerContext> {

    public JobOperation unmarshall(StaxUnmarshallerContext context) throws Exception {
        JobOperation jobOperation = new JobOperation();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("LambdaInvoke", targetDepth)) {
                    jobOperation.setLambdaInvoke(LambdaInvokeOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3PutObjectCopy", targetDepth)) {
                    jobOperation.setS3PutObjectCopy(S3CopyObjectOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3PutObjectAcl", targetDepth)) {
                    jobOperation.setS3PutObjectAcl(S3SetObjectAclOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3PutObjectTagging", targetDepth)) {
                    jobOperation.setS3PutObjectTagging(S3SetObjectTaggingOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3InitiateRestoreObject", targetDepth)) {
                    jobOperation.setS3InitiateRestoreObject(S3InitiateRestoreObjectOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3PutObjectLegalHold", targetDepth)) {
                    jobOperation.setS3PutObjectLegalHold(S3SetObjectLegalHoldOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3PutObjectRetention", targetDepth)) {
                    jobOperation.setS3PutObjectRetention(S3SetObjectRetentionOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return jobOperation;
    }

    private static JobOperationStaxUnmarshaller instance;
    public static JobOperationStaxUnmarshaller getInstance() {
        if (instance == null) instance = new JobOperationStaxUnmarshaller();
        return instance;
    }
}
