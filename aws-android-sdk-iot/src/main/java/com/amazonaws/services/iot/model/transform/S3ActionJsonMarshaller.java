/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Action
 */
class S3ActionJsonMarshaller {

    public void marshall(S3Action s3Action, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Action.getRoleArn() != null) {
            String roleArn = s3Action.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (s3Action.getBucketName() != null) {
            String bucketName = s3Action.getBucketName();
            jsonWriter.name("bucketName");
            jsonWriter.value(bucketName);
        }
        if (s3Action.getKey() != null) {
            String key = s3Action.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (s3Action.getCannedAcl() != null) {
            String cannedAcl = s3Action.getCannedAcl();
            jsonWriter.name("cannedAcl");
            jsonWriter.value(cannedAcl);
        }
        jsonWriter.endObject();
    }

    private static S3ActionJsonMarshaller instance;

    public static S3ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ActionJsonMarshaller();
        return instance;
    }
}
