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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClientVpnAuthenticationRequest
 */
class ClientVpnAuthenticationRequestJsonMarshaller {

    public void marshall(ClientVpnAuthenticationRequest clientVpnAuthenticationRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clientVpnAuthenticationRequest.getType() != null) {
            String type = clientVpnAuthenticationRequest.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (clientVpnAuthenticationRequest.getActiveDirectory() != null) {
            DirectoryServiceAuthenticationRequest activeDirectory = clientVpnAuthenticationRequest
                    .getActiveDirectory();
            jsonWriter.name("ActiveDirectory");
            DirectoryServiceAuthenticationRequestJsonMarshaller.getInstance().marshall(
                    activeDirectory, jsonWriter);
        }
        if (clientVpnAuthenticationRequest.getMutualAuthentication() != null) {
            CertificateAuthenticationRequest mutualAuthentication = clientVpnAuthenticationRequest
                    .getMutualAuthentication();
            jsonWriter.name("MutualAuthentication");
            CertificateAuthenticationRequestJsonMarshaller.getInstance().marshall(
                    mutualAuthentication, jsonWriter);
        }
        if (clientVpnAuthenticationRequest.getFederatedAuthentication() != null) {
            FederatedAuthenticationRequest federatedAuthentication = clientVpnAuthenticationRequest
                    .getFederatedAuthentication();
            jsonWriter.name("FederatedAuthentication");
            FederatedAuthenticationRequestJsonMarshaller.getInstance().marshall(
                    federatedAuthentication, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClientVpnAuthenticationRequestJsonMarshaller instance;

    public static ClientVpnAuthenticationRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnAuthenticationRequestJsonMarshaller();
        return instance;
    }
}
