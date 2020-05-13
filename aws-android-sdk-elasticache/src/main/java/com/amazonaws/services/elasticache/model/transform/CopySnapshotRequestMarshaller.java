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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CopySnapshotRequest
 */
public class CopySnapshotRequestMarshaller implements
        Marshaller<Request<CopySnapshotRequest>, CopySnapshotRequest> {

    public Request<CopySnapshotRequest> marshall(CopySnapshotRequest copySnapshotRequest) {
        if (copySnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopySnapshotRequest)");
        }

        Request<CopySnapshotRequest> request = new DefaultRequest<CopySnapshotRequest>(
                copySnapshotRequest, "AmazonElastiCache");
        request.addParameter("Action", "CopySnapshot");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (copySnapshotRequest.getSourceSnapshotName() != null) {
            prefix = "SourceSnapshotName";
            String sourceSnapshotName = copySnapshotRequest.getSourceSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(sourceSnapshotName));
        }
        if (copySnapshotRequest.getTargetSnapshotName() != null) {
            prefix = "TargetSnapshotName";
            String targetSnapshotName = copySnapshotRequest.getTargetSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(targetSnapshotName));
        }
        if (copySnapshotRequest.getTargetBucket() != null) {
            prefix = "TargetBucket";
            String targetBucket = copySnapshotRequest.getTargetBucket();
            request.addParameter(prefix, StringUtils.fromString(targetBucket));
        }
        if (copySnapshotRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = copySnapshotRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }

        return request;
    }
}
