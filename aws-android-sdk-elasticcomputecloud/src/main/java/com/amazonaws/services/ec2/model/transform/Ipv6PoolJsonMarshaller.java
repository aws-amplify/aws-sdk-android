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
 * JSON marshaller for POJO Ipv6Pool
 */
class Ipv6PoolJsonMarshaller {

    public void marshall(Ipv6Pool ipv6Pool, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipv6Pool.getPoolId() != null) {
            String poolId = ipv6Pool.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        if (ipv6Pool.getDescription() != null) {
            String description = ipv6Pool.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (ipv6Pool.getPoolCidrBlocks() != null) {
            java.util.List<PoolCidrBlock> poolCidrBlocks = ipv6Pool.getPoolCidrBlocks();
            jsonWriter.name("PoolCidrBlocks");
            jsonWriter.beginArray();
            for (PoolCidrBlock poolCidrBlocksItem : poolCidrBlocks) {
                if (poolCidrBlocksItem != null) {
                    PoolCidrBlockJsonMarshaller.getInstance().marshall(poolCidrBlocksItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (ipv6Pool.getTags() != null) {
            java.util.List<Tag> tags = ipv6Pool.getTags();
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

    private static Ipv6PoolJsonMarshaller instance;

    public static Ipv6PoolJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ipv6PoolJsonMarshaller();
        return instance;
    }
}
