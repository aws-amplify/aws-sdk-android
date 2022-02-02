/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PiiOutputDataConfig
 */
class PiiOutputDataConfigJsonMarshaller {

    public void marshall(PiiOutputDataConfig piiOutputDataConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (piiOutputDataConfig.getS3Uri() != null) {
            String s3Uri = piiOutputDataConfig.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        if (piiOutputDataConfig.getKmsKeyId() != null) {
            String kmsKeyId = piiOutputDataConfig.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static PiiOutputDataConfigJsonMarshaller instance;

    public static PiiOutputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PiiOutputDataConfigJsonMarshaller();
        return instance;
    }
}
