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
 * JSON unmarshaller for response DescribeInstanceAttributeResult
 */
public class DescribeInstanceAttributeResultJsonUnmarshaller implements
        Unmarshaller<DescribeInstanceAttributeResult, JsonUnmarshallerContext> {

    public DescribeInstanceAttributeResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeInstanceAttributeResult describeInstanceAttributeResult = new DescribeInstanceAttributeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Groups")) {
                describeInstanceAttributeResult.setGroups(new ListUnmarshaller<GroupIdentifier>(
                        GroupIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                describeInstanceAttributeResult
                        .setBlockDeviceMappings(new ListUnmarshaller<InstanceBlockDeviceMapping>(
                                InstanceBlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DisableApiTermination")) {
                describeInstanceAttributeResult
                        .setDisableApiTermination(AttributeBooleanValueJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EnaSupport")) {
                describeInstanceAttributeResult.setEnaSupport(AttributeBooleanValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                describeInstanceAttributeResult
                        .setEbsOptimized(AttributeBooleanValueJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                describeInstanceAttributeResult.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceInitiatedShutdownBehavior")) {
                describeInstanceAttributeResult
                        .setInstanceInitiatedShutdownBehavior(AttributeValueJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                describeInstanceAttributeResult.setInstanceType(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                describeInstanceAttributeResult.setKernelId(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductCodes")) {
                describeInstanceAttributeResult.setProductCodes(new ListUnmarshaller<ProductCode>(
                        ProductCodeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                describeInstanceAttributeResult.setRamdiskId(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDeviceName")) {
                describeInstanceAttributeResult.setRootDeviceName(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceDestCheck")) {
                describeInstanceAttributeResult
                        .setSourceDestCheck(AttributeBooleanValueJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SriovNetSupport")) {
                describeInstanceAttributeResult.setSriovNetSupport(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserData")) {
                describeInstanceAttributeResult.setUserData(AttributeValueJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeInstanceAttributeResult;
    }

    private static DescribeInstanceAttributeResultJsonUnmarshaller instance;

    public static DescribeInstanceAttributeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInstanceAttributeResultJsonUnmarshaller();
        return instance;
    }
}
