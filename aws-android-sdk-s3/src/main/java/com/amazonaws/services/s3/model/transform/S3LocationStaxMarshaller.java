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

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3Location
 */
class S3LocationStaxMarshaller {

    public void marshall(S3Location _s3Location, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Location.getBucketName() != null) {
            prefix = _prefix + "BucketName";
            String bucketName = _s3Location.getBucketName();
            request.addParameter(prefix, StringUtils.fromString(bucketName));
        }
        if (_s3Location.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _s3Location.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_s3Location.getEncryption() != null) {
            prefix = _prefix + "Encryption";
            Encryption encryption = _s3Location.getEncryption();
            EncryptionStaxMarshaller.getInstance().marshall(encryption, request, prefix + ".");
        }
        if (_s3Location.getCannedACL() != null) {
            prefix = _prefix + "CannedACL";
            String cannedACL = _s3Location.getCannedACL();
            request.addParameter(prefix, StringUtils.fromString(cannedACL));
        }
        if (_s3Location.getAccessControlList() != null) {
            prefix = _prefix + "AccessControlList";
            java.util.List<Grant> accessControlList = _s3Location.getAccessControlList();
            int accessControlListIndex = 1;
            String accessControlListPrefix = prefix;
            for (Grant accessControlListItem : accessControlList) {
                prefix = accessControlListPrefix + "." + accessControlListIndex;
                if (accessControlListItem != null) {
                    GrantStaxMarshaller.getInstance().marshall(accessControlListItem, request,
                            prefix + ".");
                }
                accessControlListIndex++;
            }
            prefix = accessControlListPrefix;
        }
        if (_s3Location.getTagging() != null) {
            prefix = _prefix + "Tagging";
            Tagging tagging = _s3Location.getTagging();
            TaggingStaxMarshaller.getInstance().marshall(tagging, request, prefix + ".");
        }
        if (_s3Location.getUserMetadata() != null) {
            prefix = _prefix + "UserMetadata";
            java.util.List<MetadataEntry> userMetadata = _s3Location.getUserMetadata();
            int userMetadataIndex = 1;
            String userMetadataPrefix = prefix;
            for (MetadataEntry userMetadataItem : userMetadata) {
                prefix = userMetadataPrefix + "." + userMetadataIndex;
                if (userMetadataItem != null) {
                    MetadataEntryStaxMarshaller.getInstance().marshall(userMetadataItem, request,
                            prefix + ".");
                }
                userMetadataIndex++;
            }
            prefix = userMetadataPrefix;
        }
        if (_s3Location.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _s3Location.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
    }

    private static S3LocationStaxMarshaller instance;

    public static S3LocationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new S3LocationStaxMarshaller();
        return instance;
    }
}
