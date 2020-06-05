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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchInferenceJobOutput
 */
class BatchInferenceJobOutputJsonMarshaller {

    public void marshall(BatchInferenceJobOutput batchInferenceJobOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (batchInferenceJobOutput.getS3DataDestination() != null) {
            S3DataConfig s3DataDestination = batchInferenceJobOutput.getS3DataDestination();
            jsonWriter.name("s3DataDestination");
            S3DataConfigJsonMarshaller.getInstance().marshall(s3DataDestination, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BatchInferenceJobOutputJsonMarshaller instance;

    public static BatchInferenceJobOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchInferenceJobOutputJsonMarshaller();
        return instance;
    }
}
