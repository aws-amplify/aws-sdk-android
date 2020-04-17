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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDetectorResult
 */
public class DescribeDetectorResultJsonUnmarshaller implements
        Unmarshaller<DescribeDetectorResult, JsonUnmarshallerContext> {

    public DescribeDetectorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDetectorResult describeDetectorResult = new DescribeDetectorResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("detectorId")) {
                describeDetectorResult.setDetectorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectorVersionSummaries")) {
                describeDetectorResult
                        .setDetectorVersionSummaries(new ListUnmarshaller<DetectorVersionSummary>(
                                DetectorVersionSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                describeDetectorResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDetectorResult;
    }

    private static DescribeDetectorResultJsonUnmarshaller instance;

    public static DescribeDetectorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDetectorResultJsonUnmarshaller();
        return instance;
    }
}
