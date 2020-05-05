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
 * JSON marshaller for POJO PublicIpv4Pool
 */
class PublicIpv4PoolJsonMarshaller {

    public void marshall(PublicIpv4Pool publicIpv4Pool, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (publicIpv4Pool.getPoolId() != null) {
            String poolId = publicIpv4Pool.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        if (publicIpv4Pool.getDescription() != null) {
            String description = publicIpv4Pool.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (publicIpv4Pool.getPoolAddressRanges() != null) {
            java.util.List<PublicIpv4PoolRange> poolAddressRanges = publicIpv4Pool
                    .getPoolAddressRanges();
            jsonWriter.name("PoolAddressRanges");
            jsonWriter.beginArray();
            for (PublicIpv4PoolRange poolAddressRangesItem : poolAddressRanges) {
                if (poolAddressRangesItem != null) {
                    PublicIpv4PoolRangeJsonMarshaller.getInstance().marshall(poolAddressRangesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (publicIpv4Pool.getTotalAddressCount() != null) {
            Integer totalAddressCount = publicIpv4Pool.getTotalAddressCount();
            jsonWriter.name("TotalAddressCount");
            jsonWriter.value(totalAddressCount);
        }
        if (publicIpv4Pool.getTotalAvailableAddressCount() != null) {
            Integer totalAvailableAddressCount = publicIpv4Pool.getTotalAvailableAddressCount();
            jsonWriter.name("TotalAvailableAddressCount");
            jsonWriter.value(totalAvailableAddressCount);
        }
        if (publicIpv4Pool.getTags() != null) {
            java.util.List<Tag> tags = publicIpv4Pool.getTags();
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

    private static PublicIpv4PoolJsonMarshaller instance;

    public static PublicIpv4PoolJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PublicIpv4PoolJsonMarshaller();
        return instance;
    }
}
