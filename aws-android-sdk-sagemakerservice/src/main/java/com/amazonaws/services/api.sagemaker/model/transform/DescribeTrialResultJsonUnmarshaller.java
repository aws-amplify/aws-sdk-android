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
 * JSON unmarshaller for response DescribeTrialResult
 */
public class DescribeTrialResultJsonUnmarshaller implements
        Unmarshaller<DescribeTrialResult, JsonUnmarshallerContext> {

    public DescribeTrialResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTrialResult describeTrialResult = new DescribeTrialResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrialName")) {
                describeTrialResult.setTrialName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrialArn")) {
                describeTrialResult.setTrialArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                describeTrialResult.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentName")) {
                describeTrialResult.setExperimentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Source")) {
                describeTrialResult.setSource(TrialSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeTrialResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                describeTrialResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeTrialResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                describeTrialResult.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeTrialResult;
    }

    private static DescribeTrialResultJsonUnmarshaller instance;

    public static DescribeTrialResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrialResultJsonUnmarshaller();
        return instance;
    }
}
