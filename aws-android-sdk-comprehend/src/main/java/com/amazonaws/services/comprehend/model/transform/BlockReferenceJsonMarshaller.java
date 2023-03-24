/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlockReference
 */
class BlockReferenceJsonMarshaller {

    public void marshall(BlockReference blockReference, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blockReference.getBlockId() != null) {
            String blockId = blockReference.getBlockId();
            jsonWriter.name("BlockId");
            jsonWriter.value(blockId);
        }
        if (blockReference.getBeginOffset() != null) {
            Integer beginOffset = blockReference.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (blockReference.getEndOffset() != null) {
            Integer endOffset = blockReference.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (blockReference.getChildBlocks() != null) {
            java.util.List<ChildBlock> childBlocks = blockReference.getChildBlocks();
            jsonWriter.name("ChildBlocks");
            jsonWriter.beginArray();
            for (ChildBlock childBlocksItem : childBlocks) {
                if (childBlocksItem != null) {
                    ChildBlockJsonMarshaller.getInstance().marshall(childBlocksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BlockReferenceJsonMarshaller instance;

    public static BlockReferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlockReferenceJsonMarshaller();
        return instance;
    }
}
