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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ViewerCertificate
 */
class ViewerCertificateStaxMarshaller {

    public void marshall(ViewerCertificate _viewerCertificate, Request<?> request, String _prefix) {
        String prefix;
        if (_viewerCertificate.getCloudFrontDefaultCertificate() != null) {
            prefix = _prefix + "CloudFrontDefaultCertificate";
            Boolean cloudFrontDefaultCertificate = _viewerCertificate
                    .getCloudFrontDefaultCertificate();
            request.addParameter(prefix, StringUtils.fromBoolean(cloudFrontDefaultCertificate));
        }
        if (_viewerCertificate.getIAMCertificateId() != null) {
            prefix = _prefix + "IAMCertificateId";
            String iAMCertificateId = _viewerCertificate.getIAMCertificateId();
            request.addParameter(prefix, StringUtils.fromString(iAMCertificateId));
        }
        if (_viewerCertificate.getACMCertificateArn() != null) {
            prefix = _prefix + "ACMCertificateArn";
            String aCMCertificateArn = _viewerCertificate.getACMCertificateArn();
            request.addParameter(prefix, StringUtils.fromString(aCMCertificateArn));
        }
        if (_viewerCertificate.getSSLSupportMethod() != null) {
            prefix = _prefix + "SSLSupportMethod";
            String sSLSupportMethod = _viewerCertificate.getSSLSupportMethod();
            request.addParameter(prefix, StringUtils.fromString(sSLSupportMethod));
        }
        if (_viewerCertificate.getMinimumProtocolVersion() != null) {
            prefix = _prefix + "MinimumProtocolVersion";
            String minimumProtocolVersion = _viewerCertificate.getMinimumProtocolVersion();
            request.addParameter(prefix, StringUtils.fromString(minimumProtocolVersion));
        }
        if (_viewerCertificate.getCertificate() != null) {
            prefix = _prefix + "Certificate";
            String certificate = _viewerCertificate.getCertificate();
            request.addParameter(prefix, StringUtils.fromString(certificate));
        }
        if (_viewerCertificate.getCertificateSource() != null) {
            prefix = _prefix + "CertificateSource";
            String certificateSource = _viewerCertificate.getCertificateSource();
            request.addParameter(prefix, StringUtils.fromString(certificateSource));
        }
    }

    private static ViewerCertificateStaxMarshaller instance;

    public static ViewerCertificateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ViewerCertificateStaxMarshaller();
        return instance;
    }
}
