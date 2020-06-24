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
 * StAX marshaller for POJO ServerCertificateMetadata
 */
class ServerCertificateMetadataStaxMarshaller {

    public void marshall(ServerCertificateMetadata _serverCertificateMetadata, Request<?> request,
            String _prefix) {
        String prefix;
        if (_serverCertificateMetadata.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _serverCertificateMetadata.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_serverCertificateMetadata.getServerCertificateName() != null) {
            prefix = _prefix + "ServerCertificateName";
            String serverCertificateName = _serverCertificateMetadata.getServerCertificateName();
            request.addParameter(prefix, StringUtils.fromString(serverCertificateName));
        }
        if (_serverCertificateMetadata.getServerCertificateId() != null) {
            prefix = _prefix + "ServerCertificateId";
            String serverCertificateId = _serverCertificateMetadata.getServerCertificateId();
            request.addParameter(prefix, StringUtils.fromString(serverCertificateId));
        }
        if (_serverCertificateMetadata.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _serverCertificateMetadata.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_serverCertificateMetadata.getUploadDate() != null) {
            prefix = _prefix + "UploadDate";
            java.util.Date uploadDate = _serverCertificateMetadata.getUploadDate();
            request.addParameter(prefix, StringUtils.fromDate(uploadDate));
        }
        if (_serverCertificateMetadata.getExpiration() != null) {
            prefix = _prefix + "Expiration";
            java.util.Date expiration = _serverCertificateMetadata.getExpiration();
            request.addParameter(prefix, StringUtils.fromDate(expiration));
        }
    }

    private static ServerCertificateMetadataStaxMarshaller instance;

    public static ServerCertificateMetadataStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServerCertificateMetadataStaxMarshaller();
        return instance;
    }
}
