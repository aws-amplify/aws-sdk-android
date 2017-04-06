/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO KeyPair
 */
class KeyPairJsonMarshaller {

    public void marshall(KeyPair keyPair, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyPair.getPublicKey() != null) {
            String publicKey = keyPair.getPublicKey();
            jsonWriter.name("PublicKey");
            jsonWriter.value(publicKey);
        }
        if (keyPair.getPrivateKey() != null) {
            String privateKey = keyPair.getPrivateKey();
            jsonWriter.name("PrivateKey");
            jsonWriter.value(privateKey);
        }
        jsonWriter.endObject();
    }

    private static KeyPairJsonMarshaller instance;

    public static KeyPairJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyPairJsonMarshaller();
        return instance;
    }
}
