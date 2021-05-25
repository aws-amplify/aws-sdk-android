/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeJobTemplateResult
 */
public class DescribeJobTemplateResultJsonUnmarshaller implements
        Unmarshaller<DescribeJobTemplateResult, JsonUnmarshallerContext> {

    public DescribeJobTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobTemplateResult describeJobTemplateResult = new DescribeJobTemplateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("jobTemplateArn")) {
                describeJobTemplateResult.setJobTemplateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobTemplateId")) {
                describeJobTemplateResult.setJobTemplateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                describeJobTemplateResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("documentSource")) {
                describeJobTemplateResult.setDocumentSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("document")) {
                describeJobTemplateResult.setDocument(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                describeJobTemplateResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("presignedUrlConfig")) {
                describeJobTemplateResult.setPresignedUrlConfig(PresignedUrlConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobExecutionsRolloutConfig")) {
                describeJobTemplateResult
                        .setJobExecutionsRolloutConfig(JobExecutionsRolloutConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("abortConfig")) {
                describeJobTemplateResult.setAbortConfig(AbortConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeoutConfig")) {
                describeJobTemplateResult.setTimeoutConfig(TimeoutConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeJobTemplateResult;
    }

    private static DescribeJobTemplateResultJsonUnmarshaller instance;

    public static DescribeJobTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeJobTemplateResultJsonUnmarshaller();
        return instance;
    }
}
