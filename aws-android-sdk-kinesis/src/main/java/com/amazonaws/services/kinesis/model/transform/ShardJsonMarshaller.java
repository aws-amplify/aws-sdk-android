/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Shard
 */
class ShardJsonMarshaller {

    public void marshall(Shard shard, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (shard.getShardId() != null) {
            String shardId = shard.getShardId();
            jsonWriter.name("ShardId");
            jsonWriter.value(shardId);
        }
        if (shard.getParentShardId() != null) {
            String parentShardId = shard.getParentShardId();
            jsonWriter.name("ParentShardId");
            jsonWriter.value(parentShardId);
        }
        if (shard.getAdjacentParentShardId() != null) {
            String adjacentParentShardId = shard.getAdjacentParentShardId();
            jsonWriter.name("AdjacentParentShardId");
            jsonWriter.value(adjacentParentShardId);
        }
        if (shard.getHashKeyRange() != null) {
            HashKeyRange hashKeyRange = shard.getHashKeyRange();
            jsonWriter.name("HashKeyRange");
            HashKeyRangeJsonMarshaller.getInstance().marshall(hashKeyRange, jsonWriter);
        }
        if (shard.getSequenceNumberRange() != null) {
            SequenceNumberRange sequenceNumberRange = shard.getSequenceNumberRange();
            jsonWriter.name("SequenceNumberRange");
            SequenceNumberRangeJsonMarshaller.getInstance().marshall(sequenceNumberRange,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ShardJsonMarshaller instance;

    public static ShardJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ShardJsonMarshaller();
        return instance;
    }
}
