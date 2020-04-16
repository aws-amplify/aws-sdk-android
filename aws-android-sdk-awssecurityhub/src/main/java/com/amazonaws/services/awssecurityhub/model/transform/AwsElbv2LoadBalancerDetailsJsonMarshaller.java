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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsElbv2LoadBalancerDetails
 */
class AwsElbv2LoadBalancerDetailsJsonMarshaller {

    public void marshall(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancerDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsElbv2LoadBalancerDetails.getAvailabilityZones() != null) {
            java.util.List<AvailabilityZone> availabilityZones = awsElbv2LoadBalancerDetails
                    .getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (AvailabilityZone availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    AvailabilityZoneJsonMarshaller.getInstance().marshall(availabilityZonesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsElbv2LoadBalancerDetails.getCanonicalHostedZoneId() != null) {
            String canonicalHostedZoneId = awsElbv2LoadBalancerDetails.getCanonicalHostedZoneId();
            jsonWriter.name("CanonicalHostedZoneId");
            jsonWriter.value(canonicalHostedZoneId);
        }
        if (awsElbv2LoadBalancerDetails.getCreatedTime() != null) {
            String createdTime = awsElbv2LoadBalancerDetails.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (awsElbv2LoadBalancerDetails.getDNSName() != null) {
            String dNSName = awsElbv2LoadBalancerDetails.getDNSName();
            jsonWriter.name("DNSName");
            jsonWriter.value(dNSName);
        }
        if (awsElbv2LoadBalancerDetails.getIpAddressType() != null) {
            String ipAddressType = awsElbv2LoadBalancerDetails.getIpAddressType();
            jsonWriter.name("IpAddressType");
            jsonWriter.value(ipAddressType);
        }
        if (awsElbv2LoadBalancerDetails.getScheme() != null) {
            String scheme = awsElbv2LoadBalancerDetails.getScheme();
            jsonWriter.name("Scheme");
            jsonWriter.value(scheme);
        }
        if (awsElbv2LoadBalancerDetails.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = awsElbv2LoadBalancerDetails.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsElbv2LoadBalancerDetails.getState() != null) {
            LoadBalancerState state = awsElbv2LoadBalancerDetails.getState();
            jsonWriter.name("State");
            LoadBalancerStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (awsElbv2LoadBalancerDetails.getType() != null) {
            String type = awsElbv2LoadBalancerDetails.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (awsElbv2LoadBalancerDetails.getVpcId() != null) {
            String vpcId = awsElbv2LoadBalancerDetails.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static AwsElbv2LoadBalancerDetailsJsonMarshaller instance;

    public static AwsElbv2LoadBalancerDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsElbv2LoadBalancerDetailsJsonMarshaller();
        return instance;
    }
}
