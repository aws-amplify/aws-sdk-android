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
 * JSON unmarshaller for POJO AwsElbv2LoadBalancerDetails
 */
class AwsElbv2LoadBalancerDetailsJsonUnmarshaller implements
        Unmarshaller<AwsElbv2LoadBalancerDetails, JsonUnmarshallerContext> {

    public AwsElbv2LoadBalancerDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsElbv2LoadBalancerDetails awsElbv2LoadBalancerDetails = new AwsElbv2LoadBalancerDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZones")) {
                awsElbv2LoadBalancerDetails
                        .setAvailabilityZones(new ListUnmarshaller<AvailabilityZone>(
                                AvailabilityZoneJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CanonicalHostedZoneId")) {
                awsElbv2LoadBalancerDetails.setCanonicalHostedZoneId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                awsElbv2LoadBalancerDetails.setCreatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DNSName")) {
                awsElbv2LoadBalancerDetails.setDNSName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpAddressType")) {
                awsElbv2LoadBalancerDetails.setIpAddressType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scheme")) {
                awsElbv2LoadBalancerDetails.setScheme(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                awsElbv2LoadBalancerDetails.setSecurityGroups(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("State")) {
                awsElbv2LoadBalancerDetails.setState(LoadBalancerStateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                awsElbv2LoadBalancerDetails.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                awsElbv2LoadBalancerDetails.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsElbv2LoadBalancerDetails;
    }

    private static AwsElbv2LoadBalancerDetailsJsonUnmarshaller instance;

    public static AwsElbv2LoadBalancerDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElbv2LoadBalancerDetailsJsonUnmarshaller();
        return instance;
    }
}
