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
 * JSON unmarshaller for POJO RouteTable
 */
class RouteTableJsonUnmarshaller implements Unmarshaller<RouteTable, JsonUnmarshallerContext> {

    public RouteTable unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RouteTable routeTable = new RouteTable();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Associations")) {
                routeTable.setAssociations(new ListUnmarshaller<RouteTableAssociation>(
                        RouteTableAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PropagatingVgws")) {
                routeTable.setPropagatingVgws(new ListUnmarshaller<PropagatingVgw>(
                        PropagatingVgwJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RouteTableId")) {
                routeTable.setRouteTableId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Routes")) {
                routeTable.setRoutes(new ListUnmarshaller<Route>(RouteJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                routeTable.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcId")) {
                routeTable.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                routeTable.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return routeTable;
    }

    private static RouteTableJsonUnmarshaller instance;

    public static RouteTableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteTableJsonUnmarshaller();
        return instance;
    }
}
