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
 * JSON unmarshaller for POJO TransitGatewayRouteTableAssociation
 */
class TransitGatewayRouteTableAssociationJsonUnmarshaller implements
        Unmarshaller<TransitGatewayRouteTableAssociation, JsonUnmarshallerContext> {

    public TransitGatewayRouteTableAssociation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitGatewayRouteTableAssociation transitGatewayRouteTableAssociation = new TransitGatewayRouteTableAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransitGatewayAttachmentId")) {
                transitGatewayRouteTableAssociation
                        .setTransitGatewayAttachmentId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                transitGatewayRouteTableAssociation.setResourceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                transitGatewayRouteTableAssociation.setResourceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                transitGatewayRouteTableAssociation.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitGatewayRouteTableAssociation;
    }

    private static TransitGatewayRouteTableAssociationJsonUnmarshaller instance;

    public static TransitGatewayRouteTableAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteTableAssociationJsonUnmarshaller();
        return instance;
    }
}
