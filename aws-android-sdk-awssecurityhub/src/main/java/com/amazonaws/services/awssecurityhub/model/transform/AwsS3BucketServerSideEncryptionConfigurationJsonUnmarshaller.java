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
 * JSON unmarshaller for POJO AwsS3BucketServerSideEncryptionConfiguration
 */
class AwsS3BucketServerSideEncryptionConfigurationJsonUnmarshaller implements
        Unmarshaller<AwsS3BucketServerSideEncryptionConfiguration, JsonUnmarshallerContext> {

    public AwsS3BucketServerSideEncryptionConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsS3BucketServerSideEncryptionConfiguration awsS3BucketServerSideEncryptionConfiguration = new AwsS3BucketServerSideEncryptionConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Rules")) {
                awsS3BucketServerSideEncryptionConfiguration
                        .setRules(new ListUnmarshaller<AwsS3BucketServerSideEncryptionRule>(
                                AwsS3BucketServerSideEncryptionRuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsS3BucketServerSideEncryptionConfiguration;
    }

    private static AwsS3BucketServerSideEncryptionConfigurationJsonUnmarshaller instance;

    public static AwsS3BucketServerSideEncryptionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketServerSideEncryptionConfigurationJsonUnmarshaller();
        return instance;
    }
}
