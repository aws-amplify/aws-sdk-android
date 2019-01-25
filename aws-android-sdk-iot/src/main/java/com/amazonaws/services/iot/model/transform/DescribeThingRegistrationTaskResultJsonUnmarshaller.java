/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response DescribeThingRegistrationTaskResult
 */
public class DescribeThingRegistrationTaskResultJsonUnmarshaller implements
        Unmarshaller<DescribeThingRegistrationTaskResult, JsonUnmarshallerContext> {

    public DescribeThingRegistrationTaskResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeThingRegistrationTaskResult describeThingRegistrationTaskResult = new DescribeThingRegistrationTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("taskId")) {
                describeThingRegistrationTaskResult.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeThingRegistrationTaskResult.setCreationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                describeThingRegistrationTaskResult.setLastModifiedDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("templateBody")) {
                describeThingRegistrationTaskResult.setTemplateBody(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("inputFileBucket")) {
                describeThingRegistrationTaskResult.setInputFileBucket(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("inputFileKey")) {
                describeThingRegistrationTaskResult.setInputFileKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                describeThingRegistrationTaskResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                describeThingRegistrationTaskResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("message")) {
                describeThingRegistrationTaskResult.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("successCount")) {
                describeThingRegistrationTaskResult.setSuccessCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureCount")) {
                describeThingRegistrationTaskResult.setFailureCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("percentageProgress")) {
                describeThingRegistrationTaskResult.setPercentageProgress(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeThingRegistrationTaskResult;
    }

    private static DescribeThingRegistrationTaskResultJsonUnmarshaller instance;

    public static DescribeThingRegistrationTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingRegistrationTaskResultJsonUnmarshaller();
        return instance;
    }
}
