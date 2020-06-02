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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BucketPolicy
 */
class BucketPolicyJsonMarshaller {

    public void marshall(BucketPolicy bucketPolicy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketPolicy.getAllowsPublicReadAccess() != null) {
            Boolean allowsPublicReadAccess = bucketPolicy.getAllowsPublicReadAccess();
            jsonWriter.name("AllowsPublicReadAccess");
            jsonWriter.value(allowsPublicReadAccess);
        }
        if (bucketPolicy.getAllowsPublicWriteAccess() != null) {
            Boolean allowsPublicWriteAccess = bucketPolicy.getAllowsPublicWriteAccess();
            jsonWriter.name("AllowsPublicWriteAccess");
            jsonWriter.value(allowsPublicWriteAccess);
        }
        jsonWriter.endObject();
    }

    private static BucketPolicyJsonMarshaller instance;

    public static BucketPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketPolicyJsonMarshaller();
        return instance;
    }
}
