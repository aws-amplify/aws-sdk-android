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
 * StAX marshaller for POJO ObjectVersion
 */
class ObjectVersionStaxMarshaller {

    public void marshall(ObjectVersion _objectVersion, Request<?> request, String _prefix) {
        String prefix;
        if (_objectVersion.getETag() != null) {
            prefix = _prefix + "ETag";
            String eTag = _objectVersion.getETag();
            request.addParameter(prefix, StringUtils.fromString(eTag));
        }
        if (_objectVersion.getSize() != null) {
            prefix = _prefix + "Size";
            Integer size = _objectVersion.getSize();
            request.addParameter(prefix, StringUtils.fromInteger(size));
        }
        if (_objectVersion.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _objectVersion.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (_objectVersion.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _objectVersion.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_objectVersion.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _objectVersion.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (_objectVersion.getIsLatest() != null) {
            prefix = _prefix + "IsLatest";
            Boolean isLatest = _objectVersion.getIsLatest();
            request.addParameter(prefix, StringUtils.fromBoolean(isLatest));
        }
        if (_objectVersion.getLastModified() != null) {
            prefix = _prefix + "LastModified";
            java.util.Date lastModified = _objectVersion.getLastModified();
            request.addParameter(prefix, StringUtils.fromDate(lastModified));
        }
        if (_objectVersion.getOwner() != null) {
            prefix = _prefix + "Owner";
            Owner owner = _objectVersion.getOwner();
            OwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
    }

    private static ObjectVersionStaxMarshaller instance;

    public static ObjectVersionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ObjectVersionStaxMarshaller();
        return instance;
    }
}
