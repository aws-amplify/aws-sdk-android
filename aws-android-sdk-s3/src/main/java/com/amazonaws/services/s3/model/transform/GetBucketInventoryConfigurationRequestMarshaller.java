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
 * StAX request marshaller for GetBucketInventoryConfigurationRequest
 */
public class GetBucketInventoryConfigurationRequestMarshaller
        implements
        Marshaller<Request<GetBucketInventoryConfigurationRequest>, GetBucketInventoryConfigurationRequest> {

    public Request<GetBucketInventoryConfigurationRequest> marshall(
            GetBucketInventoryConfigurationRequest getBucketInventoryConfigurationRequest) {
        if (getBucketInventoryConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetBucketInventoryConfigurationRequest)");
        }

        Request<GetBucketInventoryConfigurationRequest> request = new DefaultRequest<GetBucketInventoryConfigurationRequest>(
                getBucketInventoryConfigurationRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "GetBucketInventoryConfiguration");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (getBucketInventoryConfigurationRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = getBucketInventoryConfigurationRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (getBucketInventoryConfigurationRequest.getId() != null) {
            prefix = "id";
            String id = getBucketInventoryConfigurationRequest.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }

        return request;
    }
}
