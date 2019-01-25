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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO APNSVoipChannelRequest
 */
class APNSVoipChannelRequestJsonMarshaller {

    public void marshall(APNSVoipChannelRequest aPNSVoipChannelRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aPNSVoipChannelRequest.getBundleId() != null) {
            String bundleId = aPNSVoipChannelRequest.getBundleId();
            jsonWriter.name("BundleId");
            jsonWriter.value(bundleId);
        }
        if (aPNSVoipChannelRequest.getCertificate() != null) {
            String certificate = aPNSVoipChannelRequest.getCertificate();
            jsonWriter.name("Certificate");
            jsonWriter.value(certificate);
        }
        if (aPNSVoipChannelRequest.getDefaultAuthenticationMethod() != null) {
            String defaultAuthenticationMethod = aPNSVoipChannelRequest
                    .getDefaultAuthenticationMethod();
            jsonWriter.name("DefaultAuthenticationMethod");
            jsonWriter.value(defaultAuthenticationMethod);
        }
        if (aPNSVoipChannelRequest.getEnabled() != null) {
            Boolean enabled = aPNSVoipChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSVoipChannelRequest.getPrivateKey() != null) {
            String privateKey = aPNSVoipChannelRequest.getPrivateKey();
            jsonWriter.name("PrivateKey");
            jsonWriter.value(privateKey);
        }
        if (aPNSVoipChannelRequest.getTeamId() != null) {
            String teamId = aPNSVoipChannelRequest.getTeamId();
            jsonWriter.name("TeamId");
            jsonWriter.value(teamId);
        }
        if (aPNSVoipChannelRequest.getTokenKey() != null) {
            String tokenKey = aPNSVoipChannelRequest.getTokenKey();
            jsonWriter.name("TokenKey");
            jsonWriter.value(tokenKey);
        }
        if (aPNSVoipChannelRequest.getTokenKeyId() != null) {
            String tokenKeyId = aPNSVoipChannelRequest.getTokenKeyId();
            jsonWriter.name("TokenKeyId");
            jsonWriter.value(tokenKeyId);
        }
        jsonWriter.endObject();
    }

    private static APNSVoipChannelRequestJsonMarshaller instance;

    public static APNSVoipChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipChannelRequestJsonMarshaller();
        return instance;
    }
}
