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
 * JSON marshaller for POJO AwsS3BucketServerSideEncryptionConfiguration
 */
class AwsS3BucketServerSideEncryptionConfigurationJsonMarshaller {

    public void marshall(
            AwsS3BucketServerSideEncryptionConfiguration awsS3BucketServerSideEncryptionConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsS3BucketServerSideEncryptionConfiguration.getRules() != null) {
            java.util.List<AwsS3BucketServerSideEncryptionRule> rules = awsS3BucketServerSideEncryptionConfiguration
                    .getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (AwsS3BucketServerSideEncryptionRule rulesItem : rules) {
                if (rulesItem != null) {
                    AwsS3BucketServerSideEncryptionRuleJsonMarshaller.getInstance().marshall(
                            rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AwsS3BucketServerSideEncryptionConfigurationJsonMarshaller instance;

    public static AwsS3BucketServerSideEncryptionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketServerSideEncryptionConfigurationJsonMarshaller();
        return instance;
    }
}
