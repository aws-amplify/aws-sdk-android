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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LogicalTableSource
 */
class LogicalTableSourceJsonMarshaller {

    public void marshall(LogicalTableSource logicalTableSource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (logicalTableSource.getJoinInstruction() != null) {
            JoinInstruction joinInstruction = logicalTableSource.getJoinInstruction();
            jsonWriter.name("JoinInstruction");
            JoinInstructionJsonMarshaller.getInstance().marshall(joinInstruction, jsonWriter);
        }
        if (logicalTableSource.getPhysicalTableId() != null) {
            String physicalTableId = logicalTableSource.getPhysicalTableId();
            jsonWriter.name("PhysicalTableId");
            jsonWriter.value(physicalTableId);
        }
        jsonWriter.endObject();
    }

    private static LogicalTableSourceJsonMarshaller instance;

    public static LogicalTableSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogicalTableSourceJsonMarshaller();
        return instance;
    }
}
