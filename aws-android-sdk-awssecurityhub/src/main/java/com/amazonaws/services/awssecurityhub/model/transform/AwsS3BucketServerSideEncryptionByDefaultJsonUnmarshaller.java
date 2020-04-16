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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsS3BucketServerSideEncryptionByDefault
 */
class AwsS3BucketServerSideEncryptionByDefaultJsonUnmarshaller implements
        Unmarshaller<AwsS3BucketServerSideEncryptionByDefault, JsonUnmarshallerContext> {

    public AwsS3BucketServerSideEncryptionByDefault unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsS3BucketServerSideEncryptionByDefault awsS3BucketServerSideEncryptionByDefault = new AwsS3BucketServerSideEncryptionByDefault();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SSEAlgorithm")) {
                awsS3BucketServerSideEncryptionByDefault.setSSEAlgorithm(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSMasterKeyID")) {
                awsS3BucketServerSideEncryptionByDefault.setKMSMasterKeyID(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsS3BucketServerSideEncryptionByDefault;
    }

    private static AwsS3BucketServerSideEncryptionByDefaultJsonUnmarshaller instance;

    public static AwsS3BucketServerSideEncryptionByDefaultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketServerSideEncryptionByDefaultJsonUnmarshaller();
        return instance;
    }
}
