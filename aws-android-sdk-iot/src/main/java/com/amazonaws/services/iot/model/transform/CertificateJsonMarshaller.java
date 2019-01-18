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
 * JSON marshaller for POJO Certificate
 */
class CertificateJsonMarshaller {

    public void marshall(Certificate certificate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (certificate.getCertificateArn() != null) {
            String certificateArn = certificate.getCertificateArn();
            jsonWriter.name("certificateArn");
            jsonWriter.value(certificateArn);
        }
        if (certificate.getCertificateId() != null) {
            String certificateId = certificate.getCertificateId();
            jsonWriter.name("certificateId");
            jsonWriter.value(certificateId);
        }
        if (certificate.getStatus() != null) {
            String status = certificate.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (certificate.getCreationDate() != null) {
            java.util.Date creationDate = certificate.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
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
