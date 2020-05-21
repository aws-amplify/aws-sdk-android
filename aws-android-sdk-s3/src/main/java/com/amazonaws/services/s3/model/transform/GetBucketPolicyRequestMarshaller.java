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
 * StAX request marshaller for GetBucketPolicyRequest
 */
public class GetBucketPolicyRequestMarshaller implements
        Marshaller<Request<GetBucketPolicyRequest>, GetBucketPolicyRequest> {

    public Request<GetBucketPolicyRequest> marshall(GetBucketPolicyRequest getBucketPolicyRequest) {
        if (getBucketPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetBucketPolicyRequest)");
        }

        Request<GetBucketPolicyRequest> request = new DefaultRequest<GetBucketPolicyRequest>(
                getBucketPolicyRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "GetBucketPolicy");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (getBucketPolicyRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = getBucketPolicyRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }

        return request;
    }
}
