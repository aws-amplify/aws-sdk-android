/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO APNSSandboxChannelRequest
 */
class APNSSandboxChannelRequestJsonMarshaller {

    public void marshall(APNSSandboxChannelRequest aPNSSandboxChannelRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aPNSSandboxChannelRequest.getCertificate() != null) {
            String certificate = aPNSSandboxChannelRequest.getCertificate();
            jsonWriter.name("Certificate");
            jsonWriter.value(certificate);
        }
        if (aPNSSandboxChannelRequest.getEnabled() != null) {
            Boolean enabled = aPNSSandboxChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSSandboxChannelRequest.getPrivateKey() != null) {
            String privateKey = aPNSSandboxChannelRequest.getPrivateKey();
            jsonWriter.name("PrivateKey");
            jsonWriter.value(privateKey);
        }
        jsonWriter.endObject();
    }

    private static APNSSandboxChannelRequestJsonMarshaller instance;

    public static APNSSandboxChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSSandboxChannelRequestJsonMarshaller();
        return instance;
    }
}
