/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CertificateDescription
 */
class CertificateDescriptionJsonMarshaller {

    public void marshall(CertificateDescription certificateDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (certificateDescription.getCertificateArn() != null) {
            String certificateArn = certificateDescription.getCertificateArn();
            jsonWriter.name("certificateArn");
            jsonWriter.value(certificateArn);
        }
        if (certificateDescription.getCertificateId() != null) {
            String certificateId = certificateDescription.getCertificateId();
            jsonWriter.name("certificateId");
            jsonWriter.value(certificateId);
        }
        if (certificateDescription.getCaCertificateId() != null) {
            String caCertificateId = certificateDescription.getCaCertificateId();
            jsonWriter.name("caCertificateId");
            jsonWriter.value(caCertificateId);
        }
        if (certificateDescription.getStatus() != null) {
            String status = certificateDescription.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (certificateDescription.getCertificatePem() != null) {
            String certificatePem = certificateDescription.getCertificatePem();
            jsonWriter.name("certificatePem");
            jsonWriter.value(certificatePem);
        }
        if (certificateDescription.getOwnedBy() != null) {
            String ownedBy = certificateDescription.getOwnedBy();
            jsonWriter.name("ownedBy");
            jsonWriter.value(ownedBy);
        }
        if (certificateDescription.getPreviousOwnedBy() != null) {
            String previousOwnedBy = certificateDescription.getPreviousOwnedBy();
            jsonWriter.name("previousOwnedBy");
            jsonWriter.value(previousOwnedBy);
        }
        if (certificateDescription.getCreationDate() != null) {
            java.util.Date creationDate = certificateDescription.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (certificateDescription.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = certificateDescription.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (certificateDescription.getCustomerVersion() != null) {
            Integer customerVersion = certificateDescription.getCustomerVersion();
            jsonWriter.name("customerVersion");
            jsonWriter.value(customerVersion);
        }
        if (certificateDescription.getTransferData() != null) {
            TransferData transferData = certificateDescription.getTransferData();
            jsonWriter.name("transferData");
            TransferDataJsonMarshaller.getInstance().marshall(transferData, jsonWriter);
        }
        if (certificateDescription.getGenerationId() != null) {
            String generationId = certificateDescription.getGenerationId();
            jsonWriter.name("generationId");
            jsonWriter.value(generationId);
        }
        if (certificateDescription.getValidity() != null) {
            CertificateValidity validity = certificateDescription.getValidity();
            jsonWriter.name("validity");
            CertificateValidityJsonMarshaller.getInstance().marshall(validity, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CertificateDescriptionJsonMarshaller instance;

    public static CertificateDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDescriptionJsonMarshaller();
        return instance;
    }
}
