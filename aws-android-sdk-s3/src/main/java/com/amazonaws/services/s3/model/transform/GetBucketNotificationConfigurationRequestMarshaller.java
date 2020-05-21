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
 * StAX request marshaller for GetBucketNotificationConfigurationRequest
 */
public class GetBucketNotificationConfigurationRequestMarshaller
        implements
        Marshaller<Request<GetBucketNotificationConfigurationRequest>, GetBucketNotificationConfigurationRequest> {

    public Request<GetBucketNotificationConfigurationRequest> marshall(
            GetBucketNotificationConfigurationRequest getBucketNotificationConfigurationRequest) {
        if (getBucketNotificationConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetBucketNotificationConfigurationRequest)");
        }

        Request<GetBucketNotificationConfigurationRequest> request = new DefaultRequest<GetBucketNotificationConfigurationRequest>(
                getBucketNotificationConfigurationRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "GetBucketNotificationConfiguration");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (getBucketNotificationConfigurationRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = getBucketNotificationConfigurationRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }

        return request;
    }
}
