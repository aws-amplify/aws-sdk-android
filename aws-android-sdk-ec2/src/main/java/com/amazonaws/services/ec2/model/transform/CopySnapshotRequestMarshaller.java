/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Copy Snapshot Request Marshaller
 */
public class CopySnapshotRequestMarshaller implements Marshaller<Request<CopySnapshotRequest>, CopySnapshotRequest> {

    public Request<CopySnapshotRequest> marshall(CopySnapshotRequest copySnapshotRequest) {

        if (copySnapshotRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopySnapshotRequest> request = new DefaultRequest<CopySnapshotRequest>(copySnapshotRequest, "AmazonEC2");
        request.addParameter("Action", "CopySnapshot");
        request.addParameter("Version", "2015-10-01");

        if (copySnapshotRequest.getSourceRegion() != null) {
            request.addParameter("SourceRegion", StringUtils.fromString(copySnapshotRequest.getSourceRegion()));
        }
        if (copySnapshotRequest.getSourceSnapshotId() != null) {
            request.addParameter("SourceSnapshotId", StringUtils.fromString(copySnapshotRequest.getSourceSnapshotId()));
        }
        if (copySnapshotRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(copySnapshotRequest.getDescription()));
        }
        if (copySnapshotRequest.getDestinationRegion() != null) {
            request.addParameter("DestinationRegion", StringUtils.fromString(copySnapshotRequest.getDestinationRegion()));
        }
        if (copySnapshotRequest.getPresignedUrl() != null) {
            request.addParameter("PresignedUrl", StringUtils.fromString(copySnapshotRequest.getPresignedUrl()));
        }
        if (copySnapshotRequest.isEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(copySnapshotRequest.isEncrypted()));
        }
        if (copySnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(copySnapshotRequest.getKmsKeyId()));
        }

        return request;
    }
}
