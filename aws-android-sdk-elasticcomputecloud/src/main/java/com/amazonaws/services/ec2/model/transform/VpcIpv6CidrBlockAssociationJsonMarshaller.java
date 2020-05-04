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
 * JSON marshaller for POJO VpcIpv6CidrBlockAssociation
 */
class VpcIpv6CidrBlockAssociationJsonMarshaller {

    public void marshall(VpcIpv6CidrBlockAssociation vpcIpv6CidrBlockAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcIpv6CidrBlockAssociation.getAssociationId() != null) {
            String associationId = vpcIpv6CidrBlockAssociation.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (vpcIpv6CidrBlockAssociation.getIpv6CidrBlock() != null) {
            String ipv6CidrBlock = vpcIpv6CidrBlockAssociation.getIpv6CidrBlock();
            jsonWriter.name("Ipv6CidrBlock");
            jsonWriter.value(ipv6CidrBlock);
        }
        if (vpcIpv6CidrBlockAssociation.getIpv6CidrBlockState() != null) {
            VpcCidrBlockState ipv6CidrBlockState = vpcIpv6CidrBlockAssociation
                    .getIpv6CidrBlockState();
            jsonWriter.name("Ipv6CidrBlockState");
            VpcCidrBlockStateJsonMarshaller.getInstance().marshall(ipv6CidrBlockState, jsonWriter);
        }
        if (vpcIpv6CidrBlockAssociation.getNetworkBorderGroup() != null) {
            String networkBorderGroup = vpcIpv6CidrBlockAssociation.getNetworkBorderGroup();
            jsonWriter.name("NetworkBorderGroup");
            jsonWriter.value(networkBorderGroup);
        }
        if (vpcIpv6CidrBlockAssociation.getIpv6Pool() != null) {
            String ipv6Pool = vpcIpv6CidrBlockAssociation.getIpv6Pool();
            jsonWriter.name("Ipv6Pool");
            jsonWriter.value(ipv6Pool);
        }
        jsonWriter.endObject();
    }

    private static VpcIpv6CidrBlockAssociationJsonMarshaller instance;

    public static VpcIpv6CidrBlockAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcIpv6CidrBlockAssociationJsonMarshaller();
        return instance;
    }
}
