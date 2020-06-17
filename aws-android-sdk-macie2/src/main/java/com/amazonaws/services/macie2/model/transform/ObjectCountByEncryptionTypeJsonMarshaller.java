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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ObjectCountByEncryptionType
 */
class ObjectCountByEncryptionTypeJsonMarshaller {

    public void marshall(ObjectCountByEncryptionType objectCountByEncryptionType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (objectCountByEncryptionType.getCustomerManaged() != null) {
            Long customerManaged = objectCountByEncryptionType.getCustomerManaged();
            jsonWriter.name("customerManaged");
            jsonWriter.value(customerManaged);
        }
        if (objectCountByEncryptionType.getKmsManaged() != null) {
            Long kmsManaged = objectCountByEncryptionType.getKmsManaged();
            jsonWriter.name("kmsManaged");
            jsonWriter.value(kmsManaged);
        }
        if (objectCountByEncryptionType.getS3Managed() != null) {
            Long s3Managed = objectCountByEncryptionType.getS3Managed();
            jsonWriter.name("s3Managed");
            jsonWriter.value(s3Managed);
        }
        if (objectCountByEncryptionType.getUnencrypted() != null) {
            Long unencrypted = objectCountByEncryptionType.getUnencrypted();
            jsonWriter.name("unencrypted");
            jsonWriter.value(unencrypted);
        }
        jsonWriter.endObject();
    }

    private static ObjectCountByEncryptionTypeJsonMarshaller instance;

    public static ObjectCountByEncryptionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ObjectCountByEncryptionTypeJsonMarshaller();
        return instance;
    }
}
