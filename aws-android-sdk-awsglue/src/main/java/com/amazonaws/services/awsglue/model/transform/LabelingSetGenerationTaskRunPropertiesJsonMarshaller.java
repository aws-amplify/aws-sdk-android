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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelingSetGenerationTaskRunProperties
 */
class LabelingSetGenerationTaskRunPropertiesJsonMarshaller {

    public void marshall(
            LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelingSetGenerationTaskRunProperties.getOutputS3Path() != null) {
            String outputS3Path = labelingSetGenerationTaskRunProperties.getOutputS3Path();
            jsonWriter.name("OutputS3Path");
            jsonWriter.value(outputS3Path);
        }
        jsonWriter.endObject();
    }

    private static LabelingSetGenerationTaskRunPropertiesJsonMarshaller instance;

    public static LabelingSetGenerationTaskRunPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingSetGenerationTaskRunPropertiesJsonMarshaller();
        return instance;
    }
}
