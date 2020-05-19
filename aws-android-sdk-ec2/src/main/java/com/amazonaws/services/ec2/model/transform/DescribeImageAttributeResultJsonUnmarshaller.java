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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeImageAttributeResult
 */
public class DescribeImageAttributeResultJsonUnmarshaller implements
        Unmarshaller<DescribeImageAttributeResult, JsonUnmarshallerContext> {

    public DescribeImageAttributeResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeImageAttributeResult describeImageAttributeResult = new DescribeImageAttributeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BlockDeviceMappings")) {
                describeImageAttributeResult
                        .setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(
                                BlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ImageId")) {
                describeImageAttributeResult.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchPermissions")) {
                describeImageAttributeResult
                        .setLaunchPermissions(new ListUnmarshaller<LaunchPermission>(
                                LaunchPermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProductCodes")) {
                describeImageAttributeResult.setProductCodes(new ListUnmarshaller<ProductCode>(
                        ProductCodeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                describeImageAttributeResult.setDescription(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                describeImageAttributeResult.setKernelId(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                describeImageAttributeResult.setRamdiskId(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SriovNetSupport")) {
                describeImageAttributeResult.setSriovNetSupport(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeImageAttributeResult;
    }

    private static DescribeImageAttributeResultJsonUnmarshaller instance;

    public static DescribeImageAttributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeImageAttributeResultJsonUnmarshaller();
        return instance;
    }
}
