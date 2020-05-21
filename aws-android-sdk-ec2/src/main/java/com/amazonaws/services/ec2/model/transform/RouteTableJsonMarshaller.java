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
 * JSON marshaller for POJO RouteTable
 */
class RouteTableJsonMarshaller {

    public void marshall(RouteTable routeTable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routeTable.getAssociations() != null) {
            java.util.List<RouteTableAssociation> associations = routeTable.getAssociations();
            jsonWriter.name("Associations");
            jsonWriter.beginArray();
            for (RouteTableAssociation associationsItem : associations) {
                if (associationsItem != null) {
                    RouteTableAssociationJsonMarshaller.getInstance().marshall(associationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routeTable.getPropagatingVgws() != null) {
            java.util.List<PropagatingVgw> propagatingVgws = routeTable.getPropagatingVgws();
            jsonWriter.name("PropagatingVgws");
            jsonWriter.beginArray();
            for (PropagatingVgw propagatingVgwsItem : propagatingVgws) {
                if (propagatingVgwsItem != null) {
                    PropagatingVgwJsonMarshaller.getInstance().marshall(propagatingVgwsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routeTable.getRouteTableId() != null) {
            String routeTableId = routeTable.getRouteTableId();
            jsonWriter.name("RouteTableId");
            jsonWriter.value(routeTableId);
        }
        if (routeTable.getRoutes() != null) {
            java.util.List<Route> routes = routeTable.getRoutes();
            jsonWriter.name("Routes");
            jsonWriter.beginArray();
            for (Route routesItem : routes) {
                if (routesItem != null) {
                    RouteJsonMarshaller.getInstance().marshall(routesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routeTable.getTags() != null) {
            java.util.List<Tag> tags = routeTable.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routeTable.getVpcId() != null) {
            String vpcId = routeTable.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (routeTable.getOwnerId() != null) {
            String ownerId = routeTable.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        jsonWriter.endObject();
    }

    private static RouteTableJsonMarshaller instance;

    public static RouteTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteTableJsonMarshaller();
        return instance;
    }
}
