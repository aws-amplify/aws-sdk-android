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
 * JSON marshaller for POJO Vpc
 */
class VpcJsonMarshaller {

    public void marshall(Vpc vpc, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpc.getCidrBlock() != null) {
            String cidrBlock = vpc.getCidrBlock();
            jsonWriter.name("CidrBlock");
            jsonWriter.value(cidrBlock);
        }
        if (vpc.getDhcpOptionsId() != null) {
            String dhcpOptionsId = vpc.getDhcpOptionsId();
            jsonWriter.name("DhcpOptionsId");
            jsonWriter.value(dhcpOptionsId);
        }
        if (vpc.getState() != null) {
            String state = vpc.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vpc.getVpcId() != null) {
            String vpcId = vpc.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (vpc.getOwnerId() != null) {
            String ownerId = vpc.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (vpc.getInstanceTenancy() != null) {
            String instanceTenancy = vpc.getInstanceTenancy();
            jsonWriter.name("InstanceTenancy");
            jsonWriter.value(instanceTenancy);
        }
        if (vpc.getIpv6CidrBlockAssociationSet() != null) {
            java.util.List<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet = vpc
                    .getIpv6CidrBlockAssociationSet();
            jsonWriter.name("Ipv6CidrBlockAssociationSet");
            jsonWriter.beginArray();
            for (VpcIpv6CidrBlockAssociation ipv6CidrBlockAssociationSetItem : ipv6CidrBlockAssociationSet) {
                if (ipv6CidrBlockAssociationSetItem != null) {
                    VpcIpv6CidrBlockAssociationJsonMarshaller.getInstance().marshall(
                            ipv6CidrBlockAssociationSetItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpc.getCidrBlockAssociationSet() != null) {
            java.util.List<VpcCidrBlockAssociation> cidrBlockAssociationSet = vpc
                    .getCidrBlockAssociationSet();
            jsonWriter.name("CidrBlockAssociationSet");
            jsonWriter.beginArray();
            for (VpcCidrBlockAssociation cidrBlockAssociationSetItem : cidrBlockAssociationSet) {
                if (cidrBlockAssociationSetItem != null) {
                    VpcCidrBlockAssociationJsonMarshaller.getInstance().marshall(
                            cidrBlockAssociationSetItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpc.getIsDefault() != null) {
            Boolean isDefault = vpc.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        if (vpc.getTags() != null) {
            java.util.List<Tag> tags = vpc.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VpcJsonMarshaller instance;

    public static VpcJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcJsonMarshaller();
        return instance;
    }
}
