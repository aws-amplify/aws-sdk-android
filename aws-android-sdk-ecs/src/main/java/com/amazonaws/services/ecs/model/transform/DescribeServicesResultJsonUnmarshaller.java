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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeServicesResult
 */
public class DescribeServicesResultJsonUnmarshaller implements
        Unmarshaller<DescribeServicesResult, JsonUnmarshallerContext> {

    public DescribeServicesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeServicesResult describeServicesResult = new DescribeServicesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("services")) {
                describeServicesResult.setServices(new ListUnmarshaller<Service>(
                        ServiceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("failures")) {
                describeServicesResult.setFailures(new ListUnmarshaller<Failure>(
                        FailureJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeServicesResult;
    }

    private static DescribeServicesResultJsonUnmarshaller instance;

    public static DescribeServicesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeServicesResultJsonUnmarshaller();
        return instance;
    }
}
