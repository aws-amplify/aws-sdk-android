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
 * JSON marshaller for POJO LocalGatewayRouteTable
 */
class LocalGatewayRouteTableJsonMarshaller {

    public void marshall(LocalGatewayRouteTable localGatewayRouteTable, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (localGatewayRouteTable.getLocalGatewayRouteTableId() != null) {
            String localGatewayRouteTableId = localGatewayRouteTable.getLocalGatewayRouteTableId();
            jsonWriter.name("LocalGatewayRouteTableId");
            jsonWriter.value(localGatewayRouteTableId);
        }
        if (localGatewayRouteTable.getLocalGatewayId() != null) {
            String localGatewayId = localGatewayRouteTable.getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (localGatewayRouteTable.getOutpostArn() != null) {
            String outpostArn = localGatewayRouteTable.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (localGatewayRouteTable.getState() != null) {
            String state = localGatewayRouteTable.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (localGatewayRouteTable.getTags() != null) {
            java.util.List<Tag> tags = localGatewayRouteTable.getTags();
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

    private static LocalGatewayRouteTableJsonMarshaller instance;

    public static LocalGatewayRouteTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableJsonMarshaller();
        return instance;
    }
}
