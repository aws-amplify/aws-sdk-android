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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SSHPublicKeyMetadata
 */
class SSHPublicKeyMetadataStaxMarshaller {

    public void marshall(SSHPublicKeyMetadata _sSHPublicKeyMetadata, Request<?> request,
            String _prefix) {
        String prefix;
        if (_sSHPublicKeyMetadata.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _sSHPublicKeyMetadata.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_sSHPublicKeyMetadata.getSSHPublicKeyId() != null) {
            prefix = _prefix + "SSHPublicKeyId";
            String sSHPublicKeyId = _sSHPublicKeyMetadata.getSSHPublicKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSHPublicKeyId));
        }
        if (_sSHPublicKeyMetadata.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _sSHPublicKeyMetadata.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_sSHPublicKeyMetadata.getUploadDate() != null) {
            prefix = _prefix + "UploadDate";
            java.util.Date uploadDate = _sSHPublicKeyMetadata.getUploadDate();
            request.addParameter(prefix, StringUtils.fromDate(uploadDate));
        }
    }

    private static SSHPublicKeyMetadataStaxMarshaller instance;

    public static SSHPublicKeyMetadataStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SSHPublicKeyMetadataStaxMarshaller();
        return instance;
    }
}
