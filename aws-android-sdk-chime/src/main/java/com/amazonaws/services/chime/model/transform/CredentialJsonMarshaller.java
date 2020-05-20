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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Credential
 */
class CredentialJsonMarshaller {

    public void marshall(Credential credential, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (credential.getUsername() != null) {
            String username = credential.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (credential.getPassword() != null) {
            String password = credential.getPassword();
            jsonWriter.name("Password");
            jsonWriter.value(password);
        }
        jsonWriter.endObject();
    }

    private static CredentialJsonMarshaller instance;

    public static CredentialJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CredentialJsonMarshaller();
        return instance;
    }
}
