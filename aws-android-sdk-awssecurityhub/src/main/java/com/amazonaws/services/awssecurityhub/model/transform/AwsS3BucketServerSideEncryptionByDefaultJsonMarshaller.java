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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsS3BucketServerSideEncryptionByDefault
 */
class AwsS3BucketServerSideEncryptionByDefaultJsonMarshaller {

    public void marshall(
            AwsS3BucketServerSideEncryptionByDefault awsS3BucketServerSideEncryptionByDefault,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsS3BucketServerSideEncryptionByDefault.getSSEAlgorithm() != null) {
            String sSEAlgorithm = awsS3BucketServerSideEncryptionByDefault.getSSEAlgorithm();
            jsonWriter.name("SSEAlgorithm");
            jsonWriter.value(sSEAlgorithm);
        }
        if (awsS3BucketServerSideEncryptionByDefault.getKMSMasterKeyID() != null) {
            String kMSMasterKeyID = awsS3BucketServerSideEncryptionByDefault.getKMSMasterKeyID();
            jsonWriter.name("KMSMasterKeyID");
            jsonWriter.value(kMSMasterKeyID);
        }
        jsonWriter.endObject();
    }

    private static AwsS3BucketServerSideEncryptionByDefaultJsonMarshaller instance;

    public static AwsS3BucketServerSideEncryptionByDefaultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketServerSideEncryptionByDefaultJsonMarshaller();
        return instance;
    }
}
