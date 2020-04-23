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

package com.amazonaws.services.awselementalmediapackagevod.model.transform;

import com.amazonaws.services.awselementalmediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribePackagingConfigurationResult
 */
public class DescribePackagingConfigurationResultJsonUnmarshaller implements
        Unmarshaller<DescribePackagingConfigurationResult, JsonUnmarshallerContext> {

    public DescribePackagingConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribePackagingConfigurationResult describePackagingConfigurationResult = new DescribePackagingConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describePackagingConfigurationResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CmafPackage")) {
                describePackagingConfigurationResult.setCmafPackage(CmafPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DashPackage")) {
                describePackagingConfigurationResult.setDashPackage(DashPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HlsPackage")) {
                describePackagingConfigurationResult.setHlsPackage(HlsPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                describePackagingConfigurationResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MssPackage")) {
                describePackagingConfigurationResult.setMssPackage(MssPackageJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackagingGroupId")) {
                describePackagingConfigurationResult.setPackagingGroupId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describePackagingConfigurationResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describePackagingConfigurationResult;
    }

    private static DescribePackagingConfigurationResultJsonUnmarshaller instance;

    public static DescribePackagingConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePackagingConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
