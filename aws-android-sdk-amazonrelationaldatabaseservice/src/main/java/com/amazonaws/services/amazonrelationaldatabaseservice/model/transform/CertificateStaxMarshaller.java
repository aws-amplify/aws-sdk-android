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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Certificate
 */
class CertificateStaxMarshaller {

    public void marshall(Certificate _certificate, Request<?> request, String _prefix) {
        String prefix;
        if (_certificate.getCertificateIdentifier() != null) {
            prefix = _prefix + "CertificateIdentifier";
            String certificateIdentifier = _certificate.getCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(certificateIdentifier));
        }
        if (_certificate.getCertificateType() != null) {
            prefix = _prefix + "CertificateType";
            String certificateType = _certificate.getCertificateType();
            request.addParameter(prefix, StringUtils.fromString(certificateType));
        }
        if (_certificate.getThumbprint() != null) {
            prefix = _prefix + "Thumbprint";
            String thumbprint = _certificate.getThumbprint();
            request.addParameter(prefix, StringUtils.fromString(thumbprint));
        }
        if (_certificate.getValidFrom() != null) {
            prefix = _prefix + "ValidFrom";
            java.util.Date validFrom = _certificate.getValidFrom();
            request.addParameter(prefix, StringUtils.fromDate(validFrom));
        }
        if (_certificate.getValidTill() != null) {
            prefix = _prefix + "ValidTill";
            java.util.Date validTill = _certificate.getValidTill();
            request.addParameter(prefix, StringUtils.fromDate(validTill));
        }
        if (_certificate.getCertificateArn() != null) {
            prefix = _prefix + "CertificateArn";
            String certificateArn = _certificate.getCertificateArn();
            request.addParameter(prefix, StringUtils.fromString(certificateArn));
        }
        if (_certificate.getCustomerOverride() != null) {
            prefix = _prefix + "CustomerOverride";
            Boolean customerOverride = _certificate.getCustomerOverride();
            request.addParameter(prefix, StringUtils.fromBoolean(customerOverride));
        }
        if (_certificate.getCustomerOverrideValidTill() != null) {
            prefix = _prefix + "CustomerOverrideValidTill";
            java.util.Date customerOverrideValidTill = _certificate.getCustomerOverrideValidTill();
            request.addParameter(prefix, StringUtils.fromDate(customerOverrideValidTill));
        }
    }

    private static CertificateStaxMarshaller instance;

    public static CertificateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateStaxMarshaller();
        return instance;
    }
}
