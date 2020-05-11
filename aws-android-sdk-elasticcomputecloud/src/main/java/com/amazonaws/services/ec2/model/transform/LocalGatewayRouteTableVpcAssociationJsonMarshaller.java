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
 * JSON marshaller for POJO LocalGatewayRouteTableVpcAssociation
 */
class LocalGatewayRouteTableVpcAssociationJsonMarshaller {

    public void marshall(LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (localGatewayRouteTableVpcAssociation.getLocalGatewayRouteTableVpcAssociationId() != null) {
            String localGatewayRouteTableVpcAssociationId = localGatewayRouteTableVpcAssociation
                    .getLocalGatewayRouteTableVpcAssociationId();
            jsonWriter.name("LocalGatewayRouteTableVpcAssociationId");
            jsonWriter.value(localGatewayRouteTableVpcAssociationId);
        }
        if (localGatewayRouteTableVpcAssociation.getLocalGatewayRouteTableId() != null) {
            String localGatewayRouteTableId = localGatewayRouteTableVpcAssociation
                    .getLocalGatewayRouteTableId();
            jsonWriter.name("LocalGatewayRouteTableId");
            jsonWriter.value(localGatewayRouteTableId);
        }
        if (localGatewayRouteTableVpcAssociation.getLocalGatewayId() != null) {
            String localGatewayId = localGatewayRouteTableVpcAssociation.getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (localGatewayRouteTableVpcAssociation.getVpcId() != null) {
            String vpcId = localGatewayRouteTableVpcAssociation.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (localGatewayRouteTableVpcAssociation.getState() != null) {
            String state = localGatewayRouteTableVpcAssociation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (localGatewayRouteTableVpcAssociation.getTags() != null) {
            java.util.List<Tag> tags = localGatewayRouteTableVpcAssociation.getTags();
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

    private static LocalGatewayRouteTableVpcAssociationJsonMarshaller instance;

    public static LocalGatewayRouteTableVpcAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableVpcAssociationJsonMarshaller();
        return instance;
    }
}
