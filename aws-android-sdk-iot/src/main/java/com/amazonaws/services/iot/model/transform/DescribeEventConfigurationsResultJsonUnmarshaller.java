/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response DescribeEventConfigurationsResult
 */
public class DescribeEventConfigurationsResultJsonUnmarshaller implements
        Unmarshaller<DescribeEventConfigurationsResult, JsonUnmarshallerContext> {

    public DescribeEventConfigurationsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeEventConfigurationsResult describeEventConfigurationsResult = new DescribeEventConfigurationsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eventConfigurations")) {
                describeEventConfigurationsResult
                        .setEventConfigurations(new MapUnmarshaller<Configuration>(
                                ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeEventConfigurationsResult.setCreationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                describeEventConfigurationsResult.setLastModifiedDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeEventConfigurationsResult;
    }

    private static DescribeEventConfigurationsResultJsonUnmarshaller instance;

    public static DescribeEventConfigurationsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEventConfigurationsResultJsonUnmarshaller();
        return instance;
    }
}
