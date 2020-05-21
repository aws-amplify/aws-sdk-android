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
 * StAX marshaller for POJO Object
 */
class ObjectStaxMarshaller {

    public void marshall(Object _objectValue, Request<?> request, String _prefix) {
        String prefix;
        if (_objectValue.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _objectValue.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_objectValue.getLastModified() != null) {
            prefix = _prefix + "LastModified";
            java.util.Date lastModified = _objectValue.getLastModified();
            request.addParameter(prefix, StringUtils.fromDate(lastModified));
        }
        if (_objectValue.getETag() != null) {
            prefix = _prefix + "ETag";
            String eTag = _objectValue.getETag();
            request.addParameter(prefix, StringUtils.fromString(eTag));
        }
        if (_objectValue.getSize() != null) {
            prefix = _prefix + "Size";
            Integer size = _objectValue.getSize();
            request.addParameter(prefix, StringUtils.fromInteger(size));
        }
        if (_objectValue.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _objectValue.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (_objectValue.getOwner() != null) {
            prefix = _prefix + "Owner";
            Owner owner = _objectValue.getOwner();
            OwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
    }

    private static ObjectStaxMarshaller instance;

    public static ObjectStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ObjectStaxMarshaller();
        return instance;
    }
}
