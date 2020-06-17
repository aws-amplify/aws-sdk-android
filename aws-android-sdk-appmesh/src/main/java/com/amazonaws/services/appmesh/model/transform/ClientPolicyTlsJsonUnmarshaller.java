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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ClientPolicyTls
 */
class ClientPolicyTlsJsonUnmarshaller implements
        Unmarshaller<ClientPolicyTls, JsonUnmarshallerContext> {

    public ClientPolicyTls unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClientPolicyTls clientPolicyTls = new ClientPolicyTls();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("enforce")) {
                clientPolicyTls.setEnforce(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ports")) {
                clientPolicyTls.setPorts(new ListUnmarshaller<Integer>(IntegerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("validation")) {
                clientPolicyTls.setValidation(TlsValidationContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return clientPolicyTls;
    }

    private static ClientPolicyTlsJsonUnmarshaller instance;

    public static ClientPolicyTlsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClientPolicyTlsJsonUnmarshaller();
        return instance;
    }
}
