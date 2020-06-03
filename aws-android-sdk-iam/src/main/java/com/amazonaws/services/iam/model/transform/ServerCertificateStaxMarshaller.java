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
 * StAX marshaller for POJO ServerCertificate
 */
class ServerCertificateStaxMarshaller {

    public void marshall(ServerCertificate _serverCertificate, Request<?> request, String _prefix) {
        String prefix;
        if (_serverCertificate.getServerCertificateMetadata() != null) {
            prefix = _prefix + "ServerCertificateMetadata";
            ServerCertificateMetadata serverCertificateMetadata = _serverCertificate
                    .getServerCertificateMetadata();
            ServerCertificateMetadataStaxMarshaller.getInstance().marshall(
                    serverCertificateMetadata, request, prefix + ".");
        }
        if (_serverCertificate.getCertificateBody() != null) {
            prefix = _prefix + "CertificateBody";
            String certificateBody = _serverCertificate.getCertificateBody();
            request.addParameter(prefix, StringUtils.fromString(certificateBody));
        }
        if (_serverCertificate.getCertificateChain() != null) {
            prefix = _prefix + "CertificateChain";
            String certificateChain = _serverCertificate.getCertificateChain();
            request.addParameter(prefix, StringUtils.fromString(certificateChain));
        }
    }

    private static ServerCertificateStaxMarshaller instance;

    public static ServerCertificateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServerCertificateStaxMarshaller();
        return instance;
    }
}
