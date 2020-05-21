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
 * StAX marshaller for POJO MultipartUpload
 */
class MultipartUploadStaxMarshaller {

    public void marshall(MultipartUpload _multipartUpload, Request<?> request, String _prefix) {
        String prefix;
        if (_multipartUpload.getUploadId() != null) {
            prefix = _prefix + "UploadId";
            String uploadId = _multipartUpload.getUploadId();
            request.addParameter(prefix, StringUtils.fromString(uploadId));
        }
        if (_multipartUpload.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _multipartUpload.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_multipartUpload.getInitiated() != null) {
            prefix = _prefix + "Initiated";
            java.util.Date initiated = _multipartUpload.getInitiated();
            request.addParameter(prefix, StringUtils.fromDate(initiated));
        }
        if (_multipartUpload.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _multipartUpload.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
        if (_multipartUpload.getOwner() != null) {
            prefix = _prefix + "Owner";
            Owner owner = _multipartUpload.getOwner();
            OwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
        if (_multipartUpload.getInitiator() != null) {
            prefix = _prefix + "Initiator";
            Initiator initiator = _multipartUpload.getInitiator();
            InitiatorStaxMarshaller.getInstance().marshall(initiator, request, prefix + ".");
        }
    }

    private static MultipartUploadStaxMarshaller instance;

    public static MultipartUploadStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MultipartUploadStaxMarshaller();
        return instance;
    }
}
