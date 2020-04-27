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
 * JSON unmarshaller for response DescribeAppResult
 */
public class DescribeAppResultJsonUnmarshaller implements
        Unmarshaller<DescribeAppResult, JsonUnmarshallerContext> {

    public DescribeAppResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAppResult describeAppResult = new DescribeAppResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AppArn")) {
                describeAppResult.setAppArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AppType")) {
                describeAppResult.setAppType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AppName")) {
                describeAppResult.setAppName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainId")) {
                describeAppResult.setDomainId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserProfileName")) {
                describeAppResult.setUserProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeAppResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastHealthCheckTimestamp")) {
                describeAppResult.setLastHealthCheckTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUserActivityTimestamp")) {
                describeAppResult.setLastUserActivityTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeAppResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeAppResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceSpec")) {
                describeAppResult.setResourceSpec(ResourceSpecJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAppResult;
    }

    private static DescribeAppResultJsonUnmarshaller instance;

    public static DescribeAppResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAppResultJsonUnmarshaller();
        return instance;
    }
}
