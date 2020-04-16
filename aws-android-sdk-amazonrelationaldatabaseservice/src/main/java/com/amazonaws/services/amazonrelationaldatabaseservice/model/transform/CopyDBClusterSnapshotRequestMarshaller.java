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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CopyDBClusterSnapshotRequest
 */
public class CopyDBClusterSnapshotRequestMarshaller implements
        Marshaller<Request<CopyDBClusterSnapshotRequest>, CopyDBClusterSnapshotRequest> {

    public Request<CopyDBClusterSnapshotRequest> marshall(
            CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest) {
        if (copyDBClusterSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyDBClusterSnapshotRequest)");
        }

        Request<CopyDBClusterSnapshotRequest> request = new DefaultRequest<CopyDBClusterSnapshotRequest>(
                copyDBClusterSnapshotRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CopyDBClusterSnapshot");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (copyDBClusterSnapshotRequest.getSourceDBClusterSnapshotIdentifier() != null) {
            prefix = "SourceDBClusterSnapshotIdentifier";
            String sourceDBClusterSnapshotIdentifier = copyDBClusterSnapshotRequest
                    .getSourceDBClusterSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBClusterSnapshotIdentifier));
        }
        if (copyDBClusterSnapshotRequest.getTargetDBClusterSnapshotIdentifier() != null) {
            prefix = "TargetDBClusterSnapshotIdentifier";
            String targetDBClusterSnapshotIdentifier = copyDBClusterSnapshotRequest
                    .getTargetDBClusterSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetDBClusterSnapshotIdentifier));
        }
        if (copyDBClusterSnapshotRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = copyDBClusterSnapshotRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (copyDBClusterSnapshotRequest.getPreSignedUrl() != null) {
            prefix = "PreSignedUrl";
            String preSignedUrl = copyDBClusterSnapshotRequest.getPreSignedUrl();
            request.addParameter(prefix, StringUtils.fromString(preSignedUrl));
        }
        if (copyDBClusterSnapshotRequest.getCopyTags() != null) {
            prefix = "CopyTags";
            Boolean copyTags = copyDBClusterSnapshotRequest.getCopyTags();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTags));
        }
        if (copyDBClusterSnapshotRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = copyDBClusterSnapshotRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
