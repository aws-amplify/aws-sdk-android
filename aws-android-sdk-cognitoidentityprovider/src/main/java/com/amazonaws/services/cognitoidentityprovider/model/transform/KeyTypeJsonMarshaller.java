/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeyType
 */
class KeyTypeJsonMarshaller {

    public void marshall(KeyType keyType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyType.getKty() != null) {
            String kty = keyType.getKty();
            jsonWriter.name("kty");
            jsonWriter.value(kty);
        }
        if (keyType.getAlg() != null) {
            String alg = keyType.getAlg();
            jsonWriter.name("alg");
            jsonWriter.value(alg);
        }
        if (keyType.getUse() != null) {
            String use = keyType.getUse();
            jsonWriter.name("use");
            jsonWriter.value(use);
        }
        if (keyType.getKid() != null) {
            String kid = keyType.getKid();
            jsonWriter.name("kid");
            jsonWriter.value(kid);
        }
        if (keyType.getN() != null) {
            String n = keyType.getN();
            jsonWriter.name("n");
            jsonWriter.value(n);
        }
        if (keyType.getE() != null) {
            String e = keyType.getE();
            jsonWriter.name("e");
            jsonWriter.value(e);
        }
        jsonWriter.endObject();
    }

    private static KeyTypeJsonMarshaller instance;

    public static KeyTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyTypeJsonMarshaller();
        return instance;
    }
}
