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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Certificate
 */
class CertificateJsonMarshaller {

    public void marshall(Certificate certificate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (certificate.getCertificateIdentifier() != null) {
            String certificateIdentifier = certificate.getCertificateIdentifier();
            jsonWriter.name("CertificateIdentifier");
            jsonWriter.value(certificateIdentifier);
        }
        if (certificate.getCertificateCreationDate() != null) {
            java.util.Date certificateCreationDate = certificate.getCertificateCreationDate();
            jsonWriter.name("CertificateCreationDate");
            jsonWriter.value(certificateCreationDate);
        }
        if (certificate.getCertificatePem() != null) {
            String certificatePem = certificate.getCertificatePem();
            jsonWriter.name("CertificatePem");
            jsonWriter.value(certificatePem);
        }
        if (certificate.getCertificateWallet() != null) {
            java.nio.ByteBuffer certificateWallet = certificate.getCertificateWallet();
            jsonWriter.name("CertificateWallet");
            jsonWriter.value(certificateWallet);
        }
        if (certificate.getCertificateArn() != null) {
            String certificateArn = certificate.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        if (certificate.getCertificateOwner() != null) {
            String certificateOwner = certificate.getCertificateOwner();
            jsonWriter.name("CertificateOwner");
            jsonWriter.value(certificateOwner);
        }
        if (certificate.getValidFromDate() != null) {
            java.util.Date validFromDate = certificate.getValidFromDate();
            jsonWriter.name("ValidFromDate");
            jsonWriter.value(validFromDate);
        }
        if (certificate.getValidToDate() != null) {
            java.util.Date validToDate = certificate.getValidToDate();
            jsonWriter.name("ValidToDate");
            jsonWriter.value(validToDate);
        }
        if (certificate.getSigningAlgorithm() != null) {
            String signingAlgorithm = certificate.getSigningAlgorithm();
            jsonWriter.name("SigningAlgorithm");
            jsonWriter.value(signingAlgorithm);
        }
        if (certificate.getKeyLength() != null) {
            Integer keyLength = certificate.getKeyLength();
            jsonWriter.name("KeyLength");
            jsonWriter.value(keyLength);
        }
        jsonWriter.endObject();
    }

    private static CertificateJsonMarshaller instance;

    public static CertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateJsonMarshaller();
        return instance;
    }
}
