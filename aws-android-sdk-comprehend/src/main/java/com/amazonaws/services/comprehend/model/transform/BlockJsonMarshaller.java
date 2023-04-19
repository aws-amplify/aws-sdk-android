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
 * JSON marshaller for POJO Block
 */
class BlockJsonMarshaller {

    public void marshall(Block block, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (block.getId() != null) {
            String id = block.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (block.getBlockType() != null) {
            String blockType = block.getBlockType();
            jsonWriter.name("BlockType");
            jsonWriter.value(blockType);
        }
        if (block.getText() != null) {
            String text = block.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (block.getPage() != null) {
            Integer page = block.getPage();
            jsonWriter.name("Page");
            jsonWriter.value(page);
        }
        if (block.getGeometry() != null) {
            Geometry geometry = block.getGeometry();
            jsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (block.getRelationships() != null) {
            java.util.List<RelationshipsListItem> relationships = block.getRelationships();
            jsonWriter.name("Relationships");
            jsonWriter.beginArray();
            for (RelationshipsListItem relationshipsItem : relationships) {
                if (relationshipsItem != null) {
                    RelationshipsListItemJsonMarshaller.getInstance().marshall(relationshipsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BlockJsonMarshaller instance;

    public static BlockJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlockJsonMarshaller();
        return instance;
    }
}
