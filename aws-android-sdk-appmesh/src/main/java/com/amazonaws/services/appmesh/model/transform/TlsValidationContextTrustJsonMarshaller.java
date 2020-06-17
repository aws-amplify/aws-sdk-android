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
 * JSON marshaller for POJO TlsValidationContextTrust
 */
class TlsValidationContextTrustJsonMarshaller {

    public void marshall(TlsValidationContextTrust tlsValidationContextTrust,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tlsValidationContextTrust.getAcm() != null) {
            TlsValidationContextAcmTrust acm = tlsValidationContextTrust.getAcm();
            jsonWriter.name("acm");
            TlsValidationContextAcmTrustJsonMarshaller.getInstance().marshall(acm, jsonWriter);
        }
        if (tlsValidationContextTrust.getFile() != null) {
            TlsValidationContextFileTrust file = tlsValidationContextTrust.getFile();
            jsonWriter.name("file");
            TlsValidationContextFileTrustJsonMarshaller.getInstance().marshall(file, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TlsValidationContextTrustJsonMarshaller instance;

    public static TlsValidationContextTrustJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TlsValidationContextTrustJsonMarshaller();
        return instance;
    }
}
