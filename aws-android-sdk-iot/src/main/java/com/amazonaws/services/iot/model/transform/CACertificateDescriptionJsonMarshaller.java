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
 * JSON marshaller for POJO CACertificateDescription
 */
class CACertificateDescriptionJsonMarshaller {

    public void marshall(CACertificateDescription cACertificateDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cACertificateDescription.getCertificateArn() != null) {
            String certificateArn = cACertificateDescription.getCertificateArn();
            jsonWriter.name("certificateArn");
            jsonWriter.value(certificateArn);
        }
        if (cACertificateDescription.getCertificateId() != null) {
            String certificateId = cACertificateDescription.getCertificateId();
            jsonWriter.name("certificateId");
            jsonWriter.value(certificateId);
        }
        if (cACertificateDescription.getStatus() != null) {
            String status = cACertificateDescription.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (cACertificateDescription.getCertificatePem() != null) {
            String certificatePem = cACertificateDescription.getCertificatePem();
            jsonWriter.name("certificatePem");
            jsonWriter.value(certificatePem);
        }
        if (cACertificateDescription.getOwnedBy() != null) {
            String ownedBy = cACertificateDescription.getOwnedBy();
            jsonWriter.name("ownedBy");
            jsonWriter.value(ownedBy);
        }
        if (cACertificateDescription.getCreationDate() != null) {
            java.util.Date creationDate = cACertificateDescription.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (cACertificateDescription.getAutoRegistrationStatus() != null) {
            String autoRegistrationStatus = cACertificateDescription.getAutoRegistrationStatus();
            jsonWriter.name("autoRegistrationStatus");
            jsonWriter.value(autoRegistrationStatus);
        }
        if (cACertificateDescription.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = cACertificateDescription.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (cACertificateDescription.getCustomerVersion() != null) {
            Integer customerVersion = cACertificateDescription.getCustomerVersion();
            jsonWriter.name("customerVersion");
            jsonWriter.value(customerVersion);
        }
        if (cACertificateDescription.getGenerationId() != null) {
            String generationId = cACertificateDescription.getGenerationId();
            jsonWriter.name("generationId");
            jsonWriter.value(generationId);
        }
        if (cACertificateDescription.getValidity() != null) {
            CertificateValidity validity = cACertificateDescription.getValidity();
            jsonWriter.name("validity");
            CertificateValidityJsonMarshaller.getInstance().marshall(validity, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CACertificateDescriptionJsonMarshaller instance;

    public static CACertificateDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CACertificateDescriptionJsonMarshaller();
        return instance;
    }
}
