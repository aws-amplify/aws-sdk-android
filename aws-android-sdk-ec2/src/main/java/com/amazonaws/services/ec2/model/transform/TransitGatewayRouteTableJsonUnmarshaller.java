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
 * JSON unmarshaller for POJO TransitGatewayRouteTable
 */
class TransitGatewayRouteTableJsonUnmarshaller implements
        Unmarshaller<TransitGatewayRouteTable, JsonUnmarshallerContext> {

    public TransitGatewayRouteTable unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitGatewayRouteTable transitGatewayRouteTable = new TransitGatewayRouteTable();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransitGatewayRouteTableId")) {
                transitGatewayRouteTable.setTransitGatewayRouteTableId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransitGatewayId")) {
                transitGatewayRouteTable.setTransitGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                transitGatewayRouteTable.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAssociationRouteTable")) {
                transitGatewayRouteTable.setDefaultAssociationRouteTable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultPropagationRouteTable")) {
                transitGatewayRouteTable.setDefaultPropagationRouteTable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                transitGatewayRouteTable.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                transitGatewayRouteTable.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitGatewayRouteTable;
    }

    private static TransitGatewayRouteTableJsonUnmarshaller instance;

    public static TransitGatewayRouteTableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteTableJsonUnmarshaller();
        return instance;
    }
}
