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
 * StAX marshaller for POJO SSHPublicKey
 */
class SSHPublicKeyStaxMarshaller {

    public void marshall(SSHPublicKey _sSHPublicKey, Request<?> request, String _prefix) {
        String prefix;
        if (_sSHPublicKey.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _sSHPublicKey.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_sSHPublicKey.getSSHPublicKeyId() != null) {
            prefix = _prefix + "SSHPublicKeyId";
            String sSHPublicKeyId = _sSHPublicKey.getSSHPublicKeyId();
            request.addParameter(prefix, StringUtils.fromString(sSHPublicKeyId));
        }
        if (_sSHPublicKey.getFingerprint() != null) {
            prefix = _prefix + "Fingerprint";
            String fingerprint = _sSHPublicKey.getFingerprint();
            request.addParameter(prefix, StringUtils.fromString(fingerprint));
        }
        if (_sSHPublicKey.getSSHPublicKeyBody() != null) {
            prefix = _prefix + "SSHPublicKeyBody";
            String sSHPublicKeyBody = _sSHPublicKey.getSSHPublicKeyBody();
            request.addParameter(prefix, StringUtils.fromString(sSHPublicKeyBody));
        }
        if (_sSHPublicKey.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _sSHPublicKey.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_sSHPublicKey.getUploadDate() != null) {
            prefix = _prefix + "UploadDate";
            java.util.Date uploadDate = _sSHPublicKey.getUploadDate();
            request.addParameter(prefix, StringUtils.fromDate(uploadDate));
        }
    }

    private static SSHPublicKeyStaxMarshaller instance;

    public static SSHPublicKeyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SSHPublicKeyStaxMarshaller();
        return instance;
    }
}
