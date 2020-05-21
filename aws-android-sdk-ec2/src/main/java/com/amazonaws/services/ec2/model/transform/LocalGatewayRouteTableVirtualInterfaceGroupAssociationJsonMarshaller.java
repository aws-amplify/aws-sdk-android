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
 * JSON marshaller for POJO
 * LocalGatewayRouteTableVirtualInterfaceGroupAssociation
 */
class LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonMarshaller {

    public void marshall(
            LocalGatewayRouteTableVirtualInterfaceGroupAssociation localGatewayRouteTableVirtualInterfaceGroupAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (localGatewayRouteTableVirtualInterfaceGroupAssociation
                .getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() != null) {
            String localGatewayRouteTableVirtualInterfaceGroupAssociationId = localGatewayRouteTableVirtualInterfaceGroupAssociation
                    .getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId();
            jsonWriter.name("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId");
            jsonWriter.value(localGatewayRouteTableVirtualInterfaceGroupAssociationId);
        }
        if (localGatewayRouteTableVirtualInterfaceGroupAssociation
                .getLocalGatewayVirtualInterfaceGroupId() != null) {
            String localGatewayVirtualInterfaceGroupId = localGatewayRouteTableVirtualInterfaceGroupAssociation
                    .getLocalGatewayVirtualInterfaceGroupId();
            jsonWriter.name("LocalGatewayVirtualInterfaceGroupId");
            jsonWriter.value(localGatewayVirtualInterfaceGroupId);
        }
        if (localGatewayRouteTableVirtualInterfaceGroupAssociation.getLocalGatewayId() != null) {
            String localGatewayId = localGatewayRouteTableVirtualInterfaceGroupAssociation
                    .getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (localGatewayRouteTableVirtualInterfaceGroupAssociation.getLocalGatewayRouteTableId() != null) {
            String localGatewayRouteTableId = localGatewayRouteTableVirtualInterfaceGroupAssociation
                    .getLocalGatewayRouteTableId();
            jsonWriter.name("LocalGatewayRouteTableId");
            jsonWriter.value(localGatewayRouteTableId);
        }
        if (localGatewayRouteTableVirtualInterfaceGroupAssociation.getState() != null) {
            String state = localGatewayRouteTableVirtualInterfaceGroupAssociation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (localGatewayRouteTableVirtualInterfaceGroupAssociation.getTags() != null) {
            java.util.List<Tag> tags = localGatewayRouteTableVirtualInterfaceGroupAssociation
                    .getTags();
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

    private static LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonMarshaller instance;

    public static LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonMarshaller();
        return instance;
    }
}
