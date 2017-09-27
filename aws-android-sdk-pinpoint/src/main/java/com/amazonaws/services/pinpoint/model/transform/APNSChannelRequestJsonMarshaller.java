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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO APNSChannelRequest
 */
class APNSChannelRequestJsonMarshaller {

    public void marshall(APNSChannelRequest aPNSChannelRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aPNSChannelRequest.getCertificate() != null) {
            String certificate = aPNSChannelRequest.getCertificate();
            jsonWriter.name("Certificate");
            jsonWriter.value(certificate);
        }
        if (aPNSChannelRequest.getEnabled() != null) {
            Boolean enabled = aPNSChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSChannelRequest.getPrivateKey() != null) {
            String privateKey = aPNSChannelRequest.getPrivateKey();
            jsonWriter.name("PrivateKey");
            jsonWriter.value(privateKey);
        }
        jsonWriter.endObject();
    }

    private static APNSChannelRequestJsonMarshaller instance;

    public static APNSChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSChannelRequestJsonMarshaller();
        return instance;
    }
}
