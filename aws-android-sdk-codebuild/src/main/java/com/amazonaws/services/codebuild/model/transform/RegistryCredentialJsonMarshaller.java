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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RegistryCredential
 */
class RegistryCredentialJsonMarshaller {

    public void marshall(RegistryCredential registryCredential, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (registryCredential.getCredential() != null) {
            String credential = registryCredential.getCredential();
            jsonWriter.name("credential");
            jsonWriter.value(credential);
        }
        if (registryCredential.getCredentialProvider() != null) {
            String credentialProvider = registryCredential.getCredentialProvider();
            jsonWriter.name("credentialProvider");
            jsonWriter.value(credentialProvider);
        }
        jsonWriter.endObject();
    }

    private static RegistryCredentialJsonMarshaller instance;

    public static RegistryCredentialJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegistryCredentialJsonMarshaller();
        return instance;
    }
}
