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
 * JSON marshaller for POJO ClientPolicyTls
 */
class ClientPolicyTlsJsonMarshaller {

    public void marshall(ClientPolicyTls clientPolicyTls, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clientPolicyTls.getEnforce() != null) {
            Boolean enforce = clientPolicyTls.getEnforce();
            jsonWriter.name("enforce");
            jsonWriter.value(enforce);
        }
        if (clientPolicyTls.getPorts() != null) {
            java.util.List<Integer> ports = clientPolicyTls.getPorts();
            jsonWriter.name("ports");
            jsonWriter.beginArray();
            for (Integer portsItem : ports) {
                if (portsItem != null) {
                    jsonWriter.value(portsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (clientPolicyTls.getValidation() != null) {
            TlsValidationContext validation = clientPolicyTls.getValidation();
            jsonWriter.name("validation");
            TlsValidationContextJsonMarshaller.getInstance().marshall(validation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClientPolicyTlsJsonMarshaller instance;

    public static ClientPolicyTlsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientPolicyTlsJsonMarshaller();
        return instance;
    }
}
