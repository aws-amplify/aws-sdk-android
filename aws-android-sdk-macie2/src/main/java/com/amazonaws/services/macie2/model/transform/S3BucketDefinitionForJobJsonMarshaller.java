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
 * JSON marshaller for POJO S3BucketDefinitionForJob
 */
class S3BucketDefinitionForJobJsonMarshaller {

    public void marshall(S3BucketDefinitionForJob s3BucketDefinitionForJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3BucketDefinitionForJob.getAccountId() != null) {
            String accountId = s3BucketDefinitionForJob.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (s3BucketDefinitionForJob.getBuckets() != null) {
            java.util.List<String> buckets = s3BucketDefinitionForJob.getBuckets();
            jsonWriter.name("buckets");
            jsonWriter.beginArray();
            for (String bucketsItem : buckets) {
                if (bucketsItem != null) {
                    jsonWriter.value(bucketsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static S3BucketDefinitionForJobJsonMarshaller instance;

    public static S3BucketDefinitionForJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketDefinitionForJobJsonMarshaller();
        return instance;
    }
}
