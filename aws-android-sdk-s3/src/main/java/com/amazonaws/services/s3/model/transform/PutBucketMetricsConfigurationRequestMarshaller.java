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
 * StAX request marshaller for PutBucketMetricsConfigurationRequest
 */
public class PutBucketMetricsConfigurationRequestMarshaller
        implements
        Marshaller<Request<PutBucketMetricsConfigurationRequest>, PutBucketMetricsConfigurationRequest> {

    public Request<PutBucketMetricsConfigurationRequest> marshall(
            PutBucketMetricsConfigurationRequest putBucketMetricsConfigurationRequest) {
        if (putBucketMetricsConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutBucketMetricsConfigurationRequest)");
        }

        Request<PutBucketMetricsConfigurationRequest> request = new DefaultRequest<PutBucketMetricsConfigurationRequest>(
                putBucketMetricsConfigurationRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "PutBucketMetricsConfiguration");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (putBucketMetricsConfigurationRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = putBucketMetricsConfigurationRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (putBucketMetricsConfigurationRequest.getId() != null) {
            prefix = "id";
            String id = putBucketMetricsConfigurationRequest.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (putBucketMetricsConfigurationRequest.getMetricsConfiguration() != null) {
            prefix = "MetricsConfiguration";
            MetricsConfiguration metricsConfiguration = putBucketMetricsConfigurationRequest
                    .getMetricsConfiguration();
            MetricsConfigurationStaxMarshaller.getInstance().marshall(metricsConfiguration,
                    request, prefix + ".");
        }

        return request;
    }
}
