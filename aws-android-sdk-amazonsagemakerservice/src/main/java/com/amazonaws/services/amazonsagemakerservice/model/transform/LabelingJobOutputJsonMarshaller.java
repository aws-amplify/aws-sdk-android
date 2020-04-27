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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelingJobOutput
 */
class LabelingJobOutputJsonMarshaller {

    public void marshall(LabelingJobOutput labelingJobOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (labelingJobOutput.getOutputDatasetS3Uri() != null) {
            String outputDatasetS3Uri = labelingJobOutput.getOutputDatasetS3Uri();
            jsonWriter.name("OutputDatasetS3Uri");
            jsonWriter.value(outputDatasetS3Uri);
        }
        if (labelingJobOutput.getFinalActiveLearningModelArn() != null) {
            String finalActiveLearningModelArn = labelingJobOutput.getFinalActiveLearningModelArn();
            jsonWriter.name("FinalActiveLearningModelArn");
            jsonWriter.value(finalActiveLearningModelArn);
        }
        jsonWriter.endObject();
    }

    private static LabelingJobOutputJsonMarshaller instance;

    public static LabelingJobOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobOutputJsonMarshaller();
        return instance;
    }
}
