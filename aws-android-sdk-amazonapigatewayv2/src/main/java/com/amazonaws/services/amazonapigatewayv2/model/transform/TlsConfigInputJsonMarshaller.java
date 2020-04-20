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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TlsConfigInput
 */
class TlsConfigInputJsonMarshaller {

    public void marshall(TlsConfigInput tlsConfigInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tlsConfigInput.getServerNameToVerify() != null) {
            String serverNameToVerify = tlsConfigInput.getServerNameToVerify();
            jsonWriter.name("ServerNameToVerify");
            jsonWriter.value(serverNameToVerify);
        }
        jsonWriter.endObject();
    }

    private static TlsConfigInputJsonMarshaller instance;

    public static TlsConfigInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TlsConfigInputJsonMarshaller();
        return instance;
    }
}
