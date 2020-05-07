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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClientCertificateRevocationListStatus
 */
class ClientCertificateRevocationListStatusJsonMarshaller {

    public void marshall(
            ClientCertificateRevocationListStatus clientCertificateRevocationListStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clientCertificateRevocationListStatus.getCode() != null) {
            String code = clientCertificateRevocationListStatus.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (clientCertificateRevocationListStatus.getMessage() != null) {
            String message = clientCertificateRevocationListStatus.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static ClientCertificateRevocationListStatusJsonMarshaller instance;

    public static ClientCertificateRevocationListStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientCertificateRevocationListStatusJsonMarshaller();
        return instance;
    }
}
