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
 * JSON marshaller for POJO TransitGatewayRouteTable
 */
class TransitGatewayRouteTableJsonMarshaller {

    public void marshall(TransitGatewayRouteTable transitGatewayRouteTable, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayRouteTable.getTransitGatewayRouteTableId() != null) {
            String transitGatewayRouteTableId = transitGatewayRouteTable
                    .getTransitGatewayRouteTableId();
            jsonWriter.name("TransitGatewayRouteTableId");
            jsonWriter.value(transitGatewayRouteTableId);
        }
        if (transitGatewayRouteTable.getTransitGatewayId() != null) {
            String transitGatewayId = transitGatewayRouteTable.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (transitGatewayRouteTable.getState() != null) {
            String state = transitGatewayRouteTable.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (transitGatewayRouteTable.getDefaultAssociationRouteTable() != null) {
            Boolean defaultAssociationRouteTable = transitGatewayRouteTable
                    .getDefaultAssociationRouteTable();
            jsonWriter.name("DefaultAssociationRouteTable");
            jsonWriter.value(defaultAssociationRouteTable);
        }
        if (transitGatewayRouteTable.getDefaultPropagationRouteTable() != null) {
            Boolean defaultPropagationRouteTable = transitGatewayRouteTable
                    .getDefaultPropagationRouteTable();
            jsonWriter.name("DefaultPropagationRouteTable");
            jsonWriter.value(defaultPropagationRouteTable);
        }
        if (transitGatewayRouteTable.getCreationTime() != null) {
            java.util.Date creationTime = transitGatewayRouteTable.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transitGatewayRouteTable.getTags() != null) {
            java.util.List<Tag> tags = transitGatewayRouteTable.getTags();
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

    private static TransitGatewayRouteTableJsonMarshaller instance;

    public static TransitGatewayRouteTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteTableJsonMarshaller();
        return instance;
    }
}
