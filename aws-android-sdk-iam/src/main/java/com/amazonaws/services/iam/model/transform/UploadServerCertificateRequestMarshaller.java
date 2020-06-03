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
 * StAX request marshaller for UploadServerCertificateRequest
 */
public class UploadServerCertificateRequestMarshaller implements
        Marshaller<Request<UploadServerCertificateRequest>, UploadServerCertificateRequest> {

    public Request<UploadServerCertificateRequest> marshall(
            UploadServerCertificateRequest uploadServerCertificateRequest) {
        if (uploadServerCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UploadServerCertificateRequest)");
        }

        Request<UploadServerCertificateRequest> request = new DefaultRequest<UploadServerCertificateRequest>(
                uploadServerCertificateRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UploadServerCertificate");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (uploadServerCertificateRequest.getPath() != null) {
            prefix = "Path";
            String path = uploadServerCertificateRequest.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (uploadServerCertificateRequest.getServerCertificateName() != null) {
            prefix = "ServerCertificateName";
            String serverCertificateName = uploadServerCertificateRequest
                    .getServerCertificateName();
            request.addParameter(prefix, StringUtils.fromString(serverCertificateName));
        }
        if (uploadServerCertificateRequest.getCertificateBody() != null) {
            prefix = "CertificateBody";
            String certificateBody = uploadServerCertificateRequest.getCertificateBody();
            request.addParameter(prefix, StringUtils.fromString(certificateBody));
        }
        if (uploadServerCertificateRequest.getPrivateKey() != null) {
            prefix = "PrivateKey";
            String privateKey = uploadServerCertificateRequest.getPrivateKey();
            request.addParameter(prefix, StringUtils.fromString(privateKey));
        }
        if (uploadServerCertificateRequest.getCertificateChain() != null) {
            prefix = "CertificateChain";
            String certificateChain = uploadServerCertificateRequest.getCertificateChain();
            request.addParameter(prefix, StringUtils.fromString(certificateChain));
        }

        return request;
    }
}
