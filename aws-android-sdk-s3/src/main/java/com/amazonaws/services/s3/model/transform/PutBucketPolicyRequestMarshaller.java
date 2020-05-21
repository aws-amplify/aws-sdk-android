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
 * StAX request marshaller for PutBucketPolicyRequest
 */
public class PutBucketPolicyRequestMarshaller implements
        Marshaller<Request<PutBucketPolicyRequest>, PutBucketPolicyRequest> {

    public Request<PutBucketPolicyRequest> marshall(PutBucketPolicyRequest putBucketPolicyRequest) {
        if (putBucketPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBucketPolicyRequest)");
        }

        Request<PutBucketPolicyRequest> request = new DefaultRequest<PutBucketPolicyRequest>(
                putBucketPolicyRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutBucketPolicy");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putBucketPolicyRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putBucketPolicyRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putBucketPolicyRequest.getContentMD5() != null) {
            prefix = "Content-MD5";
            String contentMD5 = putBucketPolicyRequest.getContentMD5();
            request.addParameter(prefix, StringUtils.fromString(contentMD5));
        }
        if (putBucketPolicyRequest.getConfirmRemoveSelfBucketAccess() != null) {
            prefix = "x-amz-confirm-remove-self-bucket-access";
            Boolean confirmRemoveSelfBucketAccess = putBucketPolicyRequest
                    .getConfirmRemoveSelfBucketAccess();
            request.addParameter(prefix, StringUtils.fromBoolean(confirmRemoveSelfBucketAccess));
        }
        if (putBucketPolicyRequest.getPolicy() != null) {
            prefix = "Policy";
            String policy = putBucketPolicyRequest.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }

        return request;
    }
}
