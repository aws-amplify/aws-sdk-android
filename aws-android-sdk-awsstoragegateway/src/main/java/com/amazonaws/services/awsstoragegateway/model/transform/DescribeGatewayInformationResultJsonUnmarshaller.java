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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeGatewayInformationResult
 */
public class DescribeGatewayInformationResultJsonUnmarshaller implements
        Unmarshaller<DescribeGatewayInformationResult, JsonUnmarshallerContext> {

    public DescribeGatewayInformationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeGatewayInformationResult describeGatewayInformationResult = new DescribeGatewayInformationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GatewayARN")) {
                describeGatewayInformationResult.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayId")) {
                describeGatewayInformationResult.setGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayName")) {
                describeGatewayInformationResult.setGatewayName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayTimezone")) {
                describeGatewayInformationResult.setGatewayTimezone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayState")) {
                describeGatewayInformationResult.setGatewayState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayNetworkInterfaces")) {
                describeGatewayInformationResult
                        .setGatewayNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(
                                NetworkInterfaceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("GatewayType")) {
                describeGatewayInformationResult.setGatewayType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextUpdateAvailabilityDate")) {
                describeGatewayInformationResult
                        .setNextUpdateAvailabilityDate(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LastSoftwareUpdate")) {
                describeGatewayInformationResult.setLastSoftwareUpdate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2InstanceId")) {
                describeGatewayInformationResult.setEc2InstanceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2InstanceRegion")) {
                describeGatewayInformationResult.setEc2InstanceRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeGatewayInformationResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VPCEndpoint")) {
                describeGatewayInformationResult.setVPCEndpoint(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CloudWatchLogGroupARN")) {
                describeGatewayInformationResult.setCloudWatchLogGroupARN(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostEnvironment")) {
                describeGatewayInformationResult.setHostEnvironment(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeGatewayInformationResult;
    }

    private static DescribeGatewayInformationResultJsonUnmarshaller instance;

    public static DescribeGatewayInformationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGatewayInformationResultJsonUnmarshaller();
        return instance;
    }
}
