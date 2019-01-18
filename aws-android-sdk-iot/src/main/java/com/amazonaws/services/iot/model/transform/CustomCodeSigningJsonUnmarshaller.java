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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CustomCodeSigning
 */
class CustomCodeSigningJsonUnmarshaller implements
        Unmarshaller<CustomCodeSigning, JsonUnmarshallerContext> {

    public CustomCodeSigning unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CustomCodeSigning customCodeSigning = new CustomCodeSigning();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("signature")) {
                customCodeSigning.setSignature(CodeSigningSignatureJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateChain")) {
                customCodeSigning.setCertificateChain(CodeSigningCertificateChainJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("hashAlgorithm")) {
                customCodeSigning.setHashAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("signatureAlgorithm")) {
                customCodeSigning.setSignatureAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return customCodeSigning;
    }

    private static CustomCodeSigningJsonUnmarshaller instance;

    public static CustomCodeSigningJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomCodeSigningJsonUnmarshaller();
        return instance;
    }
}
