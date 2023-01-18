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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BlockReference
 */
class BlockReferenceJsonUnmarshaller implements
        Unmarshaller<BlockReference, JsonUnmarshallerContext> {

    public BlockReference unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BlockReference blockReference = new BlockReference();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BlockId")) {
                blockReference.setBlockId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                blockReference.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                blockReference.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChildBlocks")) {
                blockReference.setChildBlocks(new ListUnmarshaller<ChildBlock>(
                        ChildBlockJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return blockReference;
    }

    private static BlockReferenceJsonUnmarshaller instance;

    public static BlockReferenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlockReferenceJsonUnmarshaller();
        return instance;
    }
}
