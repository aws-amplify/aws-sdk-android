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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for EnableLoggingRequest
 */
public class EnableLoggingRequestMarshaller implements
        Marshaller<Request<EnableLoggingRequest>, EnableLoggingRequest> {

    public Request<EnableLoggingRequest> marshall(EnableLoggingRequest enableLoggingRequest) {
        if (enableLoggingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(EnableLoggingRequest)");
        }

        Request<EnableLoggingRequest> request = new DefaultRequest<EnableLoggingRequest>(
                enableLoggingRequest, "AmazonRedshift");
        request.addParameter("Action", "EnableLogging");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (enableLoggingRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = enableLoggingRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (enableLoggingRequest.getBucketName() != null) {
            prefix = "BucketName";
            String bucketName = enableLoggingRequest.getBucketName();
            request.addParameter(prefix, StringUtils.fromString(bucketName));
        }
        if (enableLoggingRequest.getS3KeyPrefix() != null) {
            prefix = "S3KeyPrefix";
            String s3KeyPrefix = enableLoggingRequest.getS3KeyPrefix();
            request.addParameter(prefix, StringUtils.fromString(s3KeyPrefix));
        }

        return request;
    }
}
