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
 * JSON marshaller for POJO CustomCodeSigning
 */
class CustomCodeSigningJsonMarshaller {

    public void marshall(CustomCodeSigning customCodeSigning, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customCodeSigning.getSignature() != null) {
            CodeSigningSignature signature = customCodeSigning.getSignature();
            jsonWriter.name("signature");
            CodeSigningSignatureJsonMarshaller.getInstance().marshall(signature, jsonWriter);
        }
        if (customCodeSigning.getCertificateChain() != null) {
            CodeSigningCertificateChain certificateChain = customCodeSigning.getCertificateChain();
            jsonWriter.name("certificateChain");
            CodeSigningCertificateChainJsonMarshaller.getInstance().marshall(certificateChain,
                    jsonWriter);
        }
        if (customCodeSigning.getHashAlgorithm() != null) {
            String hashAlgorithm = customCodeSigning.getHashAlgorithm();
            jsonWriter.name("hashAlgorithm");
            jsonWriter.value(hashAlgorithm);
        }
        if (customCodeSigning.getSignatureAlgorithm() != null) {
            String signatureAlgorithm = customCodeSigning.getSignatureAlgorithm();
            jsonWriter.name("signatureAlgorithm");
            jsonWriter.value(signatureAlgorithm);
        }
        jsonWriter.endObject();
    }

    private static CustomCodeSigningJsonMarshaller instance;

    public static CustomCodeSigningJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomCodeSigningJsonMarshaller();
        return instance;
    }
}
