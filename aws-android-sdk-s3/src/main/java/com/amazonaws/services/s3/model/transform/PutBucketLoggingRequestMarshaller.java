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
 * StAX request marshaller for PutBucketLoggingRequest
 */
public class PutBucketLoggingRequestMarshaller implements
        Marshaller<Request<PutBucketLoggingRequest>, PutBucketLoggingRequest> {

    public Request<PutBucketLoggingRequest> marshall(PutBucketLoggingRequest putBucketLoggingRequest) {
        if (putBucketLoggingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBucketLoggingRequest)");
        }

        Request<PutBucketLoggingRequest> request = new DefaultRequest<PutBucketLoggingRequest>(
                putBucketLoggingRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutBucketLogging");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putBucketLoggingRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putBucketLoggingRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putBucketLoggingRequest.getBucketLoggingStatus() != null) {
            prefix = "BucketLoggingStatus";
            BucketLoggingStatus bucketLoggingStatus = putBucketLoggingRequest
                    .getBucketLoggingStatus();
            BucketLoggingStatusStaxMarshaller.getInstance().marshall(bucketLoggingStatus, request,
                    prefix + ".");
        }
        if (putBucketLoggingRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putBucketLoggingRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }

        return request;
    }
}
