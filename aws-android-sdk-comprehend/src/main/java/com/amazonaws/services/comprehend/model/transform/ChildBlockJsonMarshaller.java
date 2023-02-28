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
 * JSON marshaller for POJO ChildBlock
 */
class ChildBlockJsonMarshaller {

    public void marshall(ChildBlock childBlock, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (childBlock.getChildBlockId() != null) {
            String childBlockId = childBlock.getChildBlockId();
            jsonWriter.name("ChildBlockId");
            jsonWriter.value(childBlockId);
        }
        if (childBlock.getBeginOffset() != null) {
            Integer beginOffset = childBlock.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (childBlock.getEndOffset() != null) {
            Integer endOffset = childBlock.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        jsonWriter.endObject();
    }

    private static ChildBlockJsonMarshaller instance;

    public static ChildBlockJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChildBlockJsonMarshaller();
        return instance;
    }
}
