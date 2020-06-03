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
 * StAX marshaller for POJO SigningCertificate
 */
class SigningCertificateStaxMarshaller {

    public void marshall(SigningCertificate _signingCertificate, Request<?> request, String _prefix) {
        String prefix;
        if (_signingCertificate.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _signingCertificate.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_signingCertificate.getCertificateId() != null) {
            prefix = _prefix + "CertificateId";
            String certificateId = _signingCertificate.getCertificateId();
            request.addParameter(prefix, StringUtils.fromString(certificateId));
        }
        if (_signingCertificate.getCertificateBody() != null) {
            prefix = _prefix + "CertificateBody";
            String certificateBody = _signingCertificate.getCertificateBody();
            request.addParameter(prefix, StringUtils.fromString(certificateBody));
        }
        if (_signingCertificate.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _signingCertificate.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_signingCertificate.getUploadDate() != null) {
            prefix = _prefix + "UploadDate";
            java.util.Date uploadDate = _signingCertificate.getUploadDate();
            request.addParameter(prefix, StringUtils.fromDate(uploadDate));
        }
    }

    private static SigningCertificateStaxMarshaller instance;

    public static SigningCertificateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SigningCertificateStaxMarshaller();
        return instance;
    }
}
