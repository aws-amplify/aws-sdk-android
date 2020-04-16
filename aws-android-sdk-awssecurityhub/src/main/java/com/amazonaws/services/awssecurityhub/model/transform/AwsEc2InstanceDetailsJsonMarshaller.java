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
 * JSON marshaller for POJO AwsEc2InstanceDetails
 */
class AwsEc2InstanceDetailsJsonMarshaller {

    public void marshall(AwsEc2InstanceDetails awsEc2InstanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsEc2InstanceDetails.getType() != null) {
            String type = awsEc2InstanceDetails.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (awsEc2InstanceDetails.getImageId() != null) {
            String imageId = awsEc2InstanceDetails.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (awsEc2InstanceDetails.getIpV4Addresses() != null) {
            java.util.List<String> ipV4Addresses = awsEc2InstanceDetails.getIpV4Addresses();
            jsonWriter.name("IpV4Addresses");
            jsonWriter.beginArray();
            for (String ipV4AddressesItem : ipV4Addresses) {
                if (ipV4AddressesItem != null) {
                    jsonWriter.value(ipV4AddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2InstanceDetails.getIpV6Addresses() != null) {
            java.util.List<String> ipV6Addresses = awsEc2InstanceDetails.getIpV6Addresses();
            jsonWriter.name("IpV6Addresses");
            jsonWriter.beginArray();
            for (String ipV6AddressesItem : ipV6Addresses) {
                if (ipV6AddressesItem != null) {
                    jsonWriter.value(ipV6AddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2InstanceDetails.getKeyName() != null) {
            String keyName = awsEc2InstanceDetails.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (awsEc2InstanceDetails.getIamInstanceProfileArn() != null) {
            String iamInstanceProfileArn = awsEc2InstanceDetails.getIamInstanceProfileArn();
            jsonWriter.name("IamInstanceProfileArn");
            jsonWriter.value(iamInstanceProfileArn);
        }
        if (awsEc2InstanceDetails.getVpcId() != null) {
            String vpcId = awsEc2InstanceDetails.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (awsEc2InstanceDetails.getSubnetId() != null) {
            String subnetId = awsEc2InstanceDetails.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (awsEc2InstanceDetails.getLaunchedAt() != null) {
            String launchedAt = awsEc2InstanceDetails.getLaunchedAt();
            jsonWriter.name("LaunchedAt");
            jsonWriter.value(launchedAt);
        }
        jsonWriter.endObject();
    }

    private static AwsEc2InstanceDetailsJsonMarshaller instance;

    public static AwsEc2InstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2InstanceDetailsJsonMarshaller();
        return instance;
    }
}
