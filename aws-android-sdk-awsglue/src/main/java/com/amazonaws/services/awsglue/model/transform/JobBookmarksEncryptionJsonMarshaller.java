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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobBookmarksEncryption
 */
class JobBookmarksEncryptionJsonMarshaller {

    public void marshall(JobBookmarksEncryption jobBookmarksEncryption, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobBookmarksEncryption.getJobBookmarksEncryptionMode() != null) {
            String jobBookmarksEncryptionMode = jobBookmarksEncryption
                    .getJobBookmarksEncryptionMode();
            jsonWriter.name("JobBookmarksEncryptionMode");
            jsonWriter.value(jobBookmarksEncryptionMode);
        }
        if (jobBookmarksEncryption.getKmsKeyArn() != null) {
            String kmsKeyArn = jobBookmarksEncryption.getKmsKeyArn();
            jsonWriter.name("KmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        jsonWriter.endObject();
    }

    private static JobBookmarksEncryptionJsonMarshaller instance;

    public static JobBookmarksEncryptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobBookmarksEncryptionJsonMarshaller();
        return instance;
    }
}
