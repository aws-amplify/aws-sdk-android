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

package com.amazonaws.services.transfer.model.transform;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SshPublicKey
 */
class SshPublicKeyJsonMarshaller {

    public void marshall(SshPublicKey sshPublicKey, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sshPublicKey.getDateImported() != null) {
            java.util.Date dateImported = sshPublicKey.getDateImported();
            jsonWriter.name("DateImported");
            jsonWriter.value(dateImported);
        }
        if (sshPublicKey.getSshPublicKeyBody() != null) {
            String sshPublicKeyBody = sshPublicKey.getSshPublicKeyBody();
            jsonWriter.name("SshPublicKeyBody");
            jsonWriter.value(sshPublicKeyBody);
        }
        if (sshPublicKey.getSshPublicKeyId() != null) {
            String sshPublicKeyId = sshPublicKey.getSshPublicKeyId();
            jsonWriter.name("SshPublicKeyId");
            jsonWriter.value(sshPublicKeyId);
        }
        jsonWriter.endObject();
    }

    private static SshPublicKeyJsonMarshaller instance;

    public static SshPublicKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SshPublicKeyJsonMarshaller();
        return instance;
    }
}
