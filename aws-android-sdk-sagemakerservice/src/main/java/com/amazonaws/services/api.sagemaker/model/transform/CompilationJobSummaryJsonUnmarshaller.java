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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CompilationJobSummary
 */
class CompilationJobSummaryJsonUnmarshaller implements
        Unmarshaller<CompilationJobSummary, JsonUnmarshallerContext> {

    public CompilationJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CompilationJobSummary compilationJobSummary = new CompilationJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CompilationJobName")) {
                compilationJobSummary.setCompilationJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationJobArn")) {
                compilationJobSummary.setCompilationJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                compilationJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationStartTime")) {
                compilationJobSummary.setCompilationStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationEndTime")) {
                compilationJobSummary.setCompilationEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationTargetDevice")) {
                compilationJobSummary.setCompilationTargetDevice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                compilationJobSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationJobStatus")) {
                compilationJobSummary.setCompilationJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return compilationJobSummary;
    }

    private static CompilationJobSummaryJsonUnmarshaller instance;

    public static CompilationJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CompilationJobSummaryJsonUnmarshaller();
        return instance;
    }
}
