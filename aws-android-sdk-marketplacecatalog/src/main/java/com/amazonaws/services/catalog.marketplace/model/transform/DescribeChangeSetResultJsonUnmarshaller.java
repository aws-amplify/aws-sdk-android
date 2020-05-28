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

package com.amazonaws.services.catalog.marketplace.model.transform;

import com.amazonaws.services.catalog.marketplace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeChangeSetResult
 */
public class DescribeChangeSetResultJsonUnmarshaller implements
        Unmarshaller<DescribeChangeSetResult, JsonUnmarshallerContext> {

    public DescribeChangeSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeChangeSetResult describeChangeSetResult = new DescribeChangeSetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ChangeSetId")) {
                describeChangeSetResult.setChangeSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChangeSetArn")) {
                describeChangeSetResult.setChangeSetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChangeSetName")) {
                describeChangeSetResult.setChangeSetName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                describeChangeSetResult.setStartTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                describeChangeSetResult.setEndTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeChangeSetResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDescription")) {
                describeChangeSetResult.setFailureDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChangeSet")) {
                describeChangeSetResult.setChangeSet(new ListUnmarshaller<ChangeSummary>(
                        ChangeSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeChangeSetResult;
    }

    private static DescribeChangeSetResultJsonUnmarshaller instance;

    public static DescribeChangeSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeChangeSetResultJsonUnmarshaller();
        return instance;
    }
}
