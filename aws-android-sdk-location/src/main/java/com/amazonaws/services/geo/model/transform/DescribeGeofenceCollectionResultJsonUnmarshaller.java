/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeGeofenceCollectionResult
 */
public class DescribeGeofenceCollectionResultJsonUnmarshaller implements
        Unmarshaller<DescribeGeofenceCollectionResult, JsonUnmarshallerContext> {

    public DescribeGeofenceCollectionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeGeofenceCollectionResult describeGeofenceCollectionResult = new DescribeGeofenceCollectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CollectionArn")) {
                describeGeofenceCollectionResult.setCollectionArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CollectionName")) {
                describeGeofenceCollectionResult.setCollectionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                describeGeofenceCollectionResult.setCreateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                describeGeofenceCollectionResult.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                describeGeofenceCollectionResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingPlan")) {
                describeGeofenceCollectionResult.setPricingPlan(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PricingPlanDataSource")) {
                describeGeofenceCollectionResult.setPricingPlanDataSource(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeGeofenceCollectionResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                describeGeofenceCollectionResult.setUpdateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeGeofenceCollectionResult;
    }

    private static DescribeGeofenceCollectionResultJsonUnmarshaller instance;

    public static DescribeGeofenceCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGeofenceCollectionResultJsonUnmarshaller();
        return instance;
    }
}
