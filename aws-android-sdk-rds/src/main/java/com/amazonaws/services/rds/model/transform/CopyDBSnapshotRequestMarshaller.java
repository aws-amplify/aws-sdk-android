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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CopyDBSnapshotRequest
 */
public class CopyDBSnapshotRequestMarshaller implements
        Marshaller<Request<CopyDBSnapshotRequest>, CopyDBSnapshotRequest> {

    public Request<CopyDBSnapshotRequest> marshall(CopyDBSnapshotRequest copyDBSnapshotRequest) {
        if (copyDBSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyDBSnapshotRequest)");
        }

        Request<CopyDBSnapshotRequest> request = new DefaultRequest<CopyDBSnapshotRequest>(
                copyDBSnapshotRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CopyDBSnapshot");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (copyDBSnapshotRequest.getSourceDBSnapshotIdentifier() != null) {
            prefix = "SourceDBSnapshotIdentifier";
            String sourceDBSnapshotIdentifier = copyDBSnapshotRequest
                    .getSourceDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBSnapshotIdentifier));
        }
        if (copyDBSnapshotRequest.getTargetDBSnapshotIdentifier() != null) {
            prefix = "TargetDBSnapshotIdentifier";
            String targetDBSnapshotIdentifier = copyDBSnapshotRequest
                    .getTargetDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetDBSnapshotIdentifier));
        }
        if (copyDBSnapshotRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = copyDBSnapshotRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (copyDBSnapshotRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = copyDBSnapshotRequest.getTags();
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
        if (copyDBSnapshotRequest.getCopyTags() != null) {
            prefix = "CopyTags";
            Boolean copyTags = copyDBSnapshotRequest.getCopyTags();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTags));
        }
        if (copyDBSnapshotRequest.getPreSignedUrl() != null) {
            prefix = "PreSignedUrl";
            String preSignedUrl = copyDBSnapshotRequest.getPreSignedUrl();
            request.addParameter(prefix, StringUtils.fromString(preSignedUrl));
        }
        if (copyDBSnapshotRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = copyDBSnapshotRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }

        return request;
    }
}
