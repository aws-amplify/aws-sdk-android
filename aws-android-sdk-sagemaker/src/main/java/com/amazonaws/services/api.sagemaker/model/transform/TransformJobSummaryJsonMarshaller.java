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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TransformJobSummary
 */
class TransformJobSummaryJsonMarshaller {

    public void marshall(TransformJobSummary transformJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transformJobSummary.getTransformJobName() != null) {
            String transformJobName = transformJobSummary.getTransformJobName();
            jsonWriter.name("TransformJobName");
            jsonWriter.value(transformJobName);
        }
        if (transformJobSummary.getTransformJobArn() != null) {
            String transformJobArn = transformJobSummary.getTransformJobArn();
            jsonWriter.name("TransformJobArn");
            jsonWriter.value(transformJobArn);
        }
        if (transformJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = transformJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transformJobSummary.getTransformEndTime() != null) {
            java.util.Date transformEndTime = transformJobSummary.getTransformEndTime();
            jsonWriter.name("TransformEndTime");
            jsonWriter.value(transformEndTime);
        }
        if (transformJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = transformJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (transformJobSummary.getTransformJobStatus() != null) {
            String transformJobStatus = transformJobSummary.getTransformJobStatus();
            jsonWriter.name("TransformJobStatus");
            jsonWriter.value(transformJobStatus);
        }
        if (transformJobSummary.getFailureReason() != null) {
            String failureReason = transformJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static TransformJobSummaryJsonMarshaller instance;

    public static TransformJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransformJobSummaryJsonMarshaller();
        return instance;
    }
}
