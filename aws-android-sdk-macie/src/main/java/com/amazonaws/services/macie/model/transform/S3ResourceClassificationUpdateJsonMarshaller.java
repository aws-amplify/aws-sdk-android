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

package com.amazonaws.services.macie.model.transform;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3ResourceClassificationUpdate
 */
class S3ResourceClassificationUpdateJsonMarshaller {

    public void marshall(S3ResourceClassificationUpdate s3ResourceClassificationUpdate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3ResourceClassificationUpdate.getBucketName() != null) {
            String bucketName = s3ResourceClassificationUpdate.getBucketName();
            jsonWriter.name("bucketName");
            jsonWriter.value(bucketName);
        }
        if (s3ResourceClassificationUpdate.getPrefix() != null) {
            String prefix = s3ResourceClassificationUpdate.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        if (s3ResourceClassificationUpdate.getClassificationTypeUpdate() != null) {
            ClassificationTypeUpdate classificationTypeUpdate = s3ResourceClassificationUpdate
                    .getClassificationTypeUpdate();
            jsonWriter.name("classificationTypeUpdate");
            ClassificationTypeUpdateJsonMarshaller.getInstance().marshall(classificationTypeUpdate,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3ResourceClassificationUpdateJsonMarshaller instance;

    public static S3ResourceClassificationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ResourceClassificationUpdateJsonMarshaller();
        return instance;
    }
}
