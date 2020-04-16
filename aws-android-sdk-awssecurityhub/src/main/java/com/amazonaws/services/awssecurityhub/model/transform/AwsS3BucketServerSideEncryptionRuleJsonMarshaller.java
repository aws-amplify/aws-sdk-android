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
 * JSON marshaller for POJO AwsS3BucketServerSideEncryptionRule
 */
class AwsS3BucketServerSideEncryptionRuleJsonMarshaller {

    public void marshall(AwsS3BucketServerSideEncryptionRule awsS3BucketServerSideEncryptionRule,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsS3BucketServerSideEncryptionRule.getApplyServerSideEncryptionByDefault() != null) {
            AwsS3BucketServerSideEncryptionByDefault applyServerSideEncryptionByDefault = awsS3BucketServerSideEncryptionRule
                    .getApplyServerSideEncryptionByDefault();
            jsonWriter.name("ApplyServerSideEncryptionByDefault");
            AwsS3BucketServerSideEncryptionByDefaultJsonMarshaller.getInstance().marshall(
                    applyServerSideEncryptionByDefault, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsS3BucketServerSideEncryptionRuleJsonMarshaller instance;

    public static AwsS3BucketServerSideEncryptionRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketServerSideEncryptionRuleJsonMarshaller();
        return instance;
    }
}
