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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateSigningCertificateRequest
 */
public class UpdateSigningCertificateRequestMarshaller implements
        Marshaller<Request<UpdateSigningCertificateRequest>, UpdateSigningCertificateRequest> {

    public Request<UpdateSigningCertificateRequest> marshall(
            UpdateSigningCertificateRequest updateSigningCertificateRequest) {
        if (updateSigningCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateSigningCertificateRequest)");
        }

        Request<UpdateSigningCertificateRequest> request = new DefaultRequest<UpdateSigningCertificateRequest>(
                updateSigningCertificateRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UpdateSigningCertificate");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (updateSigningCertificateRequest.getUserName() != null) {
            prefix = "UserName";
            String userName = updateSigningCertificateRequest.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (updateSigningCertificateRequest.getCertificateId() != null) {
            prefix = "CertificateId";
            String certificateId = updateSigningCertificateRequest.getCertificateId();
            request.addParameter(prefix, StringUtils.fromString(certificateId));
        }
        if (updateSigningCertificateRequest.getStatus() != null) {
            prefix = "Status";
            String status = updateSigningCertificateRequest.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }

        return request;
    }
}
