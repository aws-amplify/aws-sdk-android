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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EncryptionAtRestOptionsStatus
 */
class EncryptionAtRestOptionsStatusJsonMarshaller {

    public void marshall(EncryptionAtRestOptionsStatus encryptionAtRestOptionsStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (encryptionAtRestOptionsStatus.getOptions() != null) {
            EncryptionAtRestOptions options = encryptionAtRestOptionsStatus.getOptions();
            jsonWriter.name("Options");
            EncryptionAtRestOptionsJsonMarshaller.getInstance().marshall(options, jsonWriter);
        }
        if (encryptionAtRestOptionsStatus.getStatus() != null) {
            OptionStatus status = encryptionAtRestOptionsStatus.getStatus();
            jsonWriter.name("Status");
            OptionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EncryptionAtRestOptionsStatusJsonMarshaller instance;

    public static EncryptionAtRestOptionsStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EncryptionAtRestOptionsStatusJsonMarshaller();
        return instance;
    }
}
