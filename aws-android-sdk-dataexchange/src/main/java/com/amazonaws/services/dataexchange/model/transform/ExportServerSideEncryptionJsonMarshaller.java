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

package com.amazonaws.services.dataexchange.model.transform;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExportServerSideEncryption
 */
class ExportServerSideEncryptionJsonMarshaller {

    public void marshall(ExportServerSideEncryption exportServerSideEncryption,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportServerSideEncryption.getKmsKeyArn() != null) {
            String kmsKeyArn = exportServerSideEncryption.getKmsKeyArn();
            jsonWriter.name("KmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        if (exportServerSideEncryption.getType() != null) {
            String type = exportServerSideEncryption.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static ExportServerSideEncryptionJsonMarshaller instance;

    public static ExportServerSideEncryptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportServerSideEncryptionJsonMarshaller();
        return instance;
    }
}
