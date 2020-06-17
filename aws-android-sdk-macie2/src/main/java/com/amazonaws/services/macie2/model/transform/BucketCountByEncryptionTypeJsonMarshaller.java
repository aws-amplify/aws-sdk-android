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
 * JSON marshaller for POJO BucketCountByEncryptionType
 */
class BucketCountByEncryptionTypeJsonMarshaller {

    public void marshall(BucketCountByEncryptionType bucketCountByEncryptionType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketCountByEncryptionType.getKmsManaged() != null) {
            Long kmsManaged = bucketCountByEncryptionType.getKmsManaged();
            jsonWriter.name("kmsManaged");
            jsonWriter.value(kmsManaged);
        }
        if (bucketCountByEncryptionType.getS3Managed() != null) {
            Long s3Managed = bucketCountByEncryptionType.getS3Managed();
            jsonWriter.name("s3Managed");
            jsonWriter.value(s3Managed);
        }
        if (bucketCountByEncryptionType.getUnencrypted() != null) {
            Long unencrypted = bucketCountByEncryptionType.getUnencrypted();
            jsonWriter.name("unencrypted");
            jsonWriter.value(unencrypted);
        }
        jsonWriter.endObject();
    }

    private static BucketCountByEncryptionTypeJsonMarshaller instance;

    public static BucketCountByEncryptionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketCountByEncryptionTypeJsonMarshaller();
        return instance;
    }
}
