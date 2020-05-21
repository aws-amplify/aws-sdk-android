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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateBucketRequest
 */
public class CreateBucketRequestMarshaller implements
        Marshaller<Request<CreateBucketRequest>, CreateBucketRequest> {

    public Request<CreateBucketRequest> marshall(CreateBucketRequest createBucketRequest) {
        if (createBucketRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateBucketRequest)");
        }

        Request<CreateBucketRequest> request = new DefaultRequest<CreateBucketRequest>(
                createBucketRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "CreateBucket");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (createBucketRequest.getACL() != null) {
            prefix = "x-amz-acl";
            String aCL = createBucketRequest.getACL();
            request.addParameter(prefix, StringUtils.fromString(aCL));
        }
        if (createBucketRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = createBucketRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (createBucketRequest.getCreateBucketConfiguration() != null) {
            prefix = "CreateBucketConfiguration";
            CreateBucketConfiguration createBucketConfiguration = createBucketRequest
                    .getCreateBucketConfiguration();
            CreateBucketConfigurationStaxMarshaller.getInstance().marshall(
                    createBucketConfiguration, request, prefix + ".");
        }
        if (createBucketRequest.getGrantFullControl() != null) {
            prefix = "x-amz-grant-full-control";
            String grantFullControl = createBucketRequest.getGrantFullControl();
            request.addParameter(prefix, StringUtils.fromString(grantFullControl));
        }
        if (createBucketRequest.getGrantRead() != null) {
            prefix = "x-amz-grant-read";
            String grantRead = createBucketRequest.getGrantRead();
            request.addParameter(prefix, StringUtils.fromString(grantRead));
        }
        if (createBucketRequest.getGrantReadACP() != null) {
            prefix = "x-amz-grant-read-acp";
            String grantReadACP = createBucketRequest.getGrantReadACP();
            request.addParameter(prefix, StringUtils.fromString(grantReadACP));
        }
        if (createBucketRequest.getGrantWrite() != null) {
            prefix = "x-amz-grant-write";
            String grantWrite = createBucketRequest.getGrantWrite();
            request.addParameter(prefix, StringUtils.fromString(grantWrite));
        }
        if (createBucketRequest.getGrantWriteACP() != null) {
            prefix = "x-amz-grant-write-acp";
            String grantWriteACP = createBucketRequest.getGrantWriteACP();
            request.addParameter(prefix, StringUtils.fromString(grantWriteACP));
        }
        if (createBucketRequest.getObjectLockEnabledForBucket() != null) {
            prefix = "x-amz-bucket-object-lock-enabled";
            Boolean objectLockEnabledForBucket = createBucketRequest
                    .getObjectLockEnabledForBucket();
            request.addParameter(prefix, StringUtils.fromBoolean(objectLockEnabledForBucket));
        }

        return request;
    }
}
