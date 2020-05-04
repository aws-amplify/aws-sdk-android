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

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO JobOperation
 */
class JobOperationStaxMarshaller {

    public void marshall(JobOperation _jobOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_jobOperation.getLambdaInvoke() != null) {
            prefix = _prefix + "LambdaInvoke";
            LambdaInvokeOperation lambdaInvoke = _jobOperation.getLambdaInvoke();
            LambdaInvokeOperationStaxMarshaller.getInstance().marshall(lambdaInvoke, request, prefix + ".");
        }
        if (_jobOperation.getS3PutObjectCopy() != null) {
            prefix = _prefix + "S3PutObjectCopy";
            S3CopyObjectOperation s3PutObjectCopy = _jobOperation.getS3PutObjectCopy();
            S3CopyObjectOperationStaxMarshaller.getInstance().marshall(s3PutObjectCopy, request, prefix + ".");
        }
        if (_jobOperation.getS3PutObjectAcl() != null) {
            prefix = _prefix + "S3PutObjectAcl";
            S3SetObjectAclOperation s3PutObjectAcl = _jobOperation.getS3PutObjectAcl();
            S3SetObjectAclOperationStaxMarshaller.getInstance().marshall(s3PutObjectAcl, request, prefix + ".");
        }
        if (_jobOperation.getS3PutObjectTagging() != null) {
            prefix = _prefix + "S3PutObjectTagging";
            S3SetObjectTaggingOperation s3PutObjectTagging = _jobOperation.getS3PutObjectTagging();
            S3SetObjectTaggingOperationStaxMarshaller.getInstance().marshall(s3PutObjectTagging, request, prefix + ".");
        }
        if (_jobOperation.getS3InitiateRestoreObject() != null) {
            prefix = _prefix + "S3InitiateRestoreObject";
            S3InitiateRestoreObjectOperation s3InitiateRestoreObject = _jobOperation.getS3InitiateRestoreObject();
            S3InitiateRestoreObjectOperationStaxMarshaller.getInstance().marshall(s3InitiateRestoreObject, request, prefix + ".");
        }
        if (_jobOperation.getS3PutObjectLegalHold() != null) {
            prefix = _prefix + "S3PutObjectLegalHold";
            S3SetObjectLegalHoldOperation s3PutObjectLegalHold = _jobOperation.getS3PutObjectLegalHold();
            S3SetObjectLegalHoldOperationStaxMarshaller.getInstance().marshall(s3PutObjectLegalHold, request, prefix + ".");
        }
        if (_jobOperation.getS3PutObjectRetention() != null) {
            prefix = _prefix + "S3PutObjectRetention";
            S3SetObjectRetentionOperation s3PutObjectRetention = _jobOperation.getS3PutObjectRetention();
            S3SetObjectRetentionOperationStaxMarshaller.getInstance().marshall(s3PutObjectRetention, request, prefix + ".");
        }
    }

    private static JobOperationStaxMarshaller instance;
    public static JobOperationStaxMarshaller getInstance() {
        if (instance == null) instance = new JobOperationStaxMarshaller();
        return instance;
    }
}
