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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO
 * LocalGatewayRouteTableVirtualInterfaceGroupAssociation
 */
class LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonUnmarshaller
        implements
        Unmarshaller<LocalGatewayRouteTableVirtualInterfaceGroupAssociation, JsonUnmarshallerContext> {

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation unmarshall(
            JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LocalGatewayRouteTableVirtualInterfaceGroupAssociation localGatewayRouteTableVirtualInterfaceGroupAssociation = new LocalGatewayRouteTableVirtualInterfaceGroupAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId")) {
                localGatewayRouteTableVirtualInterfaceGroupAssociation
                        .setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LocalGatewayVirtualInterfaceGroupId")) {
                localGatewayRouteTableVirtualInterfaceGroupAssociation
                        .setLocalGatewayVirtualInterfaceGroupId(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LocalGatewayId")) {
                localGatewayRouteTableVirtualInterfaceGroupAssociation
                        .setLocalGatewayId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LocalGatewayRouteTableId")) {
                localGatewayRouteTableVirtualInterfaceGroupAssociation
                        .setLocalGatewayRouteTableId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("State")) {
                localGatewayRouteTableVirtualInterfaceGroupAssociation
                        .setState(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                localGatewayRouteTableVirtualInterfaceGroupAssociation
                        .setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return localGatewayRouteTableVirtualInterfaceGroupAssociation;
    }

    private static LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonUnmarshaller instance;

    public static LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableVirtualInterfaceGroupAssociationJsonUnmarshaller();
        return instance;
    }
}
