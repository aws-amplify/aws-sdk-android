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
 * JSON unmarshaller for POJO LocalGatewayRouteTable
 */
class LocalGatewayRouteTableJsonUnmarshaller implements
        Unmarshaller<LocalGatewayRouteTable, JsonUnmarshallerContext> {

    public LocalGatewayRouteTable unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LocalGatewayRouteTable localGatewayRouteTable = new LocalGatewayRouteTable();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LocalGatewayRouteTableId")) {
                localGatewayRouteTable.setLocalGatewayRouteTableId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalGatewayId")) {
                localGatewayRouteTable.setLocalGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                localGatewayRouteTable.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                localGatewayRouteTable.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                localGatewayRouteTable.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return localGatewayRouteTable;
    }

    private static LocalGatewayRouteTableJsonUnmarshaller instance;

    public static LocalGatewayRouteTableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableJsonUnmarshaller();
        return instance;
    }
}
