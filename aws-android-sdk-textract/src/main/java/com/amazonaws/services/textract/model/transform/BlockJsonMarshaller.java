/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Block
 */
class BlockJsonMarshaller {

    public void marshall(Block block, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (block.getBlockType() != null) {
            String blockType = block.getBlockType();
            jsonWriter.name("BlockType");
            jsonWriter.value(blockType);
        }
        if (block.getConfidence() != null) {
            Float confidence = block.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (block.getText() != null) {
            String text = block.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (block.getTextType() != null) {
            String textType = block.getTextType();
            jsonWriter.name("TextType");
            jsonWriter.value(textType);
        }
        if (block.getRowIndex() != null) {
            Integer rowIndex = block.getRowIndex();
            jsonWriter.name("RowIndex");
            jsonWriter.value(rowIndex);
        }
        if (block.getColumnIndex() != null) {
            Integer columnIndex = block.getColumnIndex();
            jsonWriter.name("ColumnIndex");
            jsonWriter.value(columnIndex);
        }
        if (block.getRowSpan() != null) {
            Integer rowSpan = block.getRowSpan();
            jsonWriter.name("RowSpan");
            jsonWriter.value(rowSpan);
        }
        if (block.getColumnSpan() != null) {
            Integer columnSpan = block.getColumnSpan();
            jsonWriter.name("ColumnSpan");
            jsonWriter.value(columnSpan);
        }
        if (block.getGeometry() != null) {
            Geometry geometry = block.getGeometry();
            jsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (block.getId() != null) {
            String id = block.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (block.getRelationships() != null) {
            java.util.List<Relationship> relationships = block.getRelationships();
            jsonWriter.name("Relationships");
            jsonWriter.beginArray();
            for (Relationship relationshipsItem : relationships) {
                if (relationshipsItem != null) {
                    RelationshipJsonMarshaller.getInstance()
                            .marshall(relationshipsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (block.getEntityTypes() != null) {
            java.util.List<String> entityTypes = block.getEntityTypes();
            jsonWriter.name("EntityTypes");
            jsonWriter.beginArray();
            for (String entityTypesItem : entityTypes) {
                if (entityTypesItem != null) {
                    jsonWriter.value(entityTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (block.getSelectionStatus() != null) {
            String selectionStatus = block.getSelectionStatus();
            jsonWriter.name("SelectionStatus");
            jsonWriter.value(selectionStatus);
        }
        if (block.getPage() != null) {
            Integer page = block.getPage();
            jsonWriter.name("Page");
            jsonWriter.value(page);
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
