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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeClassificationJobResult
 */
public class DescribeClassificationJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeClassificationJobResult, JsonUnmarshallerContext> {

    public DescribeClassificationJobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeClassificationJobResult describeClassificationJobResult = new DescribeClassificationJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("clientToken")) {
                describeClassificationJobResult.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                describeClassificationJobResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customDataIdentifierIds")) {
                describeClassificationJobResult
                        .setCustomDataIdentifierIds(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("description")) {
                describeClassificationJobResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("initialRun")) {
                describeClassificationJobResult.setInitialRun(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobArn")) {
                describeClassificationJobResult.setJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobId")) {
                describeClassificationJobResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobStatus")) {
                describeClassificationJobResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobType")) {
                describeClassificationJobResult.setJobType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastRunTime")) {
                describeClassificationJobResult.setLastRunTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                describeClassificationJobResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("s3JobDefinition")) {
                describeClassificationJobResult.setS3JobDefinition(S3JobDefinitionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("samplingPercentage")) {
                describeClassificationJobResult.setSamplingPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("scheduleFrequency")) {
                describeClassificationJobResult
                        .setScheduleFrequency(JobScheduleFrequencyJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("statistics")) {
                describeClassificationJobResult.setStatistics(StatisticsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                describeClassificationJobResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeClassificationJobResult;
    }

    private static DescribeClassificationJobResultJsonUnmarshaller instance;

    public static DescribeClassificationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeClassificationJobResultJsonUnmarshaller();
        return instance;
    }
}
