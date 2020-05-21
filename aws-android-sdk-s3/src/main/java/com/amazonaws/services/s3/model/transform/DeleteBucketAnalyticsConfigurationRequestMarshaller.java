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
 * StAX request marshaller for DeleteBucketAnalyticsConfigurationRequest
 */
public class DeleteBucketAnalyticsConfigurationRequestMarshaller
        implements
        Marshaller<Request<DeleteBucketAnalyticsConfigurationRequest>, DeleteBucketAnalyticsConfigurationRequest> {

    public Request<DeleteBucketAnalyticsConfigurationRequest> marshall(
            DeleteBucketAnalyticsConfigurationRequest deleteBucketAnalyticsConfigurationRequest) {
        if (deleteBucketAnalyticsConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteBucketAnalyticsConfigurationRequest)");
        }

        Request<DeleteBucketAnalyticsConfigurationRequest> request = new DefaultRequest<DeleteBucketAnalyticsConfigurationRequest>(
                deleteBucketAnalyticsConfigurationRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "DeleteBucketAnalyticsConfiguration");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (deleteBucketAnalyticsConfigurationRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = deleteBucketAnalyticsConfigurationRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (deleteBucketAnalyticsConfigurationRequest.getId() != null) {
            prefix = "id";
            String id = deleteBucketAnalyticsConfigurationRequest.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }

        return request;
    }
}
