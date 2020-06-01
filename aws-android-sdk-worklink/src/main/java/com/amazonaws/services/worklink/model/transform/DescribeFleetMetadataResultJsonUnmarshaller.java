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

package com.amazonaws.services.worklink.model.transform;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeFleetMetadataResult
 */
public class DescribeFleetMetadataResultJsonUnmarshaller implements
        Unmarshaller<DescribeFleetMetadataResult, JsonUnmarshallerContext> {

    public DescribeFleetMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFleetMetadataResult describeFleetMetadataResult = new DescribeFleetMetadataResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedTime")) {
                describeFleetMetadataResult.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                describeFleetMetadataResult.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FleetName")) {
                describeFleetMetadataResult.setFleetName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                describeFleetMetadataResult.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OptimizeForEndUserLocation")) {
                describeFleetMetadataResult.setOptimizeForEndUserLocation(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompanyCode")) {
                describeFleetMetadataResult.setCompanyCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FleetStatus")) {
                describeFleetMetadataResult.setFleetStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeFleetMetadataResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeFleetMetadataResult;
    }

    private static DescribeFleetMetadataResultJsonUnmarshaller instance;

    public static DescribeFleetMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetMetadataResultJsonUnmarshaller();
        return instance;
    }
}
