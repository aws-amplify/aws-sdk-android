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
 * JSON marshaller for POJO VpcPeeringConnectionVpcInfo
 */
class VpcPeeringConnectionVpcInfoJsonMarshaller {

    public void marshall(VpcPeeringConnectionVpcInfo vpcPeeringConnectionVpcInfo,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcPeeringConnectionVpcInfo.getCidrBlock() != null) {
            String cidrBlock = vpcPeeringConnectionVpcInfo.getCidrBlock();
            jsonWriter.name("CidrBlock");
            jsonWriter.value(cidrBlock);
        }
        if (vpcPeeringConnectionVpcInfo.getIpv6CidrBlockSet() != null) {
            java.util.List<Ipv6CidrBlock> ipv6CidrBlockSet = vpcPeeringConnectionVpcInfo
                    .getIpv6CidrBlockSet();
            jsonWriter.name("Ipv6CidrBlockSet");
            jsonWriter.beginArray();
            for (Ipv6CidrBlock ipv6CidrBlockSetItem : ipv6CidrBlockSet) {
                if (ipv6CidrBlockSetItem != null) {
                    Ipv6CidrBlockJsonMarshaller.getInstance().marshall(ipv6CidrBlockSetItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcPeeringConnectionVpcInfo.getCidrBlockSet() != null) {
            java.util.List<CidrBlock> cidrBlockSet = vpcPeeringConnectionVpcInfo.getCidrBlockSet();
            jsonWriter.name("CidrBlockSet");
            jsonWriter.beginArray();
            for (CidrBlock cidrBlockSetItem : cidrBlockSet) {
                if (cidrBlockSetItem != null) {
                    CidrBlockJsonMarshaller.getInstance().marshall(cidrBlockSetItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcPeeringConnectionVpcInfo.getOwnerId() != null) {
            String ownerId = vpcPeeringConnectionVpcInfo.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (vpcPeeringConnectionVpcInfo.getPeeringOptions() != null) {
            VpcPeeringConnectionOptionsDescription peeringOptions = vpcPeeringConnectionVpcInfo
                    .getPeeringOptions();
            jsonWriter.name("PeeringOptions");
            VpcPeeringConnectionOptionsDescriptionJsonMarshaller.getInstance().marshall(
                    peeringOptions, jsonWriter);
        }
        if (vpcPeeringConnectionVpcInfo.getVpcId() != null) {
            String vpcId = vpcPeeringConnectionVpcInfo.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (vpcPeeringConnectionVpcInfo.getRegion() != null) {
            String region = vpcPeeringConnectionVpcInfo.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        jsonWriter.endObject();
    }

    private static VpcPeeringConnectionVpcInfoJsonMarshaller instance;

    public static VpcPeeringConnectionVpcInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcPeeringConnectionVpcInfoJsonMarshaller();
        return instance;
    }
}
