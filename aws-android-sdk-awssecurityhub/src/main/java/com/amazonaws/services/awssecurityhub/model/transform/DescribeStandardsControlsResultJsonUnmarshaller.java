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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeStandardsControlsResult
 */
public class DescribeStandardsControlsResultJsonUnmarshaller implements
        Unmarshaller<DescribeStandardsControlsResult, JsonUnmarshallerContext> {

    public DescribeStandardsControlsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeStandardsControlsResult describeStandardsControlsResult = new DescribeStandardsControlsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Controls")) {
                describeStandardsControlsResult.setControls(new ListUnmarshaller<StandardsControl>(
                        StandardsControlJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                describeStandardsControlsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeStandardsControlsResult;
    }

    private static DescribeStandardsControlsResultJsonUnmarshaller instance;

    public static DescribeStandardsControlsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStandardsControlsResultJsonUnmarshaller();
        return instance;
    }
}
