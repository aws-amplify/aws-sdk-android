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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3CopyObjectOperation
 */
class S3CopyObjectOperationStaxMarshaller {

    public void marshall(S3CopyObjectOperation _s3CopyObjectOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_s3CopyObjectOperation.getTargetResource() != null) {
            prefix = _prefix + "TargetResource";
            String targetResource = _s3CopyObjectOperation.getTargetResource();
            request.addParameter(prefix, StringUtils.fromString(targetResource));
        }
        if (_s3CopyObjectOperation.getCannedAccessControlList() != null) {
            prefix = _prefix + "CannedAccessControlList";
            String cannedAccessControlList = _s3CopyObjectOperation.getCannedAccessControlList();
            request.addParameter(prefix, StringUtils.fromString(cannedAccessControlList));
        }
        if (_s3CopyObjectOperation.getAccessControlGrants() != null) {
            prefix = _prefix + "AccessControlGrants";
            java.util.List<S3Grant> accessControlGrants = _s3CopyObjectOperation.getAccessControlGrants();
            int accessControlGrantsIndex = 1;
            String accessControlGrantsPrefix = prefix;
            for (S3Grant accessControlGrantsItem : accessControlGrants) {
                prefix = accessControlGrantsPrefix + ".member." + accessControlGrantsIndex;
                if (accessControlGrantsItem != null) {
            S3GrantStaxMarshaller.getInstance().marshall(accessControlGrantsItem, request, prefix + ".");
                    }
                accessControlGrantsIndex ++;
            }
            prefix = accessControlGrantsPrefix;
        }
        if (_s3CopyObjectOperation.getMetadataDirective() != null) {
            prefix = _prefix + "MetadataDirective";
            String metadataDirective = _s3CopyObjectOperation.getMetadataDirective();
            request.addParameter(prefix, StringUtils.fromString(metadataDirective));
        }
        if (_s3CopyObjectOperation.getModifiedSinceConstraint() != null) {
            prefix = _prefix + "ModifiedSinceConstraint";
            java.util.Date modifiedSinceConstraint = _s3CopyObjectOperation.getModifiedSinceConstraint();
            request.addParameter(prefix, StringUtils.fromDate(modifiedSinceConstraint));
        }
        if (_s3CopyObjectOperation.getNewObjectMetadata() != null) {
            prefix = _prefix + "NewObjectMetadata";
            S3ObjectMetadata newObjectMetadata = _s3CopyObjectOperation.getNewObjectMetadata();
            S3ObjectMetadataStaxMarshaller.getInstance().marshall(newObjectMetadata, request, prefix + ".");
        }
        if (_s3CopyObjectOperation.getNewObjectTagging() != null) {
            prefix = _prefix + "NewObjectTagging";
            java.util.List<S3Tag> newObjectTagging = _s3CopyObjectOperation.getNewObjectTagging();
            int newObjectTaggingIndex = 1;
            String newObjectTaggingPrefix = prefix;
            for (S3Tag newObjectTaggingItem : newObjectTagging) {
                prefix = newObjectTaggingPrefix + ".member." + newObjectTaggingIndex;
                if (newObjectTaggingItem != null) {
            S3TagStaxMarshaller.getInstance().marshall(newObjectTaggingItem, request, prefix + ".");
                    }
                newObjectTaggingIndex ++;
            }
            prefix = newObjectTaggingPrefix;
        }
        if (_s3CopyObjectOperation.getRedirectLocation() != null) {
            prefix = _prefix + "RedirectLocation";
            String redirectLocation = _s3CopyObjectOperation.getRedirectLocation();
            request.addParameter(prefix, StringUtils.fromString(redirectLocation));
        }
        if (_s3CopyObjectOperation.getRequesterPays() != null) {
            prefix = _prefix + "RequesterPays";
            Boolean requesterPays = _s3CopyObjectOperation.getRequesterPays();
            request.addParameter(prefix, StringUtils.fromBoolean(requesterPays));
        }
        if (_s3CopyObjectOperation.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _s3CopyObjectOperation.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (_s3CopyObjectOperation.getUnModifiedSinceConstraint() != null) {
            prefix = _prefix + "UnModifiedSinceConstraint";
            java.util.Date unModifiedSinceConstraint = _s3CopyObjectOperation.getUnModifiedSinceConstraint();
            request.addParameter(prefix, StringUtils.fromDate(unModifiedSinceConstraint));
        }
        if (_s3CopyObjectOperation.getSSEAwsKmsKeyId() != null) {
            prefix = _prefix + "SSEAwsKmsKeyId";
            String sSEAwsKmsKeyId = _s3CopyObjectOperation.getSSEAwsKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSEAwsKmsKeyId));
        }
        if (_s3CopyObjectOperation.getTargetKeyPrefix() != null) {
            prefix = _prefix + "TargetKeyPrefix";
            String targetKeyPrefix = _s3CopyObjectOperation.getTargetKeyPrefix();
            request.addParameter(prefix, StringUtils.fromString(targetKeyPrefix));
        }
        if (_s3CopyObjectOperation.getObjectLockLegalHoldStatus() != null) {
            prefix = _prefix + "ObjectLockLegalHoldStatus";
            String objectLockLegalHoldStatus = _s3CopyObjectOperation.getObjectLockLegalHoldStatus();
            request.addParameter(prefix, StringUtils.fromString(objectLockLegalHoldStatus));
        }
        if (_s3CopyObjectOperation.getObjectLockMode() != null) {
            prefix = _prefix + "ObjectLockMode";
            String objectLockMode = _s3CopyObjectOperation.getObjectLockMode();
            request.addParameter(prefix, StringUtils.fromString(objectLockMode));
        }
        if (_s3CopyObjectOperation.getObjectLockRetainUntilDate() != null) {
            prefix = _prefix + "ObjectLockRetainUntilDate";
            java.util.Date objectLockRetainUntilDate = _s3CopyObjectOperation.getObjectLockRetainUntilDate();
            request.addParameter(prefix, StringUtils.fromDate(objectLockRetainUntilDate));
        }
    }

    private static S3CopyObjectOperationStaxMarshaller instance;
    public static S3CopyObjectOperationStaxMarshaller getInstance() {
        if (instance == null) instance = new S3CopyObjectOperationStaxMarshaller();
        return instance;
    }
}
