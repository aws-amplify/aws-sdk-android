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
 * JSON marshaller for POJO CoipPool
 */
class CoipPoolJsonMarshaller {

    public void marshall(CoipPool coipPool, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (coipPool.getPoolId() != null) {
            String poolId = coipPool.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        if (coipPool.getPoolCidrs() != null) {
            java.util.List<String> poolCidrs = coipPool.getPoolCidrs();
            jsonWriter.name("PoolCidrs");
            jsonWriter.beginArray();
            for (String poolCidrsItem : poolCidrs) {
                if (poolCidrsItem != null) {
                    jsonWriter.value(poolCidrsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (coipPool.getLocalGatewayRouteTableId() != null) {
            String localGatewayRouteTableId = coipPool.getLocalGatewayRouteTableId();
            jsonWriter.name("LocalGatewayRouteTableId");
            jsonWriter.value(localGatewayRouteTableId);
        }
        if (coipPool.getTags() != null) {
            java.util.List<Tag> tags = coipPool.getTags();
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

    private static CoipPoolJsonMarshaller instance;

    public static CoipPoolJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CoipPoolJsonMarshaller();
        return instance;
    }
}
