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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsEc2InstanceDetails
 */
class AwsEc2InstanceDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2InstanceDetails, JsonUnmarshallerContext> {

    public AwsEc2InstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsEc2InstanceDetails awsEc2InstanceDetails = new AwsEc2InstanceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                awsEc2InstanceDetails.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageId")) {
                awsEc2InstanceDetails.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpV4Addresses")) {
                awsEc2InstanceDetails.setIpV4Addresses(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IpV6Addresses")) {
                awsEc2InstanceDetails.setIpV6Addresses(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("KeyName")) {
                awsEc2InstanceDetails.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamInstanceProfileArn")) {
                awsEc2InstanceDetails.setIamInstanceProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                awsEc2InstanceDetails.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                awsEc2InstanceDetails.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchedAt")) {
                awsEc2InstanceDetails.setLaunchedAt(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsEc2InstanceDetails;
    }

    private static AwsEc2InstanceDetailsJsonUnmarshaller instance;

    public static AwsEc2InstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2InstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
