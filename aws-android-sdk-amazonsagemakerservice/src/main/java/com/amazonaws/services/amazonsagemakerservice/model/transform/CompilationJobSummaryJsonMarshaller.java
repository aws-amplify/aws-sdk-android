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
 * JSON marshaller for POJO CompilationJobSummary
 */
class CompilationJobSummaryJsonMarshaller {

    public void marshall(CompilationJobSummary compilationJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (compilationJobSummary.getCompilationJobName() != null) {
            String compilationJobName = compilationJobSummary.getCompilationJobName();
            jsonWriter.name("CompilationJobName");
            jsonWriter.value(compilationJobName);
        }
        if (compilationJobSummary.getCompilationJobArn() != null) {
            String compilationJobArn = compilationJobSummary.getCompilationJobArn();
            jsonWriter.name("CompilationJobArn");
            jsonWriter.value(compilationJobArn);
        }
        if (compilationJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = compilationJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (compilationJobSummary.getCompilationStartTime() != null) {
            java.util.Date compilationStartTime = compilationJobSummary.getCompilationStartTime();
            jsonWriter.name("CompilationStartTime");
            jsonWriter.value(compilationStartTime);
        }
        if (compilationJobSummary.getCompilationEndTime() != null) {
            java.util.Date compilationEndTime = compilationJobSummary.getCompilationEndTime();
            jsonWriter.name("CompilationEndTime");
            jsonWriter.value(compilationEndTime);
        }
        if (compilationJobSummary.getCompilationTargetDevice() != null) {
            String compilationTargetDevice = compilationJobSummary.getCompilationTargetDevice();
            jsonWriter.name("CompilationTargetDevice");
            jsonWriter.value(compilationTargetDevice);
        }
        if (compilationJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = compilationJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (compilationJobSummary.getCompilationJobStatus() != null) {
            String compilationJobStatus = compilationJobSummary.getCompilationJobStatus();
            jsonWriter.name("CompilationJobStatus");
            jsonWriter.value(compilationJobStatus);
        }
        jsonWriter.endObject();
    }

    private static CompilationJobSummaryJsonMarshaller instance;

    public static CompilationJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CompilationJobSummaryJsonMarshaller();
        return instance;
    }
}
