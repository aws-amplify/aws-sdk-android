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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkProfileData
 */
class NetworkProfileDataJsonMarshaller {

    public void marshall(NetworkProfileData networkProfileData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkProfileData.getNetworkProfileArn() != null) {
            String networkProfileArn = networkProfileData.getNetworkProfileArn();
            jsonWriter.name("NetworkProfileArn");
            jsonWriter.value(networkProfileArn);
        }
        if (networkProfileData.getNetworkProfileName() != null) {
            String networkProfileName = networkProfileData.getNetworkProfileName();
            jsonWriter.name("NetworkProfileName");
            jsonWriter.value(networkProfileName);
        }
        if (networkProfileData.getDescription() != null) {
            String description = networkProfileData.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (networkProfileData.getSsid() != null) {
            String ssid = networkProfileData.getSsid();
            jsonWriter.name("Ssid");
            jsonWriter.value(ssid);
        }
        if (networkProfileData.getSecurityType() != null) {
            String securityType = networkProfileData.getSecurityType();
            jsonWriter.name("SecurityType");
            jsonWriter.value(securityType);
        }
        if (networkProfileData.getEapMethod() != null) {
            String eapMethod = networkProfileData.getEapMethod();
            jsonWriter.name("EapMethod");
            jsonWriter.value(eapMethod);
        }
        if (networkProfileData.getCertificateAuthorityArn() != null) {
            String certificateAuthorityArn = networkProfileData.getCertificateAuthorityArn();
            jsonWriter.name("CertificateAuthorityArn");
            jsonWriter.value(certificateAuthorityArn);
        }
        jsonWriter.endObject();
    }

    private static NetworkProfileDataJsonMarshaller instance;

    public static NetworkProfileDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkProfileDataJsonMarshaller();
        return instance;
    }
}
