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
 * JSON marshaller for POJO S3BucketOwner
 */
class S3BucketOwnerJsonMarshaller {

    public void marshall(S3BucketOwner s3BucketOwner, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3BucketOwner.getDisplayName() != null) {
            String displayName = s3BucketOwner.getDisplayName();
            jsonWriter.name("displayName");
            jsonWriter.value(displayName);
        }
        if (s3BucketOwner.getId() != null) {
            String id = s3BucketOwner.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static S3BucketOwnerJsonMarshaller instance;

    public static S3BucketOwnerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketOwnerJsonMarshaller();
        return instance;
    }
}
