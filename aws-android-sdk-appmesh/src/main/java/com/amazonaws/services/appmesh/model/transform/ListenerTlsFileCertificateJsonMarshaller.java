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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListenerTlsFileCertificate
 */
class ListenerTlsFileCertificateJsonMarshaller {

    public void marshall(ListenerTlsFileCertificate listenerTlsFileCertificate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listenerTlsFileCertificate.getCertificateChain() != null) {
            String certificateChain = listenerTlsFileCertificate.getCertificateChain();
            jsonWriter.name("certificateChain");
            jsonWriter.value(certificateChain);
        }
        if (listenerTlsFileCertificate.getPrivateKey() != null) {
            String privateKey = listenerTlsFileCertificate.getPrivateKey();
            jsonWriter.name("privateKey");
            jsonWriter.value(privateKey);
        }
        jsonWriter.endObject();
    }

    private static ListenerTlsFileCertificateJsonMarshaller instance;

    public static ListenerTlsFileCertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListenerTlsFileCertificateJsonMarshaller();
        return instance;
    }
}
