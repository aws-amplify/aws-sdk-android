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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDataSourcePermissionsResult
 */
public class DescribeDataSourcePermissionsResultJsonUnmarshaller implements
        Unmarshaller<DescribeDataSourcePermissionsResult, JsonUnmarshallerContext> {

    public DescribeDataSourcePermissionsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeDataSourcePermissionsResult describeDataSourcePermissionsResult = new DescribeDataSourcePermissionsResult();

        describeDataSourcePermissionsResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataSourceArn")) {
                describeDataSourcePermissionsResult.setDataSourceArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSourceId")) {
                describeDataSourcePermissionsResult.setDataSourceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Permissions")) {
                describeDataSourcePermissionsResult
                        .setPermissions(new ListUnmarshaller<ResourcePermission>(
                                ResourcePermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RequestId")) {
                describeDataSourcePermissionsResult.setRequestId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeDataSourcePermissionsResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDataSourcePermissionsResult;
    }

    private static DescribeDataSourcePermissionsResultJsonUnmarshaller instance;

    public static DescribeDataSourcePermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDataSourcePermissionsResultJsonUnmarshaller();
        return instance;
    }
}
