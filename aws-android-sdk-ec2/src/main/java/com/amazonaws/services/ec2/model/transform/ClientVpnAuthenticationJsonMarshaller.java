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
 * JSON marshaller for POJO ClientVpnAuthentication
 */
class ClientVpnAuthenticationJsonMarshaller {

    public void marshall(ClientVpnAuthentication clientVpnAuthentication, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clientVpnAuthentication.getType() != null) {
            String type = clientVpnAuthentication.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (clientVpnAuthentication.getActiveDirectory() != null) {
            DirectoryServiceAuthentication activeDirectory = clientVpnAuthentication
                    .getActiveDirectory();
            jsonWriter.name("ActiveDirectory");
            DirectoryServiceAuthenticationJsonMarshaller.getInstance().marshall(activeDirectory,
                    jsonWriter);
        }
        if (clientVpnAuthentication.getMutualAuthentication() != null) {
            CertificateAuthentication mutualAuthentication = clientVpnAuthentication
                    .getMutualAuthentication();
            jsonWriter.name("MutualAuthentication");
            CertificateAuthenticationJsonMarshaller.getInstance().marshall(mutualAuthentication,
                    jsonWriter);
        }
        if (clientVpnAuthentication.getFederatedAuthentication() != null) {
            FederatedAuthentication federatedAuthentication = clientVpnAuthentication
                    .getFederatedAuthentication();
            jsonWriter.name("FederatedAuthentication");
            FederatedAuthenticationJsonMarshaller.getInstance().marshall(federatedAuthentication,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClientVpnAuthenticationJsonMarshaller instance;

    public static ClientVpnAuthenticationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnAuthenticationJsonMarshaller();
        return instance;
    }
}
