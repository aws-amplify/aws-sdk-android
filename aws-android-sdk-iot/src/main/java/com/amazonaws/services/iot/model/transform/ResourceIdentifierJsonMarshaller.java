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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceIdentifier
 */
class ResourceIdentifierJsonMarshaller {

    public void marshall(ResourceIdentifier resourceIdentifier, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceIdentifier.getDeviceCertificateId() != null) {
            String deviceCertificateId = resourceIdentifier.getDeviceCertificateId();
            jsonWriter.name("deviceCertificateId");
            jsonWriter.value(deviceCertificateId);
        }
        if (resourceIdentifier.getCaCertificateId() != null) {
            String caCertificateId = resourceIdentifier.getCaCertificateId();
            jsonWriter.name("caCertificateId");
            jsonWriter.value(caCertificateId);
        }
        if (resourceIdentifier.getCognitoIdentityPoolId() != null) {
            String cognitoIdentityPoolId = resourceIdentifier.getCognitoIdentityPoolId();
            jsonWriter.name("cognitoIdentityPoolId");
            jsonWriter.value(cognitoIdentityPoolId);
        }
        if (resourceIdentifier.getClientId() != null) {
            String clientId = resourceIdentifier.getClientId();
            jsonWriter.name("clientId");
            jsonWriter.value(clientId);
        }
        if (resourceIdentifier.getPolicyVersionIdentifier() != null) {
            PolicyVersionIdentifier policyVersionIdentifier = resourceIdentifier
                    .getPolicyVersionIdentifier();
            jsonWriter.name("policyVersionIdentifier");
            PolicyVersionIdentifierJsonMarshaller.getInstance().marshall(policyVersionIdentifier,
                    jsonWriter);
        }
        if (resourceIdentifier.getAccount() != null) {
            String account = resourceIdentifier.getAccount();
            jsonWriter.name("account");
            jsonWriter.value(account);
        }
        jsonWriter.endObject();
    }

    private static ResourceIdentifierJsonMarshaller instance;

    public static ResourceIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceIdentifierJsonMarshaller();
        return instance;
    }
}
