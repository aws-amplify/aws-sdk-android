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
 * JSON marshaller for POJO ListenerTlsCertificate
 */
class ListenerTlsCertificateJsonMarshaller {

    public void marshall(ListenerTlsCertificate listenerTlsCertificate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listenerTlsCertificate.getAcm() != null) {
            ListenerTlsAcmCertificate acm = listenerTlsCertificate.getAcm();
            jsonWriter.name("acm");
            ListenerTlsAcmCertificateJsonMarshaller.getInstance().marshall(acm, jsonWriter);
        }
        if (listenerTlsCertificate.getFile() != null) {
            ListenerTlsFileCertificate file = listenerTlsCertificate.getFile();
            jsonWriter.name("file");
            ListenerTlsFileCertificateJsonMarshaller.getInstance().marshall(file, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ListenerTlsCertificateJsonMarshaller instance;

    public static ListenerTlsCertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListenerTlsCertificateJsonMarshaller();
        return instance;
    }
}
