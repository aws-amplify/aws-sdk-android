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
 * JSON marshaller for POJO AwsS3BucketDetails
 */
class AwsS3BucketDetailsJsonMarshaller {

    public void marshall(AwsS3BucketDetails awsS3BucketDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsS3BucketDetails.getOwnerId() != null) {
            String ownerId = awsS3BucketDetails.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (awsS3BucketDetails.getOwnerName() != null) {
            String ownerName = awsS3BucketDetails.getOwnerName();
            jsonWriter.name("OwnerName");
            jsonWriter.value(ownerName);
        }
        if (awsS3BucketDetails.getCreatedAt() != null) {
            String createdAt = awsS3BucketDetails.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (awsS3BucketDetails.getServerSideEncryptionConfiguration() != null) {
            AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration = awsS3BucketDetails
                    .getServerSideEncryptionConfiguration();
            jsonWriter.name("ServerSideEncryptionConfiguration");
            AwsS3BucketServerSideEncryptionConfigurationJsonMarshaller.getInstance().marshall(
                    serverSideEncryptionConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsS3BucketDetailsJsonMarshaller instance;

    public static AwsS3BucketDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketDetailsJsonMarshaller();
        return instance;
    }
}
