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
 * JSON marshaller for POJO SubnetIpv6CidrBlockAssociation
 */
class SubnetIpv6CidrBlockAssociationJsonMarshaller {

    public void marshall(SubnetIpv6CidrBlockAssociation subnetIpv6CidrBlockAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (subnetIpv6CidrBlockAssociation.getAssociationId() != null) {
            String associationId = subnetIpv6CidrBlockAssociation.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (subnetIpv6CidrBlockAssociation.getIpv6CidrBlock() != null) {
            String ipv6CidrBlock = subnetIpv6CidrBlockAssociation.getIpv6CidrBlock();
            jsonWriter.name("Ipv6CidrBlock");
            jsonWriter.value(ipv6CidrBlock);
        }
        if (subnetIpv6CidrBlockAssociation.getIpv6CidrBlockState() != null) {
            SubnetCidrBlockState ipv6CidrBlockState = subnetIpv6CidrBlockAssociation
                    .getIpv6CidrBlockState();
            jsonWriter.name("Ipv6CidrBlockState");
            SubnetCidrBlockStateJsonMarshaller.getInstance().marshall(ipv6CidrBlockState,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SubnetIpv6CidrBlockAssociationJsonMarshaller instance;

    public static SubnetIpv6CidrBlockAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubnetIpv6CidrBlockAssociationJsonMarshaller();
        return instance;
    }
}
