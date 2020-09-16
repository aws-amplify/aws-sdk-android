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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3OutputUrl
 */
class S3OutputUrlJsonMarshaller {

    public void marshall(S3OutputUrl s3OutputUrl, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3OutputUrl.getOutputUrl() != null) {
            String outputUrl = s3OutputUrl.getOutputUrl();
            jsonWriter.name("OutputUrl");
            jsonWriter.value(outputUrl);
        }
        jsonWriter.endObject();
    }

    private static S3OutputUrlJsonMarshaller instance;
    public static S3OutputUrlJsonMarshaller getInstance() {
        if (instance == null) instance = new S3OutputUrlJsonMarshaller();
        return instance;
    }
}
