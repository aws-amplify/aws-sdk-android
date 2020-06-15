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
 * JSON marshaller for POJO NetworkProfile
 */
class NetworkProfileJsonMarshaller {

    public void marshall(NetworkProfile networkProfile, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkProfile.getNetworkProfileArn() != null) {
            String networkProfileArn = networkProfile.getNetworkProfileArn();
            jsonWriter.name("NetworkProfileArn");
            jsonWriter.value(networkProfileArn);
        }
        if (networkProfile.getNetworkProfileName() != null) {
            String networkProfileName = networkProfile.getNetworkProfileName();
            jsonWriter.name("NetworkProfileName");
            jsonWriter.value(networkProfileName);
        }
        if (networkProfile.getDescription() != null) {
            String description = networkProfile.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (networkProfile.getSsid() != null) {
            String ssid = networkProfile.getSsid();
            jsonWriter.name("Ssid");
            jsonWriter.value(ssid);
        }
        if (networkProfile.getSecurityType() != null) {
            String securityType = networkProfile.getSecurityType();
            jsonWriter.name("SecurityType");
            jsonWriter.value(securityType);
        }
        if (networkProfile.getEapMethod() != null) {
            String eapMethod = networkProfile.getEapMethod();
            jsonWriter.name("EapMethod");
            jsonWriter.value(eapMethod);
        }
        if (networkProfile.getCurrentPassword() != null) {
            String currentPassword = networkProfile.getCurrentPassword();
            jsonWriter.name("CurrentPassword");
            jsonWriter.value(currentPassword);
        }
        if (networkProfile.getNextPassword() != null) {
            String nextPassword = networkProfile.getNextPassword();
            jsonWriter.name("NextPassword");
            jsonWriter.value(nextPassword);
        }
        if (networkProfile.getCertificateAuthorityArn() != null) {
            String certificateAuthorityArn = networkProfile.getCertificateAuthorityArn();
            jsonWriter.name("CertificateAuthorityArn");
            jsonWriter.value(certificateAuthorityArn);
        }
        if (networkProfile.getTrustAnchors() != null) {
            java.util.List<String> trustAnchors = networkProfile.getTrustAnchors();
            jsonWriter.name("TrustAnchors");
            jsonWriter.beginArray();
            for (String trustAnchorsItem : trustAnchors) {
                if (trustAnchorsItem != null) {
                    jsonWriter.value(trustAnchorsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NetworkProfileJsonMarshaller instance;

    public static NetworkProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkProfileJsonMarshaller();
        return instance;
    }
}
