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
 * JSON marshaller for POJO OutgoingCertificate
 */
class OutgoingCertificateJsonMarshaller {

    public void marshall(OutgoingCertificate outgoingCertificate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outgoingCertificate.getCertificateArn() != null) {
            String certificateArn = outgoingCertificate.getCertificateArn();
            jsonWriter.name("certificateArn");
            jsonWriter.value(certificateArn);
        }
        if (outgoingCertificate.getCertificateId() != null) {
            String certificateId = outgoingCertificate.getCertificateId();
            jsonWriter.name("certificateId");
            jsonWriter.value(certificateId);
        }
        if (outgoingCertificate.getTransferredTo() != null) {
            String transferredTo = outgoingCertificate.getTransferredTo();
            jsonWriter.name("transferredTo");
            jsonWriter.value(transferredTo);
        }
        if (outgoingCertificate.getTransferDate() != null) {
            java.util.Date transferDate = outgoingCertificate.getTransferDate();
            jsonWriter.name("transferDate");
            jsonWriter.value(transferDate);
        }
        if (outgoingCertificate.getTransferMessage() != null) {
            String transferMessage = outgoingCertificate.getTransferMessage();
            jsonWriter.name("transferMessage");
            jsonWriter.value(transferMessage);
        }
        if (outgoingCertificate.getCreationDate() != null) {
            java.util.Date creationDate = outgoingCertificate.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static OutgoingCertificateJsonMarshaller instance;

    public static OutgoingCertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutgoingCertificateJsonMarshaller();
        return instance;
    }
}
