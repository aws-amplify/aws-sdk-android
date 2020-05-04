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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Subnet
 */
class SubnetJsonMarshaller {

    public void marshall(Subnet subnet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (subnet.getAvailabilityZone() != null) {
            String availabilityZone = subnet.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (subnet.getAvailabilityZoneId() != null) {
            String availabilityZoneId = subnet.getAvailabilityZoneId();
            jsonWriter.name("AvailabilityZoneId");
            jsonWriter.value(availabilityZoneId);
        }
        if (subnet.getAvailableIpAddressCount() != null) {
            Integer availableIpAddressCount = subnet.getAvailableIpAddressCount();
            jsonWriter.name("AvailableIpAddressCount");
            jsonWriter.value(availableIpAddressCount);
        }
        if (subnet.getCidrBlock() != null) {
            String cidrBlock = subnet.getCidrBlock();
            jsonWriter.name("CidrBlock");
            jsonWriter.value(cidrBlock);
        }
        if (subnet.getDefaultForAz() != null) {
            Boolean defaultForAz = subnet.getDefaultForAz();
            jsonWriter.name("DefaultForAz");
            jsonWriter.value(defaultForAz);
        }
        if (subnet.getMapPublicIpOnLaunch() != null) {
            Boolean mapPublicIpOnLaunch = subnet.getMapPublicIpOnLaunch();
            jsonWriter.name("MapPublicIpOnLaunch");
            jsonWriter.value(mapPublicIpOnLaunch);
        }
        if (subnet.getState() != null) {
            String state = subnet.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (subnet.getSubnetId() != null) {
            String subnetId = subnet.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (subnet.getVpcId() != null) {
            String vpcId = subnet.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (subnet.getOwnerId() != null) {
            String ownerId = subnet.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (subnet.getAssignIpv6AddressOnCreation() != null) {
            Boolean assignIpv6AddressOnCreation = subnet.getAssignIpv6AddressOnCreation();
            jsonWriter.name("AssignIpv6AddressOnCreation");
            jsonWriter.value(assignIpv6AddressOnCreation);
        }
        if (subnet.getIpv6CidrBlockAssociationSet() != null) {
            java.util.List<SubnetIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet = subnet
                    .getIpv6CidrBlockAssociationSet();
            jsonWriter.name("Ipv6CidrBlockAssociationSet");
            jsonWriter.beginArray();
            for (SubnetIpv6CidrBlockAssociation ipv6CidrBlockAssociationSetItem : ipv6CidrBlockAssociationSet) {
                if (ipv6CidrBlockAssociationSetItem != null) {
                    SubnetIpv6CidrBlockAssociationJsonMarshaller.getInstance().marshall(
                            ipv6CidrBlockAssociationSetItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (subnet.getTags() != null) {
            java.util.List<Tag> tags = subnet.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (subnet.getSubnetArn() != null) {
            String subnetArn = subnet.getSubnetArn();
            jsonWriter.name("SubnetArn");
            jsonWriter.value(subnetArn);
        }
        if (subnet.getOutpostArn() != null) {
            String outpostArn = subnet.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        jsonWriter.endObject();
    }

    private static SubnetJsonMarshaller instance;

    public static SubnetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubnetJsonMarshaller();
        return instance;
    }
}
