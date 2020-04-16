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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeTrialComponentResult
 */
public class DescribeTrialComponentResultJsonUnmarshaller implements
        Unmarshaller<DescribeTrialComponentResult, JsonUnmarshallerContext> {

    public DescribeTrialComponentResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeTrialComponentResult describeTrialComponentResult = new DescribeTrialComponentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrialComponentName")) {
                describeTrialComponentResult.setTrialComponentName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrialComponentArn")) {
                describeTrialComponentResult.setTrialComponentArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                describeTrialComponentResult.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Source")) {
                describeTrialComponentResult.setSource(TrialComponentSourceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeTrialComponentResult.setStatus(TrialComponentStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                describeTrialComponentResult.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                describeTrialComponentResult.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeTrialComponentResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                describeTrialComponentResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeTrialComponentResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                describeTrialComponentResult.setLastModifiedBy(UserContextJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                describeTrialComponentResult
                        .setParameters(new MapUnmarshaller<TrialComponentParameterValue>(
                                TrialComponentParameterValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputArtifacts")) {
                describeTrialComponentResult
                        .setInputArtifacts(new MapUnmarshaller<TrialComponentArtifact>(
                                TrialComponentArtifactJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputArtifacts")) {
                describeTrialComponentResult
                        .setOutputArtifacts(new MapUnmarshaller<TrialComponentArtifact>(
                                TrialComponentArtifactJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Metrics")) {
                describeTrialComponentResult
                        .setMetrics(new ListUnmarshaller<TrialComponentMetricSummary>(
                                TrialComponentMetricSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeTrialComponentResult;
    }

    private static DescribeTrialComponentResultJsonUnmarshaller instance;

    public static DescribeTrialComponentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrialComponentResultJsonUnmarshaller();
        return instance;
    }
}
